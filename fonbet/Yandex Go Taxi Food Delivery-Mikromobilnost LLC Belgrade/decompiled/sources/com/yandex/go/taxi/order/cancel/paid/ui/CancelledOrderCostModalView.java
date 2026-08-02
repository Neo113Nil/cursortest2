package com.yandex.go.taxi.order.cancel.paid.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Tariff;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.a3y0;
import defpackage.c28;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.d28;
import defpackage.dn7;
import defpackage.evu0;
import defpackage.ij7;
import defpackage.kub1;
import defpackage.kyh0;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qeb1;
import defpackage.sls;
import defpackage.tls;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.y130;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000223BK\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/paid/ui/CancelledOrderCostModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lc28;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lkotlin/Function0;", "Lzy11;", "onDone", "Lkotlin/Function1;", "onTariffClick", "Lxdf;", "currencyFormatter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lsls;Ltls;Lxdf;)V", "Landroid/widget/TextView;", "getCostView", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Landroid/widget/TextView;", "getCostMessageView", "getTitleView", "", "getCostMessage", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Ljava/lang/CharSequence;", "", "getMaxWaitingTime", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Ljava/lang/String;", "getCostString", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lxdf;)Ljava/lang/String;", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lc28;", "onAttachedToWindow", "()V", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "getOrder", "()Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "Lsls;", "Ltls;", "Lxdf;", "La3y0;", "logger", "La3y0;", "Companion", "d28", "e28", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelledOrderCostModalView extends BindingModalView<c28> {
    public static final int $stable = 8;
    private static final d28 Companion = new d28();

    @Deprecated
    public static final String PLACEHOLDER_COST_STR = "$COST_AS_STR$";

    @Deprecated
    public static final String PLACEHOLDER_TARIFF_NAME = "$TARIFF_NAME$";

    @Deprecated
    public static final String PLACEHOLDER_WAITING_TIME = "$MAX_WAITING_TIME$";
    private final xdf currencyFormatter;
    private final a3y0 logger;
    private final sls onDone;
    private final tls onTariffClick;
    private final TaxiOrder order;

    public CancelledOrderCostModalView(Context context, TaxiOrder taxiOrder, sls slsVar, tls tlsVar, xdf xdfVar) {
        super(context);
        this.order = taxiOrder;
        this.onDone = slsVar;
        this.onTariffClick = tlsVar;
        this.currencyFormatter = xdfVar;
        this.logger = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "CancelledOrderCostModalView");
    }

    private final CharSequence getCostMessage(final TaxiOrder order) {
        String d = kub1.d(this.currencyFormatter, order.V().K, order.j());
        if (d == null || d.length() == 0 || !evu0.y(d, PLACEHOLDER_TARIFF_NAME, false)) {
            d = getContext().getString(kyh0.order_cancelled_cost_message);
        }
        int H = evu0.H(d, PLACEHOLDER_TARIFF_NAME, 0, false, 6);
        Tariff tariff = order.V().e;
        String c = tariff != null ? tariff.getC() : null;
        if (c == null) {
            c = "";
        }
        if (c.length() == 0) {
            a3y0.d(this.logger, "getCostMessage", null, new ij7(17), 2);
        }
        int length = c.length() + H;
        String v = cvu0.v(cvu0.v(d, PLACEHOLDER_TARIFF_NAME, c, false), PLACEHOLDER_WAITING_TIME, getMaxWaitingTime(order), false);
        if (H < 0 || H >= length) {
            return null;
        }
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView$getCostMessage$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                tls tlsVar;
                tlsVar = CancelledOrderCostModalView.this.onTariffClick;
                tlsVar.invoke(order);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                ds.linkColor = c.c(xng0.textMain, CancelledOrderCostModalView.this);
                super.updateDrawState(ds);
            }
        };
        SpannableString spannableString = new SpannableString(v);
        spannableString.setSpan(clickableSpan, H, length, 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCostMessage$lambda$0() {
        return "Tariff name is null";
    }

    private final TextView getCostMessageView(TaxiOrder order) {
        String i = order.i();
        return (i == null || i.length() == 0) ? getBinding().i : getBinding().d;
    }

    private final String getCostString(TaxiOrder order, xdf currencyFormatter) {
        String str;
        if (order.g() != null) {
            str = kub1.d(currencyFormatter, order.V().K, order.g());
        } else {
            a3y0.d(this.logger, "getCostString", null, new ij7(16), 2);
            str = "";
        }
        String i = order.i();
        if (i == null || i.length() == 0) {
            return str;
        }
        String i2 = order.i();
        return i2 != null ? cvu0.v(i2, PLACEHOLDER_COST_STR, str, false) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCostString$lambda$0() {
        return "Cost message is null";
    }

    private final TextView getCostView(TaxiOrder order) {
        String i = order.i();
        return (i == null || i.length() == 0) ? getBinding().h : getBinding().b;
    }

    private final String getMaxWaitingTime(TaxiOrder order) {
        return String.valueOf(((int) order.V().N) / 60);
    }

    private final TextView getTitleView(TaxiOrder order) {
        String i = order.i();
        return (i == null || i.length() == 0) ? getBinding().j : getBinding().e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$0(CancelledOrderCostModalView cancelledOrderCostModalView) {
        cancelledOrderCostModalView.onDone.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public c28 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.cancelled_modal_view, parent, false);
        int i = p8h0.cost;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = p8h0.cost_container;
            ScrollView scrollView = (ScrollView) cma1.O(i, inflate);
            if (scrollView != null) {
                i = p8h0.cost_message;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = p8h0.cost_title;
                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView3 != null) {
                        i = p8h0.done;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            i = p8h0.rate_container;
                            RelativeLayout relativeLayout = (RelativeLayout) cma1.O(i, inflate);
                            if (relativeLayout != null) {
                                i = p8h0.rate_cost;
                                RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView4 != null) {
                                    i = p8h0.rate_message;
                                    RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView5 != null) {
                                        i = p8h0.rate_title;
                                        RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i, inflate);
                                        if (robotoTextView6 != null) {
                                            return new c28((RelativeLayout) inflate, robotoTextView, scrollView, robotoTextView2, robotoTextView3, buttonComponent, relativeLayout, robotoTextView4, robotoTextView5, robotoTextView6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final TaxiOrder getOrder() {
        return this.order;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(3, null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        c28 binding = getBinding();
        binding.f.setDebounceClickListener(new dn7(9, this));
        RelativeLayout relativeLayout = binding.g;
        String i = this.order.i();
        relativeLayout.setVisibility((i == null || i.length() == 0) ? 0 : 8);
        ScrollView scrollView = binding.c;
        String i2 = this.order.i();
        scrollView.setVisibility((i2 == null || i2.length() == 0) ? 8 : 0);
        TextView costView = getCostView(this.order);
        TextView costMessageView = getCostMessageView(this.order);
        TextView titleView = getTitleView(this.order);
        ngd0.n(costView, null, 0).d(34.0f, 2);
        costView.setText(getCostString(this.order, this.currencyFormatter));
        CharSequence costMessage = getCostMessage(this.order);
        if (costMessage != null) {
            costMessageView.setText(costMessage);
            if (qeb1.d(costMessage)) {
                costMessageView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                costMessageView.setMovementMethod(null);
            }
        }
        TaxiOrder taxiOrder = this.order;
        OrderStatusInfo.CancelledBy cancelledBy = taxiOrder.V().F;
        OrderStatusInfo.CancelledBy cancelledBy2 = OrderStatusInfo.CancelledBy.TIMEOUT;
        OrderStatusInfo.CancelReasonDescription cancelReasonDescription = cancelledBy == cancelledBy2 ? taxiOrder.V().Q : null;
        String a = cancelReasonDescription == null ? null : cancelReasonDescription.getA();
        if (a == null || a.length() == 0) {
            titleView.setVisibility(8);
            return;
        }
        titleView.setVisibility(0);
        TaxiOrder taxiOrder2 = this.order;
        OrderStatusInfo.CancelReasonDescription cancelReasonDescription2 = taxiOrder2.V().F == cancelledBy2 ? taxiOrder2.V().Q : null;
        titleView.setText(cancelReasonDescription2 != null ? cancelReasonDescription2.getA() : null);
    }
}
