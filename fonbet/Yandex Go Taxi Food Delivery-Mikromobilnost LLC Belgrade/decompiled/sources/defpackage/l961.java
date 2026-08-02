package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class l961 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final LoadableInput c;
    public final TextView d;
    public final ToolbarView e;

    public l961(ConstraintLayout constraintLayout, YbButtonView ybButtonView, LoadableInput loadableInput, TextView textView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = loadableInput;
        this.d = textView;
        this.e = toolbarView;
    }

    public static l961 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer2_receiver_name, viewGroup, false);
        int i = cch0.receiverNameButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = cch0.receiverNameInput;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
            if (loadableInput != null) {
                i = cch0.receiverNameSubtitle;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = cch0.receiverNameToolbar;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        return new l961((ConstraintLayout) inflate, ybButtonView, loadableInput, textView, toolbarView);
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
