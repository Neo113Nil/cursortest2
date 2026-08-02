package com.yandex.go.scooters.offers.v2.components.bottom;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.scooters.mosru.b;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardSubscriptionComponent;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardSuperPassComponent;
import com.yandex.go.scooters.offers.v2.details.d;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyButAnotherOnParkingException;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyException;
import com.yandex.go.scooters.offers.v2.domain.model.ScootersOfferSuperPassComponentLocation;
import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.scooters.subscription.api.ScootersSubscriptionEntryPoint;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ajl0;
import defpackage.awn0;
import defpackage.b4p0;
import defpackage.bia0;
import defpackage.c3o;
import defpackage.d3o;
import defpackage.eer;
import defpackage.eho0;
import defpackage.evu0;
import defpackage.f3n0;
import defpackage.g1a0;
import defpackage.g3n0;
import defpackage.gxo0;
import defpackage.h3n0;
import defpackage.h7n0;
import defpackage.h8;
import defpackage.hfa0;
import defpackage.i3n0;
import defpackage.i3y;
import defpackage.j3n0;
import defpackage.j6m0;
import defpackage.jl40;
import defpackage.k1b1;
import defpackage.k3n0;
import defpackage.k3o0;
import defpackage.k4n0;
import defpackage.kyh0;
import defpackage.l3n0;
import defpackage.lea0;
import defpackage.m4n0;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mio0;
import defpackage.mo30;
import defpackage.n4n0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.o1b1;
import defpackage.oio0;
import defpackage.p1j0;
import defpackage.p3n0;
import defpackage.p4n0;
import defpackage.pav;
import defpackage.q8p0;
import defpackage.qco0;
import defpackage.qeb1;
import defpackage.r8c0;
import defpackage.rco0;
import defpackage.rea0;
import defpackage.reo0;
import defpackage.s3h0;
import defpackage.s4n0;
import defpackage.s6n0;
import defpackage.sco0;
import defpackage.sea0;
import defpackage.seb1;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tmm0;
import defpackage.tse;
import defpackage.two0;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.wwo0;
import defpackage.x2h0;
import defpackage.xvf0;
import defpackage.xwo0;
import defpackage.xzt0;
import defpackage.y4c0;
import defpackage.y5n0;
import defpackage.ycc;
import defpackage.yy51;
import defpackage.z0a0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;
import ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate.ScootersPersonalGoalsPromoPlateView;
import ru.yandex.taxi.utils.URLSpanFix;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002ghBM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J)\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J!\u0010'\u001a\u00020%2\b\b\u0001\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020#2\u0006\u00102\u001a\u00020)H\u0003¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u000209*\u000205H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010?J\u0017\u0010C\u001a\u00020\u00142\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0014H\u0002¢\u0006\u0004\bE\u0010\u0016J#\u0010G\u001a\u00020\u00142\b\u0010F\u001a\u0004\u0018\u00010%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bG\u00101J#\u0010H\u001a\u00020\u00142\b\u0010F\u001a\u0004\u0018\u00010%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bH\u00101J\u000f\u0010I\u001a\u00020\u0014H\u0002¢\u0006\u0004\bI\u0010\u0016J\u0017\u0010L\u001a\u00020\u00142\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bN\u0010OJ)\u0010U\u001a\u00020\u00142\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020JH\u0002¢\u0006\u0004\bU\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010YR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020c0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010b¨\u0006i"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/bottom/ScootersCardBottomComponent;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lpav;", "imageLoader", "Lz0a0;", "paymentIconLoader", "Lbia0;", "paymentResourceProvider", "Ls4n0;", "scootersCardBottomPresenter", "Ls6n0;", "scootersCardV2ProxyAnalytics", "Lrea0;", "paymentModelsTitleInteractor", "<init>", "(Landroid/content/Context;Ltse;Lpav;Lz0a0;Lbia0;Ls4n0;Ls6n0;Lrea0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Leho0;", ClidProvider.STATE, "Lkotlin/Function0;", "onClick", "setPersonalGoals", "(Leho0;Lsls;)V", "Lp3n0;", "offerSuccess", "success", "(Lp3n0;)V", "setupButton", "", "stringId", "", "spannable", "getResourceStringWithCharSequenceInsteadOfTemplate", "(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "throwable", "Ll3n0;", "action", "error", "(Ljava/lang/Throwable;Ll3n0;)V", "buttonTitleOverride", "bookIsBlocked", "(Ljava/lang/CharSequence;Ll3n0;)V", "t", "extractTextButton", "(Ljava/lang/Throwable;)I", "Lawn0;", "legalTerms", "setupLegalTermsText", "(Lawn0;)V", "Landroid/text/Spannable;", "asSpannable", "(Lawn0;)Landroid/text/Spannable;", "Lhfa0;", "paymentOptions", "setPaymentMethods", "(Lhfa0;)V", "setPaymentOptions", "Lb4p0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "setCashback", "(Lb4p0;)V", "setOfferDetails", "titleOverride", "startButtonProgress", "finishButtonProgress", "renderPhotoVerificationInProgressLayout", "", "hasLegalTerms", "updateButtonBottomAnchor", "(Z)V", "setButtonClickListener", "(Ll3n0;)V", "Lsco0;", "passes", "Ltwo0;", "scootersSubscription", "isSubscriptionToggleEnabled", "setSuperPassOrSubscription", "(Lsco0;Ltwo0;Z)V", "Lz0a0;", "Lbia0;", "Ls4n0;", "Ls6n0;", "Lrea0;", "Ln4n0;", "binding", "Ln4n0;", "Li3y;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardSubscriptionComponent;", "subscriptionComponentLazy", "Li3y;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardSuperPassComponent;", "superPassComponentLazy", "Lru/yandex/taxi/scooters/presentation/personal_goals/promo_plate/ScootersPersonalGoalsPromoPlateView;", "personalGoalsComponentLazy", "m4n0", "l4n0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardBottomComponent extends GoConstraintLayout {
    public static final int $stable = 8;
    private final n4n0 binding;
    private final z0a0 paymentIconLoader;
    private final rea0 paymentModelsTitleInteractor;
    private final bia0 paymentResourceProvider;
    private final i3y personalGoalsComponentLazy;
    private final s4n0 scootersCardBottomPresenter;
    private final s6n0 scootersCardV2ProxyAnalytics;
    private final i3y subscriptionComponentLazy;
    private final i3y superPassComponentLazy;

    public ScootersCardBottomComponent(Context context, tse tseVar, pav pavVar, z0a0 z0a0Var, bia0 bia0Var, s4n0 s4n0Var, s6n0 s6n0Var, rea0 rea0Var) {
        super(context, null, 0, 0, 14, null);
        this.paymentIconLoader = z0a0Var;
        this.paymentResourceProvider = bia0Var;
        this.scootersCardBottomPresenter = s4n0Var;
        this.scootersCardV2ProxyAnalytics = s6n0Var;
        this.paymentModelsTitleInteractor = rea0Var;
        n4n0 o = n4n0.o(LayoutInflater.from(context), this);
        this.binding = o;
        r8c0 r8c0Var = new r8c0(this, context, pavVar, tseVar, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.subscriptionComponentLazy = a.b(lazyThreadSafetyMode, r8c0Var);
        this.superPassComponentLazy = a.b(lazyThreadSafetyMode, new tmm0(7, context, this));
        this.personalGoalsComponentLazy = a.b(lazyThreadSafetyMode, new tmm0(8, context, pavVar));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackground(tje.y(s3h0.scooters_top_rounded_floating_background, getContext()));
        setClickable(true);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(0);
        layoutTransition.enableTransitionType(1);
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, CaretView.ALPHA_PROPERTY, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(0L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, CaretView.ALPHA_PROPERTY, 1.0f, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setStartDelay(300L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        layoutTransition.setAnimator(0, ofFloat);
        layoutTransition.setAnimator(1, ofFloat2);
        layoutTransition.setAnimateParentHierarchy(false);
        setLayoutTransition(layoutTransition);
        o.d.setBadgeStyle(CashbackBadgeStyle.LIGHT_GRADIENT);
    }

    private final Spannable asSpannable(awn0 awn0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(awn0Var.a);
        spannableStringBuilder.setSpan(new URLSpanFix(awn0Var.b), 0, awn0Var.a.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bookIsBlocked(CharSequence buttonTitleOverride, l3n0 action) {
        finishButtonProgress(buttonTitleOverride, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error(Throwable throwable, l3n0 action) {
        finishButtonProgress(getContext().getString(extractTextButton(throwable)), action);
    }

    private final int extractTextButton(Throwable t) {
        return t instanceof ScooterIsBusyButAnotherOnParkingException ? kyh0.scooters_booking_failed_look_for_another_on_parking : t instanceof ScooterIsBusyException ? kyh0.scooters_booking_failed_look_for_another : kyh0.scooters_reload;
    }

    private final void finishButtonProgress(CharSequence titleOverride, l3n0 action) {
        setButtonClickListener(action);
        if (titleOverride != null) {
            this.binding.c.setText(titleOverride);
        }
        if (this.binding.d.getVisibility() == 4) {
            this.binding.d.setVisibility(0);
        }
        ButtonComponent buttonComponent = this.binding.c;
        k1b1.f(buttonComponent);
        buttonComponent.stopAnimation();
    }

    private final CharSequence getResourceStringWithCharSequenceInsteadOfTemplate(int stringId, CharSequence spannable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) c.H(this, stringId, "$META_TEMPLATE$"));
        int H = evu0.H(spannableStringBuilder, "$META_TEMPLATE$", 0, false, 6);
        spannableStringBuilder.delete(H, H + 15);
        return spannableStringBuilder.append(spannable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScootersPersonalGoalsPromoPlateView personalGoalsComponentLazy$lambda$0(Context context, pav pavVar) {
        return new ScootersPersonalGoalsPromoPlateView(context, pavVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPhotoVerificationInProgressLayout() {
        this.binding.b.setVisibility(8);
        this.binding.g.e.setVisibility(8);
        this.binding.f.setVisibility(8);
        this.binding.e.setVisibility(8);
        this.binding.d.setVisibility(8);
        updateButtonBottomAnchor(false);
    }

    private final void setButtonClickListener(l3n0 action) {
        int i = 3;
        if (action != null) {
            Iterator h8Var = new h8(i, this);
            ArrayList arrayList = new ArrayList();
            while (h8Var.hasNext()) {
                Object next = h8Var.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                h8 h8Var2 = viewGroup != null ? new h8(i, viewGroup) : null;
                if (h8Var2 == null || !h8Var2.hasNext()) {
                    while (!h8Var.hasNext() && !arrayList.isEmpty()) {
                        h8Var = (Iterator) kotlin.collections.a.Z(arrayList);
                        ycc.z(arrayList);
                    }
                } else {
                    arrayList.add(h8Var);
                    h8Var = h8Var2;
                }
                ((View) next).setEnabled(true);
            }
            this.binding.c.setDebounceClickListener(new ajl0(12, this, action));
            return;
        }
        this.binding.c.setDebounceClickListener(null);
        Iterator h8Var3 = new h8(i, this);
        ArrayList arrayList2 = new ArrayList();
        while (h8Var3.hasNext()) {
            Object next2 = h8Var3.next();
            View view2 = (View) next2;
            ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
            h8 h8Var4 = viewGroup2 != null ? new h8(i, viewGroup2) : null;
            if (h8Var4 == null || !h8Var4.hasNext()) {
                while (!h8Var3.hasNext() && !arrayList2.isEmpty()) {
                    h8Var3 = (Iterator) kotlin.collections.a.Z(arrayList2);
                    ycc.z(arrayList2);
                }
            } else {
                arrayList2.add(h8Var3);
                h8Var3 = h8Var4;
            }
            ((View) next2).setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButtonClickListener$lambda$0(ScootersCardBottomComponent scootersCardBottomComponent, l3n0 l3n0Var) {
        two0 two0Var;
        gxo0 gxo0Var;
        s4n0 s4n0Var = scootersCardBottomComponent.scootersCardBottomPresenter;
        n6n0 n6n0Var = s4n0Var.x;
        if (jl40.l(l3n0Var, i3n0.a)) {
            h7n0 h7n0Var = (h7n0) n6n0Var;
            g gVar = h7n0Var.b;
            y4c0 y4c0Var = gVar.r0;
            if (y4c0Var == null ? false : gVar.v(y4c0Var)) {
                return;
            }
            h7n0Var.c(mio0.a);
            return;
        }
        wwo0 wwo0Var = null;
        if (l3n0Var instanceof h3n0) {
            Set set = ((h3n0) l3n0Var).a;
            h7n0 h7n0Var2 = (h7n0) n6n0Var;
            h7n0Var2.getClass();
            h7n0Var2.c(new oio0(set, null));
            return;
        }
        if (jl40.l(l3n0Var, k3n0.a)) {
            ((h7n0) n6n0Var).k();
            return;
        }
        if (jl40.l(l3n0Var, j3n0.a)) {
            tje.N(s4n0Var.Jg(), null, null, new ScootersCardBottomPresenter$reloadCard$1(s4n0Var, null), 3);
            return;
        }
        if (jl40.l(l3n0Var, f3n0.a)) {
            tje.N(s4n0Var.Jg(), null, null, new ScootersCardBottomPresenter$book$1(s4n0Var, null), 3);
            return;
        }
        if (!jl40.l(l3n0Var, g3n0.a)) {
            w511.b();
            return;
        }
        s4n0Var.z.a(ScootersCardV2Analytics$CardButton.SUBSCRIPTION_PURCHASE);
        y5n0 a = s4n0Var.B.a();
        if (a != null && (two0Var = a.j.d) != null) {
            xwo0 xwo0Var = two0Var instanceof xwo0 ? (xwo0) two0Var : null;
            if (xwo0Var != null && (gxo0Var = xwo0Var.a) != null) {
                wwo0Var = gxo0Var.a;
            }
        }
        ((h7n0) n6n0Var).j(ScootersSubscriptionEntryPoint.OFFER_BOOK_BUTTON, wwo0Var, true);
    }

    private final void setCashback(b4p0 tariff) {
        Integer num = tariff.b;
        this.binding.d.setVisibility(num != null ? 0 : 8);
        n4n0 n4n0Var = this.binding;
        if (num == null) {
            n4n0Var.c.setAccessibilityTraversalAfter(n4n0Var.g.e.getId());
            return;
        }
        n4n0Var.d.setValueText(c.H(this, num.intValue() == 100 ? kyh0.scooters_full_price_cashback_template : kyh0.scooters_cashback_template, num));
        this.binding.d.setContentDescription(c.H(this, kyh0.scooters_offer_card_v2_a11y_cashback_label, num));
        n4n0 n4n0Var2 = this.binding;
        n4n0Var2.c.setAccessibilityTraversalAfter(n4n0Var2.d.getId());
    }

    private final void setOfferDetails() {
        GoImageView goImageView = this.binding.f;
        goImageView.setVisibility(0);
        goImageView.setEnabled(true);
        goImageView.setContentDescription(goImageView.getContext().getString(kyh0.scooters_offer_card_v2_a11y_offer_details_button));
        c.z(new j6m0(19, this), goImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOfferDetails$lambda$0$0(ScootersCardBottomComponent scootersCardBottomComponent) {
        scootersCardBottomComponent.scootersCardV2ProxyAnalytics.a(ScootersCardV2Analytics$CardButton.OFFER_DETAILS);
        h7n0 h7n0Var = (h7n0) scootersCardBottomComponent.scootersCardBottomPresenter.x;
        g gVar = h7n0Var.b;
        d dVar = (d) ((xvf0) gVar.T(h7n0Var.a).L).get();
        gVar.q0 = dVar;
        gVar.A(dVar, new k3o0(null, null), new mo30(26, gVar));
        return zy11.a;
    }

    private final void setPaymentMethods(hfa0 paymentOptions) {
        setPaymentOptions(paymentOptions);
        setOfferDetails();
    }

    private final void setPaymentOptions(hfa0 paymentOptions) {
        lea0 b = paymentOptions.b();
        if (b == null || !b.e()) {
            this.binding.g.d.setVisibility(8);
            this.binding.g.c.setEnabled(true);
            this.binding.g.c.setVisibility(0);
        } else {
            this.binding.g.c.setVisibility(8);
            CompositePaymentIconsView compositePaymentIconsView = this.binding.g.d;
            compositePaymentIconsView.setContentDescription(c.H(compositePaymentIconsView, kyh0.scooters_offer_card_v2_a11y_payment_info_button, ((sea0) this.paymentModelsTitleInteractor).a(compositePaymentIconsView.getContext(), b)));
            Drawable a = bia0.a(this.paymentResourceProvider, compositePaymentIconsView.getContext(), b);
            if (a == null) {
                a = tje.y(x2h0.ic_payment_undefined, compositePaymentIconsView.getContext());
            }
            compositePaymentIconsView.setBaseIcon(a);
            if (!(b instanceof yy51)) {
                ((g1a0) this.paymentIconLoader).c(compositePaymentIconsView.getTopIcon(), b);
            }
            compositePaymentIconsView.setComplementIcon(bia0.a(this.paymentResourceProvider, compositePaymentIconsView.getContext(), paymentOptions.c()));
            compositePaymentIconsView.setEnabled(true);
            compositePaymentIconsView.setVisibility(0);
        }
        this.binding.g.e.setVisibility(0);
        c.z(new tmm0(9, this, (b == null || !b.e()) ? null : paymentOptions.d()), this.binding.g.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setPaymentOptions$lambda$1(ScootersCardBottomComponent scootersCardBottomComponent, m6a0 m6a0Var) {
        scootersCardBottomComponent.scootersCardV2ProxyAnalytics.a(ScootersCardV2Analytics$CardButton.PAYMENT);
        n6n0.a(scootersCardBottomComponent.scootersCardBottomPresenter.x, m6a0Var, null, 2);
        return zy11.a;
    }

    public static /* synthetic */ void setPersonalGoals$default(ScootersCardBottomComponent scootersCardBottomComponent, eho0 eho0Var, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = null;
        }
        scootersCardBottomComponent.setPersonalGoals(eho0Var, slsVar);
    }

    private final void setSuperPassOrSubscription(sco0 passes, two0 scootersSubscription, boolean isSubscriptionToggleEnabled) {
        rco0 rco0Var;
        if (!this.subscriptionComponentLazy.isInitialized() && (scootersSubscription instanceof xwo0)) {
            this.binding.b.addView((View) this.subscriptionComponentLazy.getValue());
        }
        ((ScootersCardSubscriptionComponent) this.subscriptionComponentLazy.getValue()).setSubscription(scootersSubscription, isSubscriptionToggleEnabled);
        if (!this.superPassComponentLazy.isInitialized()) {
            rco0 rco0Var2 = null;
            qco0 qco0Var = passes instanceof qco0 ? (qco0) passes : null;
            if (qco0Var != null && (rco0Var = qco0Var.i) != null) {
                rco0Var2 = rco0Var;
            } else if (passes instanceof rco0) {
                rco0Var2 = (rco0) passes;
            }
            if (rco0Var2 != null) {
                this.binding.b.addView((View) this.superPassComponentLazy.getValue());
            }
        }
        ((ScootersCardSuperPassComponent) this.superPassComponentLazy.getValue()).setSuperPasses(passes);
        if (((View) this.subscriptionComponentLazy.getValue()).getVisibility() == 0 && ((View) this.superPassComponentLazy.getValue()).getVisibility() == 0) {
            ((View) this.subscriptionComponentLazy.getValue()).setVisibility(8);
        }
    }

    private final void setupButton(p3n0 offerSuccess) {
        CharSequence charSequence;
        boolean z = offerSuccess.b;
        b4p0 b4p0Var = offerSuccess.a;
        CharSequence charSequence2 = offerSuccess.f;
        boolean z2 = false;
        if (z) {
            CharSequence charSequence3 = "";
            if (charSequence2 == null || charSequence2.length() == 0) {
                if (b4p0Var instanceof eer) {
                    charSequence3 = b4p0Var.f;
                } else if (b4p0Var.f.length() > 0) {
                    charSequence3 = getResourceStringWithCharSequenceInsteadOfTemplate(kyh0.scooters_then_you_can_go, b4p0Var.f);
                    z2 = true;
                }
            }
            charSequence2 = k1b1.a(getContext(), getContext().getString(kyh0.scooters_rules_first), charSequence3, z2);
        } else if (charSequence2 == null || charSequence2.length() == 0) {
            if (o1b1.a(offerSuccess.c) && (b4p0Var instanceof xzt0)) {
                charSequence = getContext().getString(kyh0.scooters_start_riding);
            } else {
                charSequence = b4p0Var.e;
            }
            charSequence2 = k1b1.a(getContext(), charSequence, b4p0Var.f, false);
        }
        finishButtonProgress(charSequence2, offerSuccess.k);
    }

    private final void setupLegalTermsText(awn0 legalTerms) {
        Spannable asSpannable;
        this.binding.e.setVisibility(legalTerms != null ? 0 : 8);
        updateButtonBottomAnchor(legalTerms != null);
        if (legalTerms == null || (asSpannable = asSpannable(legalTerms)) == null) {
            return;
        }
        this.binding.e.setText(asSpannable);
        if (qeb1.d(asSpannable)) {
            this.binding.e.setMovementMethod(seb1.a(new k4n0(this, 2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupLegalTermsText$lambda$0(ScootersCardBottomComponent scootersCardBottomComponent, String str) {
        h7n0 h7n0Var = (h7n0) scootersCardBottomComponent.scootersCardBottomPresenter.x;
        h7n0Var.getClass();
        w8p0 w8p0Var = new w8p0(new q8p0(str, false), (b) null, 6);
        g gVar = h7n0Var.b;
        gVar.B((m950) gVar.K.get(), w8p0Var, sy60.Q2, p1j0.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startButtonProgress(CharSequence titleOverride, l3n0 action) {
        setButtonClickListener(action);
        if (titleOverride != null) {
            this.binding.c.setText(titleOverride);
        }
        if (this.binding.d.getVisibility() == 0) {
            this.binding.d.setVisibility(4);
        }
        ButtonComponent buttonComponent = this.binding.c;
        k1b1.f(buttonComponent);
        buttonComponent.startAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScootersCardSubscriptionComponent subscriptionComponentLazy$lambda$0(ScootersCardBottomComponent scootersCardBottomComponent, Context context, pav pavVar, tse tseVar) {
        return new ScootersCardSubscriptionComponent(context, new ScootersCardBottomComponent$subscriptionComponentLazy$1$2(0, scootersCardBottomComponent.scootersCardBottomPresenter, s4n0.class, "subscriptionClicked", "subscriptionClicked()V", 0), new ScootersCardBottomComponent$subscriptionComponentLazy$1$1(1, scootersCardBottomComponent.scootersCardV2ProxyAnalytics, s6n0.class, "onSubscriptionPromoblockShown", "onSubscriptionPromoblockShown(Lcom/yandex/go/deeplinks/generated/scooters/ScootersSubscriptionDeeplink;)V", 0), pavVar, tseVar, new ScootersCardBottomComponent$subscriptionComponentLazy$1$3(1, scootersCardBottomComponent.scootersCardBottomPresenter, s4n0.class, "subscriptionToggleChanged", "subscriptionToggleChanged(Z)V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void success(p3n0 offerSuccess) {
        this.binding.b.setVisibility(0);
        setupButton(offerSuccess);
        setupLegalTermsText(offerSuccess.e);
        setPaymentMethods(offerSuccess.d);
        setCashback(offerSuccess.a);
        setSuperPassOrSubscription(offerSuccess.i, offerSuccess.g, offerSuccess.h);
        setPersonalGoals(offerSuccess.j, new ScootersCardBottomComponent$success$1(0, this.scootersCardBottomPresenter, s4n0.class, "personalGoalsClicked", "personalGoalsClicked()V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScootersCardSuperPassComponent superPassComponentLazy$lambda$0(Context context, ScootersCardBottomComponent scootersCardBottomComponent) {
        return new ScootersCardSuperPassComponent(context, new k4n0(scootersCardBottomComponent, 0), new k4n0(scootersCardBottomComponent, 1), ScootersOfferSuperPassComponentLocation.BOTTOM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 superPassComponentLazy$lambda$0$0(ScootersCardBottomComponent scootersCardBottomComponent, rco0 rco0Var) {
        s4n0 s4n0Var = scootersCardBottomComponent.scootersCardBottomPresenter;
        s4n0Var.z.a(ScootersCardV2Analytics$CardButton.SUPERPASSES);
        d3o d3oVar = rco0Var.b;
        c3o c3oVar = d3oVar != null ? d3oVar.d : null;
        n6n0 n6n0Var = s4n0Var.x;
        if (c3oVar != null) {
            ((h7n0) n6n0Var).i(c3oVar);
        } else {
            n6n0.b(n6n0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 superPassComponentLazy$lambda$0$1(ScootersCardBottomComponent scootersCardBottomComponent, rco0 rco0Var) {
        s4n0 s4n0Var = scootersCardBottomComponent.scootersCardBottomPresenter;
        s4n0Var.z.a(ScootersCardV2Analytics$CardButton.ACTIVE_SUPERPASSES);
        d3o d3oVar = rco0Var.b;
        c3o c3oVar = d3oVar != null ? d3oVar.d : null;
        n6n0 n6n0Var = s4n0Var.x;
        if (c3oVar != null) {
            ((h7n0) n6n0Var).i(c3oVar);
        } else {
            ((h7n0) n6n0Var).h(reo0.a);
        }
        return zy11.a;
    }

    private final void updateButtonBottomAnchor(boolean hasLegalTerms) {
        ButtonComponent buttonComponent = this.binding.c;
        ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (hasLegalTerms) {
            layoutParams2.bottomToTop = this.binding.e.getId();
            layoutParams2.bottomToBottom = -1;
        } else {
            layoutParams2.bottomToTop = -1;
            layoutParams2.bottomToBottom = 0;
        }
        buttonComponent.setLayoutParams(layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((g1a0) this.paymentIconLoader).a();
        s4n0 s4n0Var = this.scootersCardBottomPresenter;
        s4n0Var.Bg(new m4n0(this));
        tje.N(s4n0Var.Jg(), null, null, new ScootersCardBottomPresenter$listenToBottomComponentUiState$$inlined$collectIn$1(e.t(s4n0Var.D.c()), null, (p4n0) s4n0Var.Dg()), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersCardBottomPresenter.Cg();
        ((g1a0) this.paymentIconLoader).d();
    }

    public final void setPersonalGoals(eho0 state, sls onClick) {
        if (!this.personalGoalsComponentLazy.isInitialized() && state != null) {
            this.binding.b.addView((View) this.personalGoalsComponentLazy.getValue(), 0);
        }
        if (this.personalGoalsComponentLazy.isInitialized()) {
            ((ScootersPersonalGoalsPromoPlateView) this.personalGoalsComponentLazy.getValue()).setState(state, onClick);
        }
        if (((View) this.subscriptionComponentLazy.getValue()).getVisibility() == 0 || ((View) this.superPassComponentLazy.getValue()).getVisibility() == 0) {
            ((View) this.personalGoalsComponentLazy.getValue()).setVisibility(8);
        }
    }
}
