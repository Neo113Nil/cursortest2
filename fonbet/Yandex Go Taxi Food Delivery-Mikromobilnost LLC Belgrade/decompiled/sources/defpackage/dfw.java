package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardModalView;

/* loaded from: classes14.dex */
public final class dfw implements bfw {
    public final /* synthetic */ IntercityDashboardModalView a;

    public dfw(IntercityDashboardModalView intercityDashboardModalView) {
        this.a = intercityDashboardModalView;
    }

    @Override // defpackage.bfw
    public final void Oa() {
        IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView;
        intercityDashboardPromoBannerContainerView = this.a.dashboardPromoBannerContainerView;
        intercityDashboardPromoBannerContainerView.startDelayedAutoscroll$impl();
    }

    @Override // defpackage.bfw
    public final void a5() {
        this.a.close();
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        jlw jlwVar = (jlw) obj;
        boolean z = jlwVar instanceof glw;
        IntercityDashboardModalView intercityDashboardModalView = this.a;
        if (z) {
            intercityDashboardModalView.renderContent((glw) jlwVar);
            return;
        }
        if (jlwVar instanceof hlw) {
            intercityDashboardModalView.renderErrorState();
        } else if (jlwVar instanceof ilw) {
            intercityDashboardModalView.renderLoadingState();
        } else {
            w511.b();
        }
    }
}
