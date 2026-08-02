package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes13.dex */
public final class h261 implements zo31 {
    public final ShimmerFrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public h261(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.a = shimmerFrameLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
