package com.yandex.go.taxi.order.ui.status;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.order.models.api.status.ActionType;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowAction;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowButton;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.d880;
import defpackage.e880;
import defpackage.eg3;
import defpackage.f880;
import defpackage.fef;
import defpackage.g1a0;
import defpackage.gwk0;
import defpackage.h880;
import defpackage.i880;
import defpackage.ief;
import defpackage.kdc;
import defpackage.m880;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p370;
import defpackage.p8h0;
import defpackage.pdc;
import defpackage.pit;
import defpackage.qdb1;
import defpackage.s8o;
import defpackage.tje;
import defpackage.x770;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.z0a0;
import defpackage.zkh0;
import defpackage.zrm;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.styling.g;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f,B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0018\u0010 \u001a\u00060\u001fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010'¨\u0006-"}, d2 = {"Lcom/yandex/go/taxi/order/ui/status/OrderStatusModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Li880;", "Landroid/content/Context;", "context", "Lm880;", "presenter", "Lpdc;", "colorConverter", "Lz0a0;", "paymentIconLoader", "<init>", "(Landroid/content/Context;Lm880;Lpdc;Lz0a0;)V", "Lzy11;", "updateColors", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li880;", "Lm880;", "Lpdc;", "Lz0a0;", "Lh880;", "mvpInner", "Lh880;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "floatBackButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lkdc;", "primaryButtonBackgroundColor", "Lkdc;", "primaryButtonTittleColor", "secondaryButtonBackgroundColor", "secondaryButtonTittleColor", "Companion", "f880", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderStatusModalView extends SlideableBindingModalView<i880> {
    public static final int $stable = 8;
    private static final f880 Companion = new f880();

    @Deprecated
    public static final int ICON_PADDING = 10;

    @Deprecated
    public static final int ICON_SIZE = 40;

    @Deprecated
    public static final int ICON_TITLE_PADDING = 8;

    @Deprecated
    public static final int PHOTO_TITLE_PADDING = 12;
    private final pdc colorConverter;
    private final FloatButtonIconComponent floatBackButton;
    private final h880 mvpInner;
    private final z0a0 paymentIconLoader;
    private final m880 presenter;
    private kdc primaryButtonBackgroundColor;
    private kdc primaryButtonTittleColor;
    private kdc secondaryButtonBackgroundColor;
    private kdc secondaryButtonTittleColor;

    public OrderStatusModalView(Context context, m880 m880Var, pdc pdcVar, z0a0 z0a0Var) {
        super(context);
        this.presenter = m880Var;
        this.colorConverter = pdcVar;
        this.paymentIconLoader = z0a0Var;
        this.mvpInner = new h880(this);
        this.floatBackButton = qdb1.b(this, new e880(m880Var, 0));
        this.primaryButtonBackgroundColor = new bdc(xng0.controlMain);
        this.primaryButtonTittleColor = new bdc(xng0.textOnControl);
        this.secondaryButtonBackgroundColor = new bdc(xng0.controlMinor);
        this.secondaryButtonTittleColor = new bdc(xng0.textOnControlMinor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void floatBackButton$onFloatBackButtonPressed(m880 m880Var) {
        p370 p370Var = m880Var.z;
        if (m880Var.Kg()) {
            zrm zrmVar = (zrm) p370Var.c;
            ((pit) zrmVar.b).b.d((o2y0) zrmVar.c);
            p370Var.y(m880Var.x, false);
        }
        ((d880) m880Var.Dg()).dismissView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$clickOnPrimaryButton(m880 m880Var) {
        p370 p370Var = m880Var.z;
        OrderStatusWindowNotification orderStatusWindowNotification = m880Var.F;
        m880Var.Lg(orderStatusWindowNotification.f.d);
        OrderStatusWindowButton orderStatusWindowButton = orderStatusWindowNotification.f;
        if (m880Var.Kg()) {
            zrm zrmVar = (zrm) p370Var.c;
            ((pit) zrmVar.b).b.d((o2y0) zrmVar.c);
        }
        p370Var.a(m880Var.x, orderStatusWindowButton);
        ((d880) m880Var.Dg()).dismissView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$clickOnSecondaryButton(m880 m880Var) {
        o2y0 o2y0Var = m880Var.x;
        p370 p370Var = m880Var.z;
        OrderStatusWindowNotification orderStatusWindowNotification = m880Var.F;
        OrderStatusWindowButton orderStatusWindowButton = orderStatusWindowNotification.g;
        m880Var.Lg(orderStatusWindowButton != null ? orderStatusWindowButton.d : null);
        OrderStatusWindowButton orderStatusWindowButton2 = orderStatusWindowNotification.g;
        if (orderStatusWindowButton2 != null) {
            if (m880Var.Kg()) {
                zrm zrmVar = (zrm) p370Var.c;
                ((pit) zrmVar.b).b.d((o2y0) zrmVar.c);
                p370Var.y(o2y0Var, false);
            }
            p370Var.a(o2y0Var, orderStatusWindowButton2);
            ((d880) m880Var.Dg()).dismissView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onFloatBackButtonPressed(m880 m880Var) {
        p370 p370Var = m880Var.z;
        if (m880Var.Kg()) {
            zrm zrmVar = (zrm) p370Var.c;
            ((pit) zrmVar.b).b.d((o2y0) zrmVar.c);
            p370Var.y(m880Var.x, false);
        }
        ((d880) m880Var.Dg()).dismissView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateColors() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), ((g) this.presenter.D).b().b);
        getBinding().e.setButtonBackground(s8o.m(this.primaryButtonBackgroundColor, contextThemeWrapper));
        getBinding().e.setButtonTitleColor(s8o.m(this.primaryButtonTittleColor, contextThemeWrapper));
        getBinding().f.setButtonBackground(s8o.m(this.secondaryButtonBackgroundColor, contextThemeWrapper));
        getBinding().f.setButtonTitleColor(s8o.m(this.secondaryButtonTittleColor, contextThemeWrapper));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateColors();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public i880 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(zkh0.order_status_modal_view, parent, false);
        int i = p8h0.icon;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null && (O = cma1.O((i = p8h0.payment_method_divider), inflate)) != null) {
            i = p8h0.payment_method_item;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = p8h0.primary_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = p8h0.secondary_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        i = p8h0.text;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = p8h0.title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                return new i880((ConstraintLayout) inflate, imageView, O, listItemComponent, buttonComponent, buttonComponent2, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        OrderStatusWindowAction orderStatusWindowAction;
        ActionType actionType;
        String eventName;
        super.onAttachedToWindow();
        int i = 1;
        b.q(getBinding().h, true);
        getBinding().b.setVisibility(8);
        ((g1a0) this.paymentIconLoader).a();
        m880 m880Var = this.presenter;
        h880 h880Var = this.mvpInner;
        o2y0 o2y0Var = m880Var.x;
        OrderStatusWindowNotification orderStatusWindowNotification = m880Var.F;
        m880Var.Bg(h880Var);
        if (m880Var.Kg()) {
            OrderStatusModalView orderStatusModalView = h880Var.a;
            orderStatusModalView.setCardMode(SlideableModalView.CardMode.FIXED_CARD);
            orderStatusModalView.setDismissOnTouchOutside(false);
        }
        boolean f = eg3.f(orderStatusWindowNotification, o2y0Var.c());
        OrderStatusWindowButton orderStatusWindowButton = orderStatusWindowNotification.g;
        OrderStatusWindowButton orderStatusWindowButton2 = orderStatusWindowNotification.f;
        if (!f) {
            h880Var.dismissView();
        }
        xdf xdfVar = m880Var.A;
        ief iefVar = o2y0Var.b().V().K;
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        ((d880) m880Var.Dg()).Q3(xdfVar.a(h, orderStatusWindowNotification.a, false, true), xdfVar.a(h, orderStatusWindowNotification.b, false, true), orderStatusWindowButton2.a, orderStatusWindowButton != null ? orderStatusWindowButton.a : null, orderStatusWindowButton2.b, orderStatusWindowButton != null ? orderStatusWindowButton.b : null, orderStatusWindowButton2.c, orderStatusWindowButton != null ? orderStatusWindowButton.c : null, orderStatusWindowNotification.i);
        int i2 = 3;
        tje.N(m880Var.Jg(), null, null, new OrderStatusPresenter$bindIcon$1(m880Var, null), 3);
        if (orderStatusWindowNotification.l) {
            tje.N(m880Var.Jg(), null, null, new OrderStatusPresenter$bindPaymentMethod$1(m880Var, null), 3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mainButton", orderStatusWindowButton2.d.a.getEventName());
        if (orderStatusWindowButton != null && (orderStatusWindowAction = orderStatusWindowButton.d) != null && (actionType = orderStatusWindowAction.a) != null && (eventName = actionType.getEventName()) != null) {
            linkedHashMap.put("extraButton", eventName);
        }
        x770 x770Var = m880Var.y;
        String str = orderStatusWindowNotification.e;
        String str2 = o2y0Var.b().a;
        String str3 = orderStatusWindowNotification.d;
        String driveState = o2y0Var.c().toString();
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("buttons_list", linkedHashMap);
        if (str != null) {
            hashMap.put("modal_id", str);
        }
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        if (str3 != null) {
            hashMap.put(CRLReasonCodeExtension.REASON, str3);
        }
        if (driveState != null) {
            hashMap.put(ACSPConstants.STATUS, driveState);
        }
        x770Var.a.a("RideStatusCard.Shown", hashMap, 1, new HashMap());
        if (!m880Var.Kg()) {
            ((d880) m880Var.Dg()).ld();
        }
        tje.N(m880Var.Jg(), null, null, new OrderStatusPresenter$observeOrderState$1(m880Var, null), 3);
        tje.N(m880Var.Jg(), null, null, new OrderStatusPresenter$observeOrderState$2(m880Var, null), 3);
        getBinding().e.setOnClickListener(new e880(this.presenter, i));
        getBinding().f.setOnClickListener(new e880(this.presenter, 2));
        setOnBackPressedListener(new e880(this.presenter, i2));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        ((g1a0) this.paymentIconLoader).d();
        super.onDetachedFromWindow();
    }
}
