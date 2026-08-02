package defpackage;

import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.facade.b;
import java.util.Map;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;

/* loaded from: classes12.dex */
public final class gjr implements ejr {
    public final yhr a;
    public final Map b;
    public b c;
    public fjr w;

    public gjr(yhr yhrVar, Map map) {
        this.a = yhrVar;
        this.b = map;
    }

    @Override // defpackage.ejr
    public final void f(GoFrameLayout goFrameLayout, SummaryPromotionModalWindowsModalView summaryPromotionModalWindowsModalView) {
        goFrameLayout.setVisibility(0);
        b a = ((nir) this.a).a(new nhr(new vlr("OrderModalHeader", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048574), null, new g92(2, new pwy(new u1m(2, "bdui/v1/taxi/summary/order/modal-header", this.b), new ywl(new aks0("(theme bgMinor 0 (padded 16 16 18 16 (bone 100% 90 24)))", null), null, cnr0.b, null, null, null), false, 4)), null, null, null, null, null, null, null, 8186));
        fjr fjrVar = new fjr(0, goFrameLayout);
        a.a(fjrVar);
        a.b(goFrameLayout, summaryPromotionModalWindowsModalView);
        this.c = a;
        this.w = fjrVar;
    }

    @Override // defpackage.ejr
    public final void onDetach() {
        b bVar;
        fjr fjrVar = this.w;
        if (fjrVar != null && (bVar = this.c) != null) {
            bVar.e(fjrVar);
        }
        b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.d();
        }
        b bVar3 = this.c;
        if (bVar3 != null) {
            bVar3.c();
        }
        this.c = null;
        this.w = null;
    }
}
