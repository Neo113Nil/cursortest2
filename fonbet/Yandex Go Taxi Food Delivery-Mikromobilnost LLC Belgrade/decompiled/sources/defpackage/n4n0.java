package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class n4n0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoLinearLayout b;
    public final ButtonComponent c;
    public final CashbackHorizontalView d;
    public final RobotoTextView e;
    public final GoImageView f;
    public final ula g;

    public n4n0(GoConstraintLayout goConstraintLayout, GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, CashbackHorizontalView cashbackHorizontalView, RobotoTextView robotoTextView, GoImageView goImageView, ula ulaVar) {
        this.a = goConstraintLayout;
        this.b = goLinearLayout;
        this.c = buttonComponent;
        this.d = cashbackHorizontalView;
        this.e = robotoTextView;
        this.f = goImageView;
        this.g = ulaVar;
    }

    public static n4n0 o(LayoutInflater layoutInflater, GoConstraintLayout goConstraintLayout) {
        View O;
        layoutInflater.inflate(srh0.scooters_card_bottom_component, goConstraintLayout);
        int i = qfh0.above_button_barrier;
        if (((Barrier) cma1.O(i, goConstraintLayout)) != null) {
            i = qfh0.above_button_layout;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, goConstraintLayout);
            if (goLinearLayout != null) {
                i = qfh0.button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, goConstraintLayout);
                if (buttonComponent != null) {
                    i = qfh0.cashback_view;
                    CashbackHorizontalView cashbackHorizontalView = (CashbackHorizontalView) cma1.O(i, goConstraintLayout);
                    if (cashbackHorizontalView != null) {
                        i = qfh0.legal_terms_agreement;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, goConstraintLayout);
                        if (robotoTextView != null) {
                            i = qfh0.offer_details_view;
                            GoImageView goImageView = (GoImageView) cma1.O(i, goConstraintLayout);
                            if (goImageView != null && (O = cma1.O((i = qfh0.payment_layout_container), goConstraintLayout)) != null) {
                                return new n4n0(goConstraintLayout, goLinearLayout, buttonComponent, cashbackHorizontalView, robotoTextView, goImageView, ula.o(O));
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(goConstraintLayout.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
