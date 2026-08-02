package defpackage;

import com.yandex.go.splash.SplashComponent;

/* loaded from: classes8.dex */
public final /* synthetic */ class eqt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SplashComponent b;

    public /* synthetic */ eqt0(SplashComponent splashComponent, int i) {
        this.a = i;
        this.b = splashComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SplashComponent splashComponent = this.b;
        switch (i) {
            case 0:
                splashComponent.detachFromParent();
                break;
            default:
                SplashComponent.hide$lambda$0(splashComponent);
                break;
        }
    }
}
