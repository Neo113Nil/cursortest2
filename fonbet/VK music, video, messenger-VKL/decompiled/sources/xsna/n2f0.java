package xsna;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ReactionsAdapter.kt */
/* loaded from: classes16.dex */
public final class n2f0 extends RecyclerView.e0 {
    public final ImageView l;
    public final Object m;

    public n2f0(FrameLayout frameLayout, ImageView imageView, bk30 bk30Var) {
        super(frameLayout);
        this.l = imageView;
        this.m = msy.a(LazyThreadSafetyMode.NONE, new ig(28));
        bwt0.i0(imageView, new j20(21, bk30Var, this));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void V5(vze0 vze0Var, List<? extends Object> list) {
        boolean z = vze0Var.a;
        ImageView imageView = this.l;
        if (z) {
            imageView.setBackground((Drawable) this.m.getValue());
        } else {
            imageView.setBackground(null);
        }
        if (list.isEmpty()) {
            y0f0 y0f0Var = vze0Var.b;
            Drawable drawable = imageView.getDrawable();
            RLottieDrawable rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
            if (rLottieDrawable != null) {
                rLottieDrawable.k();
            }
            imageView.setImageDrawable(null);
            String str = y0f0Var.c;
            String str2 = "menu_" + y0f0Var.a;
            int i = StoryReactionViewGroup.t;
            RLottieDrawable rLottieDrawable2 = new RLottieDrawable(str, str2, i, i, null, false, false, null, 496);
            rLottieDrawable2.k.q = -1;
            imageView.setImageDrawable(rLottieDrawable2);
            imageView.setVisibility(0);
            rLottieDrawable2.j();
            Drawable drawable2 = imageView.getDrawable();
            RLottieDrawable rLottieDrawable3 = drawable2 instanceof RLottieDrawable ? (RLottieDrawable) drawable2 : null;
            if (rLottieDrawable3 == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                rLottieDrawable3.j();
            }
        }
    }
}
