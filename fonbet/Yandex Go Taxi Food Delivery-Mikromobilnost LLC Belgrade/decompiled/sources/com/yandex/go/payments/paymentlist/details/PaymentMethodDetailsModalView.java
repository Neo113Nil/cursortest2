package com.yandex.go.payments.paymentlist.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.ak80;
import defpackage.cma1;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.fl8;
import defpackage.g1a0;
import defpackage.g8e;
import defpackage.kyh0;
import defpackage.l4a0;
import defpackage.luh0;
import defpackage.ny61;
import defpackage.op70;
import defpackage.pav;
import defpackage.qu;
import defpackage.t4a0;
import defpackage.tje;
import defpackage.y130;
import defpackage.y2h0;
import defpackage.y5e;
import defpackage.z4a0;
import kotlin.Metadata;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0017H\u0014¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00172\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020,H\u0014¢\u0006\u0004\b3\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106¨\u00068"}, d2 = {"Lcom/yandex/go/payments/paymentlist/details/PaymentMethodDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ll4a0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lg1a0;", "paymentImageLoader", "Lcom/yandex/go/payments/paymentlist/details/c;", "paymentMethodDetailsPresenter", "<init>", "(Landroid/content/Context;Lpav;Lg1a0;Lcom/yandex/go/payments/paymentlist/details/c;)V", "", "cardTitle", "getMaskedCardTitle", "(Ljava/lang/String;)Ljava/lang/String;", "Lfl8;", "card", "cardDescription", "(Lfl8;)Ljava/lang/String;", "", "color", "Lzy11;", "setDefaultLeadIcon", "(Ljava/lang/Integer;)V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll4a0;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "screenName", "()Ljava/lang/String;", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lpav;", "Lg1a0;", "Lcom/yandex/go/payments/paymentlist/details/c;", "t4a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodDetailsModalView extends SlideableBindingModalView<l4a0> {
    public static final int $stable = 8;
    private final pav imageLoader;
    private final g1a0 paymentImageLoader;
    private final c paymentMethodDetailsPresenter;

    public PaymentMethodDetailsModalView(Context context, pav pavVar, g1a0 g1a0Var, c cVar) {
        super(context);
        this.imageLoader = pavVar;
        this.paymentImageLoader = g1a0Var;
        this.paymentMethodDetailsPresenter = cVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        getBinding().g.setTextDirection(3);
        getBinding().n.setLayoutDirection(0);
        getBinding().m.setLayoutDirection(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String cardDescription(fl8 card) {
        String str = card.l;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            return str;
        }
        String str2 = card.g;
        String str3 = card.f;
        return (evu0.J(str2) || evu0.J(str3)) ? "" : g8e.p(str2, "/", str3.substring(str3.length() - 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMaskedCardTitle(String cardTitle) {
        return evu0.k0(cardTitle).toString().length() < 4 ? "" : getResources().getString(kyh0.card_mask_details, cardTitle.substring(cardTitle.length() - 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(PaymentMethodDetailsModalView paymentMethodDetailsModalView) {
        return paymentMethodDetailsModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(PaymentMethodDetailsModalView paymentMethodDetailsModalView) {
        ((z4a0) paymentMethodDetailsModalView.paymentMethodDetailsPresenter.C.c).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDefaultLeadIcon(Integer color) {
        ListItemComponent listItemComponent = getBinding().k;
        listItemComponent.setLeadImage(tje.y(y2h0.ic_payment_banner_info, listItemComponent.getContext()));
        if (color != null) {
            listItemComponent.setLeadTint(color.intValue());
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        y5e.b(getContent(), startAction, endAction, false, 300L, NavigationDirection.BACKWARD);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        y5e.b(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, true, 300L, NavigationDirection.FORWARD);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        c cVar = this.paymentMethodDetailsPresenter;
        tje.N(cVar.Jg(), null, null, new PaymentMethodDetailsPresenter$updateBannerIcons$1(cVar, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public l4a0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.payment_method_chooser_details, parent, false);
        int i = e6h0.banner_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = e6h0.card_error_info;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = e6h0.card_exp_date;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = e6h0.card_expired_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        i = e6h0.card_layout;
                        GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                        if (goLinearLayout2 != null) {
                            i = e6h0.card_number;
                            RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView3 != null) {
                                i = e6h0.confirm;
                                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                if (listItemComponent != null) {
                                    i = e6h0.content;
                                    if (((ScrollView) cma1.O(i, inflate)) != null) {
                                        i = e6h0.delete;
                                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                        if (listItemComponent2 != null) {
                                            i = e6h0.delete_item_notification;
                                            ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent3 != null) {
                                                i = e6h0.details_banner;
                                                ListItemComponent listItemComponent4 = (ListItemComponent) cma1.O(i, inflate);
                                                if (listItemComponent4 != null) {
                                                    i = e6h0.divider;
                                                    CardDivider cardDivider = (CardDivider) cma1.O(i, inflate);
                                                    if (cardDivider != null) {
                                                        i = e6h0.icon_bottom;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                                                        if (appCompatImageView2 != null) {
                                                            i = e6h0.icon_top;
                                                            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                                                            if (goImageView != null) {
                                                                i = e6h0.sbp_token_details;
                                                                ListItemComponent listItemComponent5 = (ListItemComponent) cma1.O(i, inflate);
                                                                if (listItemComponent5 != null) {
                                                                    i = e6h0.toolbar;
                                                                    ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                                                                    if (toolbarComponent != null) {
                                                                        return new l4a0((LinearLayout) inflate, goLinearLayout, robotoTextView, robotoTextView2, appCompatImageView, goLinearLayout2, robotoTextView3, listItemComponent, listItemComponent2, listItemComponent3, listItemComponent4, cardDivider, appCompatImageView2, goImageView, listItemComponent5, toolbarComponent);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new ak80(14, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.paymentMethodDetailsPresenter.Bg(new t4a0(this));
        this.paymentImageLoader.a();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        getBinding().p.setOnNavigationClickListener(new op70(19, this));
        c cVar = this.paymentMethodDetailsPresenter;
        tje.N(cVar.Jg(), null, null, new PaymentMethodDetailsPresenter$checkNeedToShowBanner$1(cVar, null), 3);
        c cVar2 = this.paymentMethodDetailsPresenter;
        tje.N(cVar2.Jg(), null, null, new PaymentMethodDetailsPresenter$createDetailsView$1(cVar2, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.paymentMethodDetailsPresenter.Cg();
        this.paymentImageLoader.d();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "payment_method_info";
    }
}
