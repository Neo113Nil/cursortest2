package defpackage;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardHorizontalButtons;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;

/* loaded from: classes14.dex */
public final /* synthetic */ class k6j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6j b;

    public /* synthetic */ k6j(g6j g6jVar, int i) {
        this.a = i;
        this.b = g6jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g6j g6jVar = this.b;
        switch (i) {
            case 0:
                DetailsCardHorizontalButtons.setupHeightInteractor$onNewActiveHeightAnimation(g6jVar);
                break;
            case 1:
                DetailsCardHorizontalButtons.setupHeightInteractor$onHeightAnimationFinished(g6jVar);
                break;
            case 2:
                DriverSectionView.setupHeightInteractor$onNewActiveHeightAnimation(g6jVar);
                break;
            default:
                DriverSectionView.setupHeightInteractor$onHeightAnimationFinished(g6jVar);
                break;
        }
    }
}
