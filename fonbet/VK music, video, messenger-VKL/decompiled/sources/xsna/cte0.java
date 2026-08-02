package xsna;

import com.vk.rlottie.RLottieDrawable;
import com.vk.rlottie.RLottieView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cte0 implements izs {
    public final /* synthetic */ RLottieView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ cte0(RLottieView rLottieView, int i, int i2) {
        this.b = rLottieView;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RLottieDrawable rLottieDrawable = (RLottieDrawable) obj;
        RLottieView rLottieView = this.b;
        if (rLottieView.h) {
            rLottieDrawable.n(rLottieView.c);
            rLottieDrawable.i();
        } else {
            rLottieDrawable.j();
        }
        rLottieView.g = rLottieDrawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(rLottieView);
        }
        rLottieView.invalidate();
        RLottieDrawable rLottieDrawable2 = rLottieView.g;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.setBounds(0, 0, this.c, this.d);
        }
        return s3q0.a;
    }
}
