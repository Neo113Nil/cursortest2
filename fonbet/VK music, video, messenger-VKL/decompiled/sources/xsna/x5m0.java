package xsna;

import com.vk.rlottie.RLottieDrawable;

/* compiled from: StoryMainReactionButton.kt */
/* loaded from: classes6.dex */
public final class x5m0 implements RLottieDrawable.a {
    public final /* synthetic */ RLottieDrawable a;

    public x5m0(RLottieDrawable rLottieDrawable) {
        this.a = rLottieDrawable;
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void b() {
        RLottieDrawable rLottieDrawable = this.a;
        int i = rLottieDrawable.k.b[1] - 1;
        if (i < 0) {
            i = 0;
        }
        rLottieDrawable.n(i);
        rLottieDrawable.i();
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void a() {
    }
}
