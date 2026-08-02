package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class l561 implements zo31 {
    public final ConstraintLayout a;
    public final ImageViewWithCustomScaleTypes b;
    public final YbButtonViewGroup c;
    public final YbDivView d;
    public final ErrorView e;
    public final Group f;
    public final FullscreenStatusView g;
    public final TextView h;
    public final TextView i;

    public l561(ConstraintLayout constraintLayout, ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes, YbButtonViewGroup ybButtonViewGroup, YbDivView ybDivView, ErrorView errorView, Group group, FullscreenStatusView fullscreenStatusView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageViewWithCustomScaleTypes;
        this.c = ybButtonViewGroup;
        this.d = ybDivView;
        this.e = errorView;
        this.f = group;
        this.g = fullscreenStatusView;
        this.h = textView;
        this.i = textView2;
    }

    public static l561 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_savings_fund_operation_fragment, viewGroup, false);
        int i = tbh0.backgroundImage;
        ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes = (ImageViewWithCustomScaleTypes) cma1.O(i, inflate);
        if (imageViewWithCustomScaleTypes != null) {
            i = tbh0.buttonsGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
            if (ybButtonViewGroup != null) {
                i = tbh0.divView;
                YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                if (ybDivView != null) {
                    i = tbh0.errorView;
                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                    if (errorView != null) {
                        i = tbh0.operationConfirmGroup;
                        Group group = (Group) cma1.O(i, inflate);
                        if (group != null) {
                            i = tbh0.statusView;
                            FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
                            if (fullscreenStatusView != null) {
                                i = tbh0.subtitle;
                                TextView textView = (TextView) cma1.O(i, inflate);
                                if (textView != null) {
                                    i = tbh0.title;
                                    TextView textView2 = (TextView) cma1.O(i, inflate);
                                    if (textView2 != null) {
                                        i = tbh0.toolbar;
                                        if (((ToolbarView) cma1.O(i, inflate)) != null) {
                                            return new l561((ConstraintLayout) inflate, imageViewWithCustomScaleTypes, ybButtonViewGroup, ybDivView, errorView, group, fullscreenStatusView, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
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
