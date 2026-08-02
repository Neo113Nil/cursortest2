package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class d061 implements zo31 {
    public final AutoTopupSummaryView a;
    public final SpoilerTextView b;
    public final AppCompatImageView c;
    public final View d;
    public final TextView e;
    public final AppCompatImageView f;
    public final RecyclerView g;
    public final ShimmerFrameLayout h;
    public final View i;
    public final TextView j;
    public final AppCompatImageView k;

    public d061(AutoTopupSummaryView autoTopupSummaryView, SpoilerTextView spoilerTextView, AppCompatImageView appCompatImageView, View view, TextView textView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, View view2, TextView textView2, AppCompatImageView appCompatImageView3) {
        this.a = autoTopupSummaryView;
        this.b = spoilerTextView;
        this.c = appCompatImageView;
        this.d = view;
        this.e = textView;
        this.f = appCompatImageView2;
        this.g = recyclerView;
        this.h = shimmerFrameLayout;
        this.i = view2;
        this.j = textView2;
        this.k = appCompatImageView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
