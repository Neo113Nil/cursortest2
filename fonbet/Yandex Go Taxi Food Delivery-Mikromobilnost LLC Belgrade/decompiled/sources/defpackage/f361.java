package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;

/* loaded from: classes4.dex */
public final class f361 implements zo31 {
    public final LinearLayout a;
    public final CheckBoxView b;
    public final TextView c;

    public f361(LinearLayout linearLayout, CheckBoxView checkBoxView, TextView textView) {
        this.a = linearLayout;
        this.b = checkBoxView;
        this.c = textView;
    }

    public static f361 o(View view) {
        int i = fch0.checkbox;
        CheckBoxView checkBoxView = (CheckBoxView) cma1.O(i, view);
        if (checkBoxView != null) {
            i = fch0.checkbox_title;
            TextView textView = (TextView) cma1.O(i, view);
            if (textView != null) {
                return new f361((LinearLayout) view, checkBoxView, textView);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
