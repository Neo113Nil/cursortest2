package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.lu7;
import xsna.q630;
import xsna.rmw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zt7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zt7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                vu7 vu7Var = (vu7) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-389765165, intValue, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.Content.<anonymous> (BookingRecordCompletedScreen.kt:127)");
                    }
                    lu7.a aVar2 = vu7Var.d;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (aVar2 != null) {
                        aVar.K(2097578822);
                        com.vk.ecomm.onlinebooking.impl.common.a aVar3 = vu7Var.d.a;
                        boolean J = aVar.J(vu7Var) | aVar.J(izsVar);
                        Object x = aVar.x();
                        if (J || x == c0012a) {
                            x = new k4(2, vu7Var, izsVar);
                            aVar.R(x);
                        }
                        iq7.a(aVar3, (gzs) x, aVar, 0);
                        aVar.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    aVar.K(2091401359);
                    aVar.j();
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar4 = q630.a.a;
                    q630 c = qri.c(aVar, aVar4);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar5);
                    } else {
                        aVar.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar, c, dVar);
                    float f = 16;
                    q630 H = s200.H(p490.D(txj0.c(aVar4, 1.0f), p490.x(aVar), 14), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 72, 2);
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c2 = qri.c(aVar, H);
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar5);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cVar);
                    k9q0.w(aVar, D2, eVar);
                    ur.d(hashCode2, aVar, bVar, aVar, c2678a);
                    k9q0.w(aVar, c2, dVar);
                    fu7.e(vu7Var, aVar, 6);
                    if (vu7Var.b != null) {
                        aVar.K(-863921151);
                        f9t.e(txj0.h(aVar4, 40), aVar, 6);
                        av7 av7Var = vu7Var.b;
                        String str = vu7Var.f;
                        boolean J2 = aVar.J(izsVar) | aVar.J(vu7Var);
                        Object x2 = aVar.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new ju(1, izsVar, vu7Var);
                            aVar.R(x2);
                        }
                        mt7.b(av7Var, str, null, (izs) x2, aVar, 0, 4);
                    } else {
                        aVar.K(-870639533);
                    }
                    aVar.j();
                    aVar.G();
                    fu7.c(0, aVar, izsVar, ra8.a.b(txj0.z(aVar4, null, 3), dt1.a.i));
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                umd0 umd0Var = (umd0) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-408452541, intValue2, -1, "com.vk.core.compose.component.menu.ContextMenuScopeImpl.items.<anonymous>.<anonymous> (VkContextMenu.kt:911)");
                    }
                    umd0Var.a(umd0Var, (ProductCardTopBarControlAction) this.d, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 2:
                rmw.e eVar2 = (rmw.e) this.c;
                izs izsVar2 = (izs) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                aVar7.K(1317460003);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1317460003, intValue3, -1, "com.vk.libvideo.design.compose.base.media.onDrawnFor.<anonymous>.<anonymous> (MediaView.kt:140)");
                }
                boolean J3 = aVar7.J(eVar2);
                Object x3 = aVar7.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (J3 || x3 == c0012a2) {
                    x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    aVar7.R(x3);
                }
                wh50 wh50Var = (wh50) x3;
                boolean J4 = aVar7.J(wh50Var) | aVar7.J(izsVar2) | aVar7.J(eVar2);
                Object x4 = aVar7.x();
                if (J4 || x4 == c0012a2) {
                    x4 = new wyg(izsVar2, eVar2, wh50Var, 2);
                    aVar7.R(x4);
                }
                q630 c3 = bu00.c(q630Var, (izs) x4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                return c3;
            case 3:
                hze hzeVar = (hze) this.c;
                wzs wzsVar = (wzs) this.d;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1613409668, intValue4, -1, "com.vk.clips.upload.ui.impl.compose.views.UploadCellItem.<anonymous>.<anonymous> (UploadCellItem.kt:101)");
                }
                List list = hzeVar.g;
                boolean J5 = aVar8.J(wzsVar) | aVar8.J(hzeVar);
                Object x5 = aVar8.x();
                if (J5 || x5 == a.C0011a.a) {
                    x5 = new gs80(5, wzsVar, hzeVar);
                    aVar8.R(x5);
                }
                jaq0.b(0, aVar8, list, (izs) x5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            default:
                wq5 wq5Var = (wq5) this.c;
                yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar = (yzs) obj;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= aVar9.y(yzsVar) ? 4 : 2;
                }
                if (aVar9.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(381166023, intValue5, -1, "com.vk.core.compose.component.UserStackScopeImpl.avatars.<anonymous>.<anonymous> (VkUserStack.kt:358)");
                    }
                    wq5Var.e(this.d, yzsVar, aVar9, (intValue5 << 3) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
        }
    }
}
