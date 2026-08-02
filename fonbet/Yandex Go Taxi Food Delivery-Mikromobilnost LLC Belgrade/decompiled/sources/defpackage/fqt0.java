package defpackage;

import android.content.Context;
import com.yandex.go.splash.SplashComponent;
import com.yandex.go.splash.animated.a;
import com.yandex.go.splash.data.dto.AnimatedSplashScreenExperiment;
import com.yandex.go.splash.data.dto.SplashScreenType;

/* loaded from: classes8.dex */
public final class fqt0 implements iqt0 {
    public final /* synthetic */ SplashComponent a;

    public fqt0(SplashComponent splashComponent) {
        this.a = splashComponent;
    }

    @Override // defpackage.iqt0
    public final void Md(bst0 bst0Var) {
        jqt0 jqt0Var;
        n450 nativeSplashViewHolder;
        juz juzVar;
        n250 n250Var;
        n450 nativeSplashViewHolder2;
        boolean z = bst0Var instanceof zg2;
        SplashComponent splashComponent = this.a;
        if (z) {
            n250Var = splashComponent.nativeAnimationSplashViewHolderFactory;
            nativeSplashViewHolder2 = splashComponent.getNativeSplashViewHolder();
            splashComponent.setupCustomSplashView(new m250((oqt0) ((o250) n250Var).a.a.get(), nativeSplashViewHolder2, ((zg2) bst0Var).a));
            return;
        }
        if (bst0Var instanceof yg2) {
            nativeSplashViewHolder = splashComponent.getNativeSplashViewHolder();
            splashComponent.removeView(nativeSplashViewHolder.a().o());
            juzVar = splashComponent.lottieSplashViewHolderFactory;
            AnimatedSplashScreenExperiment.SplashAnimation splashAnimation = ((yg2) bst0Var).a;
            luz luzVar = ((kuz) juzVar).a;
            splashComponent.setupCustomSplashView(new iuz((Context) luzVar.a.get(), (a) luzVar.b.get(), splashAnimation));
            return;
        }
        if (!(bst0Var instanceof g9n)) {
            splashComponent.hide(0L);
        } else {
            if (((g9n) bst0Var).a.b != SplashScreenType.INSTANTLY_HIDE) {
                splashComponent.hide(0L);
                return;
            }
            jqt0Var = splashComponent.presenter;
            jqt0Var.Kg();
            splashComponent.detachFromParent();
        }
    }
}
