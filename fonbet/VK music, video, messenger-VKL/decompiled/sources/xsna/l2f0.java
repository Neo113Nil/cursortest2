package xsna;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;

/* compiled from: ReactionViewHolder.kt */
/* loaded from: classes6.dex */
public final class l2f0 {
    public final y0f0 a;
    public final FrameLayout b;
    public final ImageView c;

    public l2f0(y0f0 y0f0Var, FrameLayout frameLayout, ImageView imageView) {
        this.a = y0f0Var;
        this.b = frameLayout;
        this.c = imageView;
        a();
    }

    public final void a() {
        ImageView imageView = this.c;
        if (imageView.getDrawable() == null) {
            y0f0 y0f0Var = this.a;
            String str = y0f0Var.c;
            String str2 = "menu_" + y0f0Var.a;
            int i = StoryReactionViewGroup.t;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(str, str2, i, i, null, false, false, null, 496);
            rLottieDrawable.k.q = -1;
            imageView.setImageDrawable(rLottieDrawable);
            rLottieDrawable.i();
        }
    }
}
