package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lsz implements xtz {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public lsz(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // defpackage.xtz
    public final void onResult(Object obj) {
        int i;
        xtz xtzVar;
        int i2;
        int i3 = this.a;
        WeakReference weakReference = this.b;
        switch (i3) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    i = lottieAnimationView.fallbackResource;
                    if (i != 0) {
                        i2 = lottieAnimationView.fallbackResource;
                        lottieAnimationView.setImageResource(i2);
                    }
                    xtzVar = lottieAnimationView.failureListener;
                    (xtzVar == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th);
                    break;
                }
                break;
            default:
                nsz nszVar = (nsz) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(nszVar);
                    break;
                }
                break;
        }
    }
}
