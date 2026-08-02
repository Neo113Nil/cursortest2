package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes12.dex */
public final class cmn0 extends Animation {
    public final /* synthetic */ SwipeRefreshLayout b;

    public cmn0(SwipeRefreshLayout swipeRefreshLayout) {
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        float f2 = swipeRefreshLayout.x;
        swipeRefreshLayout.setAnimationProgress(((-f2) * f) + f2);
        swipeRefreshLayout.g(f);
    }
}
