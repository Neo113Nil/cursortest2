package xsna;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes13.dex */
public final class h78 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior b;

    public h78(BottomSheetBehavior bottomSheetBehavior) {
        this.b = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MaterialShapeDrawable materialShapeDrawable = this.b.j;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(floatValue);
        }
    }
}
