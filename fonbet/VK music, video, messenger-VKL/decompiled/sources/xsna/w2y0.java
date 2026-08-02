package xsna;

import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;

/* compiled from: WriteRestrictionViewBinding.kt */
/* loaded from: classes2.dex */
public final class w2y0 {
    public final ShimmerFrameLayout a;
    public final ImageView b;
    public final TextView c;

    public w2y0(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView, TextView textView) {
        this.a = shimmerFrameLayout;
        this.b = imageView;
        this.c = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2y0)) {
            return false;
        }
        w2y0 w2y0Var = (w2y0) obj;
        return epx.f(this.a, w2y0Var.a) && epx.f(this.b, w2y0Var.b) && epx.f(this.c, w2y0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WriteRestrictionViewBinding(shimmer=" + this.a + ", icon=" + this.b + ", title=" + this.c + ')';
    }
}
