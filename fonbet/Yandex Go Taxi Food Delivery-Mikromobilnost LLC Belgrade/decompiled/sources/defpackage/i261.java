package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.widgets.common.ColorFilterConstraintLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class i261 implements zo31 {
    public final ColorFilterConstraintLayout a;
    public final FrameLayout b;
    public final ImageView c;
    public final ColorFilterConstraintLayout d;
    public final ImageView e;
    public final SpoilerTextView f;
    public final LinearLayout g;
    public final ImageView h;
    public final TextView i;
    public final ShimmerFrameLayout j;
    public final SpoilerTextView k;
    public final LinearLayout l;
    public final ImageView m;
    public final TextView n;
    public final ShimmerFrameLayout o;

    public i261(ColorFilterConstraintLayout colorFilterConstraintLayout, FrameLayout frameLayout, ImageView imageView, ColorFilterConstraintLayout colorFilterConstraintLayout2, ImageView imageView2, SpoilerTextView spoilerTextView, LinearLayout linearLayout, ImageView imageView3, TextView textView, ShimmerFrameLayout shimmerFrameLayout, SpoilerTextView spoilerTextView2, LinearLayout linearLayout2, ImageView imageView4, TextView textView2, ShimmerFrameLayout shimmerFrameLayout2) {
        this.a = colorFilterConstraintLayout;
        this.b = frameLayout;
        this.c = imageView;
        this.d = colorFilterConstraintLayout2;
        this.e = imageView2;
        this.f = spoilerTextView;
        this.g = linearLayout;
        this.h = imageView3;
        this.i = textView;
        this.j = shimmerFrameLayout;
        this.k = spoilerTextView2;
        this.l = linearLayout2;
        this.m = imageView4;
        this.n = textView2;
        this.o = shimmerFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
