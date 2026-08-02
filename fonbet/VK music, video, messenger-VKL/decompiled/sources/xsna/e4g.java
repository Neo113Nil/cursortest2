package xsna;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes13.dex */
public final class e4g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CollapsingToolbarLayout b;

    public e4g(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.b = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.b.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
