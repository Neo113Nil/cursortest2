package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes14.dex */
public final /* synthetic */ class fsz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LottieAnimationView b;

    public /* synthetic */ fsz(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        this.b = lottieAnimationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LottieAnimationView lottieAnimationView = this.b;
        switch (i) {
            case 0:
                lottieAnimationView.playAnimation();
                break;
            default:
                lottieAnimationView.playAnimation();
                break;
        }
    }
}
