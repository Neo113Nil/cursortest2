package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public abstract class ctr0 {
    public static final ck11 a = sb2.K(300, 0, ubn.a, 2);

    public static final void a(f530 f530Var, wls wlsVar, fid fidVar, int i) {
        f530 f530Var2;
        wls wlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1361920385);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            String b = vhb1.b(btsVar, wyh0.m3c_bottom_sheet_drag_handle_description);
            f530 c = ljs0.c(c530.a, 1.0f);
            z910 d = pi6.d(x4c.y, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar3);
            }
            qje.W(btsVar, d.d, d2);
            f530Var2 = f530Var;
            wlsVar2 = wlsVar;
            avz0.b(tuz0.a(btsVar), wwg.S(1497042086, true, new jk30(b, 28), btsVar), avz0.c(btsVar), f530Var2, false, wlsVar2, btsVar, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024), PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
            btsVar.t(true);
        } else {
            f530Var2 = f530Var;
            wlsVar2 = wlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(f530Var2, wlsVar2, i, 8);
        }
    }
}
