package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.Lifecycle;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.pox0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ofo implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ofo(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                BlockId blockId = (BlockId) this.c;
                ksy ksyVar = (ksy) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(-946710045);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-946710045, intValue, -1, "com.vk.catalog.mvi.section.ui.view.reorder.dragAndDropItem.<anonymous> (DragAndDropReorder.kt:117)");
                }
                wfo wfoVar = (wfo) aVar.r(sfo.a);
                if (wfoVar == null) {
                    aVar.K(744717319);
                    aVar.j();
                } else {
                    boolean f = epx.f(blockId, ((zak0) wfoVar.f).getValue());
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (f) {
                        aVar.K(744719811);
                        q630 P = f370.P(q630Var, 1.0f);
                        boolean y = aVar.y(wfoVar);
                        Object x = aVar.x();
                        if (y || x == c0012a) {
                            x = new iie(wfoVar, 10);
                            aVar.R(x);
                        }
                        q630Var = rdu.a(P, (izs) x);
                        aVar.j();
                    } else if (epx.f(blockId, ((zak0) wfoVar.g).getValue())) {
                        aVar.K(744725481);
                        q630 P2 = f370.P(q630Var, 1.0f);
                        boolean y2 = aVar.y(wfoVar);
                        Object x2 = aVar.x();
                        if (y2 || x2 == c0012a) {
                            x2 = new l2k(wfoVar, 8);
                            aVar.R(x2);
                        }
                        q630Var = rdu.a(P2, (izs) x2);
                        aVar.j();
                    } else {
                        aVar.K(744729449);
                        aVar.j();
                        q630Var = ksy.c(ksyVar, q630Var, 2);
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return q630Var;
            case 1:
                izs izsVar = (izs) this.c;
                gzs gzsVar = (gzs) this.d;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-1313889252);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1313889252, intValue2, -1, "com.vk.core.compose.ext.onViewedListener.<anonymous> (ModifierExt.kt:39)");
                }
                Object x3 = aVar2.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (x3 == c0012a2) {
                    x3 = androidx.compose.runtime.j.a(-1L);
                    aVar2.R(x3);
                }
                ah50 ah50Var = (ah50) x3;
                Lifecycle lifecycle = ((f5z) aVar2.r(bvz.a)).getLifecycle();
                boolean J = aVar2.J(izsVar) | aVar2.J(gzsVar) | aVar2.y(lifecycle);
                Object x4 = aVar2.x();
                if (J || x4 == c0012a2) {
                    x4 = new sps(lifecycle, gzsVar, ah50Var, izsVar, 1);
                    aVar2.R(x4);
                }
                bap.c(lifecycle, (izs) x4, aVar2, 0);
                boolean n = aVar2.n(0.8f) | aVar2.J(izsVar) | aVar2.J(gzsVar);
                Object x5 = aVar2.x();
                if (n || x5 == c0012a2) {
                    x5 = new zgb(gzsVar, ah50Var, izsVar, 3);
                    aVar2.R(x5);
                }
                q630 o = egi.o(q630Var2, (izs) x5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return o;
            case 2:
                y440 y440Var = (y440) this.c;
                u76 u76Var = (u76) this.d;
                String str = (String) obj;
                String str2 = (String) obj2;
                UserId userId = (UserId) obj3;
                y440Var.getBottomControlPanel().setSendButtonAvatar(str2);
                y440Var.getBottomControlPanel().setPrivacy(fkq0.d(userId) ? u76Var.getPrivacy() : null);
                u76Var.I2(str, str2);
                u76Var.k3().e = fkq0.b(userId) ? fkq0.e(userId) : UserId.d;
                u76Var.J2(u76Var.k3().e);
                return s3q0.a;
            default:
                List list = (List) this.c;
                izs izsVar2 = (izs) this.d;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(va8Var) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1580760831, intValue3, -1, "com.vk.community.design.compose.widget.list.WidgetList.<anonymous> (WidgetList.kt:38)");
                    }
                    float j = va8Var.j() * 0.78f;
                    jgh0 x6 = p490.x(aVar3);
                    q630.a aVar4 = q630.a.a;
                    q630 r = p490.r(aVar4, x6, 14);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, r);
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
                    aVar3.K(-1779094558);
                    int i = 0;
                    for (Object obj4 : (list != null ? new wow(list) : null).b) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        hnx0.b((pox0.b.C3524b) obj4, i == e43.h(list != null ? new wow(list) : null), txj0.v(aVar4, j), izsVar2, aVar3, 0);
                        i = i2;
                    }
                    if (gp.d(aVar3)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
