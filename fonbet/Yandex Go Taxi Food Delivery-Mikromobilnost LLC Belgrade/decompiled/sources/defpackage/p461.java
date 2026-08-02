package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.feature.passes.widget.api.presentation.PassesWidgetView;
import com.ybsdk.widgets.common.segmented.SegmentedControlView;

/* loaded from: classes3.dex */
public final class p461 implements zo31 {
    public final ConstraintLayout a;
    public final PassesWidgetView b;
    public final FrameLayout c;
    public final View d;
    public final SegmentedControlView e;
    public final ViewPager2 f;

    public p461(ConstraintLayout constraintLayout, PassesWidgetView passesWidgetView, FrameLayout frameLayout, View view, SegmentedControlView segmentedControlView, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = passesWidgetView;
        this.c = frameLayout;
        this.d = view;
        this.e = segmentedControlView;
        this.f = viewPager2;
    }

    public static p461 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(ynh0.ybsdk_qr_code_base_screen, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = obh0.passesWidget;
        PassesWidgetView passesWidgetView = (PassesWidgetView) cma1.O(i, inflate);
        if (passesWidgetView != null) {
            i = obh0.qrContainer;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout != null && (O = cma1.O((i = obh0.screenBackground), inflate)) != null) {
                i = obh0.tabView;
                SegmentedControlView segmentedControlView = (SegmentedControlView) cma1.O(i, inflate);
                if (segmentedControlView != null) {
                    i = obh0.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
                    if (viewPager2 != null) {
                        return new p461(constraintLayout, passesWidgetView, frameLayout, O, segmentedControlView, viewPager2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
