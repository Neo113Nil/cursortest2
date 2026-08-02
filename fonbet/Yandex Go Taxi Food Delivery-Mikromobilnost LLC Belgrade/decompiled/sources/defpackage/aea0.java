package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.yandex.go.payments.cards.ui.YbWidgetView;
import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import java.util.Objects;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.buttons.ButtonTrailView;

/* loaded from: classes8.dex */
public final class aea0 extends wys {
    public static final /* synthetic */ int U = 0;
    public final YbWidgetView R;
    public final z0a0 S;
    public final hba0 T;

    public aea0(YbWidgetView ybWidgetView, z0a0 z0a0Var, hba0 hba0Var) {
        super(ybWidgetView);
        this.R = ybWidgetView;
        this.S = z0a0Var;
        this.T = hba0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        final gt51 gt51Var = (gt51) obj;
        cf70 cf70Var = gt51Var.f;
        PaymentOptionState paymentOptionState = gt51Var.b;
        ft51 ft51Var = gt51Var.h;
        YbWidgetView ybWidgetView = this.R;
        ((g1a0) this.S).b(ybWidgetView.getLeadView(), gt51Var.g);
        ybWidgetView.setTitle(gt51Var.e);
        ybWidgetView.setSubtitle(cf70Var.a, cf70Var.b);
        j4a0 j4a0Var = gt51Var.j;
        hst hstVar = jst.e;
        CharSequence c = j4a0Var != null ? j4a0Var.c() : null;
        Objects.toString(j4a0Var);
        Objects.toString(c);
        hstVar.getClass();
        if (j4a0Var != null) {
            Objects.toString(j4a0Var.c());
            ybWidgetView.setBadge(j4a0Var.c(), s8o.m(j4a0Var.a(), ybWidgetView.getContext()), s8o.m(j4a0Var.b(), ybWidgetView.getContext()));
        } else {
            ybWidgetView.hideBadge();
        }
        char c2 = 1;
        final int i = 0;
        if (paymentOptionState == PaymentOptionState.NONE) {
            ybWidgetView.hideCheckable();
            b.p(ybWidgetView, null);
        } else {
            boolean z = ft51Var instanceof dt51;
            ybWidgetView.setCheckable(!z);
            if (z) {
                b.p(ybWidgetView, null);
            } else {
                ybWidgetView.setCheckedState(zda0.a[paymentOptionState.ordinal()] == 1);
                b.p(ybWidgetView, yda0.a);
            }
        }
        c.z(new l2z(13, this, gt51Var), ybWidgetView);
        boolean z2 = gt51Var.i;
        View view = this.a;
        ybWidgetView.setHorizontalPadding(z2 ? c.d(utg0.payment_methods_item_horizontal_padding, view) : c.h(0, view));
        boolean z3 = ft51Var instanceof et51;
        ButtonTrailView trailButton = ybWidgetView.getTrailButton();
        ybWidgetView.setBottomActionsContainerVisibility(z3);
        boolean z4 = ft51Var instanceof dt51;
        trailButton.setCheckBoxVisible(!z4);
        trailButton.setButtonVisibility(z4);
        if (z4) {
            dt51 dt51Var = (dt51) ft51Var;
            zs51 zs51Var = dt51Var.a;
            trailButton.setButtonVisibility(true);
            trailButton.setButtonText(zs51Var.a, zs51Var.b);
            trailButton.setButtonOnClickAction(new iy2(29, this, dt51Var));
            trailButton.setButtonStyle(dt51Var.b);
        } else if (z3) {
            et51 et51Var = (et51) ft51Var;
            bt51 a = et51Var.a();
            ButtonComponent mainButton = ybWidgetView.getMainButton();
            Runnable runnable = new Runnable(this) { // from class: wda0
                public final /* synthetic */ aea0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    gt51 gt51Var2 = gt51Var;
                    aea0 aea0Var = this.b;
                    switch (i2) {
                        case 0:
                            aea0Var.T.s5(((et51) gt51Var2.h).a());
                            break;
                        default:
                            aea0Var.T.s5(((et51) gt51Var2.h).b());
                            break;
                    }
                }
            };
            mainButton.setText(a.b());
            mainButton.setContentDescription(a.a());
            mainButton.setDebounceClickListener(runnable);
            bt51 b = et51Var.b();
            ButtonComponent secondaryButton = ybWidgetView.getSecondaryButton();
            final char c3 = c2 == true ? 1 : 0;
            Runnable runnable2 = new Runnable(this) { // from class: wda0
                public final /* synthetic */ aea0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = c3;
                    gt51 gt51Var2 = gt51Var;
                    aea0 aea0Var = this.b;
                    switch (i2) {
                        case 0:
                            aea0Var.T.s5(((et51) gt51Var2.h).a());
                            break;
                        default:
                            aea0Var.T.s5(((et51) gt51Var2.h).b());
                            break;
                    }
                }
            };
            secondaryButton.setText(b.b());
            secondaryButton.setContentDescription(b.a());
            secondaryButton.setDebounceClickListener(runnable2);
        } else {
            if (!(ft51Var instanceof ct51)) {
                w511.b();
                return;
            }
            trailButton.setButtonVisibility(false);
        }
        ybWidgetView.setActivated(paymentOptionState == PaymentOptionState.SELECTED);
        if (gt51Var.d) {
            ybWidgetView.setEnabledState();
        } else {
            ybWidgetView.setDisabledState();
        }
        ybWidgetView.setDividers(DividerPosition.BOTTOM, gt51Var.c);
    }
}
