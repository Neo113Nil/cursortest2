package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class c661 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final YbButtonView c;
    public final ToolbarView d;

    public c661(ConstraintLayout constraintLayout, YbButtonView ybButtonView, YbButtonView ybButtonView2, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = ybButtonView2;
        this.d = toolbarView;
    }

    public static c661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(xnh0.ybsdk_screen_biometry_set, viewGroup, false);
        int i = nbh0.enableBiometricButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = nbh0.pinHintText;
            if (((AppCompatTextView) cma1.O(i, inflate)) != null) {
                i = nbh0.skipBiometricButton;
                YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView2 != null) {
                    i = nbh0.toolbar;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        i = nbh0.ybsdk_biometric_image;
                        if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                            return new c661((ConstraintLayout) inflate, ybButtonView, ybButtonView2, toolbarView);
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
