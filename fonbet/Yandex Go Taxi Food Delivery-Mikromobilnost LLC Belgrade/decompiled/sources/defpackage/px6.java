package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class px6 implements zo31 {
    public final /* synthetic */ int a;
    public final LinearLayout b;

    public /* synthetic */ px6(LinearLayout linearLayout, int i) {
        this.a = i;
        this.b = linearLayout;
    }

    public static px6 o(View view) {
        int i = q6h0.error_icon;
        if (((GoImageView) cma1.O(i, view)) != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = q6h0.error_subtitle;
            if (((RobotoTextView) cma1.O(i2, view)) != null) {
                i2 = q6h0.error_title;
                if (((RobotoTextView) cma1.O(i2, view)) != null) {
                    return new px6(linearLayout, 1);
                }
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public LinearLayout p() {
        return this.b;
    }
}
