package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.ybsdk.core.design.widget.SlidableCoordinatorLayout;

/* loaded from: classes2.dex */
public final class lu31 {
    public final View a;
    public ValueAnimator b;
    public boolean c;

    public lu31(SlidableCoordinatorLayout slidableCoordinatorLayout) {
        this.a = slidableCoordinatorLayout;
    }

    public final void a() {
        if (this.c || this.b != null) {
            this.c = false;
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b = null;
            View view = this.a;
            view.animate().scaleY(1.0f);
            view.animate().scaleX(1.0f);
        }
    }
}
