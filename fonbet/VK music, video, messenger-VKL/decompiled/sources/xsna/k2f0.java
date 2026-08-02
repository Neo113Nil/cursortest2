package xsna;

import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.ReactionView;

/* compiled from: ReactionView.kt */
/* loaded from: classes6.dex */
public final class k2f0 implements RLottieDrawable.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactionView b;
    public final /* synthetic */ RLottieDrawable c;
    public final /* synthetic */ y0f0 d;

    public k2f0(int i, ReactionView reactionView, RLottieDrawable rLottieDrawable, y0f0 y0f0Var) {
        this.a = i;
        this.b = reactionView;
        this.c = rLottieDrawable;
        this.d = y0f0Var;
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void b() {
        final ReactionView reactionView = this.b;
        int i = reactionView.i;
        final int i2 = this.a;
        if (i2 == i) {
            RLottieDrawable rLottieDrawable = reactionView.g;
            final RLottieDrawable rLottieDrawable2 = this.c;
            if (rLottieDrawable == rLottieDrawable2) {
                rLottieDrawable2.i();
                final y0f0 y0f0Var = this.d;
                gzs<s3q0> gzsVar = new gzs() { // from class: xsna.i2f0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        ReactionView reactionView2 = reactionView;
                        int i3 = reactionView2.i;
                        int i4 = i2;
                        if (i4 == i3) {
                            RLottieDrawable rLottieDrawable3 = reactionView2.g;
                            RLottieDrawable rLottieDrawable4 = rLottieDrawable2;
                            if (rLottieDrawable3 == rLottieDrawable4) {
                                reactionView2.d(y0f0Var, rLottieDrawable4, i4);
                            }
                        }
                        return s3q0.a;
                    }
                };
                ez3 ez3Var = rLottieDrawable2.k;
                ez3Var.v = gzsVar;
                int i3 = ez3Var.b[1] - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                rLottieDrawable2.n(i3);
                reactionView.invalidate();
            }
        }
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void a() {
    }
}
