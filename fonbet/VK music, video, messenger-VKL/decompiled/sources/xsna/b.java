package xsna;

import xsna.vl8;

/* compiled from: Buffer.kt */
/* loaded from: classes8.dex */
public final class b {
    public static final byte[] a = "0123456789abcdef".getBytes(emb.b);

    public static final vl8.c a(vl8 vl8Var, vl8.c cVar) {
        if (cVar == e.a) {
            cVar = new vl8.c();
        }
        if (cVar.b != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        cVar.b = vl8Var;
        cVar.c = true;
        return cVar;
    }

    public static final byte[] b() {
        return a;
    }

    public static final String c(vl8 vl8Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (vl8Var.q(j2) == 13) {
                String w = vl8Var.w(j2, emb.b);
                vl8Var.skip(2L);
                return w;
            }
        }
        String w2 = vl8Var.w(j, emb.b);
        vl8Var.skip(1L);
        return w2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        return -2;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[LOOP:0: B:8:0x0019->B:29:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(vl8 vl8Var, zt80 zt80Var, boolean z) {
        int i;
        int i2;
        int i3;
        m4i0 m4i0Var;
        int i4;
        m4i0 m4i0Var2 = vl8Var.b;
        if (m4i0Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = m4i0Var2.a;
        int i5 = m4i0Var2.b;
        int i6 = m4i0Var2.c;
        int[] iArr = zt80Var.c;
        m4i0 m4i0Var3 = m4i0Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (m4i0Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            m4i0Var3 = m4i0Var3.f;
                            int i16 = m4i0Var3.b;
                            byte[] bArr2 = m4i0Var3.a;
                            i2 = m4i0Var3.c;
                            if (m4i0Var3 == m4i0Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                m4i0Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i < 0) {
                        }
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i17 = (i10 * (-1)) + i11;
            while (true) {
                int i18 = i5 + 1;
                int i19 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i19 == i17;
                if (i18 == i6) {
                    m4i0 m4i0Var4 = m4i0Var3.f;
                    i3 = m4i0Var4.b;
                    byte[] bArr3 = m4i0Var4.a;
                    i4 = m4i0Var4.c;
                    if (m4i0Var4 != m4i0Var2) {
                        m4i0Var = m4i0Var4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        m4i0Var = null;
                    }
                } else {
                    m4i0Var = m4i0Var3;
                    i4 = i6;
                    i3 = i18;
                }
                if (z2) {
                    i = iArr[i19];
                    int i20 = i4;
                    m4i0Var3 = m4i0Var;
                    i2 = i20;
                    break;
                }
                i5 = i3;
                i6 = i4;
                m4i0Var3 = m4i0Var;
                i11 = i19;
            }
            if (i < 0) {
                return i;
            }
            int i21 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i21;
        }
        return i7;
    }
}
