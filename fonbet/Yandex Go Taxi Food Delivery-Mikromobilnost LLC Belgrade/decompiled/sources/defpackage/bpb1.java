package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class bpb1 {
    public static mgv a;

    public static final void a(p440 p440Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-224768289);
        int i2 = 4;
        int i3 = (btsVar.k(p440Var) ? 4 : 2) | i;
        int i4 = 0;
        if (!btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530Var2 = f530Var;
            btsVar.Y();
        } else if (p440Var instanceof o440) {
            btsVar.e0(-217910680);
            k9d.a.getClass();
            ydb1.a(f530Var, null, k9d.b, null, null, null, null, false, btsVar, 390, 250);
            f530Var2 = f530Var;
            btsVar.t(false);
        } else {
            f530Var2 = f530Var;
            if (!(p440Var instanceof n440)) {
                throw unr0.y(-1253956558, btsVar, false);
            }
            btsVar.e0(-217421128);
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new x240(i4, p440Var);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(f530Var2, (tls) Q), null, wwg.S(307069805, true, new wg30(7, p440Var), btsVar), null, null, null, null, false, btsVar, 384, 250);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(p440Var, f530Var2, i, i2);
        }
    }

    public static final void b(k340 k340Var, tls tlsVar, wg6 wg6Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1764008980);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(k340Var) : btsVar.e(k340Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(wg6Var) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            lg6 c = qab1.c(wg6Var, new up2(((dtr0) wg6Var.g.getValue()).a == -2 ? zp2.c : zp2.d), null, btsVar, ((i3 >> 6) & 14) | 384, 0);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            boolean z = (i3 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new d0(tlsVar, oz40Var, 8);
                btsVar.o0(Q2);
            }
            tls tlsVar2 = (tls) Q2;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            c.a(null, wg6Var, c, false, false, null, null, wwg.S(-327328116, true, new y240(tlsVar, k340Var), btsVar), null, null, wwg.S(-1263859570, true, new y240(k340Var, tlsVar2), btsVar), wwg.S(212345018, true, new l0(20, k340Var, tlsVar), btsVar), btsVar, ((i3 >> 3) & 112) | 12582912, 54, 889);
            ku30 ku30Var = k340Var.g;
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new w01(18, oz40Var);
                btsVar.o0(Q3);
            }
            ru.yandex.taxi.masstransit.geopayment.purchase.b.b(ku30Var, booleanValue, tlsVar2, (sls) Q3, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ((Object) k340Var, (cms) tlsVar, (Object) wg6Var, f530Var2, i, 14);
        }
    }

    public static final void c(List list, ety0 ety0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-643304830);
        int i2 = i | (btsVar.k(list) ? 4 : 2) | (btsVar.k(ety0Var) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                hk2 hk2Var = new hk2(0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r2v0 r2v0Var = (r2v0) it.next();
                    String str = r2v0Var.a;
                    if (str != null) {
                        hk2Var.d(str);
                    } else if (r2v0Var.b != null) {
                        String str2 = "icon_" + i3;
                        hk2Var.d("  ");
                        n6b1.a(hk2Var, str2, "�");
                        hk2Var.d("  ");
                        linkedHashMap.put(str2, new oxv(new r3c0(4, uh6.E(7), uh6.E(8)), new a(-1226241452, new tv30(r2v0Var, i4), true)));
                        i3++;
                    }
                }
                Pair pair = new Pair(hk2Var.i(), linkedHashMap);
                btsVar.o0(pair);
                Q = pair;
            }
            Pair pair2 = (Pair) Q;
            m5b1.a((kk2) pair2.getFirst(), f530Var, ety0.a(ety0Var, tje.n(AppColor$Palette.Text, btsVar), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), null, 2, false, 2, 0, (Map) pair2.getSecond(), null, btsVar, 1597488, 0, 1704);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(list, ety0Var, f530Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final okp d(BaseFragment baseFragment) {
        for (Fragment fragment = baseFragment.getParentFragment(); fragment != 0; fragment = fragment.getParentFragment()) {
            if (fragment instanceof okp) {
                return (okp) fragment;
            }
        }
        return (okp) baseFragment.requireActivity();
    }
}
