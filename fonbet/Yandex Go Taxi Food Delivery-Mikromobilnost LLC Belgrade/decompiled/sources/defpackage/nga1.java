package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.node.d;
import com.yandex.go.summary.ui.compose.expanded.content.b;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class nga1 {
    public static final void a(cex0 cex0Var, f530 f530Var, tls tlsVar, tpr tprVar, yur yurVar, yur yurVar2, m3u0 m3u0Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        yur yurVar3;
        yur yurVar4;
        m3u0 m3u0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(698829666);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(cex0Var) : btsVar.e(cex0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 32 : 16;
        } else {
            f530Var2 = f530Var;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            yurVar3 = yurVar;
            i2 |= btsVar.k(yurVar3) ? 16384 : 8192;
        } else {
            yurVar3 = yurVar;
        }
        if ((196608 & i) == 0) {
            yurVar4 = yurVar2;
            i2 |= btsVar.k(yurVar4) ? 131072 : 65536;
        } else {
            yurVar4 = yurVar2;
        }
        if ((1572864 & i) == 0) {
            m3u0Var2 = m3u0Var;
            i2 |= btsVar.k(m3u0Var2) ? 1048576 : 524288;
        } else {
            m3u0Var2 = m3u0Var;
        }
        boolean z = true;
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            if (cex0Var instanceof cex0) {
                btsVar.e0(1128704316);
                int i3 = i2 >> 9;
                if ((((i3 & 14) ^ 6) <= 4 || !btsVar.k(tprVar)) && (i3 & 6) != 4) {
                    z = false;
                }
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (z || Q == o430Var) {
                    Q = new b(tprVar);
                    btsVar.o0(Q);
                }
                tpr tprVar2 = (tpr) Q;
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new l0o(8);
                    btsVar.o0(Q2);
                }
                c.g(cex0Var, f530Var2, yn91.g(tlsVar, (tls) Q2, btsVar, ((i2 >> 6) & 14) | 48), tprVar2, yurVar3, yurVar4, m3u0Var2, btsVar, i2 & 4186238);
                btsVar.t(false);
            } else {
                btsVar.e0(1129357920);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cpo(cex0Var, f530Var, tlsVar, tprVar, yurVar, yurVar2, m3u0Var, i, 0);
        }
    }

    public static final void b(int i, float f, long j, final int i2, long j2, final tls tlsVar, final String[] strArr, fid fidVar, final int i3) {
        bts btsVar;
        final int i4;
        final float f2;
        final long j3;
        final long j4;
        int i5;
        int i6;
        float f3;
        long j5;
        long j6;
        int i7;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1884779531);
        int i8 = i3 | 54;
        if ((i3 & 384) == 0) {
            i8 = i3 | 182;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i8 |= btsVar2.c(i2) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i8 |= 8192;
        }
        if ((196608 & i3) == 0) {
            i8 |= btsVar2.e(tlsVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i8 |= btsVar2.e(strArr) ? 1048576 : 524288;
        }
        if (btsVar2.V(i8 & 1, (599187 & i8) != 599186)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                a7u0 a7u0Var = gl51.a;
                long g = ((el51) btsVar2.m(a7u0Var)).g();
                long f4 = ((el51) btsVar2.m(a7u0Var)).f();
                i5 = i8 & (-58241);
                i6 = 5;
                f3 = 48.0f;
                j5 = g;
                j6 = f4;
            } else {
                btsVar2.Y();
                i5 = i8 & (-58241);
                i6 = i;
                f3 = f;
                j5 = j;
                j6 = j2;
            }
            btsVar2.u();
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(new i43(8.0f, true, new m6(9, x4c.H)), x4c.D, btsVar2, 6);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            btsVar2.e0(2747718);
            int i9 = 0;
            while (i9 < i6) {
                pa90 m = mt71.m(wzg0.ic_star, 0, btsVar2);
                f530 m2 = ljs0.m(c530Var, f3);
                boolean z = i9 == i2 + (-1);
                ay40 ay40Var = new ay40();
                awk0 awk0Var = new awk0(0);
                boolean c2 = ((458752 & i5) == 131072) | btsVar2.c(i9);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (c2 || Q == o430Var) {
                    Q = new yj50(i9, 1, tlsVar);
                    btsVar2.o0(Q);
                }
                f530 v = r5a1.v(m2, z, ay40Var, null, false, awk0Var, (tls) Q, 8);
                boolean e = btsVar2.e(strArr) | btsVar2.c(i9);
                Object Q2 = btsVar2.Q();
                if (e || Q2 == o430Var) {
                    i7 = 9;
                    Q2 = new is8(strArr, i9, i7);
                    btsVar2.o0(Q2);
                } else {
                    i7 = 9;
                }
                bts btsVar3 = btsVar2;
                q4v.b(m, null, fnq0.a(v, (tls) Q2), i9 < i2 ? j6 : j5, btsVar3, 48, 0);
                i9++;
                c530Var = c530Var;
                btsVar2 = btsVar3;
            }
            btsVar = btsVar2;
            btsVar.t(false);
            btsVar.t(true);
            i4 = i6;
            f2 = f3;
            j3 = j5;
            j4 = j6;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            i4 = i;
            f2 = f;
            j3 = j;
            j4 = j2;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls() { // from class: a8i0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nga1.b(i4, f2, j3, i2, j4, tlsVar, strArr, (fid) obj, vng.O(i3 | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(Dialog dialog) {
        Activity ownerActivity = dialog.getOwnerActivity();
        boolean z = ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed());
        if (dialog.isShowing() && z) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public static final Drawable d(int i, Context context) {
        Drawable t = vng.t(i, context);
        if (t != null) {
            return t;
        }
        xfo.g(oyr.i(i, "Invalid resource ID: "));
        return null;
    }
}
