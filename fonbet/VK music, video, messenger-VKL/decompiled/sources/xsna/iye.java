package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.hud0;
import xsna.loh0;
import xsna.nye;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class iye implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iye(List list, izs izsVar, nye nyeVar, izs izsVar2, int i) {
        this.e = list;
        this.c = izsVar;
        this.g = nyeVar;
        this.f = izsVar2;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x027c  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        mc90 mc90Var;
        List list;
        izs izsVar;
        Object gd5Var;
        rg50 rg50Var;
        izs izsVar2;
        androidx.compose.runtime.a aVar;
        boolean J;
        Object x;
        boolean J2;
        Object x2;
        androidx.compose.runtime.a aVar2;
        int i = this.b;
        int i2 = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                List list2 = (List) obj5;
                nye nyeVar = (nye) obj3;
                izs izsVar3 = (izs) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(725203303, intValue, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.ProfilesBlock.<anonymous> (ClipsProfileToolbarView.kt:259)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630.a aVar4 = q630.a.a;
                    q630 c = qri.c(aVar3, aVar4);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    Object x3 = aVar3.x();
                    Object obj6 = a.C0011a.a;
                    if (x3 == obj6) {
                        x3 = androidx.compose.runtime.i.a(i2);
                        aVar3.R(x3);
                    }
                    rg50 rg50Var2 = (rg50) x3;
                    Object c2 = androidx.compose.runtime.k.c(new wow(list2), aVar3, 0);
                    final int intValue2 = rg50Var2.getIntValue();
                    boolean J3 = aVar3.J(c2);
                    Object x4 = aVar3.x();
                    if (J3 || x4 == obj6) {
                        x4 = new j1(c2, 29);
                        aVar3.R(x4);
                    }
                    final gzs gzsVar = (gzs) x4;
                    fh9 fh9Var = pc90.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(665595439, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.rememberPagerStateWithoutOffset (pagerStateInternal.kt:16)");
                    }
                    Object[] objArr = new Object[0];
                    fh9 fh9Var2 = pc90.a;
                    boolean o = aVar3.o(intValue2) | aVar3.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) | aVar3.J(gzsVar);
                    Object x5 = aVar3.x();
                    if (o || x5 == obj6) {
                        x5 = new gzs() { // from class: xsna.oc90
                            @Override // xsna.gzs
                            public final Object invoke() {
                                return new qc90(intValue2, gzsVar);
                            }
                        };
                        aVar3.R(x5);
                    }
                    mc90 mc90Var2 = (mc90) crx0.D(objArr, fh9Var2, (gzs) x5, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    izs izsVar4 = this.c;
                    rt.a(list2, mc90Var2, izsVar4, aVar3, 0);
                    hud0 hud0Var = (hud0) list2.get(rg50Var2.getIntValue());
                    if (hud0Var instanceof hud0.b) {
                        aVar3.K(-1371233822);
                        list = list2;
                        izsVar = izsVar4;
                        nyeVar.g(mc90Var2, list, rg50Var2.getIntValue(), izsVar, aVar3, 32768);
                        mc90Var = mc90Var2;
                        androidx.compose.runtime.a aVar6 = aVar3;
                        aVar6.j();
                        aVar2 = aVar6;
                    } else {
                        mc90Var = mc90Var2;
                        list = list2;
                        androidx.compose.runtime.a aVar7 = aVar3;
                        izsVar = izsVar4;
                        if (hud0Var instanceof hud0.c) {
                            aVar7.K(-1371066205);
                            ck70.b(aVar4, 14, aVar7, 6);
                            aVar2 = aVar7;
                        } else if (hud0Var instanceof hud0.d) {
                            aVar7.K(-1370922117);
                            f9t.e(txj0.h(aVar4, 12), aVar7, 6);
                            zxe a2 = ((hud0) list.get(rg50Var2.getIntValue())).a();
                            boolean y = aVar7.y(nyeVar) | aVar7.J(izsVar) | aVar7.J(list);
                            Object x6 = aVar7.x();
                            if (y || x6 == obj6) {
                                x6 = new vkb(nyeVar, izsVar, list, rg50Var2);
                                aVar7.R(x6);
                            }
                            gud0.f(a2, (izs) x6, aVar7, 0);
                            aVar7.j();
                            aVar2 = aVar7;
                        } else {
                            if (!(hud0Var instanceof hud0.a)) {
                                throw alb0.c(1202691112, aVar7);
                            }
                            aVar7.K(-1370467781);
                            f9t.e(txj0.h(aVar4, 12), aVar7, 6);
                            zxe a3 = ((hud0) list.get(rg50Var2.getIntValue())).a();
                            boolean y2 = aVar7.y(nyeVar) | aVar7.J(izsVar) | aVar7.J(list);
                            Object x7 = aVar7.x();
                            if (y2 || x7 == obj6) {
                                rg50Var = rg50Var2;
                                gd5Var = new gd5(nyeVar, izsVar, list, rg50Var, 4);
                                izsVar2 = izsVar;
                                list = list;
                                aVar7.R(gd5Var);
                            } else {
                                gd5Var = x7;
                                izsVar2 = izsVar;
                                rg50Var = rg50Var2;
                            }
                            gud0.f(a3, (izs) gd5Var, aVar7, 0);
                            aVar7.j();
                            aVar = aVar7;
                            Integer valueOf = Integer.valueOf(mc90Var.k());
                            J = aVar.J(mc90Var) | aVar.J(list) | aVar.J(izsVar2) | aVar.J(izsVar3);
                            x = aVar.x();
                            if (!J || x == obj6) {
                                rg50 rg50Var3 = rg50Var;
                                Object bVar = new nye.b(mc90Var, list, izsVar2, izsVar3, rg50Var3, null);
                                rg50Var = rg50Var3;
                                aVar.R(bVar);
                                x = bVar;
                            }
                            bap.g(valueOf, (wzs) x, aVar, 0);
                            s3q0 s3q0Var = s3q0.a;
                            J2 = aVar.J(list) | aVar.J(izsVar2);
                            x2 = aVar.x();
                            if (!J2 || x2 == obj6) {
                                x2 = new nye.c(list, izsVar2, rg50Var, null);
                                aVar.R(x2);
                            }
                            bap.g(s3q0Var, (wzs) x2, aVar, 6);
                            aVar.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        }
                    }
                    izsVar2 = izsVar;
                    rg50Var = rg50Var2;
                    aVar = aVar2;
                    Integer valueOf2 = Integer.valueOf(mc90Var.k());
                    J = aVar.J(mc90Var) | aVar.J(list) | aVar.J(izsVar2) | aVar.J(izsVar3);
                    x = aVar.x();
                    if (!J) {
                    }
                    rg50 rg50Var32 = rg50Var;
                    Object bVar2 = new nye.b(mc90Var, list, izsVar2, izsVar3, rg50Var32, null);
                    rg50Var = rg50Var32;
                    aVar.R(bVar2);
                    x = bVar2;
                    bap.g(valueOf2, (wzs) x, aVar, 0);
                    s3q0 s3q0Var2 = s3q0.a;
                    J2 = aVar.J(list) | aVar.J(izsVar2);
                    x2 = aVar.x();
                    if (!J2) {
                    }
                    x2 = new nye.c(list, izsVar2, rg50Var, null);
                    aVar.R(x2);
                    bap.g(s3q0Var2, (wzs) x2, aVar, 6);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                lig0.d((mtk0) obj5, (loh0.f) obj4, this.c, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
        }
    }

    public /* synthetic */ iye(mtk0 mtk0Var, loh0.f fVar, izs izsVar, q630 q630Var, int i) {
        this.e = mtk0Var;
        this.f = fVar;
        this.c = izsVar;
        this.g = q630Var;
        this.d = i;
    }
}
