package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.ErrorView;

/* loaded from: classes2.dex */
public final class b761 implements zo31 {
    public final FrameLayout a;
    public final ErrorView b;
    public final CircularProgressIndicator c;
    public final TextView d;
    public final TextView e;

    public b761(FrameLayout frameLayout, ErrorView errorView, CircularProgressIndicator circularProgressIndicator, TextView textView, TextView textView2) {
        this.a = frameLayout;
        this.b = errorView;
        this.c = circularProgressIndicator;
        this.d = textView;
        this.e = textView2;
    }

    public static b761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_screen_initial, viewGroup, false);
        int i = jah0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = jah0.initialProgress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i, inflate);
            if (circularProgressIndicator != null) {
                i = jah0.progressSubtitle;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = jah0.progressTitle;
                    TextView textView2 = (TextView) cma1.O(i, inflate);
                    if (textView2 != null) {
                        return new b761((FrameLayout) inflate, errorView, circularProgressIndicator, textView, textView2);
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
