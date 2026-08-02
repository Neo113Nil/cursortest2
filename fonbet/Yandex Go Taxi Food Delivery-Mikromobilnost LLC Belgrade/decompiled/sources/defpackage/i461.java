package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.main.internal.widgets.ProductCardView;
import com.ybsdk.widgets.common.NfcCardBadgeView;
import com.ybsdk.widgets.common.RadialGradientTextView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class i461 implements zo31 {
    public final ProductCardView a;
    public final ImageView b;
    public final YbDivView c;
    public final YbDivView d;
    public final ImageView e;
    public final LinearLayout f;
    public final NfcCardBadgeView g;
    public final RadialGradientTextView h;
    public final ImageView i;
    public final RadialGradientTextView j;
    public final ImageView k;
    public final ShimmerFrameLayout l;
    public final SpoilerFrameLayout m;
    public final TextView n;

    public i461(ProductCardView productCardView, ImageView imageView, YbDivView ybDivView, YbDivView ybDivView2, ImageView imageView2, LinearLayout linearLayout, NfcCardBadgeView nfcCardBadgeView, RadialGradientTextView radialGradientTextView, ImageView imageView3, RadialGradientTextView radialGradientTextView2, ImageView imageView4, ShimmerFrameLayout shimmerFrameLayout, SpoilerFrameLayout spoilerFrameLayout, TextView textView) {
        this.a = productCardView;
        this.b = imageView;
        this.c = ybDivView;
        this.d = ybDivView2;
        this.e = imageView2;
        this.f = linearLayout;
        this.g = nfcCardBadgeView;
        this.h = radialGradientTextView;
        this.i = imageView3;
        this.j = radialGradientTextView2;
        this.k = imageView4;
        this.l = shimmerFrameLayout;
        this.m = spoilerFrameLayout;
        this.n = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
