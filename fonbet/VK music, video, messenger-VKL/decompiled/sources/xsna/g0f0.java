package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.im.reactions.api.BigReactionAnimationsView;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vk.rlottie.RLottieDrawable;
import java.lang.ref.WeakReference;

/* compiled from: ReactionBigAnimationDrawable.kt */
/* loaded from: classes2.dex */
public final class g0f0 extends Drawable {
    public final ReactionAssetDrawable a;
    public final int b;
    public final int c;
    public RLottieDrawable d;
    public WeakReference<View> e;
    public WeakReference<BigReactionAnimationsView> f;
    public final int[] g = new int[2];
    public d0f0 h;

    public g0f0(ReactionAssetDrawable reactionAssetDrawable, int i, int i2) {
        this.a = reactionAssetDrawable;
        this.b = i;
        this.c = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        View view;
        if (this.a.getCallback() == null) {
            d0f0 d0f0Var = this.h;
            if (d0f0Var != null) {
                d0f0Var.b();
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        WeakReference<View> weakReference = this.e;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.getLocationInWindow(iArr);
        }
        float f = iArr[0] - this.g[0];
        float f2 = (this.b - this.c) / 2.0f;
        int i = (int) (f + f2);
        int i2 = (int) (f2 + (iArr[1] - r3[1]));
        RLottieDrawable rLottieDrawable = this.d;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(i, i2, i, i2);
        }
        RLottieDrawable rLottieDrawable2 = this.d;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
