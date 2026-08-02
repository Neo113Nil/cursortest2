package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class o030 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3i b;

    public /* synthetic */ o030(w3i w3iVar, int i) {
        this.a = i;
        this.b = w3iVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        w3i w3iVar = this.b;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    sb2.c(new vvf0[]{nnm.f((hwy0) w3iVar.x, btsVar, qti.e), ua3.a.a((dci) w3iVar.c), ib51.a.a((oy60) w3iVar.A)}, wwg.S(1678903905, true, new o030(w3iVar, i4), btsVar), btsVar, 56);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qti.b((hwy0) w3iVar.x, (ThemeStyle) f.a(((t6s) w3iVar.z).a, ThemeStyle.DEFAULT, null, btsVar2, 48, 2).getValue(), wwg.S(213517609, true, new o030(w3iVar, i2), btsVar2), btsVar2, 392);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xi91.a(wwg.S(1181369298, true, new o030(w3iVar, i3), btsVar3), btsVar3, 6);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    return zy11Var;
                }
                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (p030) w3iVar.w, 16);
                rs31 a = f5z.a(btsVar4);
                if (a == null) {
                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                oz40 b = f.b(((p030) ooc.G(qoi0.a(p030.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4)).b, btsVar4);
                c530 c530Var = c530.a;
                f530 u = ljs0.u(ljs0.c(c530Var, 1.0f), null, 3);
                sic a2 = qic.a(lr20.c, x4c.G, btsVar4, 0);
                int hashCode = Long.hashCode(btsVar4.T);
                r1b0 o = btsVar4.o();
                f530 d = b.d(btsVar4, u);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar4.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar);
                } else {
                    btsVar4.r0();
                }
                qje.W(btsVar4, d.f, a2);
                qje.W(btsVar4, d.e, o);
                wls wlsVar = d.g;
                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar4, hashCode, wlsVar);
                }
                qje.W(btsVar4, d.d, d);
                tgg tggVar = (tgg) w3iVar.y;
                qkg qkgVar = (qkg) b.getValue();
                boolean e = btsVar4.e(w3iVar);
                Object Q = btsVar4.Q();
                if (e || Q == did.a) {
                    Q = new ft20(5, w3iVar);
                    btsVar4.o0(Q);
                }
                tggVar.a(qkgVar, eja1.y(c530Var, (tls) Q), 0.0f, ldc.l, true, false, null, btsVar4, 16804864, 100);
                if (((qkg) b.getValue()).a.isEmpty()) {
                    btsVar4.e0(-2069698618);
                    btsVar4.t(false);
                } else {
                    btsVar4.e0(-2070102238);
                    f530 b2 = m4m0.b(ljs0.c(c530Var, 1.0f), ((el51) btsVar4.m(gl51.a)).c(), qke.q);
                    WeakHashMap weakHashMap = a.w;
                    oeb1.c(btsVar4, o9a1.e(b2, vuz.o(btsVar4).e));
                    btsVar4.t(false);
                }
                btsVar4.t(true);
                return zy11Var;
        }
    }
}
