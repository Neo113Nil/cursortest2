package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;

/* compiled from: SwipeDrawableRefreshLayout.java */
/* loaded from: classes17.dex */
public final class vln0 extends Animation {
    public final /* synthetic */ SwipeDrawableRefreshLayout b;

    public vln0(SwipeDrawableRefreshLayout swipeDrawableRefreshLayout) {
        this.b = swipeDrawableRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.b;
        float f2 = swipeDrawableRefreshLayout.E;
        swipeDrawableRefreshLayout.setAnimationProgress(((-f2) * f) + f2);
        swipeDrawableRefreshLayout.o(f);
    }
}
