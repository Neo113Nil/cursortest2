package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;

/* compiled from: SwipeDrawableRefreshLayout.java */
/* loaded from: classes17.dex */
public final class tln0 extends Animation {
    public final /* synthetic */ SwipeDrawableRefreshLayout b;

    public tln0(SwipeDrawableRefreshLayout swipeDrawableRefreshLayout) {
        this.b = swipeDrawableRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.b.setAnimationProgress(f);
    }
}
