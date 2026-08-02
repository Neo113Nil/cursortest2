package defpackage;

import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.e;
import defpackage.aly0;
import defpackage.bts;
import defpackage.cmh;
import defpackage.did;
import defpackage.fid;
import defpackage.m3u0;
import defpackage.zky0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes10.dex */
public abstract class cmh {
    public static final eae0 a = new eae0(30);

    public static final void a(lly0 lly0Var, zky0 zky0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1904307118);
        int i2 = (btsVar.k(lly0Var) ? 4 : 2) | i | (btsVar.e(zky0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.e0(-1009482584);
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.t(false);
            boolean e = btsVar.e(zky0Var) | ((i2 & 14) == 4) | btsVar.e(context);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new f89(19, zky0Var, context, lly0Var);
                btsVar.o0(Q);
            }
            bke.b(null, null, (tls) Q, btsVar, 0, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(lly0Var, zky0Var, i, 6);
        }
    }

    public static final void b(final int i, final int i2, final long j, fid fidVar) {
        final int i3;
        int i4;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (btsVar.c(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar.d(j) ? 32 : 16;
        }
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            boolean k = ((i4 & 14) == 4) | btsVar.k(context);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                btsVar.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            if (intValue == -1) {
                v = btsVar.v();
                if (v != null) {
                    final int i5 = 1;
                    wlsVar = new wls() { // from class: zlh
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            zy11 zy11Var = zy11.a;
                            int i7 = i2;
                            long j2 = j;
                            int i8 = i3;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    cmh.b(i8, vng.O(i7 | 1), j2, fidVar2);
                                    break;
                                default:
                                    cmh.b(i8, vng.O(i7 | 1), j2, fidVar2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            pa90 m = mt71.m(intValue, 0, btsVar);
            boolean z = (i4 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = j == 16 ? null : new c36(j, 5);
                btsVar.o0(Q2);
            }
            pi6.a(cma1.j0(ljs0.m(c530.a, ake.e), m, null, mhe.b, 0.0f, (wec) Q2, 22), btsVar, 0);
        } else {
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 0;
            wlsVar = new wls() { // from class: zlh
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    zy11 zy11Var = zy11.a;
                    int i7 = i2;
                    long j2 = j;
                    int i8 = i;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            cmh.b(i8, vng.O(i7 | 1), j2, fidVar2);
                            break;
                        default:
                            cmh.b(i8, vng.O(i7 | 1), j2, fidVar2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void c(final lly0 lly0Var, final aly0 aly0Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(lly0Var) : btsVar.e(lly0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(aly0Var) : btsVar.e(aly0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.k(aly0Var));
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new td00(new z3e(new jhd(29, aly0Var, slsVar)));
                btsVar.o0(Q);
            }
            td00 td00Var = (td00) Q;
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(lly0Var));
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new amh(i3, lly0Var);
                btsVar.o0(Q2);
            }
            e.a(td00Var, (sls) Q2, a, wwg.S(1315155414, true, new wls() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        aly0 aly0Var2 = aly0.this;
                        boolean k = btsVar2.k(aly0Var2);
                        Object Q3 = btsVar2.Q();
                        if (k || Q3 == did.a) {
                            Q3 = f.d(new DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(0, aly0Var2, aly0.class, Constants.KEY_DATA, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0));
                            btsVar2.o0(Q3);
                        }
                        cmh.a(lly0Var, (zky0) ((m3u0) Q3).getValue(), btsVar2, 0);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 3456, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(lly0Var, aly0Var, slsVar, i, 20);
        }
    }

    public static final void d(f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        a aVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qwd qwdVar = jly0.a;
            l6d.a.getClass();
            f530Var2 = f530Var;
            aVar2 = aVar;
            i5b1.a(f530Var2, qwdVar, l6d.b, aVar2, btsVar, (i2 & 14) | 432 | ((i2 << 6) & 7168));
        } else {
            f530Var2 = f530Var;
            aVar2 = aVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tc2(f530Var2, aVar2, i, i3);
        }
    }
}
