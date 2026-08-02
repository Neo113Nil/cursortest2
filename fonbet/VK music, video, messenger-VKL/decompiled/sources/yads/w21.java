package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import xsna.itj0;

/* loaded from: classes10.dex */
public final class w21 extends h03 {
    public static final u21 b = new itj0(12);
    public final u21 a;

    public w21(u21 u21Var) {
        this.a = u21Var;
    }

    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public static lu1 c(int i, kc2 kc2Var) {
        int r = kc2Var.r();
        int o = kc2Var.o();
        int o2 = kc2Var.o();
        int m = kc2Var.m();
        int m2 = kc2Var.m();
        jc2 jc2Var = new jc2();
        jc2Var.a(kc2Var.c, kc2Var.a);
        jc2Var.b(kc2Var.b * 8);
        int i2 = ((i - 10) * 8) / (m + m2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a = jc2Var.a(m);
            int a2 = jc2Var.a(m2);
            iArr[i3] = a;
            iArr2[i3] = a2;
        }
        return new lu1(r, o, o2, iArr, iArr2);
    }

    public static wj2 d(int i, kc2 kc2Var) {
        byte[] bArr = new byte[i];
        kc2Var.a(bArr, 0, i);
        int b2 = b(0, bArr);
        String str = new String(bArr, 0, b2, "ISO-8859-1");
        int i2 = b2 + 1;
        return new wj2(str, i <= i2 ? mc3.f : Arrays.copyOfRange(bArr, i2, i));
    }

    public static c73 e(int i, kc2 kc2Var) {
        if (i < 1) {
            return null;
        }
        int m = kc2Var.m();
        String b2 = b(m);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kc2Var.a(bArr, 0, i2);
        int a = a(bArr, 0, m);
        String str = new String(bArr, 0, a, b2);
        int a2 = a(m) + a;
        return new c73("TXXX", str, a(a2, a(bArr, a2, m), b2, bArr));
    }

    public static yb3 f(int i, kc2 kc2Var) {
        if (i < 1) {
            return null;
        }
        int m = kc2Var.m();
        String b2 = b(m);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kc2Var.a(bArr, 0, i2);
        int a = a(bArr, 0, m);
        String str = new String(bArr, 0, a, b2);
        int a2 = a(m) + a;
        return new yb3("WXXX", str, a(a2, b(a2, bArr), "ISO-8859-1", bArr));
    }

    public static int g(int i, kc2 kc2Var) {
        byte[] bArr = kc2Var.a;
        int i2 = kc2Var.b;
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

    public static wt b(kc2 kc2Var, int i, int i2, boolean z, int i3, u21 u21Var) {
        int i4 = kc2Var.b;
        int b2 = b(i4, kc2Var.a);
        String str = new String(kc2Var.a, i4, b2 - i4, "ISO-8859-1");
        kc2Var.e(b2 + 1);
        int m = kc2Var.m();
        boolean z2 = (m & 2) != 0;
        boolean z3 = (m & 1) != 0;
        int m2 = kc2Var.m();
        String[] strArr = new String[m2];
        for (int i5 = 0; i5 < m2; i5++) {
            int i6 = kc2Var.b;
            int b3 = b(i6, kc2Var.a);
            strArr[i5] = new String(kc2Var.a, i6, b3 - i6, "ISO-8859-1");
            kc2Var.e(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (kc2Var.b < i7) {
            x21 a = a(i2, kc2Var, z, i3, u21Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new wt(str, z2, z3, strArr, (x21[]) arrayList.toArray(new x21[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ut1 a(int i, byte[] bArr) {
        v21 v21Var;
        ArrayList arrayList = new ArrayList();
        kc2 kc2Var = new kc2(i, bArr);
        boolean z = false;
        if (i - kc2Var.b < 10) {
            ji1.d("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int o = kc2Var.o();
            if (o == 4801587) {
                int m = kc2Var.m();
                kc2Var.e(kc2Var.b + 1);
                int m2 = kc2Var.m();
                int l = kc2Var.l();
                if (m == 2) {
                    if ((m2 & 64) != 0) {
                        ji1.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    v21Var = new v21(m, l, m >= 4 && (m2 & 128) != 0);
                } else {
                    if (m == 3) {
                        if ((m2 & 64) != 0) {
                            int b2 = kc2Var.b();
                            kc2Var.e(kc2Var.b + b2);
                            l -= b2 + 4;
                        }
                    } else if (m == 4) {
                        if ((m2 & 64) != 0) {
                            int l2 = kc2Var.l();
                            kc2Var.e(kc2Var.b + (l2 - 4));
                            l -= l2;
                        }
                        if ((m2 & 16) != 0) {
                            l -= 10;
                        }
                    } else {
                        lg1.a("Skipped ID3 tag with unsupported majorVersion=", m, "Id3Decoder");
                    }
                    v21Var = new v21(m, l, m >= 4 && (m2 & 128) != 0);
                }
                if (v21Var != null) {
                    return null;
                }
                int i2 = kc2Var.b;
                int i3 = v21Var.a == 2 ? 6 : 10;
                int i4 = v21Var.c;
                if (v21Var.b) {
                    i4 = g(i4, kc2Var);
                }
                kc2Var.d(i2 + i4);
                if (!a(kc2Var, v21Var.a, i3, false)) {
                    if (v21Var.a != 4 || !a(kc2Var, 4, i3, true)) {
                        ji1.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + v21Var.a);
                        return null;
                    }
                    z = true;
                }
                while (kc2Var.c - kc2Var.b >= i3) {
                    x21 a = a(v21Var.a, kc2Var, z, i3, this.a);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                return new ut1(arrayList);
            }
            ji1.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(o))));
        }
        v21Var = null;
        if (v21Var != null) {
        }
    }

    public static cz0 b(int i, kc2 kc2Var) {
        byte[] copyOfRange;
        int m = kc2Var.m();
        String b2 = b(m);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kc2Var.a(bArr, 0, i2);
        int b3 = b(0, bArr);
        String str = new String(bArr, 0, b3, "ISO-8859-1");
        int i3 = b3 + 1;
        int a = a(bArr, i3, m);
        String a2 = a(i3, a, b2, bArr);
        int a3 = a(m) + a;
        int a4 = a(bArr, a3, m);
        String a5 = a(a3, a4, b2, bArr);
        int a6 = a(m) + a4;
        if (i2 <= a6) {
            copyOfRange = mc3.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, a6, i2);
        }
        return new cz0(str, a2, a5, copyOfRange);
    }

    @Override // yads.h03
    public final ut1 a(xt1 xt1Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }

    public static ag a(int i, int i2, kc2 kc2Var) {
        int b2;
        String a;
        byte[] copyOfRange;
        int m = kc2Var.m();
        String b3 = b(m);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        kc2Var.a(bArr, 0, i3);
        if (i2 == 2) {
            String str = "image/" + ki.a(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            a = str;
            b2 = 2;
        } else {
            b2 = b(0, bArr);
            a = ki.a(new String(bArr, 0, b2, "ISO-8859-1"));
            if (a.indexOf(47) == -1) {
                a = "image/".concat(a);
            }
        }
        int i4 = bArr[b2 + 1] & 255;
        int i5 = b2 + 2;
        int a2 = a(bArr, i5, m);
        String str2 = new String(bArr, i5, a2 - i5, b3);
        int a3 = a(m) + a2;
        if (i3 <= a3) {
            copyOfRange = mc3.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, a3, i3);
        }
        return new ag(a, str2, i4, copyOfRange);
    }

    public static yb3 b(int i, kc2 kc2Var, String str) {
        byte[] bArr = new byte[i];
        kc2Var.a(bArr, 0, i);
        return new yb3(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static String b(int i) {
        if (i == 1) {
            return C.UTF16_NAME;
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i != 3) {
            return "ISO-8859-1";
        }
        return C.UTF8_NAME;
    }

    public static int b(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static ut a(kc2 kc2Var, int i, int i2, boolean z, int i3, u21 u21Var) {
        int i4 = kc2Var.b;
        int b2 = b(i4, kc2Var.a);
        String str = new String(kc2Var.a, i4, b2 - i4, "ISO-8859-1");
        kc2Var.e(b2 + 1);
        int b3 = kc2Var.b();
        int b4 = kc2Var.b();
        long n = kc2Var.n();
        if (n == 4294967295L) {
            n = -1;
        }
        long n2 = kc2Var.n();
        long j = n2 == 4294967295L ? -1L : n2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (kc2Var.b < i5) {
            x21 a = a(i2, kc2Var, z, i3, u21Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new ut(str, b3, b4, n, j, (x21[]) arrayList.toArray(new x21[0]));
    }

    public static px a(int i, kc2 kc2Var) {
        if (i < 4) {
            return null;
        }
        int m = kc2Var.m();
        String b2 = b(m);
        byte[] bArr = new byte[3];
        kc2Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        kc2Var.a(bArr2, 0, i2);
        int a = a(bArr2, 0, m);
        String str2 = new String(bArr2, 0, a, b2);
        int a2 = a(m) + a;
        return new px(str, str2, a(a2, a(bArr2, a2, m), b2, bArr2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01af, code lost:
    
        if (r4 == 67) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0237 A[Catch: all -> 0x020e, UnsupportedEncodingException -> 0x0256, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x0256, blocks: (B:61:0x0237, B:137:0x0209, B:145:0x0220, B:146:0x0225), top: B:52:0x011c }] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [yads.kc2] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [yads.kc2] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x21 a(int i, kc2 kc2Var, boolean z, int i2, u21 u21Var) {
        int o;
        ?? r1;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        x21 x21Var;
        boolean z4;
        boolean z5;
        kc2 kc2Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        kc2 kc2Var3;
        x21 mpVar;
        int i10 = i;
        int m = kc2Var.m();
        int m2 = kc2Var.m();
        int m3 = kc2Var.m();
        int m4 = i10 >= 3 ? kc2Var.m() : 0;
        if (i10 == 4) {
            o = kc2Var.p();
            if (!z) {
                o = (((o >> 24) & 255) << 21) | (o & 255) | (((o >> 8) & 255) << 7) | (((o >> 16) & 255) << 14);
            }
        } else if (i10 == 3) {
            o = kc2Var.p();
        } else {
            o = kc2Var.o();
        }
        int i11 = o;
        int r = i10 >= 3 ? kc2Var.r() : 0;
        if (m == 0 && m2 == 0 && m3 == 0 && m4 == 0 && i11 == 0 && r == 0) {
            kc2Var.e(kc2Var.c);
            return null;
        }
        int i12 = kc2Var.b + i11;
        if (i12 > kc2Var.c) {
            ji1.d("Id3Decoder", "Frame size exceeds remaining tag data");
            kc2Var.e(kc2Var.c);
            return null;
        }
        if (u21Var != null) {
            boolean a = u21Var.a(i10, m, m2, m3, m4);
            i10 = i10;
            r1 = m2;
            i3 = m;
            i4 = m3;
            i5 = m4;
            if (!a) {
                kc2Var.e(i12);
                return null;
            }
        } else {
            r1 = m2;
            i3 = m;
            i4 = m3;
            i5 = m4;
        }
        if (i10 == 3) {
            z2 = (r & 128) != 0;
            z4 = (r & 64) != 0;
            z5 = false;
            x21Var = (r & 32) != 0 ? 1 : null;
            z3 = z2;
        } else if (i10 == 4) {
            x21 x21Var2 = (r & 64) != 0 ? 1 : null;
            boolean z6 = (r & 8) != 0;
            z4 = (r & 4) != 0;
            z5 = (r & 2) != 0;
            if ((r & 1) != 0) {
                boolean z7 = z6;
                x21Var = x21Var2;
                z2 = z7;
                z3 = true;
            } else {
                boolean z8 = z6;
                x21Var = x21Var2;
                z2 = z8;
                z3 = false;
            }
        } else {
            z2 = false;
            z3 = false;
            x21Var = null;
            z4 = false;
            z5 = false;
        }
        if (!z2 && !z4) {
            if (x21Var != null) {
                i11--;
                kc2Var.e(kc2Var.b + 1);
            }
            if (z3) {
                i11 -= 4;
                kc2Var.e(kc2Var.b + 4);
            }
            if (z5) {
                i11 = g(i11, kc2Var);
            }
            try {
                try {
                    try {
                        try {
                            if (i3 == 84 && r1 == 88 && i4 == 88 && (i10 == 2 || i5 == 88)) {
                                mpVar = e(i11, kc2Var);
                            } else if (i3 == 84) {
                                mpVar = a(i11, kc2Var, a(i10, i3, (int) r1, i4, i5));
                            } else if (i3 == 87 && r1 == 88 && i4 == 88 && (i10 == 2 || i5 == 88)) {
                                mpVar = f(i11, kc2Var);
                            } else if (i3 == 87) {
                                mpVar = b(i11, kc2Var, a(i10, i3, (int) r1, i4, i5));
                            } else {
                                x21Var = null;
                                try {
                                    if (i3 == 80 && r1 == 82 && i4 == 73 && i5 == 86) {
                                        mpVar = d(i11, kc2Var);
                                    } else if (i3 == 71 && r1 == 69 && i4 == 79 && (i5 == 66 || i10 == 2)) {
                                        mpVar = b(i11, kc2Var);
                                    } else {
                                        if (i10 != 2) {
                                            if (i3 == 65) {
                                                if (r1 == 80) {
                                                    if (i4 == 73) {
                                                    }
                                                }
                                            }
                                            if (i3 != 67) {
                                            }
                                            if (i3 != 67) {
                                            }
                                            int i13 = i11;
                                            i6 = i4;
                                            i7 = i13;
                                            i8 = r1;
                                            i9 = i5;
                                            if (i3 != 67) {
                                            }
                                            i10 = i;
                                            kc2Var3 = kc2Var;
                                            if (i3 != 77) {
                                            }
                                            String a2 = a(i10, i3, i8, i6, i9);
                                            byte[] bArr = new byte[i7];
                                            kc2Var3.a(bArr, 0, i7);
                                            mpVar = new mp(a2, bArr);
                                            r1 = kc2Var3;
                                            if (mpVar == null) {
                                            }
                                            r1.e(i12);
                                            return mpVar;
                                        }
                                        if (i3 == 80 && r1 == 73 && i4 == 67) {
                                            mpVar = a(i11, i10, kc2Var);
                                        }
                                        if (i3 != 67 && r1 == 79 && i4 == 77 && (i5 == 77 || i10 == 2)) {
                                            mpVar = a(i11, kc2Var);
                                        } else {
                                            if (i3 != 67 && r1 == 72 && i4 == 65 && i5 == 80) {
                                                int i14 = i11;
                                                i6 = i4;
                                                i7 = i14;
                                                i8 = r1;
                                                i9 = i5;
                                                try {
                                                    mpVar = a(kc2Var, i7, i10, z, i2, u21Var);
                                                    i10 = i;
                                                    r1 = kc2Var;
                                                } catch (UnsupportedEncodingException unused) {
                                                    r1 = kc2Var;
                                                    ji1.d("Id3Decoder", "Unsupported character encoding");
                                                    r1.e(i12);
                                                    return x21Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    kc2Var2 = kc2Var;
                                                    kc2Var2.e(i12);
                                                    throw th;
                                                }
                                            } else {
                                                int i132 = i11;
                                                i6 = i4;
                                                i7 = i132;
                                                i8 = r1;
                                                i9 = i5;
                                                if (i3 != 67 && i8 == 84 && i6 == 79 && i9 == 67) {
                                                    i10 = i;
                                                    kc2 kc2Var4 = kc2Var;
                                                    mpVar = b(kc2Var4, i7, i10, z, i2, u21Var);
                                                    r1 = kc2Var4;
                                                } else {
                                                    i10 = i;
                                                    kc2Var3 = kc2Var;
                                                    if (i3 != 77 && i8 == 76 && i6 == 76 && i9 == 84) {
                                                        mpVar = c(i7, kc2Var3);
                                                        r1 = kc2Var3;
                                                    } else {
                                                        String a22 = a(i10, i3, i8, i6, i9);
                                                        byte[] bArr2 = new byte[i7];
                                                        kc2Var3.a(bArr2, 0, i7);
                                                        mpVar = new mp(a22, bArr2);
                                                        r1 = kc2Var3;
                                                    }
                                                }
                                            }
                                            if (mpVar == null) {
                                                ji1.d("Id3Decoder", "Failed to decode frame: id=" + a(i10, i3, i8, i6, i9) + ", frameSize=" + i7);
                                            }
                                            r1.e(i12);
                                            return mpVar;
                                        }
                                    }
                                    int i15 = i11;
                                    i6 = i4;
                                    i7 = i15;
                                    i8 = r1;
                                    i9 = i5;
                                    r1 = kc2Var;
                                    if (mpVar == null) {
                                    }
                                    r1.e(i12);
                                    return mpVar;
                                } catch (UnsupportedEncodingException unused2) {
                                    r1 = kc2Var;
                                }
                            }
                            int i16 = i11;
                            i6 = i4;
                            i7 = i16;
                            i8 = r1;
                            i9 = i5;
                            r1 = kc2Var;
                            x21Var = null;
                            if (mpVar == null) {
                            }
                            r1.e(i12);
                            return mpVar;
                        } catch (UnsupportedEncodingException unused3) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        kc2Var2 = kc2Var;
                    }
                } catch (UnsupportedEncodingException unused4) {
                    r1 = kc2Var;
                    x21Var = null;
                }
            } catch (Throwable th3) {
                th = th3;
                kc2Var2 = r1;
            }
        } else {
            ji1.d("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            kc2Var.e(i12);
            return null;
        }
    }

    public static String a(int i, int i2, String str, byte[] bArr) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, str);
        }
        return "";
    }

    public static c73 a(int i, kc2 kc2Var, String str) {
        if (i < 1) {
            return null;
        }
        int m = kc2Var.m();
        String b2 = b(m);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kc2Var.a(bArr, 0, i2);
        return new c73(str, null, new String(bArr, 0, a(bArr, 0, m), b2));
    }

    public static String a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int a(byte[] bArr, int i, int i2) {
        int b2 = b(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if ((b2 - i) % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(b2 + 1, bArr);
        }
        return bArr.length;
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
    public static boolean a(kc2 kc2Var, int i, int i2, boolean z) {
        int o;
        long o2;
        int i3;
        int i4;
        int i5 = kc2Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (kc2Var.c - kc2Var.b < i2) {
                    kc2Var.e(i5);
                    return true;
                }
                if (i >= 3) {
                    o = kc2Var.b();
                    o2 = kc2Var.n();
                    i3 = kc2Var.r();
                } else {
                    o = kc2Var.o();
                    o2 = kc2Var.o();
                    i3 = 0;
                }
                if (o == 0 && o2 == 0 && i3 == 0) {
                    kc2Var.e(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & o2) != 0) {
                        kc2Var.e(i5);
                        return false;
                    }
                    o2 = (((o2 >> 24) & 255) << 21) | (o2 & 255) | (((o2 >> 8) & 255) << 7) | (((o2 >> 16) & 255) << 14);
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
                    if (o2 < i4) {
                        kc2Var.e(i5);
                        return false;
                    }
                    int i6 = kc2Var.c;
                    int i7 = kc2Var.b;
                    if (i6 - i7 < o2) {
                        kc2Var.e(i5);
                        return false;
                    }
                    kc2Var.e(i7 + ((int) o2));
                }
            } catch (Throwable th) {
                kc2Var.e(i5);
                throw th;
            }
        }
    }
}
