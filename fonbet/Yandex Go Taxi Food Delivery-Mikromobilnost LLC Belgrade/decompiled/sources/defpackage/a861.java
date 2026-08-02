package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class a861 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final LoadableInput c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;

    public a861(ConstraintLayout constraintLayout, YbButtonView ybButtonView, LoadableInput loadableInput, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = loadableInput;
        this.d = appCompatTextView;
        this.e = appCompatTextView2;
    }

    public static a861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_account_name, viewGroup, false);
        int i = tbh0.buttonSave;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = tbh0.name;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
            if (loadableInput != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                i = tbh0.subtitle;
                AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                if (appCompatTextView != null) {
                    i = tbh0.title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                    if (appCompatTextView2 != null) {
                        return new a861(constraintLayout, ybButtonView, loadableInput, appCompatTextView, appCompatTextView2);
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
