package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.vk.core.ui.refresh.BottomSwipeRefreshLayout;

/* compiled from: BottomSwipeRefreshLayout.java */
/* loaded from: classes17.dex */
public final class k98 extends Animation {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ BottomSwipeRefreshLayout d;

    public k98(BottomSwipeRefreshLayout bottomSwipeRefreshLayout, int i, int i2) {
        this.d = bottomSwipeRefreshLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        om10 om10Var = this.d.x;
        om10Var.c.u = (int) (((this.c - r0) * f) + this.b);
    }
}
