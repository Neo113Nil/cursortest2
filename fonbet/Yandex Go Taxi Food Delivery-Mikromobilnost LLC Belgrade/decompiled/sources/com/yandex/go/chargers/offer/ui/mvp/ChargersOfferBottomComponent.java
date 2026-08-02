package com.yandex.go.chargers.offer.ui.mvp;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferBottomComponent;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.payment.common.result.ResultType;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a8a;
import defpackage.cc6;
import defpackage.cma1;
import defpackage.d7a;
import defpackage.dc6;
import defpackage.dzg0;
import defpackage.e7a;
import defpackage.evu0;
import defpackage.f7a;
import defpackage.g18;
import defpackage.g1a0;
import defpackage.hfa0;
import defpackage.hh8;
import defpackage.ju8;
import defpackage.kyh0;
import defpackage.l7a;
import defpackage.lea0;
import defpackage.n7a;
import defpackage.n9a;
import defpackage.nac;
import defpackage.ny61;
import defpackage.o1h0;
import defpackage.od9;
import defpackage.pav;
import defpackage.q1h0;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.rea0;
import defpackage.sea0;
import defpackage.seb1;
import defpackage.shh0;
import defpackage.sls;
import defpackage.ssh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn9;
import defpackage.ula;
import defpackage.uo9;
import defpackage.vng;
import defpackage.w0d;
import defpackage.wls;
import defpackage.x7a;
import defpackage.xng0;
import defpackage.xyw0;
import defpackage.z0a0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\"\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&JI\u00100\u001a\u00020\f*\u00020'2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010+2\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0-H\u0002¢\u0006\u0004\b0\u00101J5\u00102\u001a\u00020\f*\u00020'2\u0006\u0010,\u001a\u00020+2\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0-H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b5\u00106J\u001f\u0010;\u001a\u0002042\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\fH\u0014¢\u0006\u0004\b?\u0010>J\u001b\u0010B\u001a\u00020\f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\f0@¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010>JC\u0010L\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\f2\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f0-¢\u0006\u0004\bM\u0010NJ/\u0010S\u001a\u00020\f2\u0006\u0010O\u001a\u0002092\u0006\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u0002092\u0006\u0010R\u001a\u000209H\u0014¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\fH\u0014¢\u0006\u0004\bU\u0010>J\u0017\u0010X\u001a\u00020\f2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\f2\u0006\u0010[\u001a\u00020ZH\u0014¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010`R\"\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR*\u0010e\u001a\u0016\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010iR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006n"}, d2 = {"Lcom/yandex/go/chargers/offer/ui/mvp/ChargersOfferBottomComponent;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lz0a0;", "paymentIconLoader", "Lrea0;", "paymentModelsTitleInteractor", "Lkotlin/Function1;", "Luj9;", "Lzy11;", "onButtonClickListener", "<init>", "(Landroid/content/Context;Lpav;Lz0a0;Lrea0;Ltls;)V", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "", ResultType.RESULT_TYPE_LOADING, "updateAnimation", "(Lru/yandex/taxi/widget/ShimmeringRobotoTextView;Z)V", "Luo9;", "button", "setButton", "(Luo9;)V", "Lhfa0;", "paymentOptions", "setPaymentOptions", "(Lhfa0;)V", "Lt2a;", "legalTerms", "isShimmered", "setLegalTerms-CIcbqa4", "(Ljava/lang/CharSequence;Z)V", "setLegalTerms", "La8a;", "promoPlate", "setPromoPlate", "(La8a;)V", "Lru/yandex/taxi/design/ListItemComponent;", "Ltn9;", "chargersAttribute", "hasAction", "Ln9a;", "toggle", "Lkotlin/Function2;", "", "onCheckedChange", "setTrailView", "(Lru/yandex/taxi/design/ListItemComponent;Ltn9;ZLn9a;Lwls;)V", "setSwitchComponent", "(Lru/yandex/taxi/design/ListItemComponent;Ln9a;Lwls;)V", "Landroid/view/View;", "badgeAndChevron", "(Ltn9;)Landroid/view/View;", "", "text", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "badgeView", "(Ljava/lang/CharSequence;I)Landroid/view/View;", "updateDiscountsButtonIcon", "()V", "onAttachedToWindow", "Lkotlin/Function0;", "listener", "setDiscountsButtonDebounceClickListener", "(Lsls;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parentToAttach", "attach", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "Lx7a;", "discountsEntryPoint", "success-n-A-iNo", "(Luo9;Lhfa0;Ljava/lang/CharSequence;La8a;Lx7a;Z)V", "success", "setOnSizeChangedListener", "(Lwls;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lpav;", "Lz0a0;", "Lrea0;", "Ltls;", "Ldc6;", "bottomContainerShadow", "Ldc6;", "onSizeChangedListener", "Lwls;", "Lg18;", "leadImageCancellable", "Lg18;", "discountsEntryPointIconCancellable", "Ln7a;", "binding", "Ln7a;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferBottomComponent extends GoConstraintLayout {
    public static final int $stable = 8;
    private final n7a binding;
    private final dc6 bottomContainerShadow;
    private g18 discountsEntryPointIconCancellable;
    private final pav imageLoader;
    private g18 leadImageCancellable;
    private final tls onButtonClickListener;
    private wls onSizeChangedListener;
    private final z0a0 paymentIconLoader;
    private final rea0 paymentModelsTitleInteractor;

    public ChargersOfferBottomComponent(Context context, pav pavVar, z0a0 z0a0Var, rea0 rea0Var, tls tlsVar) {
        super(context, null, 0, 0, 14, null);
        View O;
        this.imageLoader = pavVar;
        this.paymentIconLoader = z0a0Var;
        this.paymentModelsTitleInteractor = rea0Var;
        this.onButtonClickListener = tlsVar;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
        this.bottomContainerShadow = new dc6(context);
        LayoutInflater.from(context).inflate(ssh0.chargers_offer_bottom_component, this);
        int i = shh0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
        if (buttonComponent != null) {
            i = shh0.discounts_button;
            GoImageView goImageView = (GoImageView) cma1.O(i, this);
            if (goImageView != null) {
                i = shh0.discounts_button_badge;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                if (robotoTextView != null) {
                    i = shh0.legal_terms;
                    ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i, this);
                    if (shimmeringRobotoTextView != null && (O = cma1.O((i = shh0.payment_method_container), this)) != null) {
                        int i2 = shh0.payment_add_card_view;
                        GoImageView goImageView2 = (GoImageView) cma1.O(i2, O);
                        if (goImageView2 != null) {
                            i2 = shh0.payment_info_view;
                            CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) cma1.O(i2, O);
                            if (compositePaymentIconsView != null) {
                                GoFrameLayout goFrameLayout = (GoFrameLayout) O;
                                ula ulaVar = new ula(goFrameLayout, goImageView2, compositePaymentIconsView, goFrameLayout, 0);
                                i = shh0.top_component;
                                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
                                if (listItemComponent != null) {
                                    this.binding = new n7a(this, buttonComponent, goImageView, robotoTextView, shimmeringRobotoTextView, ulaVar, listItemComponent);
                                    return;
                                }
                            }
                        }
                        ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                        throw null;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final View badgeAndChevron(tn9 chargersAttribute) {
        GoLinearLayout goLinearLayout = new GoLinearLayout(getContext(), null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        goLinearLayout.setOrientation(1);
        goLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(17);
        goLinearLayout.addView(badgeView(chargersAttribute.a, chargersAttribute.b));
        ImageView imageView = new ImageView(goLinearLayout.getContext());
        imageView.setImageDrawable(vng.t(dzg0.chevron_next, imageView.getContext()));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(tje.u(24, imageView.getContext()), tje.u(24, imageView.getContext())));
        goLinearLayout.addView(imageView);
        return goLinearLayout;
    }

    private final View badgeView(CharSequence text, int backgroundColor) {
        BadgeView badgeView = new BadgeView(getContext(), null, 0, 6, null);
        badgeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        badgeView.setBackgroundResource(o1h0.chargers_badge_bg);
        badgeView.setPadding(tje.u(6, badgeView.getContext()), tje.u(1, badgeView.getContext()), tje.u(6, badgeView.getContext()), tje.u(2, badgeView.getContext()));
        badgeView.setText(text);
        badgeView.setTintColor(backgroundColor);
        return badgeView;
    }

    private final void setButton(uo9 button) {
        ButtonComponent buttonComponent = this.binding.b;
        CharSequence charSequence = button.a;
        boolean z = button.h;
        CharSequence charSequence2 = button.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        if (charSequence2 != null && !evu0.J(charSequence2)) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append(charSequence2);
        }
        buttonComponent.setText(spannableStringBuilder);
        ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = marginLayoutParams.topMargin;
        marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
        buttonComponent.setLayoutParams(marginLayoutParams);
        if (z) {
            buttonComponent.startProgress();
        } else {
            buttonComponent.finishProgress();
        }
        buttonComponent.setAccent(true);
        int i = 0;
        buttonComponent.setEnabled(button.c && !z);
        buttonComponent.setDebounceClickListener(new l7a(i, this, button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButton$lambda$0$1(ChargersOfferBottomComponent chargersOfferBottomComponent, uo9 uo9Var) {
        chargersOfferBottomComponent.onButtonClickListener.invoke(uo9Var.d);
    }

    /* renamed from: setLegalTerms-CIcbqa4, reason: not valid java name */
    private final void m186setLegalTermsCIcbqa4(CharSequence legalTerms, boolean isShimmered) {
        updateAnimation(this.binding.e, isShimmered);
        n7a n7aVar = this.binding;
        if (legalTerms == null) {
            n7aVar.e.setVisibility(8);
            return;
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView = n7aVar.e;
        shimmeringRobotoTextView.setVisibility(0);
        shimmeringRobotoTextView.setText(legalTerms);
        if (qeb1.d(legalTerms)) {
            shimmeringRobotoTextView.setMovementMethod(seb1.a(new od9(10, this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setLegalTerms_CIcbqa4$lambda$0$0(ChargersOfferBottomComponent chargersOfferBottomComponent, String str) {
        chargersOfferBottomComponent.onButtonClickListener.invoke(new e7a(str));
        return zy11.a;
    }

    private final void setPaymentOptions(hfa0 paymentOptions) {
        lea0 b = paymentOptions.b();
        if (b == null || !b.e()) {
            this.binding.f.d.setVisibility(8);
            this.binding.f.c.setEnabled(true);
            this.binding.f.c.setVisibility(0);
        } else {
            this.binding.f.c.setVisibility(8);
            CompositePaymentIconsView compositePaymentIconsView = this.binding.f.d;
            compositePaymentIconsView.setContentDescription(ru.yandex.taxi.design.utils.c.H(compositePaymentIconsView, kyh0.scooters_offer_card_v2_a11y_payment_info_button, ((sea0) this.paymentModelsTitleInteractor).a(compositePaymentIconsView.getContext(), b)));
            ((g1a0) this.paymentIconLoader).c(compositePaymentIconsView.getTopIcon(), b);
            compositePaymentIconsView.setEnabled(true);
            compositePaymentIconsView.setVisibility(0);
        }
        this.binding.f.e.setVisibility(0);
        ru.yandex.taxi.design.utils.c.z(new ju8(27, this), this.binding.f.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setPaymentOptions$lambda$1(ChargersOfferBottomComponent chargersOfferBottomComponent) {
        chargersOfferBottomComponent.onButtonClickListener.invoke(d7a.a);
        return zy11.a;
    }

    private final void setPromoPlate(a8a promoPlate) {
        n7a n7aVar = this.binding;
        if (promoPlate == null) {
            n7aVar.g.setVisibility(8);
            return;
        }
        ListItemComponent listItemComponent = n7aVar.g;
        listItemComponent.setVisibility(0);
        g18 g18Var = this.leadImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        String str = promoPlate.d;
        this.leadImageCancellable = str != null ? ((nac) this.imageLoader.a(listItemComponent.getLeadImageView())).c(str) : null;
        int i = 1;
        setTrailView(listItemComponent, promoPlate.f, promoPlate.g != null, promoPlate.h, new hh8(16, this));
        listItemComponent.setTitle(promoPlate.b);
        listItemComponent.setSubtitle(promoPlate.c);
        listItemComponent.setDebounceClickListener(new l7a(i, this, promoPlate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setPromoPlate$lambda$0$1(ChargersOfferBottomComponent chargersOfferBottomComponent, String str, boolean z) {
        chargersOfferBottomComponent.onButtonClickListener.invoke(new f7a(str, z));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPromoPlate$lambda$0$2(ChargersOfferBottomComponent chargersOfferBottomComponent, a8a a8aVar) {
        chargersOfferBottomComponent.onButtonClickListener.invoke(a8aVar.g);
    }

    private final void setSwitchComponent(ListItemComponent listItemComponent, final n9a n9aVar, final wls wlsVar) {
        final SwitchComponent switchComponent = (SwitchComponent) listItemComponent.getTrailViewAs(SwitchComponent.class);
        if (switchComponent == null) {
            SwitchComponent switchComponent2 = new SwitchComponent(listItemComponent.getContext(), null, 0, 6, null);
            switchComponent2.setEnabled(true);
            switchComponent2.setUncheckedColorAttr(xng0.controlMinor);
            switchComponent2.setTrackColorAttr(xng0.controlMain);
            switchComponent2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            switchComponent = switchComponent2;
        }
        listItemComponent.setTrailView(switchComponent);
        ViewGroup.LayoutParams layoutParams = switchComponent.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginEnd(tje.u(12, listItemComponent.getContext()));
            switchComponent.setLayoutParams(layoutParams2);
        }
        switchComponent.setOnCheckedChangedListener(null);
        switchComponent.setCheckedWithAnimation(n9aVar.b);
        switchComponent.setOnCheckedChangedListener(new xyw0() { // from class: m7a
            @Override // defpackage.xyw0
            public final void a(boolean z) {
                ChargersOfferBottomComponent.setSwitchComponent$lambda$0(SwitchComponent.this, wlsVar, n9aVar, z);
            }
        });
        switchComponent.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSwitchComponent$lambda$0(SwitchComponent switchComponent, wls wlsVar, n9a n9aVar, boolean z) {
        switchComponent.setEnabled(false);
        wlsVar.invoke(n9aVar.a, Boolean.valueOf(z));
    }

    private final void setTrailView(ListItemComponent listItemComponent, tn9 tn9Var, boolean z, n9a n9aVar, wls wlsVar) {
        if (n9aVar != null) {
            setSwitchComponent(listItemComponent, n9aVar, wlsVar);
            return;
        }
        if (tn9Var == null && z) {
            listItemComponent.setTrailMode(2);
            return;
        }
        if (tn9Var != null && z) {
            listItemComponent.setTrailView(badgeAndChevron(tn9Var));
        } else {
            if (tn9Var == null || z) {
                return;
            }
            listItemComponent.setTrailView(badgeView(tn9Var.a, tn9Var.b));
        }
    }

    private final void updateAnimation(ShimmeringRobotoTextView shimmeringRobotoTextView, boolean z) {
        if (!z) {
            shimmeringRobotoTextView.stopAnimation();
            return;
        }
        shimmeringRobotoTextView.setAnimationDelay(0);
        shimmeringRobotoTextView.setAnimationDuration(1700);
        shimmeringRobotoTextView.startAnimation();
    }

    private final void updateDiscountsButtonIcon() {
        GoImageView goImageView = this.binding.c;
        Drawable t = vng.t(q1h0.ic_coupon_24, getContext());
        if (t != null) {
            t.setTint(qje.t(xng0.textMain, getContext()));
        } else {
            t = null;
        }
        goImageView.setImageDrawable(t);
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.bottomContainerShadow.c();
        updateDiscountsButtonIcon();
        invalidate();
    }

    public final void attach(CoordinatorLayout parentToAttach) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        parentToAttach.addView(this, layoutParams);
        updateDiscountsButtonIcon();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.bottomContainerShadow.b(canvas);
        super.dispatchDraw(canvas);
    }

    public final void loading() {
        updateAnimation(this.binding.e, true);
        this.binding.b.setText(getContext().getString(kyh0.common_loading));
        this.binding.b.setEnabled(false);
        this.binding.c.setVisibility(8);
        this.binding.b.animate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bottomContainerShadow.a(this);
        ((g1a0) this.paymentIconLoader).a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dc6 dc6Var = this.bottomContainerShadow;
        dc6Var.g = null;
        cc6 cc6Var = dc6Var.h;
        if (cc6Var != null) {
            cc6Var.cancel();
        }
        this.onSizeChangedListener = null;
        ((g1a0) this.paymentIconLoader).d();
        g18 g18Var = this.leadImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.leadImageCancellable = null;
        g18 g18Var2 = this.discountsEntryPointIconCancellable;
        if (g18Var2 != null) {
            g18Var2.cancel();
        }
        this.discountsEntryPointIconCancellable = null;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        wls wlsVar = this.onSizeChangedListener;
        if (wlsVar != null) {
            wlsVar.invoke(Integer.valueOf(w), Integer.valueOf(h));
        }
    }

    public final void setDiscountsButtonDebounceClickListener(sls listener) {
        ru.yandex.taxi.design.utils.c.z(listener, this.binding.c);
    }

    public final void setOnSizeChangedListener(wls listener) {
        this.onSizeChangedListener = listener;
    }

    /* renamed from: success-n-A-iNo, reason: not valid java name */
    public final void m187successnAiNo(uo9 button, hfa0 paymentOptions, CharSequence legalTerms, a8a promoPlate, x7a discountsEntryPoint, boolean isShimmered) {
        tn9 tn9Var;
        CharSequence charSequence;
        tn9 tn9Var2;
        tn9 tn9Var3;
        String str;
        this.binding.b.setEnabled(true);
        this.binding.b.stopAnimation();
        if (discountsEntryPoint != null && (str = discountsEntryPoint.a) != null) {
            g18 g18Var = this.discountsEntryPointIconCancellable;
            if (g18Var != null) {
                g18Var.cancel();
            }
            nac nacVar = (nac) this.imageLoader.a(this.binding.c);
            nacVar.e(q1h0.ic_coupon_24);
            this.discountsEntryPointIconCancellable = nacVar.c(str);
        }
        int i = 8;
        this.binding.c.setVisibility(discountsEntryPoint != null ? 0 : 8);
        Drawable drawable = null;
        this.binding.d.setText((discountsEntryPoint == null || (tn9Var3 = discountsEntryPoint.c) == null) ? null : tn9Var3.a);
        RobotoTextView robotoTextView = this.binding.d;
        if (discountsEntryPoint != null && (tn9Var2 = discountsEntryPoint.c) != null) {
            int i2 = tn9Var2.b;
            w0d w0dVar = new w0d();
            w0dVar.h = 100.0f;
            w0dVar.a = i2;
            drawable = w0dVar.a();
        }
        robotoTextView.setBackgroundDrawable(drawable);
        RobotoTextView robotoTextView2 = this.binding.d;
        if (discountsEntryPoint != null && (tn9Var = discountsEntryPoint.c) != null && (charSequence = tn9Var.a) != null && charSequence.length() > 0) {
            i = 0;
        }
        robotoTextView2.setVisibility(i);
        setButton(button);
        setPaymentOptions(paymentOptions);
        m186setLegalTermsCIcbqa4(legalTerms, isShimmered);
        setPromoPlate(promoPlate);
    }
}
