package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class kj50 extends c8c0 {
    @Override // defpackage.c8c0
    public final View a(ViewGroup viewGroup, z7c0 z7c0Var, z7c0 z7c0Var2) {
        GoFrameLayout goFrameLayout = new GoFrameLayout(viewGroup.getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c.z(new d240(18, z7c0Var), goFrameLayout);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(uuh0.organizations_nearby_error_loading_container, (ViewGroup) goFrameLayout, false);
        goFrameLayout.addView(inflate);
        int i = o6h0.error_icon;
        if (((GoImageView) cma1.O(i, inflate)) != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            int i2 = o6h0.error_subtitle;
            if (((RobotoTextView) cma1.O(i2, inflate)) != null) {
                i2 = o6h0.error_title;
                if (((RobotoTextView) cma1.O(i2, inflate)) != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 17;
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setGravity(17);
                    return goFrameLayout;
                }
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
