package defpackage;

import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public final class kwu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public kwu(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public static final kwu h(String str) {
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, str);
            return jwuVar.e();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(evu0.G(str, ':', length, 4) + 1, evu0.G(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int G = evu0.G(str, '/', length, 4);
        return str.substring(G, yf61.d(G, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int G = evu0.G(str, '/', length, 4);
        int d = yf61.d(G, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (G < d) {
            int i = G + 1;
            int e = yf61.e(str, '/', i, d);
            arrayList.add(str.substring(i, e));
            G = e;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int G = evu0.G(str, '?', 0, 6) + 1;
        return str.substring(G, yf61.e(str, '#', G, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, yf61.d(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kwu) && ((kwu) obj).i.equals(this.i);
    }

    public final boolean f() {
        return jl40.l(this.a, Constants.SCHEME);
    }

    public final jwu g() {
        jwu jwuVar = new jwu();
        String str = this.a;
        jwuVar.a = str;
        jwuVar.b = e();
        jwuVar.c = a();
        jwuVar.d = this.d;
        int i = str.equals("http") ? 80 : str.equals(Constants.SCHEME) ? 443 : -1;
        int i2 = this.e;
        jwuVar.e = i2 != i ? i2 : -1;
        ArrayList arrayList = jwuVar.f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        String str2 = null;
        jwuVar.g = d != null ? jwu.q(jx81.h(d, true, " \"'<>#", 0, 0, 83)) : null;
        if (this.h != null) {
            String str3 = this.i;
            str2 = str3.substring(evu0.G(str3, '#', 0, 6) + 1);
        }
        jwuVar.h = str2;
        return jwuVar;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i(String str) {
        List list = this.g;
        if (list == null) {
            return null;
        }
        b6w m = y6i0.m(y6i0.n(0, list.size()), 2);
        int i = m.a;
        int i2 = m.b;
        int i3 = m.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!str.equals(list.get(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return (String) list.get(i + 1);
        }
        return null;
    }

    public final Set j() {
        List list = this.g;
        if (list == null) {
            return EmptySet.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() / 2, 1.0f);
        b6w m = y6i0.m(y6i0.n(0, list.size()), 2);
        int i = m.a;
        int i2 = m.b;
        int i3 = m.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                linkedHashSet.add(list.get(i));
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final String k() {
        jwu jwuVar;
        try {
            jwuVar = new jwu();
            jwuVar.i(this, "/...");
        } catch (IllegalArgumentException unused) {
            jwuVar = null;
        }
        jwuVar.b = jx81.h("", false, " \"':;<=>@[]^`{}|/\\?#", 0, 0, HProv.PP_PASSWD_TERM);
        jwuVar.c = jx81.h("", false, " \"':;<=>@[]^`{}|/\\?#", 0, 0, HProv.PP_PASSWD_TERM);
        return jwuVar.e().i;
    }

    public final URI l() {
        jwu g = g();
        ArrayList arrayList = g.f;
        String str = g.d;
        g.d = str != null ? b64.k("[\"<>^`{|}]", str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, jx81.h((String) arrayList.get(i), true, "[]", 0, 0, 99));
        }
        ArrayList arrayList2 = g.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? jx81.h(str2, true, "\\^`{|}", 0, 0, 67) : null);
            }
        }
        String str3 = g.h;
        g.h = str3 != null ? jx81.h(str3, true, " \"#<>\\^`{|}", 0, 0, 35) : null;
        String jwuVar = g.toString();
        try {
            return new URI(jwuVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").j(jwuVar, ""));
            } catch (Exception unused) {
                ny61.j(e);
                return null;
            }
        }
    }

    public final URL m() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            ny61.j(e);
            return null;
        }
    }

    public final String toString() {
        return this.i;
    }
}
