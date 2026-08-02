package defpackage;

import com.yandex.go.chargers.design.components.ChargersButtonsView;
import com.yandex.go.chargers.order.completion.pre_finish.ChargersFinishModalView;

/* loaded from: classes12.dex */
public final class c1a implements e1a {
    public final /* synthetic */ ChargersFinishModalView a;

    public c1a(ChargersFinishModalView chargersFinishModalView) {
        this.a = chargersFinishModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        f1a f1aVar;
        ChargersButtonsView chargersButtonsView;
        f1a f1aVar2;
        ChargersButtonsView chargersButtonsView2;
        t1a t1aVar = (t1a) obj;
        boolean z = t1aVar instanceof q1a;
        ChargersFinishModalView chargersFinishModalView = this.a;
        if (z) {
            chargersButtonsView2 = chargersFinishModalView.chargersButtonsView;
            chargersButtonsView2.loading();
            return;
        }
        if (t1aVar instanceof r1a) {
            f1aVar2 = chargersFinishModalView.chargersFinishNavigator;
            ((k1a) ((io9) f1aVar2).a).r(new j1a(((r1a) t1aVar).a, 0));
            return;
        }
        if (t1aVar instanceof s1a) {
            chargersFinishModalView.showPreFinish((s1a) t1aVar);
            return;
        }
        if (t1aVar instanceof n1a) {
            chargersButtonsView = chargersFinishModalView.chargersButtonsView;
            chargersFinishModalView.disableChildren(chargersButtonsView);
            return;
        }
        if (t1aVar instanceof m1a) {
            chargersFinishModalView.showFinishingState(((m1a) t1aVar).a, true);
            return;
        }
        if (t1aVar instanceof o1a) {
            chargersFinishModalView.showFinishingState(((o1a) t1aVar).a, false);
        } else {
            if (!(t1aVar instanceof l1a)) {
                w511.b();
                return;
            }
            f1aVar = chargersFinishModalView.chargersFinishNavigator;
            ((k1a) ((io9) f1aVar).a).r(new j1a(((l1a) t1aVar).a, 0));
        }
    }
}
