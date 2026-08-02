package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;
import xsna.f4e0;

/* compiled from: ProjectionDecoder.java */
/* loaded from: classes12.dex */
public final class g4e0 {
    /* JADX WARN: Code restructure failed: missing block: B:80:0x003c, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.util.ArrayList<xsna.f4e0$a>] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [java.util.ArrayList<xsna.f4e0$a>] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<f4e0.a> a(xi90 xi90Var) {
        char c;
        ?? r20;
        boolean z;
        int i;
        f4e0.a aVar;
        xi90 xi90Var2 = xi90Var;
        f4e0.a aVar2 = null;
        if (xi90Var2.C() == 0) {
            char c2 = 7;
            xi90Var2.Q(7);
            int p = xi90Var2.p();
            boolean z2 = true;
            if (p == 1684433976) {
                xi90 xi90Var3 = new xi90();
                Inflater inflater = new Inflater(true);
                try {
                    if (!y2r0.K(xi90Var2, xi90Var3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    xi90Var2 = xi90Var3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList<f4e0.a> arrayList = new ArrayList<>();
            int i2 = xi90Var2.b;
            int i3 = xi90Var2.c;
            while (i2 < i3) {
                int p2 = xi90Var2.p() + i2;
                if (p2 > i2 && p2 <= i3) {
                    if (xi90Var2.p() == 1835365224) {
                        int p3 = xi90Var2.p();
                        if (p3 <= 10000) {
                            float[] fArr = new float[p3];
                            for (int i4 = 0; i4 < p3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(xi90Var2.p());
                            }
                            int p4 = xi90Var2.p();
                            if (p4 <= 32000) {
                                double log = Math.log(2.0d);
                                c = c2;
                                f4e0.a aVar3 = aVar2;
                                int ceil = (int) Math.ceil(Math.log(p3 * 2.0d) / log);
                                z = z2;
                                byte[] bArr = xi90Var2.a;
                                wi90 wi90Var = new wi90(bArr, bArr.length);
                                wi90Var.m(xi90Var2.b * 8);
                                float[] fArr2 = new float[p4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                f4e0.a aVar4 = aVar3;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < p4) {
                                        int i8 = 0;
                                        while (i8 < i5) {
                                            int i9 = iArr[i8];
                                            int g = wi90Var.g(ceil);
                                            int i10 = ((g >> 1) ^ (-(g & 1))) + i9;
                                            if (i10 >= p3 || i10 < 0) {
                                                break;
                                            }
                                            fArr2[i7] = fArr[i10];
                                            iArr[i8] = i10;
                                            i8++;
                                            i7++;
                                            i5 = 5;
                                        }
                                        i6++;
                                        i5 = 5;
                                    } else {
                                        wi90Var.m((wi90Var.e() + 7) & (-8));
                                        int i11 = 32;
                                        int g2 = wi90Var.g(32);
                                        f4e0.b[] bVarArr = new f4e0.b[g2];
                                        int i12 = 0;
                                        while (i12 < g2) {
                                            int g3 = wi90Var.g(8);
                                            int g4 = wi90Var.g(8);
                                            int g5 = wi90Var.g(i11);
                                            if (g5 <= 128000) {
                                                int i13 = g2;
                                                float[] fArr3 = fArr2;
                                                int ceil2 = (int) Math.ceil(Math.log(p4 * 2.0d) / log);
                                                float[] fArr4 = new float[g5 * 3];
                                                float[] fArr5 = new float[g5 * 2];
                                                i = i3;
                                                int i14 = 0;
                                                int i15 = 0;
                                                while (i14 < g5) {
                                                    int g6 = wi90Var.g(ceil2);
                                                    wi90 wi90Var2 = wi90Var;
                                                    int i16 = ((g6 >> 1) ^ (-(g6 & 1))) + i15;
                                                    if (i16 >= 0 && i16 < p4) {
                                                        int i17 = i14 * 3;
                                                        int i18 = i16 * 5;
                                                        fArr4[i17] = fArr3[i18];
                                                        fArr4[i17 + 1] = fArr3[i18 + 1];
                                                        fArr4[i17 + 2] = fArr3[i18 + 2];
                                                        int i19 = i14 * 2;
                                                        fArr5[i19] = fArr3[i18 + 3];
                                                        fArr5[i19 + 1] = fArr3[i18 + 4];
                                                        i14++;
                                                        i15 = i16;
                                                        wi90Var = wi90Var2;
                                                    }
                                                }
                                                bVarArr[i12] = new f4e0.b(g3, g4, fArr4, fArr5);
                                                i12++;
                                                g2 = i13;
                                                fArr2 = fArr3;
                                                i3 = i;
                                                wi90Var = wi90Var;
                                                i11 = 32;
                                            }
                                        }
                                        i = i3;
                                        aVar = new f4e0.a(bVarArr);
                                        r20 = aVar4;
                                    }
                                }
                                i = i3;
                                aVar = aVar4;
                                r20 = aVar4;
                                if (aVar != null) {
                                    return r20;
                                }
                                arrayList.add(aVar);
                            }
                        }
                        c = c2;
                        aVar = aVar2;
                        r20 = aVar;
                        z = z2;
                        i = i3;
                        if (aVar != null) {
                        }
                    } else {
                        c = c2;
                        r20 = aVar2;
                        z = z2;
                        i = i3;
                    }
                    xi90Var2.P(p2);
                    i2 = p2;
                    c2 = c;
                    z2 = z;
                    aVar2 = r20;
                    i3 = i;
                }
            }
            return arrayList;
        }
        return aVar2;
    }
}
