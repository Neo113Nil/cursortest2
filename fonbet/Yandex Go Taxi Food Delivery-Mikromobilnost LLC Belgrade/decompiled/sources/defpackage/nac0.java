package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import java.util.Locale;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class nac0 extends c8c0 {
    public final ip11 b;

    public nac0(ip11 ip11Var) {
        this.b = ip11Var;
    }

    @Override // defpackage.c8c0
    public final View a(ViewGroup viewGroup, z7c0 z7c0Var, z7c0 z7c0Var2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(uuh0.places_main_screen_error_layout, viewGroup, false);
        int i = o6h0.close_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = o6h0.icon;
            if (((GoImageView) cma1.O(i, inflate)) != null) {
                i = o6h0.reload;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = o6h0.subtitle;
                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                        i = o6h0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                            buttonComponent.setDebounceClickListener(new b8c0(z7c0Var, 1));
                            viewGroup.getContext();
                            robotoTextView.setTypeface(((zmh) this.b).e());
                            CharSequence text = robotoTextView.getText();
                            for (int i2 = 0; i2 < text.length(); i2++) {
                                text.charAt(i2);
                                Locale locale = Locale.ROOT;
                            }
                            c.z(z7c0Var2, goImageView);
                            return goConstraintLayout;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
