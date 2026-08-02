package defpackage;

import com.yandex.mapkit.navigation.transport.layer.RouteView;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonViewListener;

/* loaded from: classes7.dex */
public final class f011 implements BalloonViewListener {
    public final /* synthetic */ msv a;

    public f011(msv msvVar) {
        this.a = msvVar;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonViewListener
    public final void onBalloonContentChanged(BalloonView balloonView) {
        msv msvVar = this.a;
        msvVar.c(new e011(msvVar, balloonView, 0));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonViewListener
    public final void onBalloonViewTap(BalloonView balloonView) {
        msv msvVar = this.a;
        msvVar.c(new e011(msvVar, balloonView, 1));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonViewListener
    public final void onBalloonViewsChanged(RouteView routeView) {
        msv msvVar = this.a;
        msvVar.c(new zr01(5, msvVar, routeView));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonViewListener
    public final void onBalloonVisibilityChanged(BalloonView balloonView) {
        msv msvVar = this.a;
        msvVar.c(new e011(msvVar, balloonView, 2));
    }
}
