package okhttp3;

import com.ironsource.B5;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.ImageSizeKey;
import com.vungle.ads.internal.protos.Sdk;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.erm0;
import xsna.go9;
import xsna.i9x;
import xsna.m9u0;
import xsna.swe0;
import xsna.tdj;
import xsna.tyx;
import xsna.vl8;
import xsna.x2r0;
import xsna.xy9;
import xsna.z23;

/* compiled from: HttpUrl.kt */
/* loaded from: classes11.dex */
public final class l {
    public static final char[] k = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List<String> g;
    public final String h;
    public final String i;
    public final boolean j;

    /* compiled from: HttpUrl.kt */
    public static final class a {
        public String a;
        public String d;
        public final ArrayList f;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final void a(String str, String str2) {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(b.a(str, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, false));
            this.g.add(str2 != null ? b.a(str2, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, false) : null);
        }

        public final l b() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String c = b.c(0, 0, 7, this.b);
            String c2 = b.c(0, 0, 7, this.c);
            String str2 = this.d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int c3 = c();
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.c(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = this.g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(c5g.u(arrayList4, 10));
                for (String str3 : arrayList4) {
                    arrayList.add(str3 != null ? b.c(0, 0, 3, str3) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.h;
            return new l(str, c, c2, str2, c3, arrayList3, arrayList, str4 != null ? b.c(0, 0, 7, str4) : null, toString());
        }

        public final int c() {
            int i = this.e;
            if (i != -1) {
                return i;
            }
            String str = this.a;
            if (str.equals("http")) {
                return 80;
            }
            return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        }

        public final void d(String str) {
            String d = m9u0.d(b.c(0, 0, 7, str));
            if (d == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.d = d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:151:0x022f, code lost:
        
            if (r3 < 65536) goto L125;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(l lVar, String str) {
            int i;
            int i2;
            String str2;
            char c;
            int e;
            ArrayList arrayList;
            String str3;
            int i3;
            int i4;
            ArrayList arrayList2;
            int i5;
            String str4;
            int i6;
            String str5;
            char charAt;
            a aVar = this;
            String str6 = str;
            byte[] bArr = x2r0.a;
            int m = x2r0.m(0, str6.length(), str6);
            int n = x2r0.n(m, str6.length(), str6);
            int i7 = -1;
            if (n - m >= 2) {
                char charAt2 = str6.charAt(m);
                if ((epx.g(charAt2, 97) >= 0 && epx.g(charAt2, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) <= 0) || (epx.g(charAt2, 65) >= 0 && epx.g(charAt2, 90) <= 0)) {
                    int i8 = m + 1;
                    while (true) {
                        if (i8 >= n) {
                            break;
                        }
                        char charAt3 = str6.charAt(i8);
                        if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                            i8++;
                        } else if (charAt3 == ':') {
                            i = i8;
                        }
                    }
                }
            }
            i = -1;
            if (i != -1) {
                str2 = HttpRequest.DEFAULT_SCHEME;
                if (str6.regionMatches(true, m, "https:", 0, 6)) {
                    aVar.a = str2;
                    m += 6;
                    str6 = str;
                    i2 = 1;
                } else {
                    str6 = str;
                    i2 = 1;
                    if (!str6.regionMatches(true, m, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str6.substring(0, i) + '\'');
                    }
                    aVar.a = "http";
                    m += 5;
                }
            } else {
                i2 = 1;
                str2 = HttpRequest.DEFAULT_SCHEME;
                if (lVar == null) {
                    throw new IllegalArgumentException(go9.b("Expected URL scheme 'http' or 'https' but no scheme was found for ", str6.length() > 6 ? erm0.D0(6, str6).concat("...") : str6));
                }
                aVar.a = lVar.a;
            }
            int i9 = m;
            int i10 = 0;
            while (true) {
                c = '\\';
                if (i9 >= n || !((charAt = str6.charAt(i9)) == '\\' || charAt == '/')) {
                    break;
                }
                i10++;
                i9++;
            }
            char c2 = '?';
            ArrayList arrayList3 = aVar.f;
            int i11 = i2;
            char c3 = '#';
            if (i10 >= 2 || lVar == null || !epx.f(lVar.a, aVar.a)) {
                int i12 = m + i10;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    e = x2r0.e(i12, n, str6, "@/\\?#");
                    char charAt4 = e != n ? str6.charAt(e) : (char) 65535;
                    if (charAt4 == 65535 || charAt4 == c3 || charAt4 == '/' || charAt4 == c || charAt4 == c2) {
                        break;
                    }
                    if (charAt4 != '@') {
                        c = '\\';
                    } else {
                        if (i13 == 0) {
                            int i15 = i12;
                            int f = x2r0.f(str6, i15, e, ':');
                            arrayList2 = arrayList3;
                            String a = b.a(str6, i15, " \"':;<=>@[]^`{}|/\\?#", f, PsExtractor.VIDEO_STREAM_MASK, true);
                            if (i14 != 0) {
                                a = tdj.a(new StringBuilder(), aVar.b, "%40", a);
                            }
                            aVar.b = a;
                            if (f != e) {
                                int i16 = f + 1;
                                i5 = e;
                                aVar.c = b.a(str, i16, " \"':;<=>@[]^`{}|/\\?#", i5, PsExtractor.VIDEO_STREAM_MASK, true);
                                i6 = i11;
                            } else {
                                i5 = e;
                                i6 = i13;
                            }
                            str4 = str;
                            i13 = i6;
                            i14 = i11;
                        } else {
                            arrayList2 = arrayList3;
                            int i17 = i12;
                            i5 = e;
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.c);
                            sb.append("%40");
                            str4 = str;
                            sb.append(b.a(str4, i17, " \"':;<=>@[]^`{}|/\\?#", i5, PsExtractor.VIDEO_STREAM_MASK, true));
                            aVar.c = sb.toString();
                        }
                        i12 = i5 + 1;
                        str6 = str4;
                        arrayList3 = arrayList2;
                        c = '\\';
                        c3 = '#';
                        c2 = '?';
                    }
                }
                arrayList = arrayList3;
                int i18 = i12;
                m = e;
                str3 = str6;
                int i19 = i18;
                while (true) {
                    if (i19 >= m) {
                        i3 = m;
                        break;
                    }
                    char charAt5 = str3.charAt(i19);
                    if (charAt5 == '[') {
                        do {
                            i19++;
                            if (i19 >= m) {
                                break;
                            }
                        } while (str3.charAt(i19) != ']');
                    } else if (charAt5 == ':') {
                        i3 = i19;
                        break;
                    }
                    i19++;
                }
                int i20 = i3 + 1;
                if (i20 < m) {
                    aVar.d = m9u0.d(b.c(i18, i3, 4, str3));
                    try {
                        i4 = Integer.parseInt(b.a(str3, i20, "", m, 248, false));
                        if (i11 <= i4) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i4 = -1;
                    aVar.e = i4;
                    if (i4 == -1) {
                        throw new IllegalArgumentException(("Invalid URL port: \"" + str3.substring(i20, m) + '\"').toString());
                    }
                } else {
                    aVar.d = m9u0.d(b.c(i18, i3, 4, str3));
                    String str7 = aVar.a;
                    if (str7.equals("http")) {
                        i7 = 80;
                    } else if (str7.equals(str2)) {
                        i7 = 443;
                    }
                    aVar.e = i7;
                }
                if (aVar.d == null) {
                    throw new IllegalArgumentException(("Invalid URL host: \"" + str3.substring(i18, i3) + '\"').toString());
                }
            } else {
                aVar.b = lVar.e();
                aVar.c = lVar.a();
                aVar.d = lVar.d;
                aVar.e = lVar.e;
                arrayList3.clear();
                arrayList3.addAll(lVar.c());
                if (m == n || str6.charAt(m) == '#') {
                    String d = lVar.d();
                    aVar.g = d != null ? b.d(b.a(d, 0, " \"'<>#", 0, 211, true)) : null;
                }
                str3 = str6;
                arrayList = arrayList3;
            }
            int e2 = x2r0.e(m, n, str3, "?#");
            if (m != e2) {
                char charAt6 = str3.charAt(m);
                if (charAt6 == '/' || charAt6 == '\\') {
                    ArrayList arrayList4 = arrayList;
                    arrayList4.clear();
                    arrayList4.add("");
                    m++;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
                while (m < e2) {
                    int e3 = x2r0.e(m, e2, str3, "/\\");
                    boolean z = e3 < e2;
                    String str8 = str3;
                    aVar.f(m, e3, str8, z, true);
                    a aVar2 = aVar;
                    str3 = str8;
                    m = z ? e3 + 1 : e3;
                    aVar = aVar2;
                }
            }
            a aVar3 = aVar;
            if (e2 >= n || str3.charAt(e2) != '?') {
                str5 = str3;
            } else {
                int f2 = x2r0.f(str3, e2, n, '#');
                String str9 = str3;
                str5 = str9;
                aVar3.g = b.d(b.a(str9, e2 + 1, " \"'<>#", f2, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, true));
                e2 = f2;
            }
            if (e2 >= n || str5.charAt(e2) != '#') {
                return;
            }
            aVar3.h = b.a(str, e2 + 1, "", n, 176, true);
        }

        public final void f(int i, int i2, String str, boolean z, boolean z2) {
            String a = b.a(str, i, " \"<>^`{}|/\\?#", i2, PsExtractor.VIDEO_STREAM_MASK, z2);
            if (a.equals(".") || a.equalsIgnoreCase("%2e")) {
                return;
            }
            boolean equals = a.equals("..");
            ArrayList arrayList = this.f;
            if (equals || a.equalsIgnoreCase("%2e.") || a.equalsIgnoreCase(".%2e") || a.equalsIgnoreCase("%2e%2e")) {
                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                    return;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                }
            }
            if (((CharSequence) xy9.b(1, arrayList)).length() == 0) {
                arrayList.set(arrayList.size() - 1, a);
            } else {
                arrayList.add(a);
            }
            if (z) {
                arrayList.add("");
            }
        }

        public final void g(String str) {
            int size = this.g.size() - 2;
            int b = tyx.b(size, 0, -2);
            if (b > size) {
                return;
            }
            while (true) {
                if (str.equals(this.g.get(size))) {
                    this.g.remove(size + 1);
                    this.g.remove(size);
                    if (this.g.isEmpty()) {
                        this.g = null;
                        return;
                    }
                }
                if (size == b) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final void h(String str) {
            if (this.g == null) {
                return;
            }
            g(b.a(str, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, false));
        }

        public final void i(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.a = "http";
            } else {
                if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                this.a = HttpRequest.DEFAULT_SCHEME;
            }
        }

        public final void j(String str, String str2) {
            h(str);
            a(str, str2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        
            if (r1 != r3) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.b.length() > 0 || this.c.length() > 0) {
                sb.append(this.b);
                if (this.c.length() > 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (drm0.E(str2, ':')) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i = -1;
            if (this.e != -1 || this.a != null) {
                int c = c();
                String str3 = this.a;
                if (str3 != null) {
                    if (str3.equals("http")) {
                        i = 80;
                    } else if (str3.equals(HttpRequest.DEFAULT_SCHEME)) {
                        i = 443;
                    }
                }
                sb.append(':');
                sb.append(c);
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (this.g != null) {
                sb.append('?');
                b.e(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class b {
        public static String a(String str, int i, String str2, int i2, int i3, boolean z) {
            int i4 = 0;
            int i5 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z2 = (i3 & 8) != 0 ? false : z;
            boolean z3 = (i3 & 16) == 0;
            boolean z4 = (i3 & 32) == 0;
            boolean z5 = (i3 & 64) == 0;
            int i6 = i5;
            while (i6 < length) {
                int codePointAt = str.codePointAt(i6);
                int i7 = 32;
                int i8 = 43;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z5) || drm0.E(str2, (char) codePointAt) || ((codePointAt == 37 && (!z2 || (z3 && !b(i6, length, str)))) || (codePointAt == 43 && z4)))) {
                    vl8 vl8Var = new vl8();
                    vl8Var.Q(i5, i6, str);
                    vl8 vl8Var2 = null;
                    while (i6 < length) {
                        int codePointAt2 = str.codePointAt(i6);
                        if (!z2 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                            if (codePointAt2 == i8 && z4) {
                                String str3 = z2 ? "+" : "%2B";
                                vl8Var.Q(i4, str3.length(), str3);
                            } else {
                                if (codePointAt2 >= i7 && codePointAt2 != 127) {
                                    if ((codePointAt2 < 128 || z5) && !drm0.E(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z2 && (!z3 || b(i6, length, str))))) {
                                        vl8Var.T(codePointAt2);
                                        i6 += Character.charCount(codePointAt2);
                                        i4 = 0;
                                        i7 = 32;
                                        i8 = 43;
                                    }
                                }
                                if (vl8Var2 == null) {
                                    vl8Var2 = new vl8();
                                }
                                vl8Var2.T(codePointAt2);
                                while (!vl8Var2.W1()) {
                                    byte readByte = vl8Var2.readByte();
                                    vl8Var.I(37);
                                    char[] cArr = l.k;
                                    vl8Var.I(cArr[((readByte & 255) >> 4) & 15]);
                                    vl8Var.I(cArr[readByte & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
                                }
                                i6 += Character.charCount(codePointAt2);
                                i4 = 0;
                                i7 = 32;
                                i8 = 43;
                            }
                        }
                        i6 += Character.charCount(codePointAt2);
                        i4 = 0;
                        i7 = 32;
                        i8 = 43;
                    }
                    return vl8Var.x();
                }
                i6 += Character.charCount(codePointAt);
            }
            return str.substring(i5, length);
        }

        public static boolean b(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && x2r0.q(str.charAt(i + 1)) != -1 && x2r0.q(str.charAt(i3)) != -1;
        }

        public static String c(int i, int i2, int i3, String str) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            boolean z = (i3 & 4) == 0;
            int i5 = i;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt == '%' || (charAt == '+' && z)) {
                    vl8 vl8Var = new vl8();
                    vl8Var.Q(i, i5, str);
                    while (i5 < i2) {
                        int codePointAt = str.codePointAt(i5);
                        if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                            if (codePointAt == 43 && z) {
                                vl8Var.I(32);
                                i5++;
                            }
                            vl8Var.T(codePointAt);
                            i5 += Character.charCount(codePointAt);
                        } else {
                            int q = x2r0.q(str.charAt(i5 + 1));
                            int q2 = x2r0.q(str.charAt(i4));
                            if (q != -1 && q2 != -1) {
                                vl8Var.I((q << 4) + q2);
                                i5 = Character.charCount(codePointAt) + i4;
                            }
                            vl8Var.T(codePointAt);
                            i5 += Character.charCount(codePointAt);
                        }
                    }
                    return vl8Var.x();
                }
                i5++;
            }
            return str.substring(i, i2);
        }

        public static ArrayList d(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int L = drm0.L(str, '&', i, 4);
                if (L == -1) {
                    L = str.length();
                }
                int L2 = drm0.L(str, B5.U, i, 4);
                if (L2 == -1 || L2 > L) {
                    arrayList.add(str.substring(i, L));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, L2));
                    arrayList.add(str.substring(L2 + 1, L));
                }
                i = L + 1;
            }
            return arrayList;
        }

        public static void e(StringBuilder sb, List list) {
            i9x p = swe0.p(2, swe0.q(0, list.size()));
            int i = p.b;
            int i2 = p.c;
            int i3 = p.d;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append(B5.U);
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }
    }

    public l(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = epx.f(str, HttpRequest.DEFAULT_SCHEME);
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(drm0.L(str, ':', length, 4) + 1, drm0.L(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int L = drm0.L(str, '/', length, 4);
        return str.substring(L, x2r0.e(L, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int L = drm0.L(str, '/', length, 4);
        int e = x2r0.e(L, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (L < e) {
            int i = L + 1;
            int f = x2r0.f(str, i, e, '/');
            arrayList.add(str.substring(i, f));
            L = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int L = drm0.L(str, '?', 0, 6) + 1;
        return str.substring(L, x2r0.f(str, L, str.length(), '#'));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, x2r0.e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && epx.f(((l) obj).i, this.i);
    }

    public final a f() {
        a aVar = new a();
        String str = this.a;
        aVar.a = str;
        aVar.b = e();
        aVar.c = a();
        aVar.d = this.d;
        int i = str.equals("http") ? 80 : str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        int i2 = this.e;
        aVar.e = i2 != i ? i2 : -1;
        ArrayList arrayList = aVar.f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        String str2 = null;
        aVar.g = d != null ? b.d(b.a(d, 0, " \"'<>#", 0, 211, true)) : null;
        if (this.h != null) {
            String str3 = this.i;
            str2 = str3.substring(drm0.L(str3, '#', 0, 6) + 1);
        }
        aVar.h = str2;
        return aVar;
    }

    public final String g(String str) {
        List<String> list = this.g;
        if (list == null) {
            return null;
        }
        i9x p = swe0.p(2, swe0.q(0, list.size()));
        int i = p.b;
        int i2 = p.c;
        int i3 = p.d;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!str.equals(list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return list.get(i + 1);
    }

    public final String h() {
        a aVar;
        try {
            aVar = new a();
            aVar.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        aVar.getClass();
        aVar.b = b.a("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251, false);
        aVar.c = b.a("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251, false);
        return aVar.b().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        a f = f();
        ArrayList arrayList = f.f;
        String str = f.d;
        f.d = str != null ? z23.c("[\"<>^`{|}]", str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, b.a((String) arrayList.get(i), 0, "[]", 0, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, true));
        }
        ArrayList arrayList2 = f.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? b.a(str2, 0, "\\^`{|}", 0, 195, true) : null);
            }
        }
        String str3 = f.h;
        f.h = str3 != null ? b.a(str3, 0, " \"#<>\\^`{|}", 0, 163, true) : null;
        String aVar = f.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").g(aVar, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL j() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        return this.i;
    }
}
