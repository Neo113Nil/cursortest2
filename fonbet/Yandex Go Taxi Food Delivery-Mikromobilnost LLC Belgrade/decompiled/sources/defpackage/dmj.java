package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.BalloonView;
import com.yandex.mapkit.navigation.automotive.layer.BalloonViewListener;
import com.yandex.mapkit.navigation.automotive.layer.RouteView;

/* loaded from: classes7.dex */
public final class dmj implements BalloonViewListener {
    public final /* synthetic */ pzs a;

    public dmj(pzs pzsVar) {
        this.a = pzsVar;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.BalloonViewListener
    public final void onBalloonContentChanged(BalloonView balloonView) {
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.BalloonViewListener
    public final void onBalloonViewTap(BalloonView balloonView) {
        pzs pzsVar = this.a;
        pzsVar.c(new cmj(pzsVar, balloonView, 1));
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.BalloonViewListener
    public final void onBalloonViewsChanged(RouteView routeView) {
        pzs pzsVar = this.a;
        pzsVar.c(new bmh(28, pzsVar, routeView));
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.BalloonViewListener
    public final void onBalloonVisibilityChanged(BalloonView balloonView) {
        pzs pzsVar = this.a;
        pzsVar.c(new cmj(pzsVar, balloonView, 0));
    }
}
