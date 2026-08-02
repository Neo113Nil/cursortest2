package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.hm3;
import xsna.is5;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class gm3 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gm3(List list, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = list;
        this.d = obj;
        this.e = obj2;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                ksy ksyVar = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                hm3 hm3Var = (hm3) this.e;
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(ksyVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    km3 km3Var = (km3) this.c.get(intValue);
                    aVar.K(-1152614991);
                    boolean J = aVar.J(km3Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = km3Var.a.name() + " " + km3Var.b.name();
                        aVar.R(x);
                    }
                    String str = (String) x;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar, 48);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    yqv0.c(str, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 7), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 48, 0, 16380);
                    int i3 = hm3.b.$EnumSwitchMapping$0[((hm3.a) this.d).ordinal()];
                    if (i3 == 1) {
                        aVar.K(-1721965339);
                        hm3Var.b(km3Var, str, aVar, 0);
                        aVar.j();
                    } else {
                        if (i3 != 2) {
                            throw alb0.c(-1721967474, aVar);
                        }
                        aVar.K(-1721962846);
                        hm3Var.d(km3Var, str, aVar, 0);
                        aVar.j();
                    }
                    aVar.G();
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                cry cryVar = (cry) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                ds5 ds5Var = (ds5) this.e;
                is5 is5Var = (is5) this.d;
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar4.J(cryVar) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar4.o(intValue3) ? 32 : 16;
                }
                if (aVar4.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1117249557, i2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    int intValue5 = ((Number) ((wow) this.c).b.get(intValue3)).intValue();
                    aVar4.K(-2112387435);
                    int i4 = is5.f.$EnumSwitchMapping$0[((is5.c) ((zak0) is5Var.l).getValue()).ordinal()];
                    if (i4 == 1) {
                        aVar4.K(208955345);
                        is5Var.f(ds5Var, iah0.a(intValue5), aVar4, 0);
                        aVar4.j();
                    } else {
                        if (i4 != 2) {
                            throw alb0.c(208953134, aVar4);
                        }
                        aVar4.K(208958572);
                        is5Var.c(ds5Var, intValue5, aVar4, 0);
                        aVar4.j();
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
