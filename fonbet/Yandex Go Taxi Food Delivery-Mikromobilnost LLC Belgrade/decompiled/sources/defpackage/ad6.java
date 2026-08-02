package defpackage;

import android.view.View;
import androidx.core.view.b;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class ad6 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad6(yss0 yss0Var) {
        super(yss0Var.asView());
        this.R = 1;
        this.S = yss0Var;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.R) {
            case 2:
                super.applyTheme(themeType);
                View view = this.a;
                float h = c.h(6, view);
                Object obj = this.S;
                ((ListItemComponent) obj).setRoundedShape(c.c(xng0.bgMinor, view), h, h, h, h);
                ((ListItemComponent) obj).setTitleTextColor(c.c(xng0.textMinor, view));
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        Object obj2 = this.S;
        switch (i) {
            case 0:
                gd6 gd6Var = (gd6) obj;
                RobotoTextView robotoTextView = (RobotoTextView) obj2;
                robotoTextView.setText(gd6Var.a);
                int i2 = mrg0.go_design_m_space;
                View view = this.a;
                xw31.E(robotoTextView, Integer.valueOf(c.d(i2, view)), Integer.valueOf(tje.u(gd6Var.b, view.getContext())), Integer.valueOf(tje.r(mrg0.go_design_m_space, view.getContext())), Integer.valueOf(tje.u(gd6Var.c, view.getContext())));
                b.q(robotoTextView, true);
                break;
            case 1:
                ((yss0) obj2).render(((ed6) obj).a, false, new uz1(1));
                break;
            default:
                ListItemComponent listItemComponent = (ListItemComponent) obj2;
                listItemComponent.setTitle(((t2x) obj).b);
                listItemComponent.setAutoMinHeight();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad6(View view, int i) {
        super(view);
        this.R = i;
        this.S = view;
    }
}
