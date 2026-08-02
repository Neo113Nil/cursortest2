package defpackage;

import com.yandex.go.splash.BaseSplashView;

/* loaded from: classes8.dex */
public final /* synthetic */ class na5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ sls b;
    public final /* synthetic */ BaseSplashView c;

    public /* synthetic */ na5(sls slsVar, BaseSplashView baseSplashView) {
        this.b = slsVar;
        this.c = baseSplashView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BaseSplashView baseSplashView = this.c;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                BaseSplashView.doHide$lambda$0(baseSplashView, slsVar);
                break;
            default:
                BaseSplashView.doHide$lambda$0$0(slsVar, baseSplashView);
                break;
        }
    }

    public /* synthetic */ na5(BaseSplashView baseSplashView, sls slsVar) {
        this.c = baseSplashView;
        this.b = slsVar;
    }
}
