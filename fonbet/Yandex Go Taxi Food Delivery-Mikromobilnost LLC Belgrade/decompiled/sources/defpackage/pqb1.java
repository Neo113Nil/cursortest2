package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class pqb1 {
    public static final void a(f530 f530Var, v3y0 v3y0Var, zr40 zr40Var, z0a0 z0a0Var, lz6 lz6Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        aii0 v;
        wls t0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1358068390);
        int i2 = i | 6 | (btsVar.e(v3y0Var) ? 32 : 16) | (btsVar.e(zr40Var) ? 256 : 128) | (btsVar.k(z0a0Var) ? 2048 : 1024) | (btsVar.k(lz6Var) ? 16384 : 8192) | (btsVar.e(tlsVar) ? 131072 : 65536);
        if (!btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            if (lz6Var == null) {
                v = btsVar.v();
                if (v != null) {
                    t0Var = new nr40(v3y0Var, zr40Var, z0a0Var, lz6Var, tlsVar, i);
                    v.d = t0Var;
                }
                return;
            }
            a S = wwg.S(-1821742089, true, new nr40(zr40Var, z0a0Var, tlsVar, lz6Var, v3y0Var), btsVar);
            c530 c530Var = c530.a;
            ocb1.a(c530Var, false, null, false, false, null, 0.0f, 0, S, btsVar, 805306374, 510);
            f530Var2 = c530Var;
        }
        v = btsVar.v();
        if (v != null) {
            t0Var = new t0(f530Var2, v3y0Var, zr40Var, z0a0Var, lz6Var, tlsVar, i, 9);
            v.d = t0Var;
        }
    }

    public static final void b(r901 r901Var, e68 e68Var, tls tlsVar, lpt0 lpt0Var, fid fidVar, int i) {
        tls tlsVar2;
        boolean z;
        so5 so5Var = x4c.I;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-627153916);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.e(r901Var) ? 4 : 2) | i | (btsVar.k(e68Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(lpt0Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 a = cj6.a.a(i9a1.g(c530Var), x4c.w);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int i3 = i2;
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, a);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            o430 o430Var = did.a;
            if (lpt0Var != null) {
                btsVar.e0(-160050758);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new f0z0(13);
                    btsVar.o0(Q);
                }
                dfb1.b(vfc.j(so5Var, androidx.compose.ui.graphics.d.a(c530Var, (tls) Q)), lpt0Var, btsVar, (i3 >> 6) & 112);
                z = false;
                btsVar.t(false);
            } else {
                z = false;
                btsVar.e0(-159835494);
                btsVar.t(false);
            }
            f530 o3 = an91.o(new ypu(so5Var), 0.0f, 8.0f, 8.0f, 8.0f, 1);
            ButtonSize buttonSize = ButtonSize.M;
            CustomButtonStyle customButtonStyle = CustomButtonStyle.Fill;
            int i4 = i3 & 896;
            boolean z2 = i4 == 256 ? true : z;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                tlsVar2 = tlsVar;
                Q2 = new lao0(26, tlsVar2);
                btsVar.o0(Q2);
            } else {
                tlsVar2 = tlsVar;
            }
            boolean z3 = z;
            com.yandex.go.navigator.floating_control_buttons.compose.button.a.b(o3, buttonSize, customButtonStyle, (sls) Q2, r901Var, btsVar, 33200 | ((i3 << 12) & HProv.ALG_CLASS_ALL), 0);
            f530 o4 = an91.o(new ypu(so5Var), 0.0f, 0.0f, 8.0f, 8.0f, 3);
            if (i4 == 256) {
                z3 = true;
            }
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new lao0(27, tlsVar2);
                btsVar.o0(Q3);
            }
            b791.a(o4, buttonSize, customButtonStyle, (sls) Q3, e68Var, btsVar, 432 | ((i3 << 9) & HProv.ALG_CLASS_ALL), 0);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(r901Var, e68Var, tlsVar2, lpt0Var, i, 19);
        }
    }

    public static Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        if ((i & 4) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i & 1);
        }
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (th91.e(context, str) != 0) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (th91.e(context, str) != 0) {
                kbs.g(oyr.p("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
                return null;
            }
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, null);
    }

    public static void d(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
