package xsna;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.vk.core.tips.TipAnchorView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class s4p0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s4p0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                TipAnchorView tipAnchorView = (TipAnchorView) this.b;
                int stableInsetLeft = windowInsets.getStableInsetLeft();
                int stableInsetRight = windowInsets.getStableInsetRight();
                if (gz80.a(28)) {
                    if (stableInsetLeft <= 0) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        stableInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
                    }
                    if (stableInsetRight <= 0) {
                        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
                        stableInsetRight = displayCutout2 != null ? displayCutout2.getSafeInsetRight() : 0;
                    }
                }
                tipAnchorView.setPadding(stableInsetLeft, tipAnchorView.getPaddingTop(), stableInsetRight, tipAnchorView.getPaddingBottom());
                break;
            default:
                bq00 bq00Var = (bq00) this.b;
                Rect rect = bwt0.c;
                rect.set(windowInsets.getStableInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                bq00Var.invoke(rect);
                break;
        }
        return windowInsets;
    }
}
