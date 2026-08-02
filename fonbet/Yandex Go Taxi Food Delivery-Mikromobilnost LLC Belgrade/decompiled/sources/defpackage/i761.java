package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.ErrorView;

/* loaded from: classes3.dex */
public final class i761 implements zo31 {
    public final FrameLayout a;
    public final ErrorView b;

    public i761(FrameLayout frameLayout, ErrorView errorView) {
        this.a = frameLayout;
        this.b = errorView;
    }

    public static i761 o(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(lnh0.ybsdk_screen_open_esia, (ViewGroup) null, false);
        int i = dbh0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = dbh0.initialProgress;
            if (((CircularProgressIndicator) cma1.O(i, inflate)) != null) {
                return new i761((FrameLayout) inflate, errorView);
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
