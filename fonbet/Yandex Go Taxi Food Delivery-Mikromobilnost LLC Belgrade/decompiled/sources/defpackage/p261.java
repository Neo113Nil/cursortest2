package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes13.dex */
public final class p261 implements zo31 {
    public final ShimmerFrameLayout a;
    public final ImageView b;
    public final ConstraintLayout c;
    public final TextView d;
    public final TextView e;

    public p261(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = shimmerFrameLayout;
        this.b = imageView;
        this.c = constraintLayout;
        this.d = textView;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
