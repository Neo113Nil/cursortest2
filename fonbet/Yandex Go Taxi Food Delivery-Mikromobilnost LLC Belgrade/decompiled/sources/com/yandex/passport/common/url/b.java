package com.yandex.passport.common.url;

import android.net.Uri;
import com.yandex.passport.internal.util.p;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

@gsq0(with = c.class)
/* loaded from: classes8.dex */
public final class b {
    public static final a Companion = new a();
    public final String a;

    public static final String a(String str, Map map) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        a aVar = Companion;
        Uri build = buildUpon.build();
        aVar.getClass();
        return build.toString();
    }

    public static final String b(String str, Pair... pairArr) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Pair pair : pairArr) {
            buildUpon.appendQueryParameter((String) pair.c(), (String) pair.f());
        }
        a aVar = Companion;
        Uri build = buildUpon.build();
        aVar.getClass();
        return build.toString();
    }

    public static final int c(String str) {
        char charAt;
        int length = str.length();
        do {
            length--;
            if (-1 < length) {
                charAt = str.charAt(length);
                if (':' != charAt) {
                    if (charAt < '0') {
                        break;
                    }
                } else {
                    return length;
                }
            } else {
                break;
            }
        } while (charAt <= '9');
        return -1;
    }

    public static final String d(String str) {
        return j(str) + "://" + g(str);
    }

    public static final String e(String str) {
        String str2;
        int G = evu0.G(str, ':', 0, 6);
        int length = str.length();
        int i = G + 2;
        if (length > i && str.charAt(G + 1) == '/' && str.charAt(i) == '/') {
            int i2 = G + 3;
            int i3 = i2;
            while (i3 < length) {
                char charAt = str.charAt(i3);
                if (charAt == '#' || charAt == '/' || charAt == '?' || charAt == '\\') {
                    break;
                }
                i3++;
            }
            str2 = str.substring(i2, i3);
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    public static final LinkedHashMap f(String str, Set set) {
        List W;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String fragment = Uri.parse(str).getFragment();
        if (fragment != null) {
            W = evu0.W(fragment, new String[]{"&"}, (r2 & 4) != 0 ? 0 : 2);
            Iterator it = W.iterator();
            while (it.hasNext()) {
                List Y = evu0.Y((String) it.next(), new char[]{'='}, 2, 2);
                if (set.contains(kotlin.collections.a.P(Y))) {
                    linkedHashMap.put(kotlin.collections.a.P(Y), Y.get(1));
                }
            }
        }
        return linkedHashMap;
    }

    public static final String g(String str) {
        String e = e(str);
        if (e.length() == 0) {
            return "";
        }
        int K = evu0.K(e, '@', 0, 6);
        int c = c(e);
        String substring = c == -1 ? e.substring(K + 1) : e.substring(K + 1, c);
        Charset charset = StandardCharsets.UTF_8;
        StringBuilder sb = new StringBuilder(substring.length());
        CharsetDecoder onUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith("�").onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer allocate = ByteBuffer.allocate(substring.length());
        int i = 0;
        while (i < substring.length()) {
            char charAt = substring.charAt(i);
            i++;
            if (charAt == '%') {
                int i2 = 0;
                byte b = 0;
                while (true) {
                    if (i2 >= 2) {
                        break;
                    }
                    try {
                        if (i >= substring.length()) {
                            throw new URISyntaxException(substring, "Unexpected end of string".concat(""), i);
                        }
                        char charAt2 = substring.charAt(i);
                        i++;
                        int i3 = ('0' > charAt2 || charAt2 >= ':') ? ('a' > charAt2 || charAt2 >= 'g') ? ('A' > charAt2 || charAt2 >= 'G') ? -1 : charAt2 - '7' : charAt2 - 'W' : charAt2 - '0';
                        if (i3 < 0) {
                            p.d(sb, onUnmappableCharacter, allocate);
                            sb.append((char) 65533);
                            break;
                        }
                        b = (byte) ((b * PKIBody._CKUANN) + i3);
                        i2++;
                    } catch (URISyntaxException unused) {
                        p.d(sb, onUnmappableCharacter, allocate);
                        sb.append((char) 65533);
                    }
                }
                allocate.put(b);
            } else if (charAt != '+') {
                p.d(sb, onUnmappableCharacter, allocate);
                sb.append(charAt);
            } else {
                p.d(sb, onUnmappableCharacter, allocate);
                sb.append('+');
            }
        }
        p.d(sb, onUnmappableCharacter, allocate);
        return sb.toString();
    }

    public static final String h(String str) {
        int i;
        int i2;
        int G = evu0.G(str, ':', 0, 6);
        if (G > -1 && ((i2 = G + 1) == str.length() || str.charAt(i2) != '/')) {
            return null;
        }
        int length = str.length();
        int i3 = G + 2;
        if (length > i3 && str.charAt(G + 1) == '/' && str.charAt(i3) == '/') {
            i = G + 3;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '#') {
                    return "";
                }
                if (charAt == '/') {
                    break;
                }
                if (charAt == '?') {
                    return "";
                }
                if (charAt == '\\') {
                    break;
                }
                i++;
            }
        } else {
            i = G + 1;
        }
        int i4 = i;
        while (i4 < length) {
            char charAt2 = str.charAt(i4);
            if (charAt2 == '#' || charAt2 == '?') {
                break;
            }
            i4++;
        }
        return str.substring(i, i4);
    }

    public static final String i(String str, String str2) {
        try {
            return Uri.parse(str).getQueryParameter(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String j(String str) {
        int G = evu0.G(str, ':', 0, 6);
        return G == -1 ? "" : str.substring(0, G);
    }

    public static final String k(String str) {
        Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
        Uri.Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!jl40.l(str2, "mode")) {
                clearQuery.appendQueryParameter(str2, Uri.parse(str).getQueryParameter(str2));
            }
        }
        a aVar = Companion;
        Uri build = clearQuery.build();
        aVar.getClass();
        return build.toString();
    }

    public static String l(String str) {
        return unr0.l(')', "CommonUrl(urlString=", str);
    }

    public static final boolean m(String str) {
        try {
            new URL(str).toURI();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return jl40.l(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l(this.a);
    }
}
