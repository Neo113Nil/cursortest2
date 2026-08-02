package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class i561 implements zo31 {
    public final /* synthetic */ int a = 1;
    public final ConstraintLayout b;
    public final ShimmerFrameLayout c;

    public i561(ShimmerFrameLayout shimmerFrameLayout, ConstraintLayout constraintLayout) {
        this.c = shimmerFrameLayout;
        this.b = constraintLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.b;
        }
    }

    public ShimmerFrameLayout o() {
        return this.c;
    }

    public i561(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout, AppCompatTextView appCompatTextView) {
        this.b = constraintLayout;
        this.c = shimmerFrameLayout;
    }
}
