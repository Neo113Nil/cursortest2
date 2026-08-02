package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.m;
import defpackage.v2w;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes7.dex */
public abstract class i9a1 {
    public static final js41 a = new js41(9);
    public static final js41 b = new js41(10);
    public static final js41 c = new js41(11);
    public static final js41 d = new js41(12);
    public static final js41 e = new js41(13);
    public static au2 f;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
    
        if (r5 <= r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(Context context, d881 d881Var, jd81 jd81Var, ta71 ta71Var, a271 a271Var) {
        boolean z;
        ta71Var.getClass();
        boolean z2 = jd81Var.b(context) > 0 && jd81Var.a(context) > 0;
        boolean z3 = d881Var.w;
        Context applicationContext = context.getApplicationContext();
        jd81 jd81Var2 = (jd81) a271Var;
        int b2 = jd81Var2.b(applicationContext);
        int a2 = jd81Var2.a(applicationContext);
        int b3 = jd81Var.b(applicationContext);
        int a3 = jd81Var.a(applicationContext);
        int ordinal = jd81Var2.a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        w511.b();
                        return false;
                    }
                }
                z = true;
            }
            if (b3 <= b2) {
                if (b2 > 0) {
                    if (a3 > a2) {
                    }
                    z = true;
                }
            }
            z = false;
        } else {
            if (b3 <= b2) {
                if (b2 > 0) {
                }
            }
            z = false;
        }
        return z3 || (z2 && (z && (jd81Var.b(applicationContext) <= sj71.g(applicationContext) && jd81Var.a(applicationContext) <= sj71.d(applicationContext))));
    }

    public static final f530 b(f530 f530Var) {
        return f530Var.k(new e3x0(m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), b));
    }

    public static final f530 c(f530 f530Var) {
        return f530Var.k(new e3x0(m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), d));
    }

    public static final f530 d(f530 f530Var) {
        return f530Var.k(new e3x0(m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x003c, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [xkf0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(ef90 ef90Var) {
        char c2;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        ef90 ef90Var2 = ef90Var;
        ArrayList arrayList3 = null;
        if (ef90Var2.y() == 0) {
            char c3 = 7;
            ef90Var2.L(7);
            int k = ef90Var2.k();
            boolean z2 = true;
            if (k == 1684433976) {
                ef90 ef90Var3 = new ef90();
                Inflater inflater = new Inflater(true);
                try {
                    if (!tw21.P(ef90Var2, ef90Var3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    ef90Var2 = ef90Var3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int i = ef90Var2.b;
            int i2 = ef90Var2.c;
            while (i < i2) {
                int k2 = ef90Var2.k() + i;
                if (k2 > i && k2 <= i2) {
                    if (ef90Var2.k() == 1835365224) {
                        int k3 = ef90Var2.k();
                        if (k3 <= 10000) {
                            float[] fArr = new float[k3];
                            for (int i3 = 0; i3 < k3; i3++) {
                                fArr[i3] = Float.intBitsToFloat(ef90Var2.k());
                            }
                            int k4 = ef90Var2.k();
                            if (k4 <= 32000) {
                                double log = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList5 = arrayList3;
                                int ceil = (int) Math.ceil(Math.log(k3 * 2.0d) / log);
                                z = z2;
                                byte[] bArr = ef90Var2.a;
                                df90 df90Var = new df90(bArr, bArr.length);
                                df90Var.m(ef90Var2.b * 8);
                                float[] fArr2 = new float[k4 * 5];
                                int i4 = 5;
                                int[] iArr = new int[5];
                                arrayList = arrayList5;
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    if (i5 < k4) {
                                        int i7 = 0;
                                        while (i7 < i4) {
                                            int i8 = iArr[i7];
                                            int g = df90Var.g(ceil);
                                            int i9 = ((g >> 1) ^ (-(g & 1))) + i8;
                                            if (i9 >= k3 || i9 < 0) {
                                                break;
                                            }
                                            fArr2[i6] = fArr[i9];
                                            iArr[i7] = i9;
                                            i7++;
                                            i6++;
                                            i4 = 5;
                                        }
                                        i5++;
                                        i4 = 5;
                                    } else {
                                        df90Var.m((df90Var.e() + 7) & (-8));
                                        int i10 = 32;
                                        int g2 = df90Var.g(32);
                                        ykf0[] ykf0VarArr = new ykf0[g2];
                                        int i11 = 0;
                                        while (i11 < g2) {
                                            int g3 = df90Var.g(8);
                                            int g4 = df90Var.g(8);
                                            int g5 = df90Var.g(i10);
                                            if (g5 <= 128000) {
                                                df90 df90Var2 = df90Var;
                                                int ceil2 = (int) Math.ceil(Math.log(k4 * 2.0d) / log);
                                                float[] fArr3 = new float[g5 * 3];
                                                float[] fArr4 = new float[g5 * 2];
                                                int i12 = 0;
                                                int i13 = 0;
                                                while (i12 < g5) {
                                                    int g6 = df90Var2.g(ceil2);
                                                    int i14 = ceil2;
                                                    int i15 = ((g6 >> 1) ^ (-(g6 & 1))) + i13;
                                                    if (i15 >= 0 && i15 < k4) {
                                                        int i16 = i12 * 3;
                                                        int i17 = i15 * 5;
                                                        fArr3[i16] = fArr2[i17];
                                                        fArr3[i16 + 1] = fArr2[i17 + 1];
                                                        fArr3[i16 + 2] = fArr2[i17 + 2];
                                                        int i18 = i12 * 2;
                                                        fArr4[i18] = fArr2[i17 + 3];
                                                        fArr4[i18 + 1] = fArr2[i17 + 4];
                                                        i12++;
                                                        i13 = i15;
                                                        ceil2 = i14;
                                                    }
                                                }
                                                ykf0VarArr[i11] = new ykf0(fArr3, g3, fArr4, g4, 0);
                                                i11++;
                                                df90Var = df90Var2;
                                                i10 = 32;
                                            }
                                        }
                                        arrayList2 = new xkf0(ykf0VarArr);
                                    }
                                }
                                arrayList2 = arrayList;
                                if (arrayList2 != null) {
                                    return arrayList;
                                }
                                arrayList4.add(arrayList2);
                            }
                        }
                        c2 = c3;
                        ArrayList arrayList6 = arrayList3;
                        arrayList = arrayList6;
                        z = z2;
                        arrayList2 = arrayList6;
                        if (arrayList2 != null) {
                        }
                    } else {
                        c2 = c3;
                        arrayList = arrayList3;
                        z = z2;
                    }
                    ef90Var2.K(k2);
                    i = k2;
                    c3 = c2;
                    z2 = z;
                    arrayList3 = arrayList;
                }
            }
            return arrayList4;
        }
        return arrayList3;
    }

    public static final f530 f(f530 f530Var) {
        return f530Var.k(new e3x0(m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), c));
    }

    public static final f530 g(f530 f530Var) {
        return f530Var.k(new e3x0(m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), a));
    }
}
