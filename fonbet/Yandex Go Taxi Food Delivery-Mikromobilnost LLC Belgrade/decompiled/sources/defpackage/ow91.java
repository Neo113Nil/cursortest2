package defpackage;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.graphics.d;

/* loaded from: classes11.dex */
public abstract class ow91 {
    public static final String[] a = {"com.google.android.wearable.app", "com.google.android.apps.wear.companion", "com.samsung.android.app.watchmanager"};

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, int i, int i2, long j, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        int i3;
        long j2;
        int i4;
        float f2;
        int i5;
        int i6;
        f530 f530Var3;
        float f3;
        int i7;
        boolean k;
        Object Q;
        o430 o430Var;
        Object Q2;
        long j3;
        float f4;
        f530 f530Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1603867981);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i | (btsVar.k(f530Var2) ? 4 : 2);
        }
        if ((i2 & 2) == 0) {
            j2 = j;
            if (btsVar.d(j2)) {
                i4 = 32;
                int i9 = i3 | i4;
                if ((i2 & 4) != 0) {
                    f2 = f;
                    if (btsVar.b(f2)) {
                        i5 = 256;
                        i6 = i9 | i5;
                        if ((i6 & 147) == 146 || !btsVar.E()) {
                            btsVar.a0();
                            if ((i & 1) != 0 || btsVar.C()) {
                                f530 f530Var5 = i8 != 0 ? c530.a : f530Var2;
                                if ((i2 & 2) != 0) {
                                    qnm qnmVar = qnm.a;
                                    j2 = qnm.c(btsVar).g0();
                                    i6 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    qnm.d.getClass();
                                    f530Var3 = f530Var5;
                                    f3 = 24.0f;
                                    i7 = i6 & (-897);
                                    long j4 = j2;
                                    btsVar.u();
                                    osv d = z5b1.d(z5b1.g(null, btsVar, 1), 0.0f, 360.0f, sb2.w(sb2.K(1000, 0, ubn.d, 2), RepeatMode.Restart, 0L, 4), "Loading rotation", btsVar, 29112, 0);
                                    f530 d2 = u3a1.d(ljs0.m(f530Var3, f3), "SPINNER_TAG");
                                    btsVar.e0(5004770);
                                    k = btsVar.k(d);
                                    Q = btsVar.Q();
                                    o430Var = did.a;
                                    if (!k || Q == o430Var) {
                                        Q = new xo1(d, 8);
                                        btsVar.o0(Q);
                                    }
                                    btsVar.t(false);
                                    f530 a2 = d.a(d2, (tls) Q);
                                    float f5 = 0.083333336f * f3;
                                    long j5 = ldc.l;
                                    btsVar.e0(1849434622);
                                    Q2 = btsVar.Q();
                                    if (Q2 == o430Var) {
                                        Q2 = new jbm(28);
                                        btsVar.o0(Q2);
                                    }
                                    btsVar.t(false);
                                    bjf0.a((sls) Q2, a2, j4, f5, j5, 0.0f, btsVar, ((i7 << 3) & 896) | 24582);
                                    btsVar = btsVar;
                                    j3 = j4;
                                    f4 = f3;
                                    f530Var4 = f530Var3;
                                } else {
                                    f530Var3 = f530Var5;
                                }
                            } else {
                                btsVar.Y();
                                if ((i2 & 2) != 0) {
                                    i6 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    i6 &= -897;
                                }
                                f530Var3 = f530Var2;
                            }
                            i7 = i6;
                            f3 = f2;
                            long j42 = j2;
                            btsVar.u();
                            osv d3 = z5b1.d(z5b1.g(null, btsVar, 1), 0.0f, 360.0f, sb2.w(sb2.K(1000, 0, ubn.d, 2), RepeatMode.Restart, 0L, 4), "Loading rotation", btsVar, 29112, 0);
                            f530 d22 = u3a1.d(ljs0.m(f530Var3, f3), "SPINNER_TAG");
                            btsVar.e0(5004770);
                            k = btsVar.k(d3);
                            Q = btsVar.Q();
                            o430Var = did.a;
                            if (!k) {
                            }
                            Q = new xo1(d3, 8);
                            btsVar.o0(Q);
                            btsVar.t(false);
                            f530 a22 = d.a(d22, (tls) Q);
                            float f52 = 0.083333336f * f3;
                            long j52 = ldc.l;
                            btsVar.e0(1849434622);
                            Q2 = btsVar.Q();
                            if (Q2 == o430Var) {
                            }
                            btsVar.t(false);
                            bjf0.a((sls) Q2, a22, j42, f52, j52, 0.0f, btsVar, ((i7 << 3) & 896) | 24582);
                            btsVar = btsVar;
                            j3 = j42;
                            f4 = f3;
                            f530Var4 = f530Var3;
                        } else {
                            btsVar.Y();
                            f530Var4 = f530Var2;
                            j3 = j2;
                            f4 = f2;
                        }
                        aii0 v = btsVar.v();
                        if (v != null) {
                            v.d = new btm(f530Var4, j3, f4, i, i2);
                            return;
                        }
                        return;
                    }
                } else {
                    f2 = f;
                }
                i5 = 128;
                i6 = i9 | i5;
                if ((i6 & 147) == 146) {
                }
                btsVar.a0();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
            }
        } else {
            j2 = j;
        }
        i4 = 16;
        int i92 = i3 | i4;
        if ((i2 & 4) != 0) {
        }
        i5 = 128;
        i6 = i92 | i5;
        if ((i6 & 147) == 146) {
        }
        btsVar.a0();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
    }

    public static final boolean b(uod0 uod0Var) {
        if ((uod0Var instanceof sod0) || (uod0Var instanceof rod0) || (uod0Var instanceof ood0) || (uod0Var instanceof tod0)) {
            return false;
        }
        if ((uod0Var instanceof qod0) || (uod0Var instanceof pod0) || (uod0Var instanceof nod0)) {
            return true;
        }
        w511.b();
        return false;
    }
}
