package com.yandex.go.promocodes.base.impl.ui.share.v1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.coroutines.b;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import com.yandex.go.promocodes.referral.impl.provider.k;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.avj0;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.d5b0;
import defpackage.da0;
import defpackage.dvh0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.g9h;
import defpackage.gk1;
import defpackage.grf0;
import defpackage.gwk0;
import defpackage.hbp0;
import defpackage.hnf0;
import defpackage.ief;
import defpackage.irf0;
import defpackage.jqr;
import defpackage.jrf0;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qje;
import defpackage.qu;
import defpackage.tmf0;
import defpackage.umf0;
import defpackage.v5c0;
import defpackage.wmf0;
import defpackage.xby;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y6h0;
import defpackage.yln;
import defpackage.ys0;
import defpackage.zy11;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001bB+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0018J\u0019\u0010!\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010\"J\u0019\u0010%\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b%\u0010\"J!\u0010)\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b,\u0010\"J#\u0010/\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u001c2\b\u0010.\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u001c2\b\u0010.\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b1\u00100J\u0019\u00102\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b2\u0010\"J\u0019\u00103\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b3\u0010\"J\u0017\u00104\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b4\u0010\"J\u0011\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0012H\u0002¢\u0006\u0004\b8\u0010\u0014J#\u0010:\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u00109\u001a\u00020'H\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010k\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u00107\"\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/ui/share/v1/PromocodeSharingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lhnf0;", "Landroid/content/Context;", "context", "Lumf0;", "navigator", "Lwmf0;", "presenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lumf0;Lwmf0;Lpav;)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "isVisible", "setButtonGroupVisibility", "(Z)V", "considerOnlyText", "setConsiderOnlyTextForBottomViewsVisibility", BackendConfig.Restrictions.ENABLED, "", "text", "setFirstButtonState", "(ZLjava/lang/String;)V", "setLoadingVisibility", "setTitleText", "(Ljava/lang/String;)V", "setBodyText", "setPromoCodeText", "setRidesLeftText", "imageUrl", "", "fallbackResId", "setBackgroundImage", "(Ljava/lang/String;I)V", "color", "overrideBackgroundColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "overrideFirstButtonColors", "(Ljava/lang/String;Ljava/lang/String;)V", "overrideSendButtonColors", "overridePromocodeColor", "overrideRidesLeftColor", "setSendButtonText", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "getInitialReferralCode", "()Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "updateBottomViews", "fallback", "safeParseColor", "(Ljava/lang/String;I)I", "Lwmf0;", "Lpav;", "Lgrf0;", "viewBinding", "Lgrf0;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Landroidx/appcompat/widget/AppCompatImageView;", "backgroundImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/yandex/taxi/design/ListItemComponent;", "title", "Lru/yandex/taxi/design/ListItemComponent;", "body", "promoCode", "Lru/yandex/taxi/widget/BottomEdgeButtonLayout;", "buttonGroup", "Lru/yandex/taxi/widget/BottomEdgeButtonLayout;", "Lru/yandex/taxi/design/ButtonComponent;", "firstButton", "Lru/yandex/taxi/design/ButtonComponent;", "send", "Lru/yandex/taxi/design/LoadingComponent;", "loadingPlaceholder", "Lru/yandex/taxi/design/LoadingComponent;", "Landroid/view/View;", "bottomViewsBackground", "Landroid/view/View;", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "scrollView", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "Landroid/widget/LinearLayout;", "scrollViewContent", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "bottomViewsScrollShadow", "Landroid/widget/ImageView;", "Ljrf0;", "bottomBackgroundHolder", "Ljrf0;", "Landroid/view/View$OnLayoutChangeListener;", "bottomViewsBackgroundOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View$OnScrollChangeListener;", "onScrollChangeListener", "Landroid/view/View$OnScrollChangeListener;", "initialReferralCode", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "getInitialReferralCode$impl", "setInitialReferralCode$impl", "(Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromocodeSharingView extends ConstraintLayout implements hnf0 {
    private final AppCompatImageView backgroundImageView;
    private final ListItemComponent body;
    private final jrf0 bottomBackgroundHolder;
    private final View bottomViewsBackground;
    private final View.OnLayoutChangeListener bottomViewsBackgroundOnLayoutChangeListener;
    private final ImageView bottomViewsScrollShadow;
    private final BottomEdgeButtonLayout buttonGroup;
    private final ButtonComponent firstButton;
    private final pav imageLoader;
    private ReferralCode initialReferralCode;
    private final LoadingComponent loadingPlaceholder;
    private final View.OnScrollChangeListener onScrollChangeListener;
    private final wmf0 presenter;
    private final ListItemComponent promoCode;
    private final NestedScrollViewAdvanced scrollView;
    private final LinearLayout scrollViewContent;
    private final ButtonComponent send;
    private final ListItemComponent title;
    private final ToolbarComponent toolbar;
    private final grf0 viewBinding;

    public PromocodeSharingView(Context context, umf0 umf0Var, wmf0 wmf0Var, pav pavVar) {
        super(context);
        View O;
        this.presenter = wmf0Var;
        this.imageLoader = pavVar;
        View inflate = LayoutInflater.from(context).inflate(dvh0.promocode_share_view, (ViewGroup) this, false);
        addView(inflate);
        int i = y6h0.body;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null && (O = cma1.O((i = y6h0.bottom_views_background), inflate)) != null) {
            i = y6h0.bottom_views_scroll_shadow;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = y6h0.button_group;
                BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
                if (bottomEdgeButtonLayout != null) {
                    i = y6h0.loading_placeholder;
                    LoadingComponent loadingComponent = (LoadingComponent) cma1.O(i, inflate);
                    if (loadingComponent != null) {
                        i = y6h0.promocode_sharing_first_button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            i = y6h0.scroll_view;
                            NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                            if (nestedScrollViewAdvanced != null) {
                                i = y6h0.scroll_view_content;
                                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                                if (linearLayout != null) {
                                    i = y6h0.send_promocode;
                                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                                    if (buttonComponent2 != null) {
                                        i = y6h0.share_view_pic;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                        if (appCompatImageView != null) {
                                            i = y6h0.sharing_promocode;
                                            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent2 != null) {
                                                i = y6h0.sharing_toolbar;
                                                ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                                                if (toolbarComponent != null) {
                                                    i = y6h0.title;
                                                    ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                                    if (listItemComponent3 != null) {
                                                        this.viewBinding = new grf0((ConstraintLayout) inflate, listItemComponent, O, imageView, bottomEdgeButtonLayout, loadingComponent, buttonComponent, nestedScrollViewAdvanced, linearLayout, buttonComponent2, appCompatImageView, listItemComponent2, toolbarComponent, listItemComponent3);
                                                        this.toolbar = toolbarComponent;
                                                        this.backgroundImageView = appCompatImageView;
                                                        this.title = listItemComponent3;
                                                        this.body = listItemComponent;
                                                        this.promoCode = listItemComponent2;
                                                        this.buttonGroup = bottomEdgeButtonLayout;
                                                        this.firstButton = buttonComponent;
                                                        this.send = buttonComponent2;
                                                        this.loadingPlaceholder = loadingComponent;
                                                        this.bottomViewsBackground = O;
                                                        this.scrollView = nestedScrollViewAdvanced;
                                                        this.scrollViewContent = linearLayout;
                                                        this.bottomViewsScrollShadow = imageView;
                                                        this.bottomViewsBackgroundOnLayoutChangeListener = new yln(14, this);
                                                        int i2 = 4;
                                                        this.onScrollChangeListener = new gk1(i2, this);
                                                        wmf0Var.J = umf0Var;
                                                        this.bottomBackgroundHolder = new jrf0(imageView, O);
                                                        irf0 irf0Var = new irf0(this, 1);
                                                        Rect rect = xw31.a;
                                                        setFocusableInTouchMode(true);
                                                        requestFocus();
                                                        setOnKeyListener(new g9h(i2, irf0Var));
                                                        toolbarComponent.disableNavigationButton();
                                                        toolbarComponent.enableCloseButton();
                                                        toolbarComponent.setOnCloseClickListener(new irf0(this, 2));
                                                        return;
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
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PromocodeSharingView promocodeSharingView) {
        wmf0 wmf0Var = promocodeSharingView.presenter;
        tmf0 tmf0Var = wmf0Var.A;
        ReferralCode referralCode = wmf0Var.H;
        if (referralCode != null) {
            int i = referralCode.b;
            ReferralService referralService = referralCode.i;
            List list = tmf0.c;
            tmf0Var.a("back_button", referralService, i, false);
            tmf0Var.b("back_button", referralService, i, false);
        }
        umf0 umf0Var = wmf0Var.J;
        if (umf0Var != null) {
            ((da0) ((v5c0) umf0Var).b).r(new qu(9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PromocodeSharingView promocodeSharingView) {
        promocodeSharingView.presenter.n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomViewsBackgroundOnLayoutChangeListener$lambda$0(PromocodeSharingView promocodeSharingView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        xw31.y(i4 - i2, promocodeSharingView.scrollViewContent);
        promocodeSharingView.updateBottomViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(PromocodeSharingView promocodeSharingView, View view) {
        wmf0 wmf0Var = promocodeSharingView.presenter;
        ReferralCode referralCode = wmf0Var.H;
        if (referralCode != null) {
            tmf0 tmf0Var = wmf0Var.A;
            ReferralService referralService = referralCode.i;
            int i = referralCode.b;
            List list = tmf0.c;
            tmf0Var.a("action_button", referralService, i, false);
            ((hnf0) wmf0Var.Dg()).setFirstButtonState(false, ((avj0) wmf0Var.B).h(kyh0.promocode_copied));
            wmf0Var.y.a(false, referralCode.a, "PromoCode");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(PromocodeSharingView promocodeSharingView) {
        wmf0 wmf0Var = promocodeSharingView.presenter;
        ReferralCode referralCode = wmf0Var.H;
        if (referralCode != null) {
            tmf0 tmf0Var = wmf0Var.A;
            ReferralService referralService = referralCode.i;
            int i = referralCode.b;
            List list = tmf0.c;
            tmf0Var.a("share", referralService, i, false);
            ief iefVar = referralCode.f;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            xdf xdfVar = wmf0Var.D;
            String str = referralCode.d;
            xdfVar.getClass();
            if (str == null || str.length() == 0) {
                str = null;
            } else if (h != null && evu0.y(str, "$CURRENCY$", false)) {
                str = xdf.g(h, str);
            }
            if (str == null) {
                str = "";
            }
            b.g(wmf0Var.Jg(), null, null, new PromoCodeSharePresenter$onSendClick$1$1(wmf0Var, str, null), 3);
        }
    }

    private final int safeParseColor(String color, int fallback) {
        if (color == null || evu0.J(color) || cvu0.t(color, ShimmerDivHandler.NUMBER_SING, true)) {
            return fallback;
        }
        String upperCase = color.toUpperCase(Locale.US);
        if (upperCase.charAt(0) != '#') {
            try {
                return Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            return Color.parseColor(upperCase);
        } catch (IllegalArgumentException e) {
            xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            return fallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setBackgroundImage$lambda$0(PromocodeSharingView promocodeSharingView, int i) {
        promocodeSharingView.backgroundImageView.setImageResource(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomViews() {
        ListItemComponent listItemComponent = this.body;
        Rect rect = xw31.a;
        int[] iArr = new int[2];
        listItemComponent.getLocationOnScreen(iArr);
        int height = this.body.getHeight() + iArr[1];
        int[] iArr2 = new int[2];
        this.bottomViewsBackground.getLocationOnScreen(iArr2);
        boolean z = height > iArr2[1];
        int[] iArr3 = new int[2];
        this.scrollViewContent.getLocationOnScreen(iArr3);
        int height2 = (this.scrollViewContent.getHeight() + iArr3[1]) - this.scrollViewContent.getPaddingBottom();
        int[] iArr4 = new int[2];
        this.bottomViewsBackground.getLocationOnScreen(iArr4);
        boolean z2 = height2 > iArr4[1];
        jrf0 jrf0Var = this.bottomBackgroundHolder;
        View view = jrf0Var.a;
        if (jrf0Var.e) {
            if (z && !jrf0Var.c) {
                Animation animation = view.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                cma1.b(1.0f, view);
            } else if (!z && jrf0Var.c) {
                Animation animation2 = view.getAnimation();
                if (animation2 != null) {
                    animation2.cancel();
                }
                cma1.b(0.0f, view);
            }
            jrf0Var.c = z;
        } else {
            Animation animation3 = view.getAnimation();
            if (animation3 != null) {
                animation3.cancel();
            }
            cma1.b(1.0f, view);
            jrf0Var.c = true;
        }
        if (!jrf0Var.e) {
            z = z2;
        }
        ImageView imageView = jrf0Var.b;
        if (z && !jrf0Var.d) {
            cma1.b(1.0f, imageView);
        } else if (!z && jrf0Var.d) {
            cma1.b(0.0f, imageView);
        }
        jrf0Var.d = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        super.dispatchTouchEvent(ev);
        return true;
    }

    @Override // defpackage.hnf0
    public ReferralCode getInitialReferralCode() {
        return this.initialReferralCode;
    }

    public final ReferralCode getInitialReferralCode$impl() {
        return this.initialReferralCode;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.firstButton.setOnClickListener(new d5b0(21, this));
        this.send.setOnClickListener(new irf0(this, 0));
        wmf0 wmf0Var = this.presenter;
        wmf0Var.Bg(this);
        hbp0 hbp0Var = wmf0Var.G;
        hbp0Var.a();
        setLoadingVisibility(true);
        ReferralCode initialReferralCode = getInitialReferralCode();
        if (initialReferralCode != null) {
            wmf0Var.Kg(initialReferralCode);
        } else {
            wmf0Var.F.getClass();
            e.H(hbp0Var.c(), new o(new jqr(((k) wmf0Var.x).a(), new PromoCodeSharePresenter$attachView$1(wmf0Var, null), 3), new PromoCodeSharePresenter$attachView$2(3, null)));
        }
        this.bottomViewsBackground.addOnLayoutChangeListener(this.bottomViewsBackgroundOnLayoutChangeListener);
        this.scrollView.setOnScrollChangeListener(this.onScrollChangeListener);
        this.toolbar.requestAccessibilityFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.toolbar.setOnNavigationClickListener(null);
        this.toolbar.setOnCloseClickListener(null);
        this.toolbar.disableNavigationButton();
        this.toolbar.disableCloseButton();
        this.firstButton.setOnClickListener((Runnable) null);
        this.send.setOnClickListener((Runnable) null);
        this.presenter.Cg();
        this.bottomViewsBackground.removeOnLayoutChangeListener(this.bottomViewsBackgroundOnLayoutChangeListener);
        this.scrollView.setOnScrollChangeListener((View.OnScrollChangeListener) null);
    }

    @Override // defpackage.hnf0
    public void overrideBackgroundColor(String color) {
        int safeParseColor = safeParseColor(color, qje.t(xng0.bgMain, getContext()));
        setBackgroundColor(safeParseColor);
        this.bottomViewsBackground.setBackgroundColor(safeParseColor);
    }

    @Override // defpackage.hnf0
    public void overrideFirstButtonColors(String backgroundColor, String textColor) {
        this.firstButton.setButtonBackground(safeParseColor(backgroundColor, getContext().getColor(mqg0.component_gray_150)));
        this.firstButton.setButtonTitleColor(safeParseColor(textColor, getContext().getColor(mqg0.component_black)));
    }

    @Override // defpackage.hnf0
    public void overridePromocodeColor(String color) {
        this.promoCode.setTitleTextColor(safeParseColor(color, qje.t(xng0.textMain, getContext())));
    }

    @Override // defpackage.hnf0
    public void overrideRidesLeftColor(String color) {
        this.promoCode.setSubtitleTextColor(safeParseColor(color, qje.t(xng0.textMinor, getContext())));
    }

    @Override // defpackage.hnf0
    public void overrideSendButtonColors(String backgroundColor, String textColor) {
        this.send.setButtonBackground(safeParseColor(backgroundColor, getContext().getColor(mqg0.component_accent_color)));
        this.send.setButtonTitleColor(safeParseColor(textColor, getContext().getColor(mqg0.accent_background_text_color)));
    }

    @Override // defpackage.hnf0
    public void setBackgroundImage(String imageUrl, int fallbackResId) {
        if (imageUrl == null) {
            this.backgroundImageView.setImageResource(fallbackResId);
            return;
        }
        nac nacVar = (nac) this.imageLoader.a(this.backgroundImageView);
        nacVar.i = new ys0(this, fallbackResId, 11);
        nacVar.c(imageUrl);
    }

    @Override // defpackage.hnf0
    public void setBodyText(String text) {
        this.body.setTitle(text);
    }

    @Override // defpackage.hnf0
    public void setButtonGroupVisibility(boolean isVisible) {
        this.buttonGroup.setVisibility(isVisible ? 0 : 8);
    }

    @Override // defpackage.hnf0
    public void setConsiderOnlyTextForBottomViewsVisibility(boolean considerOnlyText) {
        this.bottomBackgroundHolder.e = considerOnlyText;
        updateBottomViews();
    }

    @Override // defpackage.hnf0
    public void setFirstButtonState(boolean enabled, String text) {
        this.firstButton.setEnabled(enabled);
        this.firstButton.setText(text);
    }

    public final void setInitialReferralCode$impl(ReferralCode referralCode) {
        this.initialReferralCode = referralCode;
    }

    @Override // defpackage.hnf0
    public void setLoadingVisibility(boolean isVisible) {
        this.loadingPlaceholder.setVisibility(isVisible ? 0 : 8);
    }

    @Override // defpackage.hnf0
    public void setPromoCodeText(String text) {
        this.promoCode.setTitle(text);
    }

    @Override // defpackage.hnf0
    public void setRidesLeftText(String text) {
        this.promoCode.setSubtitle(text);
    }

    @Override // defpackage.hnf0
    public void setSendButtonText(String text) {
        this.send.setText(text);
    }

    @Override // defpackage.hnf0
    public void setTitleText(String text) {
        this.title.setTitle(text);
        this.title.setVisibility(text == null || text.length() == 0 ? 8 : 0);
    }
}
