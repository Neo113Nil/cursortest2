package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BalanceBarView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class lo4 extends lys {
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int S = 0;
    public final Object T;

    public lo4(kqw0 kqw0Var) {
        super(kqw0Var);
        View inflate = LayoutInflater.from(this.a.getContext()).inflate(yrh0.surge_info_content_balance_content, (ViewGroup) null, false);
        int i = zfh0.balance_content_bar;
        BalanceBarView balanceBarView = (BalanceBarView) cma1.O(i, inflate);
        if (balanceBarView != null) {
            i = zfh0.balance_content_title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.T = new ho4((ViewGroup) linearLayout, (View) balanceBarView, (Object) robotoTextView, 18);
                kqw0Var.a.setCustomCenterView(linearLayout);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 0:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        String str;
        int i = this.S;
        Object obj2 = this.T;
        Object obj3 = this.R;
        switch (i) {
            case 0:
                io4 io4Var = (io4) obj;
                kqw0 kqw0Var = (kqw0) ((zo31) obj3);
                kqw0Var.a.setLeadImage(io4Var.a);
                ListItemComponent listItemComponent = kqw0Var.a;
                listItemComponent.setLeadContentDescription("");
                listItemComponent.setTrailImage(io4Var.b);
                ho4 ho4Var = (ho4) obj2;
                ((RobotoTextView) ho4Var.d).setText(io4Var.c);
                ((RobotoTextView) ho4Var.d).setTextColor(io4Var.d);
                BalanceBarView.updateState$default((BalanceBarView) ho4Var.b, io4Var.e, false, 2, null);
                listItemComponent.setDividers(DividerPosition.BOTTOM, io4Var.f ? DividerType.MARGIN : DividerType.NONE);
                break;
            default:
                xzu xzuVar = (xzu) obj;
                oxu oxuVar = (oxu) ((zo31) obj3);
                oxuVar.c.render(xzuVar.a);
                f4v f4vVar = xzuVar.b;
                if (f4vVar != null && (str = f4vVar.a) != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        ((nac) ((pav) obj2).a(oxuVar.d)).c(str);
                    }
                }
                gf91.c(oxuVar.b, f4vVar != null ? f4vVar.b : null);
                break;
        }
    }

    public lo4(oxu oxuVar, pav pavVar) {
        super(oxuVar);
        this.T = pavVar;
        cvw.a0(c.h(100, this.a), oxuVar.b);
    }
}
