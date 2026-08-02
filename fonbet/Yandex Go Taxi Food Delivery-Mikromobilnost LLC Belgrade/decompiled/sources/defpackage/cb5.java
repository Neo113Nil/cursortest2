package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.AnimationUtilsKt$addOnEndListenerForFadeOut$$inlined$addListener$default$1;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.nx4;
import defpackage.tls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.a;

/* loaded from: classes2.dex */
public abstract class cb5 {
    public final ButtonSectionView a;
    public final v17 b;
    public final c0d0 c;
    public final PlusSdkBrandType d;
    public hby e;
    public nx4 f;
    public pzc0 g;
    public final i3y h = a.a(new l95(5, this));

    public cb5(ButtonSectionView buttonSectionView, v17 v17Var, c0d0 c0d0Var, PlusSdkBrandType plusSdkBrandType) {
        this.a = buttonSectionView;
        this.b = v17Var;
        this.c = c0d0Var;
        this.d = plusSdkBrandType;
    }

    public final void a(pzc0 pzc0Var) {
        int i;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        PlusAcquisitionSmartOffer plusAcquisitionSmartOffer = pzc0Var.a;
        boolean isOneClickEnabled = plusAcquisitionSmartOffer.isOneClickEnabled();
        ButtonSectionView buttonSectionView = this.a;
        TextView legalsTextView = buttonSectionView.getLegalsTextView();
        if (isOneClickEnabled) {
            legalsTextView.setMovementMethod(LinkMovementMethod.getInstance());
            legalsTextView.setText(pzc0Var.b, TextView.BufferType.SPANNABLE);
        }
        Context context = buttonSectionView.getView().getContext();
        int s = isOneClickEnabled ? vng.s(mvg0.acquisition_sdk_dimension_size_100, context) : vng.s(mvg0.acquisition_sdk_dimension_size_200, context);
        final hby hbyVar = this.e;
        if (hbyVar != null) {
            int paddingBottom = buttonSectionView.getView().getPaddingBottom();
            AnimatorSet animatorSet = null;
            if (isOneClickEnabled) {
                View view = (View) legalsTextView.getParent();
                legalsTextView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(view.getHeight(), Integer.MIN_VALUE));
                int measuredHeight = legalsTextView.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i2 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i = i2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
            } else {
                i = 0;
            }
            int height = buttonSectionView.getView().getHeight();
            int i3 = (height - paddingBottom) + s + i;
            if (legalsTextView.getVisibility() != 8) {
                int height2 = legalsTextView.getHeight();
                ViewGroup.LayoutParams layoutParams3 = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i4 = height2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
                ViewGroup.LayoutParams layoutParams4 = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                r5 = (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0) + i4;
            }
            int i5 = i3 - r5;
            View view2 = buttonSectionView.getView();
            final zo1 zo1Var = new zo1(legalsTextView, isOneClickEnabled, 3);
            if (!hbyVar.a) {
                hbyVar.a = true;
                if (height == i5) {
                    valueAnimator = null;
                } else {
                    valueAnimator = new ValueAnimator();
                    int i6 = view2.getLayoutParams().height;
                    valueAnimator.setIntValues(height, i5);
                    int i7 = 6;
                    kxa1.b(new w29(view2, i7), valueAnimator);
                    final is8 is8Var = new is8(i6, view2, i7);
                    valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.AnimationUtilsKt$addOnEndAnimationListener$$inlined$addListener$default$1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            tls.this.invoke((ValueAnimator) animator);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                }
                if (paddingBottom == s) {
                    valueAnimator2 = null;
                } else {
                    valueAnimator2 = new ValueAnimator();
                    valueAnimator2.setIntValues(paddingBottom, s);
                    kxa1.b(new w29(view2, 7), valueAnimator2);
                }
                final ArrayList arrayList = new ArrayList();
                if (valueAnimator != null) {
                    arrayList.add(valueAnimator);
                }
                if (valueAnimator2 != null) {
                    arrayList.add(valueAnimator2);
                }
                if (!arrayList.isEmpty()) {
                    animatorSet = new AnimatorSet();
                    animatorSet.setDuration(200L);
                    animatorSet.setInterpolator(new LinearInterpolator());
                    animatorSet.playTogether(arrayList);
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators.LegalsAnimator$createAnimatorSet$lambda$9$$inlined$addListener$default$1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            animator.removeAllListeners();
                            for (ValueAnimator valueAnimator3 : arrayList) {
                                valueAnimator3.removeAllListeners();
                                valueAnimator3.removeAllUpdateListeners();
                            }
                            zo1Var.invoke();
                            hbyVar.a = false;
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                }
                if (animatorSet != null) {
                    animatorSet.start();
                }
            }
        } else {
            legalsTextView.setVisibility(isOneClickEnabled ? 0 : 8);
            View view3 = buttonSectionView.getView();
            view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), s);
        }
        buttonSectionView.getPurchaseButton().getPurchaseTextView().setText(plusAcquisitionSmartOffer.getTexts().getButtonText());
    }

    public final void b() {
        ButtonSectionView buttonSectionView = this.a;
        View view = buttonSectionView.getPurchaseButton().getView();
        i3y i3yVar = this.h;
        view.setBackground(((ab5) i3yVar.getValue()).a);
        buttonSectionView.getPurchaseButton().getPurchaseTextView().setTextAppearance(((ab5) i3yVar.getValue()).b);
        buttonSectionView.getPurchaseButton().getReadMoreTextView().setTextAppearance(((ab5) i3yVar.getValue()).b);
    }

    public final void c(int i) {
        View view = this.a.getView();
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public final void d() {
        final nx4 nx4Var = this.f;
        if (nx4Var != null) {
            i3y i3yVar = nx4Var.g;
            if (nx4Var.c || !nx4Var.b) {
                return;
            }
            nx4Var.c = true;
            int height = nx4Var.a.getContainer().getHeight();
            ValueAnimator valueAnimator = nx4Var.d;
            final boolean z = false;
            valueAnimator.setIntValues(height, 0);
            kxa1.b(new j24(4, nx4Var), valueAnimator);
            nx4.d(nx4Var.e);
            ObjectAnimator objectAnimator = nx4Var.f;
            objectAnimator.setFloatValues(1.0f, 0.0f);
            objectAnimator.addListener(new AnimationUtilsKt$addOnEndListenerForFadeOut$$inlined$addListener$default$1((View) objectAnimator.getTarget()));
            nx4Var.c();
            ((AnimatorSet) i3yVar.getValue()).addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators.BaseAnimator$addOnEndListener$$inlined$addListener$default$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    nx4.this.d.removeAllUpdateListeners();
                    nx4.this.e.removeAllListeners();
                    nx4.this.f.removeAllListeners();
                    nx4.this.b();
                    animator.removeAllListeners();
                    nx4 nx4Var2 = nx4.this;
                    nx4Var2.b = z;
                    nx4Var2.c = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            ((AnimatorSet) i3yVar.getValue()).start();
        }
    }

    public final void e() {
        ButtonSectionView buttonSectionView = this.a;
        buttonSectionView.getView().setVisibility(0);
        buttonSectionView.getContentContainer().setVisibility(0);
        buttonSectionView.getPurchaseButton().getView().setVisibility(0);
        buttonSectionView.getProgressBar().setVisibility(8);
    }

    public void f(PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, com.yandex.plus.acquisition.adapter.internal.controller.a aVar) {
        pzc0 pzc0Var = this.g;
        if (pzc0Var != null) {
            PlusAcquisitionSmartOffer plusAcquisitionSmartOffer = pzc0Var.a;
            Long configId = plusAcquisitionSmartOffer.getMeta().getConfigId();
            String page = plusAcquisitionSmartOffer.getPage();
            String place = plusAcquisitionSmartOffer.getPlace();
            int priority = plusAcquisitionSmartOffer.getPriority();
            String subscriptionName = plusAcquisitionSmartOffer.getTexts().getSubscriptionName();
            String combinedFullOfferText = plusAcquisitionSmartOffer.getTexts().getCombinedFullOfferText();
            String combinedIntroductoryText = plusAcquisitionSmartOffer.getTexts().getCombinedIntroductoryText();
            zm zmVar = this.b.a;
            String l = configId != null ? configId.toString() : null;
            if (l == null) {
                l = "no_value";
            }
            if (page == null) {
                page = "no_value";
            }
            if (place == null) {
                place = "no_value";
            }
            zmVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("config_id", l);
            linkedHashMap.put(Constants.KEY_PAGE, page);
            linkedHashMap.put("place", place);
            linkedHashMap.put("position", String.valueOf(priority));
            linkedHashMap.put("title", subscriptionName);
            linkedHashMap.put("subtitle", combinedFullOfferText);
            linkedHashMap.put("button_text", combinedIntroductoryText);
            linkedHashMap.put("_meta", zm.a(new HashMap()));
            zmVar.b("OfferSection.Clicked", linkedHashMap);
            ((com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) ((d0d0) ((ls90) this.c).h.getValue())).a(plusAcquisitionSmartOffer, plusAcquisitionPaymentAnalytics$Params);
            aVar.invoke(plusAcquisitionSmartOffer);
        }
    }

    public void g() {
        this.e = null;
        this.f = null;
        this.g = null;
        ButtonSectionView buttonSectionView = this.a;
        mj91.e(-2, buttonSectionView.getView());
        mj91.e(-2, buttonSectionView.getContentContainer());
        buttonSectionView.getContentContainer().removeAllViews();
    }

    public final void h(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params) {
        Long configId = plusAcquisitionSmartOffer.getMeta().getConfigId();
        String page = plusAcquisitionSmartOffer.getPage();
        String place = plusAcquisitionSmartOffer.getPlace();
        int priority = plusAcquisitionSmartOffer.getPriority();
        String subscriptionName = plusAcquisitionSmartOffer.getTexts().getSubscriptionName();
        String combinedFullOfferText = plusAcquisitionSmartOffer.getTexts().getCombinedFullOfferText();
        String combinedIntroductoryText = plusAcquisitionSmartOffer.getTexts().getCombinedIntroductoryText();
        zm zmVar = this.b.a;
        String l = configId != null ? configId.toString() : null;
        if (l == null) {
            l = "no_value";
        }
        if (page == null) {
            page = "no_value";
        }
        if (place == null) {
            place = "no_value";
        }
        zmVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("config_id", l);
        linkedHashMap.put(Constants.KEY_PAGE, page);
        linkedHashMap.put("place", place);
        linkedHashMap.put("position", String.valueOf(priority));
        linkedHashMap.put("title", subscriptionName);
        linkedHashMap.put("subtitle", combinedFullOfferText);
        linkedHashMap.put("button_text", combinedIntroductoryText);
        linkedHashMap.put("_meta", zm.a(new HashMap()));
        zmVar.b("OfferSection.Showed", linkedHashMap);
        ((com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) ((d0d0) ((ls90) this.c).h.getValue())).b(plusAcquisitionSmartOffer, plusAcquisitionPaymentAnalytics$Params);
    }
}
