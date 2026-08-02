package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.ui.input.nestedscroll.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class e6s0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6s0 b;

    public /* synthetic */ e6s0(f6s0 f6s0Var, int i) {
        this.a = i;
        this.b = f6s0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f6s0 f6s0Var = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    qti.a(f6s0Var.w, wwg.S(-1280179813, true, new e6s0(f6s0Var, i3), btsVar), btsVar, 56);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xi91.a(wwg.S(-563631534, true, new e6s0(f6s0Var, i2), btsVar2), btsVar2, 6);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                a aVar = f6s0Var.b;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    return zy11Var;
                }
                String obj3 = aVar.toString();
                yt0 yt0Var = new yt0((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), aVar, 21);
                rs31 a = f5z.a(btsVar3);
                if (a == null) {
                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                a aVar2 = (a) ooc.G(qoi0.a(a.class), a, obj3, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3);
                d6s0 d6s0Var = aVar2.z;
                Activity b = hrb1.b((Context) btsVar3.m(AndroidCompositionLocals_androidKt.b));
                Object m = btsVar3.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean e = btsVar3.e(b);
                Object Q = btsVar3.Q();
                int i4 = 10;
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    Q = new quq0(i4, b);
                    btsVar3.o0(Q);
                }
                zpn.a(m, (tls) Q, btsVar3);
                boolean k = btsVar3.k(d6s0Var) | btsVar3.e(b);
                Object Q2 = btsVar3.Q();
                if (k || Q2 == o430Var) {
                    Q2 = new c1p0(i4, d6s0Var, b);
                    btsVar3.o0(Q2);
                }
                rhd.a(null, (wls) Q2, btsVar3, 0);
                f530 u = pw91.u(b.a(m4m0.b(c530.a, ((el51) btsVar3.m(gl51.a)).c(), qke.q), zrb1.f(btsVar3), null), pw91.o(btsVar3), 14);
                sic a2 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o = btsVar3.o();
                f530 d = androidx.compose.ui.b.d(btsVar3, u);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar3.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, d.f, a2);
                qje.W(btsVar3, d.e, o);
                wls wlsVar = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                }
                qje.W(btsVar3, d.d, d);
                qkg qkgVar = (qkg) f.b(aVar2.y, btsVar3).getValue();
                if (qkgVar == null) {
                    btsVar3.e0(1605926033);
                    btsVar3.t(false);
                } else {
                    btsVar3.e0(1605926034);
                    f6s0Var.c.a(qkgVar, null, 0.0f, 0L, true, false, null, btsVar3, 16801792, 110);
                    btsVar3 = btsVar3;
                    btsVar3.t(false);
                }
                btsVar3.t(true);
                return zy11Var;
        }
    }
}
