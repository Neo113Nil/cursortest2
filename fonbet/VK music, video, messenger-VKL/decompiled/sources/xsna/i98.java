package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.vk.core.ui.refresh.BottomSwipeRefreshLayout;

/* compiled from: BottomSwipeRefreshLayout.java */
/* loaded from: classes17.dex */
public final class i98 extends Animation {
    public final /* synthetic */ BottomSwipeRefreshLayout b;

    public i98(BottomSwipeRefreshLayout bottomSwipeRefreshLayout) {
        this.b = bottomSwipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.b.setAnimationProgress(f);
    }
}
