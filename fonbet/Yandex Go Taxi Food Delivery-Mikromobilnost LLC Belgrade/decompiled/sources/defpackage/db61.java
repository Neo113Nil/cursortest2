package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import com.ybsdk.widgets.common.WidgetWithSwitchView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes4.dex */
public final class db61 implements zo31 {
    public final WidgetWithSwitchView a;
    public final TextView b;
    public final SwitchCompat c;
    public final AppCompatImageView d;
    public final ShimmerFrameLayout e;
    public final TextView f;

    public db61(WidgetWithSwitchView widgetWithSwitchView, TextView textView, SwitchCompat switchCompat, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout, TextView textView2) {
        this.a = widgetWithSwitchView;
        this.b = textView;
        this.c = switchCompat;
        this.d = appCompatImageView;
        this.e = shimmerFrameLayout;
        this.f = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
