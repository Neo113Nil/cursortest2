package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.WidgetWithButtonView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes4.dex */
public final class eb61 implements zo31 {
    public final WidgetWithButtonView a;
    public final TextView b;
    public final AppCompatImageView c;
    public final ShimmerFrameLayout d;
    public final TextView e;
    public final YbButtonView f;

    public eb61(WidgetWithButtonView widgetWithButtonView, TextView textView, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout, TextView textView2, YbButtonView ybButtonView) {
        this.a = widgetWithButtonView;
        this.b = textView;
        this.c = appCompatImageView;
        this.d = shimmerFrameLayout;
        this.e = textView2;
        this.f = ybButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
