package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerContainerView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ohw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntercityDashboardPromoBannerContainerView b;

    public /* synthetic */ ohw(IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView, int i) {
        this.a = i;
        this.b = intercityDashboardPromoBannerContainerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView = this.b;
        switch (i) {
            case 0:
                IntercityDashboardPromoBannerContainerView.autoscrollRunnable$lambda$0(intercityDashboardPromoBannerContainerView);
                break;
            default:
                IntercityDashboardPromoBannerContainerView.render$lambda$0$0(intercityDashboardPromoBannerContainerView);
                break;
        }
    }
}
