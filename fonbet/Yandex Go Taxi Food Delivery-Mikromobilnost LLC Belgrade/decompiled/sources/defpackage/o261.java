package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes13.dex */
public final class o261 implements zo31 {
    public final ShimmerFrameLayout a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;

    public o261(ShimmerFrameLayout shimmerFrameLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = shimmerFrameLayout;
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
