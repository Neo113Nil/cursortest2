package xsna;

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: GuideAnimationData.kt */
/* loaded from: classes16.dex */
public final class uru {
    public final Paint a;
    public ValueAnimator b = null;

    public uru(Paint paint) {
        this.a = paint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uru)) {
            return false;
        }
        uru uruVar = (uru) obj;
        return epx.f(this.a, uruVar.a) && epx.f(this.b, uruVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ValueAnimator valueAnimator = this.b;
        return hashCode + (valueAnimator == null ? 0 : valueAnimator.hashCode());
    }

    public final String toString() {
        return "GuideAnimationData(paint=" + this.a + ", animator=" + this.b + ')';
    }
}
