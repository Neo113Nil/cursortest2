package defpackage;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes9.dex */
public final class jwu {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = scc.i("");

    public static ArrayList q(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int G = evu0.G(str, '&', i, 4);
            if (G == -1) {
                G = str.length();
            }
            int G2 = evu0.G(str, '=', i, 4);
            if (G2 == -1 || G2 > G) {
                arrayList.add(str.substring(i, G));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, G2));
                arrayList.add(str.substring(G2 + 1, G));
            }
            i = G + 1;
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(jx81.h(str, true, " \"'<>#&=", 0, 0, 83));
        this.g.add(str2 != null ? jx81.h(str2, true, " \"'<>#&=", 0, 0, 83) : null);
    }

    public final void b(String str) {
        k(0, str.length(), str, false, false);
    }

    public final void c(String str, boolean z) {
        boolean z2;
        jwu jwuVar;
        String str2;
        boolean z3;
        int i = 0;
        while (true) {
            int d = yf61.d(i, str.length(), str, "/\\");
            if (d < str.length()) {
                z2 = true;
                str2 = str;
                z3 = z;
                jwuVar = this;
            } else {
                z2 = false;
                jwuVar = this;
                str2 = str;
                z3 = z;
            }
            jwuVar.k(i, d, str2, z2, z3);
            i = d + 1;
            if (i > str2.length()) {
                return;
            }
            this = jwuVar;
            str = str2;
            z = z3;
        }
    }

    public final void d(String str, String str2) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(jx81.h(str, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 0, 91));
        this.g.add(str2 != null ? jx81.h(str2, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 0, 91) : null);
    }

    public final kwu e() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            ny61.r("scheme == null");
            return null;
        }
        String G = jx81.G(0, 0, 7, this.b);
        String G2 = jx81.G(0, 0, 7, this.c);
        String str2 = this.d;
        if (str2 == null) {
            ny61.r("host == null");
            return null;
        }
        int f = f();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(jx81.G(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(tcc.n(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? jx81.G(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new kwu(str, G, G2, str2, f, arrayList3, arrayList, str4 != null ? jx81.G(0, 0, 7, str4) : null, toString());
    }

    public final int f() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public final void g(String str) {
        if (cvu0.x(str, "/", false)) {
            n(0, str.length(), str);
        } else {
            w511.f("unexpected encodedPath: ".concat(str));
        }
    }

    public final void h(String str) {
        String b = wf61.b(jx81.G(0, 0, 7, str));
        if (b != null) {
            this.d = b;
        } else {
            ny61.g("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x021e, code lost:
    
        if (r2 < 65536) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(kwu kwuVar, String str) {
        int i;
        int i2;
        String str2;
        int i3;
        int i4;
        char c;
        char c2;
        int i5;
        int i6;
        int d;
        char charAt;
        String str3;
        int i7;
        int i8;
        int i9;
        int i10;
        char c3;
        int i11;
        String str4;
        int i12;
        int d2;
        char c4;
        char charAt2;
        String str5 = str;
        byte[] bArr = yf61.a;
        int i13 = yf61.i(0, str5.length(), str5);
        int j = yf61.j(i13, str5.length(), str5);
        int i14 = -1;
        if (j - i13 >= 2) {
            char charAt3 = str5.charAt(i13);
            if ((jl40.q(charAt3, 97) >= 0 && jl40.q(charAt3, 122) <= 0) || (jl40.q(charAt3, 65) >= 0 && jl40.q(charAt3, 90) <= 0)) {
                int i15 = i13 + 1;
                while (true) {
                    if (i15 >= j) {
                        break;
                    }
                    char charAt4 = str5.charAt(i15);
                    if (('a' <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i15++;
                    } else if (charAt4 == ':') {
                        i = i15;
                    }
                }
                if (i == -1) {
                    str2 = Constants.SCHEME;
                    if (str5.regionMatches(true, i13, "https:", 0, 6)) {
                        this.a = str2;
                        i13 += 6;
                        str5 = str;
                        i2 = 1;
                    } else {
                        str5 = str;
                        i2 = 1;
                        if (!str5.regionMatches(true, i13, "http:", 0, 5)) {
                            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str5.substring(0, i) + '\'');
                        }
                        this.a = "http";
                        i13 += 5;
                    }
                } else {
                    i2 = 1;
                    str2 = Constants.SCHEME;
                    if (kwuVar == null) {
                        ny61.g("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str5.length() > 6 ? gvu0.A0(6, str5).concat("...") : str5));
                        return;
                    }
                    this.a = kwuVar.a;
                }
                i3 = i13;
                i4 = 0;
                while (true) {
                    c = CSPStore.UNIQUE_SEPARATOR;
                    c2 = '/';
                    if (i3 >= j || !((charAt2 = str5.charAt(i3)) == '/' || charAt2 == '\\')) {
                        break;
                    }
                    i4++;
                    i3++;
                }
                char c5 = '#';
                if (i4 < 2 || kwuVar == null) {
                    i5 = i2;
                } else {
                    i5 = i2;
                    if (jl40.l(kwuVar.a, this.a)) {
                        this.b = kwuVar.e();
                        this.c = kwuVar.a();
                        this.d = kwuVar.d;
                        this.e = kwuVar.e;
                        ArrayList arrayList = this.f;
                        arrayList.clear();
                        arrayList.addAll(kwuVar.c());
                        if (i13 == j || str5.charAt(i13) == '#') {
                            String d3 = kwuVar.d();
                            this.g = d3 != null ? q(jx81.h(d3, true, " \"'<>#", 0, 0, 83)) : null;
                        }
                        str3 = str5;
                        d2 = yf61.d(i13, j, str3, "?#");
                        n(i13, d2, str3);
                        if (d2 < j || str3.charAt(d2) != '?') {
                            c4 = '#';
                        } else {
                            c4 = '#';
                            int e = yf61.e(str3, '#', d2, j);
                            this.g = q(jx81.h(str3, true, " \"'<>#", d2 + 1, e, 80));
                            d2 = e;
                        }
                        if (d2 < j || str3.charAt(d2) != c4) {
                            return;
                        }
                        this.h = jx81.h(str3, true, "", d2 + 1, j, 48);
                        return;
                    }
                }
                i6 = i13 + i4;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    d = yf61.d(i6, j, str5, "@/\\?#");
                    charAt = d == j ? str5.charAt(d) : (char) 65535;
                    if (charAt == 65535 || charAt == c5 || charAt == c2 || charAt == c || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (i17 == 0) {
                            int e2 = yf61.e(str5, ':', i6, d);
                            c3 = c2;
                            String h = jx81.h(str, true, " \"':;<=>@[]^`{}|/\\?#", i6, e2, 112);
                            if (i16 != 0) {
                                h = unr0.r(new StringBuilder(), this.b, "%40", h);
                            }
                            this.b = h;
                            if (e2 != d) {
                                int i18 = e2 + 1;
                                i11 = d;
                                this.c = jx81.h(str, true, " \"':;<=>@[]^`{}|/\\?#", i18, i11, 112);
                                i12 = i5;
                            } else {
                                i11 = d;
                                i12 = i17;
                            }
                            str4 = str;
                            i17 = i12;
                            i16 = i5;
                        } else {
                            c3 = c2;
                            i11 = d;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.c);
                            sb.append("%40");
                            str4 = str;
                            sb.append(jx81.h(str4, true, " \"':;<=>@[]^`{}|/\\?#", i6, i11, 112));
                            this.c = sb.toString();
                        }
                        i6 = i11 + 1;
                        str5 = str4;
                        c2 = c3;
                        c5 = '#';
                        c = CSPStore.UNIQUE_SEPARATOR;
                    }
                }
                str3 = str5;
                int i19 = i6;
                i7 = i19;
                while (true) {
                    if (i7 < d) {
                        char charAt5 = str3.charAt(i7);
                        if (charAt5 == ':') {
                            i8 = i7;
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i7++;
                                if (i7 < d) {
                                }
                            } while (str3.charAt(i7) != ']');
                        }
                        i7++;
                    } else {
                        i8 = d;
                        break;
                    }
                }
                i9 = i8 + 1;
                if (i9 >= d) {
                    this.d = wf61.b(jx81.G(i19, i8, 4, str3));
                    try {
                        i10 = Integer.parseInt(jx81.h(str3, false, "", i9, d, 120));
                        if (i5 <= i10) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i10 = -1;
                    this.e = i10;
                    if (i10 == -1) {
                        kbs.j("Invalid URL port: \"", str3.substring(i9, d), 34);
                        return;
                    }
                } else {
                    this.d = wf61.b(jx81.G(i19, i8, 4, str3));
                    String str6 = this.a;
                    if (str6.equals("http")) {
                        i14 = 80;
                    } else if (str6.equals(str2)) {
                        i14 = 443;
                    }
                    this.e = i14;
                }
                if (this.d != null) {
                    kbs.j("Invalid URL host: \"", str3.substring(i19, i8), 34);
                    return;
                }
                i13 = d;
                d2 = yf61.d(i13, j, str3, "?#");
                n(i13, d2, str3);
                if (d2 < j) {
                }
                c4 = '#';
                if (d2 < j) {
                    return;
                } else {
                    return;
                }
            }
        }
        i = -1;
        if (i == -1) {
        }
        i3 = i13;
        i4 = 0;
        while (true) {
            c = CSPStore.UNIQUE_SEPARATOR;
            c2 = '/';
            if (i3 >= j) {
                break;
            } else {
                break;
            }
            i4++;
            i3++;
        }
        char c52 = '#';
        if (i4 < 2) {
        }
        i5 = i2;
        i6 = i13 + i4;
        int i162 = 0;
        int i172 = 0;
        while (true) {
            d = yf61.d(i6, j, str5, "@/\\?#");
            if (d == j) {
            }
            if (charAt == 65535) {
                break;
            } else {
                break;
            }
        }
        str3 = str5;
        int i192 = i6;
        i7 = i192;
        while (true) {
            if (i7 < d) {
            }
            i7++;
        }
        i9 = i8 + 1;
        if (i9 >= d) {
        }
        if (this.d != null) {
        }
    }

    public final void j(int i) {
        if (1 > i || i >= 65536) {
            w511.f(oyr.i(i, "unexpected port: "));
        } else {
            this.e = i;
        }
    }

    public final void k(int i, int i2, String str, boolean z, boolean z2) {
        String h = jx81.h(str, z2, " \"<>^`{}|/\\?#", i, i2, 112);
        if (h.equals(Extension.DOT_CHAR) || h.equalsIgnoreCase("%2e")) {
            return;
        }
        boolean equals = h.equals("..");
        ArrayList arrayList = this.f;
        if (equals || h.equalsIgnoreCase("%2e.") || h.equalsIgnoreCase(".%2e") || h.equalsIgnoreCase("%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) unr0.k(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, h);
        } else {
            arrayList.add(h);
        }
        if (z) {
            arrayList.add("");
        }
    }

    public final void l(String str) {
        int size = this.g.size() - 2;
        int v = jx81.v(size, 0, -2);
        if (v > size) {
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
            if (size == v) {
                return;
            } else {
                size -= 2;
            }
        }
    }

    public final void m(String str) {
        if (this.g == null) {
            return;
        }
        l(jx81.h(str, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 0, 91));
    }

    public final void n(int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        char charAt = str.charAt(i);
        ArrayList arrayList = this.f;
        if (charAt == '/' || charAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        int i3 = i;
        while (i3 < i2) {
            int d = yf61.d(i3, i2, str, "/\\");
            boolean z = d < i2;
            jwu jwuVar = this;
            String str2 = str;
            jwuVar.k(i3, d, str2, z, true);
            if (z) {
                i3 = d + 1;
                this = jwuVar;
            } else {
                this = jwuVar;
                i3 = d;
            }
            str = str2;
        }
    }

    public final void o(String str) {
        if (str.equalsIgnoreCase("http")) {
            this.a = "http";
        } else if (str.equalsIgnoreCase(Constants.SCHEME)) {
            this.a = Constants.SCHEME;
        } else {
            ny61.g("unexpected scheme: ".concat(str));
        }
    }

    public final void p(String str, String str2) {
        m(str);
        d(str, str2);
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
            if (evu0.z(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int f = f();
            String str3 = this.a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals(Constants.SCHEME)) {
                    i = 443;
                }
            }
            sb.append(':');
            sb.append(f);
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            sms.b(this.g, sb);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
