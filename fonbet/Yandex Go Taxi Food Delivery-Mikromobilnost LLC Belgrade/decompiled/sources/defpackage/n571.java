package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import yads.ah2;
import yads.bx;
import yads.c43;
import yads.cs1;
import yads.dp;
import yads.g11;
import yads.ke;
import yads.mt;
import yads.mx0;
import yads.ot;
import yads.ts1;
import yads.w83;

/* loaded from: classes7.dex */
public final class n571 extends eo71 {
    public static final yx61 b = new yx61(1);
    public final yx61 a;

    public n571() {
        this.a = null;
    }

    public static int c(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static int d(int i, int i2, byte[] bArr) {
        int n = n(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return n;
        }
        while (n < bArr.length - 1) {
            if ((n - i) % 2 == 0 && bArr[n + 1] == 0) {
                return n;
            }
            n = n(n + 1, bArr);
        }
        return bArr.length;
    }

    public static String e(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String f(int i, int i2, String str, byte[] bArr) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static bx g(int i, dl81 dl81Var) {
        if (i < 4) {
            return null;
        }
        int s = dl81Var.s();
        String o = o(s);
        byte[] bArr = new byte[3];
        dl81Var.d(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        dl81Var.d(0, i2, bArr2);
        int d = d(0, s, bArr2);
        String str2 = new String(bArr2, 0, d, o);
        int c = c(s) + d;
        return new bx(str, str2, f(c, d(c, s, bArr2), o, bArr2));
    }

    public static c43 h(int i, String str, dl81 dl81Var) {
        if (i < 1) {
            return null;
        }
        int s = dl81Var.s();
        String o = o(s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dl81Var.d(0, i2, bArr);
        return new c43(str, null, new String(bArr, 0, d(0, s, bArr), o));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7 A[Catch: all -> 0x0100, UnsupportedEncodingException -> 0x01f1, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:55:0x00fb, B:58:0x01e7, B:115:0x01f1, B:64:0x0109, B:71:0x0121, B:73:0x0128, B:81:0x0141, B:90:0x0158, B:96:0x0174, B:103:0x0186, B:128:0x01bf, B:135:0x01d2, B:136:0x01d7), top: B:49:0x00f1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g11 j(int i, dl81 dl81Var, boolean z, int i2, yx61 yx61Var) {
        int v;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        g11 g11Var;
        g11 dpVar;
        int i3 = i;
        dl81 dl81Var2 = dl81Var;
        int s = dl81Var2.s();
        int s2 = dl81Var2.s();
        int s3 = dl81Var2.s();
        int s4 = i3 >= 3 ? dl81Var2.s() : 0;
        if (i3 == 4) {
            v = dl81Var2.v();
            if (!z) {
                v = (((v >> 24) & 255) << 21) | (v & 255) | (((v >> 8) & 255) << 7) | (((v >> 16) & 255) << 14);
            }
        } else {
            v = i3 == 3 ? dl81Var2.v() : dl81Var2.u();
        }
        int x = i3 >= 3 ? dl81Var2.x() : 0;
        if (s == 0 && s2 == 0 && s3 == 0 && s4 == 0 && v == 0 && x == 0) {
            dl81Var2.m(dl81Var2.c);
            return null;
        }
        int i4 = dl81Var2.b + v;
        if (i4 > dl81Var2.c) {
            nba1.e();
            dl81Var2.m(dl81Var2.c);
            return null;
        }
        if (yx61Var != null) {
            dl81Var2.m(i4);
            return null;
        }
        if (i3 == 3) {
            z2 = (x & 128) != 0;
            g11Var = null;
            z5 = (x & 64) != 0;
            z4 = (x & 32) != 0;
            z3 = z2;
        } else if (i3 == 4) {
            boolean z6 = (x & 64) != 0;
            boolean z7 = (x & 8) != 0;
            z5 = (x & 4) != 0;
            g11Var = (x & 2) != 0 ? 1 : null;
            if ((x & 1) != 0) {
                boolean z8 = z7;
                z4 = z6;
                z2 = z8;
                z3 = true;
            } else {
                boolean z9 = z7;
                z4 = z6;
                z2 = z9;
                z3 = false;
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            g11Var = null;
        }
        if (z2 || z5) {
            nba1.e();
            dl81Var2.m(i4);
            return null;
        }
        if (z4) {
            v--;
            dl81Var2.m(dl81Var2.b + 1);
        }
        if (z3) {
            v -= 4;
            dl81Var2.m(dl81Var2.b + 4);
        }
        if (g11Var != null) {
            v = w(v, dl81Var2);
        }
        int i5 = v;
        try {
            try {
                try {
                    if (s == 84 && s2 == 88 && s3 == 88 && (i3 == 2 || s4 == 88)) {
                        dpVar = u(i5, dl81Var2);
                    } else if (s == 84) {
                        dpVar = h(i5, e(i3, s, s2, s3, s4), dl81Var2);
                    } else if (s == 87 && s2 == 88 && s3 == 88 && (i3 == 2 || s4 == 88)) {
                        dpVar = v(i5, dl81Var2);
                    } else if (s == 87) {
                        dpVar = r(i5, e(i3, s, s2, s3, s4), dl81Var2);
                    } else if (s == 80 && s2 == 82 && s3 == 73 && s4 == 86) {
                        dpVar = t(i5, dl81Var2);
                    } else {
                        if (s != 71 || s2 != 69 || s3 != 79 || (s4 != 66 && i3 != 2)) {
                            g11Var = null;
                            if (i3 != 2 ? s == 65 && s2 == 80 && s3 == 73 && s4 == 67 : s == 80 && s2 == 73 && s3 == 67) {
                                dpVar = k(dl81Var2, i5, i3);
                            } else if (s == 67 && s2 == 79 && s3 == 77 && (s4 == 77 || i3 == 2)) {
                                dpVar = g(i5, dl81Var2);
                            } else if (s == 67 && s2 == 72 && s3 == 65 && s4 == 80) {
                                try {
                                    dpVar = l(dl81Var2, i5, i3, z, i2, yx61Var);
                                    i3 = i;
                                    dl81Var2 = dl81Var;
                                } catch (UnsupportedEncodingException unused) {
                                    dl81Var2 = dl81Var;
                                    nba1.e();
                                    dl81Var2.m(i4);
                                    return g11Var;
                                } catch (Throwable th) {
                                    th = th;
                                    dl81Var2 = dl81Var;
                                    dl81Var2.m(i4);
                                    throw th;
                                }
                            } else if (s == 67 && s2 == 84 && s3 == 79 && s4 == 67) {
                                i3 = i;
                                dl81Var2 = dl81Var;
                                dpVar = q(dl81Var2, i5, i3, z, i2, yx61Var);
                            } else {
                                i3 = i;
                                dl81Var2 = dl81Var;
                                if (s == 77 && s2 == 76 && s3 == 76 && s4 == 84) {
                                    dpVar = s(i5, dl81Var2);
                                } else {
                                    String e = e(i3, s, s2, s3, s4);
                                    byte[] bArr = new byte[i5];
                                    dl81Var2.d(0, i5, bArr);
                                    dpVar = new dp(e, bArr);
                                }
                            }
                            if (dpVar == null) {
                                e(i3, s, s2, s3, s4);
                                nba1.e();
                            }
                            dl81Var2.m(i4);
                            return dpVar;
                        }
                        dpVar = p(i5, dl81Var2);
                    }
                    g11Var = null;
                    if (dpVar == null) {
                    }
                    dl81Var2.m(i4);
                    return dpVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (UnsupportedEncodingException unused2) {
                g11Var = null;
            }
        } catch (UnsupportedEncodingException unused3) {
        }
    }

    public static ke k(dl81 dl81Var, int i, int i2) {
        int n;
        String a;
        int s = dl81Var.s();
        String o = o(s);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        dl81Var.d(0, i3, bArr);
        if (i2 == 2) {
            a = "image/" + tea1.a(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(a)) {
                a = "image/jpeg";
            }
            n = 2;
        } else {
            n = n(0, bArr);
            a = tea1.a(new String(bArr, 0, n, "ISO-8859-1"));
            if (a.indexOf(47) == -1) {
                a = "image/".concat(a);
            }
        }
        int i4 = bArr[n + 1] & 255;
        int i5 = n + 2;
        int d = d(i5, s, bArr);
        String str = new String(bArr, i5, d - i5, o);
        int c = c(s) + d;
        return new ke(a, str, i4, i3 <= c ? rf71.f : Arrays.copyOfRange(bArr, c, i3));
    }

    public static mt l(dl81 dl81Var, int i, int i2, boolean z, int i3, yx61 yx61Var) {
        int i4 = dl81Var.b;
        int n = n(i4, dl81Var.a);
        String str = new String(dl81Var.a, i4, n - i4, "ISO-8859-1");
        dl81Var.m(n + 1);
        int a = dl81Var.a();
        int a2 = dl81Var.a();
        long t = dl81Var.t();
        if (t == _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            t = -1;
        }
        long t2 = dl81Var.t();
        long j = t2 == _Gost_CryptoPro_PrivateKeyValues.maxDWORD ? -1L : t2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (dl81Var.b < i5) {
            g11 j2 = j(i2, dl81Var, z, i3, yx61Var);
            if (j2 != null) {
                arrayList.add(j2);
            }
        }
        return new mt(str, a, a2, t, j, (g11[]) arrayList.toArray(new g11[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m(dl81 dl81Var, int i, int i2, boolean z) {
        int u;
        long u2;
        int i3;
        int i4;
        int i5 = dl81Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (dl81Var.c - dl81Var.b < i2) {
                    dl81Var.m(i5);
                    return true;
                }
                if (i >= 3) {
                    u = dl81Var.a();
                    u2 = dl81Var.t();
                    i3 = dl81Var.x();
                } else {
                    u = dl81Var.u();
                    u2 = dl81Var.u();
                    i3 = 0;
                }
                if (u == 0 && u2 == 0 && i3 == 0) {
                    dl81Var.m(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & u2) != 0) {
                        dl81Var.m(i5);
                        return false;
                    }
                    u2 = (((u2 >> 24) & 255) << 21) | (u2 & 255) | (((u2 >> 8) & 255) << 7) | (((u2 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i4 += 4;
                    }
                    if (u2 < i4) {
                        dl81Var.m(i5);
                        return false;
                    }
                    int i6 = dl81Var.c;
                    int i7 = dl81Var.b;
                    if (i6 - i7 < u2) {
                        dl81Var.m(i5);
                        return false;
                    }
                    dl81Var.m(i7 + ((int) u2));
                }
            } catch (Throwable th) {
                dl81Var.m(i5);
                throw th;
            }
        }
    }

    public static int n(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static mx0 p(int i, dl81 dl81Var) {
        int s = dl81Var.s();
        String o = o(s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dl81Var.d(0, i2, bArr);
        int n = n(0, bArr);
        String str = new String(bArr, 0, n, "ISO-8859-1");
        int i3 = n + 1;
        int d = d(i3, s, bArr);
        String f = f(i3, d, o, bArr);
        int c = c(s) + d;
        int d2 = d(c, s, bArr);
        String f2 = f(c, d2, o, bArr);
        int c2 = c(s) + d2;
        return new mx0(str, f, f2, i2 <= c2 ? rf71.f : Arrays.copyOfRange(bArr, c2, i2));
    }

    public static ot q(dl81 dl81Var, int i, int i2, boolean z, int i3, yx61 yx61Var) {
        int i4 = dl81Var.b;
        int n = n(i4, dl81Var.a);
        String str = new String(dl81Var.a, i4, n - i4, "ISO-8859-1");
        dl81Var.m(n + 1);
        int s = dl81Var.s();
        boolean z2 = (s & 2) != 0;
        boolean z3 = (s & 1) != 0;
        int s2 = dl81Var.s();
        String[] strArr = new String[s2];
        for (int i5 = 0; i5 < s2; i5++) {
            int i6 = dl81Var.b;
            int n2 = n(i6, dl81Var.a);
            strArr[i5] = new String(dl81Var.a, i6, n2 - i6, "ISO-8859-1");
            dl81Var.m(n2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (dl81Var.b < i7) {
            g11 j = j(i2, dl81Var, z, i3, yx61Var);
            if (j != null) {
                arrayList.add(j);
            }
        }
        return new ot(str, z2, z3, strArr, (g11[]) arrayList.toArray(new g11[0]));
    }

    public static w83 r(int i, String str, dl81 dl81Var) {
        byte[] bArr = new byte[i];
        dl81Var.d(0, i, bArr);
        return new w83(str, null, new String(bArr, 0, n(0, bArr), "ISO-8859-1"));
    }

    public static ts1 s(int i, dl81 dl81Var) {
        int x = dl81Var.x();
        int u = dl81Var.u();
        int u2 = dl81Var.u();
        int s = dl81Var.s();
        int s2 = dl81Var.s();
        uh81 uh81Var = new uh81();
        byte[] bArr = dl81Var.a;
        int i2 = dl81Var.c;
        uh81Var.a = bArr;
        uh81Var.b = 0;
        uh81Var.c = 0;
        uh81Var.d = i2;
        uh81Var.f(dl81Var.b * 8);
        int i3 = ((i - 10) * 8) / (s + s2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int a = uh81Var.a(s);
            int a2 = uh81Var.a(s2);
            iArr[i4] = a;
            iArr2[i4] = a2;
        }
        return new ts1(x, u, u2, iArr, iArr2);
    }

    public static ah2 t(int i, dl81 dl81Var) {
        byte[] bArr = new byte[i];
        dl81Var.d(0, i, bArr);
        int n = n(0, bArr);
        String str = new String(bArr, 0, n, "ISO-8859-1");
        int i2 = n + 1;
        return new ah2(str, i <= i2 ? rf71.f : Arrays.copyOfRange(bArr, i2, i));
    }

    public static c43 u(int i, dl81 dl81Var) {
        if (i < 1) {
            return null;
        }
        int s = dl81Var.s();
        String o = o(s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dl81Var.d(0, i2, bArr);
        int d = d(0, s, bArr);
        String str = new String(bArr, 0, d, o);
        int c = c(s) + d;
        return new c43("TXXX", str, f(c, d(c, s, bArr), o, bArr));
    }

    public static w83 v(int i, dl81 dl81Var) {
        if (i < 1) {
            return null;
        }
        int s = dl81Var.s();
        String o = o(s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dl81Var.d(0, i2, bArr);
        int d = d(0, s, bArr);
        String str = new String(bArr, 0, d, o);
        int c = c(s) + d;
        return new w83("WXXX", str, f(c, n(c, bArr), "ISO-8859-1", bArr));
    }

    public static int w(int i, dl81 dl81Var) {
        byte[] bArr = dl81Var.a;
        int i2 = dl81Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    @Override // defpackage.eo71
    public final cs1 b(u471 u471Var, ByteBuffer byteBuffer) {
        return i(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cs1 i(int i, byte[] bArr) {
        v5v v5vVar;
        ArrayList arrayList = new ArrayList();
        dl81 dl81Var = new dl81(bArr, i);
        boolean z = false;
        if (i - dl81Var.b < 10) {
            nba1.e();
        } else {
            int u = dl81Var.u();
            if (u == 4801587) {
                int s = dl81Var.s();
                dl81Var.m(dl81Var.b + 1);
                int s2 = dl81Var.s();
                int r = dl81Var.r();
                if (s == 2) {
                    if ((s2 & 64) != 0) {
                        nba1.e();
                    }
                    v5vVar = new v5v(s, r, s >= 4 && (s2 & 128) != 0);
                } else {
                    if (s == 3) {
                        if ((s2 & 64) != 0) {
                            int a = dl81Var.a();
                            dl81Var.m(dl81Var.b + a);
                            r -= a + 4;
                        }
                    } else if (s == 4) {
                        if ((s2 & 64) != 0) {
                            int r2 = dl81Var.r();
                            dl81Var.m(dl81Var.b + (r2 - 4));
                            r -= r2;
                        }
                        if ((s2 & 16) != 0) {
                            r -= 10;
                        }
                    } else {
                        nba1.e();
                    }
                    v5vVar = new v5v(s, r, s >= 4 && (s2 & 128) != 0);
                }
                if (v5vVar != null) {
                    return null;
                }
                int i2 = v5vVar.a;
                int i3 = dl81Var.b;
                int i4 = i2 == 2 ? 6 : 10;
                int i5 = v5vVar.c;
                if (v5vVar.b) {
                    i5 = w(i5, dl81Var);
                }
                dl81Var.k(i3 + i5);
                if (!m(dl81Var, i2, i4, false)) {
                    if (i2 != 4 || !m(dl81Var, 4, i4, true)) {
                        nba1.e();
                        return null;
                    }
                    z = true;
                }
                while (dl81Var.c - dl81Var.b >= i4) {
                    g11 j = j(i2, dl81Var, z, i4, this.a);
                    if (j != null) {
                        arrayList.add(j);
                    }
                }
                return new cs1(arrayList);
            }
            String.format("%06X", Integer.valueOf(u));
            nba1.e();
        }
        v5vVar = null;
        if (v5vVar != null) {
        }
    }

    public n571(yx61 yx61Var) {
        this.a = yx61Var;
    }
}
