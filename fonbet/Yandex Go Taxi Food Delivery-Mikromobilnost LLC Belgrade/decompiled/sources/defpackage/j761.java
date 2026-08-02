package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.ErrorView;

/* loaded from: classes3.dex */
public final class j761 implements zo31 {
    public final FrameLayout a;
    public final ErrorView b;

    public j761(FrameLayout frameLayout, ErrorView errorView) {
        this.a = frameLayout;
        this.b = errorView;
    }

    public static j761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(lnh0.ybsdk_screen_open_esia_sdk, viewGroup, false);
        int i = dbh0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = dbh0.initialProgress;
            if (((CircularProgressIndicator) cma1.O(i, inflate)) != null) {
                return new j761((FrameLayout) inflate, errorView);
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
