package defpackage;

import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.care.domain.a;
import ru.yandex.logistics.care.ui.b;

/* loaded from: classes4.dex */
public final class jt8 {
    public final et41 a;
    public final gt8 b;
    public final Context c;
    public final wly0 d;
    public final a e;
    public final me0 f;
    public final h2t g;
    public final b h;
    public final n0 i = ffx.c(0, 1, null, 5);

    public jt8(et41 et41Var, gt8 gt8Var, Context context, wly0 wly0Var, a aVar, me0 me0Var, h2t h2tVar, b bVar) {
        this.a = et41Var;
        this.b = gt8Var;
        this.c = context;
        this.d = wly0Var;
        this.e = aVar;
        this.f = me0Var;
        this.g = h2tVar;
        this.h = bVar;
    }

    public final void a(n4u0 n4u0Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(594721260);
        int i2 = (btsVar.e(n4u0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            k3r k3rVar = ljs0.c;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ru.yandex.logistics.care.web_view.impl.b.a;
                btsVar.o0(Q);
            }
            f530 a = exw0.a(k3rVar, zy11.a, (PointerInputEventHandler) Q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            qti.c(null, null, ((Boolean) f.b(n4u0Var, btsVar).getValue()).booleanValue(), aVar, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(this, n4u0Var, aVar, i, 24);
        }
    }

    public final void b(n4u0 n4u0Var, vt8 vt8Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1492962694);
        int i2 = 2;
        int i3 = 4;
        int i4 = (btsVar.e(n4u0Var) ? 4 : 2) | i | (btsVar.e(vt8Var) ? 32 : 16) | (btsVar.e(this) ? 256 : 128);
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            ut8 ut8Var = (ut8) f.b(vt8Var.X(), btsVar).getValue();
            if (ut8Var instanceof tt8) {
                btsVar.e0(1830001496);
                a(n4u0Var, wwg.S(-805549044, true, new hh8(3, (tt8) ut8Var), btsVar), btsVar, (i4 & 896) | (i4 & 14) | 48);
                btsVar.t(false);
            } else if (ut8Var instanceof st8) {
                btsVar.e0(1830216946);
                a(n4u0Var, wwg.S(225641333, true, new hh8(i3, (st8) ut8Var), btsVar), btsVar, (i4 & 896) | (i4 & 14) | 48);
                btsVar.t(false);
            } else if (ut8Var instanceof qt8) {
                btsVar.e0(1830626456);
                a(n4u0Var, wwg.S(-636662828, true, new hh8(i2, (qt8) ut8Var), btsVar), btsVar, (i4 & 896) | (i4 & 14) | 48);
                btsVar.t(false);
            } else {
                if (!jl40.l(ut8Var, rt8.a)) {
                    throw unr0.y(-218064443, btsVar, false);
                }
                btsVar.e0(-218025858);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(this, n4u0Var, vt8Var, i, 23);
        }
    }
}
