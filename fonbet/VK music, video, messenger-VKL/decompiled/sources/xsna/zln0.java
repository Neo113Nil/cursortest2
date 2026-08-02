package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes12.dex */
public final class zln0 extends Animation {
    public final /* synthetic */ SwipeRefreshLayout b;

    public zln0(SwipeRefreshLayout swipeRefreshLayout) {
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.b.setAnimationProgress(f);
    }
}
