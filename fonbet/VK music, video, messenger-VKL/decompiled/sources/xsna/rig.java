package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.toggle.features.ImFeatures;
import xsna.cri;
import xsna.dt1;
import xsna.k8s;
import xsna.q630;
import xsna.t8s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rig implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rig(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                sig.a((bei0) this.c, (jai) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((t8s.e) this.c).a((k8s.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                rg50 rg50Var = (rg50) this.c;
                gzs gzsVar = (gzs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1281941018, intValue, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.LegoAccessorySample.<anonymous> (ModalPageScreenContent.kt:260)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 f = txj0.f(aVar2, 1.0f);
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new lw20(rg50Var, 1);
                        aVar.R(x);
                    }
                    q630 E = s200.E(sv1.z(f, (izs) x), kqu0.b, kqu0.c);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, E);
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
                    q630 f2 = txj0.f(aVar2, 1.0f);
                    ButtonSize buttonSize = ButtonSize.Large;
                    bhu0.e(gzsVar, buttonSize, ButtonStyle.Primary, ButtonAppearance.Accent, f2, null, false, false, null, null, null, "Готово", null, null, null, null, false, null, null, null, aVar, 28080, 384, 0, 4190176);
                    f9t.e(txj0.h(aVar2, kqu0.t), aVar, 0);
                    bhu0.e(gzsVar, buttonSize, ButtonStyle.Secondary, ButtonAppearance.Neutral, txj0.f(aVar2, 1.0f), null, false, false, null, null, null, "Отмена", null, null, null, null, false, null, null, null, aVar, 28080, 384, 0, 4190176);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                vm30 vm30Var = (vm30) this.c;
                MsgFromUser msgFromUser = (MsgFromUser) this.d;
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.g0(msgFromUser);
                }
                vm30Var.f0 = null;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures)) {
                    vm30Var.e0.dismiss();
                } else {
                    vm30Var.d0.a();
                }
                return s3q0.a;
            case 4:
                gzs gzsVar2 = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                tv80.c(ne7.I(49), (androidx.compose.runtime.a) obj, gzsVar2, q630Var);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((l8d0) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((pid0) this.c).e((c5u) ((pmc) this.d), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 7:
                eld0 eld0Var = (eld0) this.c;
                dld0 dld0Var = (dld0) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(995324565, intValue2, -1, "com.vk.ecomm.market.good.good2.presentation.gallery.ProductCardGalleryViewHolder.onBind.<anonymous>.<anonymous> (ProductCardGalleryViewHolder.kt:41)");
                    }
                    bld0.a(eld0Var, dld0Var.n, txj0.f(q630.a.a, 1.0f), aVar4, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 8:
                q630 q630Var2 = (q630) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                qqj0.b(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar, q630Var2);
                return s3q0.a;
            default:
                com.vk.messagetemplates.impl.details.f fVar = (com.vk.messagetemplates.impl.details.f) this.c;
                izs izsVar2 = (izs) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1279677323, intValue3, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsScreenContent.<anonymous> (TemplateDetailsScreenContent.kt:35)");
                    }
                    j8o0.a(fVar.c, izsVar2, null, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ rig(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
