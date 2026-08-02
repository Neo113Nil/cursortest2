package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Id3Decoder.java */
/* loaded from: classes12.dex */
public final class zrv extends b920 {
    public static final w11 d = new w11(19);

    @Nullable
    public final a c;

    /* compiled from: Id3Decoder.java */
    public interface a {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* compiled from: Id3Decoder.java */
    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public zrv(@Nullable a aVar) {
        this.c = aVar;
    }

    @Nullable
    public static lio0 A(int i, String str, xi90 xi90Var) {
        if (i < 1) {
            return null;
        }
        int C = xi90Var.C();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xi90Var.n(bArr, 0, i2);
        return new lio0(str, null, B(C, 0, bArr));
    }

    public static com.google.common.collect.g B(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return ImmutableList.p("");
        }
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        int I = I(i2, i, bArr);
        while (i2 < I) {
            aVar.c(new String(bArr, i2, I - i2, G(i)));
            i2 = F(i) + I;
            I = I(i2, i, bArr);
        }
        com.google.common.collect.g g = aVar.g();
        return g.isEmpty() ? ImmutableList.p("") : g;
    }

    @Nullable
    public static lio0 C(int i, xi90 xi90Var) {
        if (i < 1) {
            return null;
        }
        int C = xi90Var.C();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xi90Var.n(bArr, 0, i2);
        int I = I(0, C, bArr);
        return new lio0("TXXX", new String(bArr, 0, I, G(C)), B(C, F(C) + I, bArr));
    }

    public static bfq0 D(int i, String str, xi90 xi90Var) {
        byte[] bArr = new byte[i];
        xi90Var.n(bArr, 0, i);
        return new bfq0(str, null, new String(bArr, 0, J(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    @Nullable
    public static bfq0 E(int i, xi90 xi90Var) {
        if (i < 1) {
            return null;
        }
        int C = xi90Var.C();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xi90Var.n(bArr, 0, i2);
        int I = I(0, C, bArr);
        String str = new String(bArr, 0, I, G(C));
        int F = F(C) + I;
        return new bfq0("WXXX", str, z(bArr, F, J(bArr, F), StandardCharsets.ISO_8859_1));
    }

    public static int F(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset G(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String H(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int I(int i, int i2, byte[] bArr) {
        int J = J(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return J;
        }
        while (J < bArr.length - 1) {
            if ((J - i) % 2 == 0 && bArr[J + 1] == 0) {
                return J;
            }
            J = J(bArr, J + 1);
        }
        return bArr.length;
    }

    public static int J(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int K(int i, xi90 xi90Var) {
        byte[] bArr = xi90Var.a;
        int i2 = xi90Var.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean L(xi90 xi90Var, int i, int i2, boolean z) {
        int F;
        long F2;
        int i3;
        int i4;
        int i5 = xi90Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (xi90Var.a() < i2) {
                    xi90Var.P(i5);
                    return true;
                }
                if (i >= 3) {
                    F = xi90Var.p();
                    F2 = xi90Var.E();
                    i3 = xi90Var.J();
                } else {
                    F = xi90Var.F();
                    F2 = xi90Var.F();
                    i3 = 0;
                }
                if (F == 0 && F2 == 0 && i3 == 0) {
                    xi90Var.P(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & F2) != 0) {
                        xi90Var.P(i5);
                        return false;
                    }
                    F2 = (((F2 >> 24) & 255) << 21) | (F2 & 255) | (((F2 >> 8) & 255) << 7) | (((F2 >> 16) & 255) << 14);
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
                    if (F2 < i4) {
                        xi90Var.P(i5);
                        return false;
                    }
                    if (xi90Var.a() < F2) {
                        xi90Var.P(i5);
                        return false;
                    }
                    xi90Var.Q((int) F2);
                }
            } catch (Throwable th) {
                xi90Var.P(i5);
                throw th;
            }
        }
    }

    public static x03 r(xi90 xi90Var, int i, int i2) {
        int J;
        String concat;
        int C = xi90Var.C();
        Charset G = G(C);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        xi90Var.n(bArr, 0, i3);
        if (i2 == 2) {
            concat = "image/" + o19.u(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            J = 2;
        } else {
            J = J(bArr, 0);
            String u = o19.u(new String(bArr, 0, J, StandardCharsets.ISO_8859_1));
            concat = u.indexOf(47) == -1 ? "image/".concat(u) : u;
        }
        int i4 = bArr[J + 1] & 255;
        int i5 = J + 2;
        int I = I(i5, C, bArr);
        String str = new String(bArr, i5, I - i5, G);
        int F = F(C) + I;
        return new x03(concat, str, i4, i3 <= F ? y2r0.b : Arrays.copyOfRange(bArr, F, i3));
    }

    public static glb s(xi90 xi90Var, int i, int i2, boolean z, int i3, @Nullable a aVar) {
        int i4 = xi90Var.b;
        int J = J(xi90Var.a, i4);
        String str = new String(xi90Var.a, i4, J - i4, StandardCharsets.ISO_8859_1);
        xi90Var.P(J + 1);
        int p = xi90Var.p();
        int p2 = xi90Var.p();
        long E = xi90Var.E();
        if (E == 4294967295L) {
            E = -1;
        }
        long E2 = xi90Var.E();
        long j = E2 == 4294967295L ? -1L : E2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (xi90Var.b < i5) {
            asv v = v(i2, xi90Var, z, i3, aVar);
            if (v != null) {
                arrayList.add(v);
            }
        }
        return new glb(str, p, p2, E, j, (asv[]) arrayList.toArray(new asv[0]));
    }

    public static klb t(xi90 xi90Var, int i, int i2, boolean z, int i3, @Nullable a aVar) {
        int i4 = xi90Var.b;
        int J = J(xi90Var.a, i4);
        String str = new String(xi90Var.a, i4, J - i4, StandardCharsets.ISO_8859_1);
        xi90Var.P(J + 1);
        int C = xi90Var.C();
        boolean z2 = (C & 2) != 0;
        boolean z3 = (C & 1) != 0;
        int C2 = xi90Var.C();
        String[] strArr = new String[C2];
        for (int i5 = 0; i5 < C2; i5++) {
            int i6 = xi90Var.b;
            int J2 = J(xi90Var.a, i6);
            strArr[i5] = new String(xi90Var.a, i6, J2 - i6, StandardCharsets.ISO_8859_1);
            xi90Var.P(J2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (xi90Var.b < i7) {
            asv v = v(i2, xi90Var, z, i3, aVar);
            if (v != null) {
                arrayList.add(v);
            }
        }
        return new klb(str, z2, z3, strArr, (asv[]) arrayList.toArray(new asv[0]));
    }

    @Nullable
    public static pbg u(int i, xi90 xi90Var) {
        if (i < 4) {
            return null;
        }
        int C = xi90Var.C();
        Charset G = G(C);
        byte[] bArr = new byte[3];
        xi90Var.n(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        xi90Var.n(bArr2, 0, i2);
        int I = I(0, C, bArr2);
        String str2 = new String(bArr2, 0, I, G);
        int F = F(C) + I;
        return new pbg(str, str2, z(bArr2, F, I(F, C, bArr2), G));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023b  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [xsna.asv] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [xsna.xi90] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static asv v(int i, xi90 xi90Var, boolean z, int i2, @Nullable a aVar) {
        int G;
        int i3;
        int i4;
        int i5;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        xi90 xi90Var2;
        Throwable th;
        xi90 xi90Var3;
        int i8;
        xi90 xi90Var4;
        ?? r12;
        asv s27Var;
        int i9 = i;
        int C = xi90Var.C();
        int C2 = xi90Var.C();
        int C3 = xi90Var.C();
        int C4 = i9 >= 3 ? xi90Var.C() : 0;
        if (i9 == 4) {
            G = xi90Var.G();
            if (!z) {
                G = (((G >> 24) & 255) << 21) | (G & 255) | (((G >> 8) & 255) << 7) | (((G >> 16) & 255) << 14);
            }
        } else {
            G = i9 == 3 ? xi90Var.G() : xi90Var.F();
        }
        int i10 = G;
        int J = i9 >= 3 ? xi90Var.J() : 0;
        if (C == 0 && C2 == 0 && C3 == 0 && C4 == 0 && i10 == 0 && J == 0) {
            xi90Var.P(xi90Var.c);
            return null;
        }
        int i11 = xi90Var.b + i10;
        if (i11 > xi90Var.c) {
            ahn.F("Frame size exceeds remaining tag data");
            xi90Var.P(xi90Var.c);
            return null;
        }
        if (aVar != null) {
            boolean evaluate = aVar.evaluate(i9, C, C2, C3, C4);
            i9 = i9;
            r1 = C2;
            i3 = C;
            i4 = C3;
            i5 = C4;
            if (!evaluate) {
                xi90Var.P(i11);
                return null;
            }
        } else {
            i3 = C;
            i4 = C3;
            i5 = C4;
            r1 = C2;
        }
        if (i9 == 3) {
            z2 = (J & 128) != 0;
            z3 = (J & 64) != 0;
            z6 = false;
            z5 = (J & 32) != 0;
            z4 = z2;
        } else if (i9 == 4) {
            boolean z7 = (J & 64) != 0;
            boolean z8 = (J & 8) != 0;
            boolean z9 = (J & 4) != 0;
            z6 = (J & 2) != 0;
            z4 = (J & 1) != 0;
            boolean z10 = z9;
            z5 = z7;
            z2 = z8;
            z3 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z3) {
            ahn.F("Skipping unsupported compressed or encrypted frame");
            xi90Var.P(i11);
            return null;
        }
        if (z5) {
            i10--;
            xi90Var.Q(1);
        }
        if (z4) {
            i10 -= 4;
            xi90Var.Q(4);
        }
        if (z6) {
            i10 = K(i10, xi90Var);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                xi90Var3 = xi90Var;
            }
        } catch (Exception e) {
            e = e;
            i6 = r1;
            i7 = i4;
            xi90Var2 = xi90Var;
            i4 = i10;
            th = null;
            i8 = i5;
            xi90Var4 = xi90Var2;
            xi90Var4.P(i11);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        } catch (OutOfMemoryError e2) {
            e = e2;
            i6 = r1;
            i7 = i4;
            xi90Var2 = xi90Var;
            i4 = i10;
            th = null;
            i8 = i5;
            xi90Var4 = xi90Var2;
            xi90Var4.P(i11);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        }
        if (i3 == 84 && r1 == 88 && i4 == 88 && (i9 == 2 || i5 == 88)) {
            s27Var = C(i10, xi90Var);
        } else if (i3 == 84) {
            s27Var = A(i10, H(i9, i3, r1, i4, i5), xi90Var);
        } else if (i3 == 87 && r1 == 88 && i4 == 88 && (i9 == 2 || i5 == 88)) {
            s27Var = E(i10, xi90Var);
        } else if (i3 == 87) {
            s27Var = D(i10, H(i9, i3, r1, i4, i5), xi90Var);
        } else if (i3 == 80 && r1 == 82 && i4 == 73 && i5 == 86) {
            s27Var = y(i10, xi90Var);
        } else {
            if (i3 != 71 || r1 != 69 || i4 != 79 || (i5 != 66 && i9 != 2)) {
                th = null;
                try {
                } catch (Exception e3) {
                    e = e3;
                    i6 = r1;
                    i7 = i4;
                    xi90Var2 = xi90Var;
                    i4 = i10;
                    i8 = i5;
                    xi90Var4 = xi90Var2;
                    xi90Var4.P(i11);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    i6 = r1;
                    i7 = i4;
                    xi90Var2 = xi90Var;
                    i4 = i10;
                    i8 = i5;
                    xi90Var4 = xi90Var2;
                    xi90Var4.P(i11);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                }
                if (i9 != 2 ? i3 == 65 && r1 == 80 && i4 == 73 && i5 == 67 : i3 == 80 && r1 == 73 && i4 == 67) {
                    s27Var = r(xi90Var, i10, i9);
                } else {
                    if (i3 != 67 || r1 != 79 || i4 != 77 || (i5 != 77 && i9 != 2)) {
                        if (i3 == 67 && r1 == 72 && i4 == 65 && i5 == 80) {
                            i6 = r1;
                            i7 = i4;
                            i4 = i10;
                            i8 = i5;
                            try {
                                s27Var = s(xi90Var, i4, i9, z, i2, aVar);
                                i9 = i;
                                r1 = xi90Var;
                            } catch (Exception e5) {
                                e = e5;
                                i9 = i;
                                xi90Var4 = xi90Var;
                                xi90Var4.P(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                i9 = i;
                                xi90Var4 = xi90Var;
                                xi90Var4.P(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th3) {
                                th = th3;
                                xi90Var3 = xi90Var;
                                xi90Var3.P(i11);
                                throw th;
                            }
                        } else {
                            i6 = r1;
                            i7 = i4;
                            i4 = i10;
                            i8 = i5;
                            try {
                                if (i3 == 67 && i6 == 84 && i7 == 79 && i8 == 67) {
                                    i9 = i;
                                    xi90 xi90Var5 = xi90Var;
                                    s27Var = t(xi90Var5, i4, i9, z, i2, aVar);
                                    r1 = xi90Var5;
                                } else {
                                    i9 = i;
                                    xi90 xi90Var6 = xi90Var;
                                    if (i3 == 77 && i6 == 76 && i7 == 76 && i8 == 84) {
                                        s27Var = x(i4, xi90Var6);
                                        r1 = xi90Var6;
                                    } else {
                                        String H = H(i9, i3, i6, i7, i8);
                                        byte[] bArr = new byte[i4];
                                        xi90Var6.n(bArr, 0, i4);
                                        s27Var = new s27(H, bArr);
                                        r1 = xi90Var6;
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                xi90Var4 = r1;
                                xi90Var4.P(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e8) {
                                e = e8;
                                xi90Var4 = r1;
                                xi90Var4.P(i11);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th4) {
                                th = th4;
                                xi90Var3 = r1;
                                xi90Var3.P(i11);
                                throw th;
                            }
                        }
                        r1.P(i11);
                        r12 = s27Var;
                        e = th;
                        if (r12 == 0) {
                            ahn.G("Failed to decode frame: id=" + H(i9, i3, i6, i7, i8) + ", frameSize=" + i4, e);
                        }
                        return r12;
                    }
                    s27Var = u(i10, xi90Var);
                }
                i6 = r1;
                i7 = i4;
                r1 = xi90Var;
                i4 = i10;
                r1 = r1;
                i8 = i5;
                r1.P(i11);
                r12 = s27Var;
                e = th;
                if (r12 == 0) {
                }
                return r12;
            }
            s27Var = w(i10, xi90Var);
        }
        i6 = r1;
        i7 = i4;
        r1 = xi90Var;
        i4 = i10;
        th = null;
        r1 = r1;
        i8 = i5;
        r1.P(i11);
        r12 = s27Var;
        e = th;
        if (r12 == 0) {
        }
        return r12;
    }

    public static pnt w(int i, xi90 xi90Var) {
        int C = xi90Var.C();
        Charset G = G(C);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xi90Var.n(bArr, 0, i2);
        int J = J(bArr, 0);
        String q = io20.q(new String(bArr, 0, J, StandardCharsets.ISO_8859_1));
        int i3 = J + 1;
        int I = I(i3, C, bArr);
        String z = z(bArr, i3, I, G);
        int F = F(C) + I;
        int I2 = I(F, C, bArr);
        String z2 = z(bArr, F, I2, G);
        int F2 = F(C) + I2;
        return new pnt(q, z, z2, i2 <= F2 ? y2r0.b : Arrays.copyOfRange(bArr, F2, i2));
    }

    public static st20 x(int i, xi90 xi90Var) {
        int J = xi90Var.J();
        int F = xi90Var.F();
        int F2 = xi90Var.F();
        int C = xi90Var.C();
        int C2 = xi90Var.C();
        wi90 wi90Var = new wi90();
        wi90Var.k(xi90Var);
        int i2 = ((i - 10) * 8) / (C + C2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int g = wi90Var.g(C);
            int g2 = wi90Var.g(C2);
            iArr[i3] = g;
            iArr2[i3] = g2;
        }
        return new st20(J, F, F2, iArr, iArr2);
    }

    public static kcd0 y(int i, xi90 xi90Var) {
        byte[] bArr = new byte[i];
        xi90Var.n(bArr, 0, i);
        int J = J(bArr, 0);
        String str = new String(bArr, 0, J, StandardCharsets.ISO_8859_1);
        int i2 = J + 1;
        return new kcd0(str, i <= i2 ? y2r0.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String z(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    @Override // xsna.b920
    @Nullable
    public final fi20 k(qi20 qi20Var, ByteBuffer byteBuffer) {
        return q(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fi20 q(int i, byte[] bArr) {
        b bVar;
        ArrayList arrayList = new ArrayList();
        xi90 xi90Var = new xi90(bArr, i);
        boolean z = false;
        if (xi90Var.a() < 10) {
            ahn.F("Data too short to be an ID3 tag");
        } else {
            int F = xi90Var.F();
            if (F == 4801587) {
                int C = xi90Var.C();
                xi90Var.Q(1);
                int C2 = xi90Var.C();
                int B = xi90Var.B();
                if (C == 2) {
                    if ((C2 & 64) != 0) {
                        ahn.F("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(C, C >= 4 && (C2 & 128) != 0, B);
                } else {
                    if (C == 3) {
                        if ((C2 & 64) != 0) {
                            int p = xi90Var.p();
                            xi90Var.Q(p);
                            B -= p + 4;
                        }
                    } else if (C == 4) {
                        if ((C2 & 64) != 0) {
                            int B2 = xi90Var.B();
                            xi90Var.Q(B2 - 4);
                            B -= B2;
                        }
                        if ((C2 & 16) != 0) {
                            B -= 10;
                        }
                    } else {
                        sn.d(C, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    bVar = new b(C, C >= 4 && (C2 & 128) != 0, B);
                }
                if (bVar != null) {
                    return null;
                }
                int i2 = bVar.a;
                int i3 = xi90Var.b;
                int i4 = i2 == 2 ? 6 : 10;
                int i5 = bVar.c;
                if (bVar.b) {
                    i5 = K(i5, xi90Var);
                }
                xi90Var.O(i3 + i5);
                if (!L(xi90Var, i2, i4, false)) {
                    if (i2 != 4 || !L(xi90Var, 4, i4, true)) {
                        sn.d(i2, "Failed to validate ID3 tag with majorVersion=");
                        return null;
                    }
                    z = true;
                }
                while (xi90Var.a() >= i4) {
                    asv v = v(i2, xi90Var, z, i4, this.c);
                    if (v != null) {
                        arrayList.add(v);
                    }
                }
                return new fi20(arrayList);
            }
            ahn.F("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(F))));
        }
        bVar = null;
        if (bVar != null) {
        }
    }
}
