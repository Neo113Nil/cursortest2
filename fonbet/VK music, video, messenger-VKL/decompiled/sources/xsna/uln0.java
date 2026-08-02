package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;

/* compiled from: SwipeDrawableRefreshLayout.java */
/* loaded from: classes17.dex */
public final class uln0 extends Animation {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SwipeDrawableRefreshLayout d;

    public uln0(SwipeDrawableRefreshLayout swipeDrawableRefreshLayout, int i, int i2) {
        this.d = swipeDrawableRefreshLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.d.I.setAlpha((int) (((this.c - r0) * f) + this.b));
    }
}
