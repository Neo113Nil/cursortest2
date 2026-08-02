package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.kvg0;
import defpackage.mh8;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class mh8 {
    public final toa0 a;
    public final cp7 b;
    public CardInput$State c = CardInput$State.CARD_NUMBER;
    public final CardNumberInput d;
    public final ExpirationDateInput e;
    public final CvnInput f;
    public final boolean g;
    public final hh5 h;
    public ky7 i;
    public tls j;
    public tls k;
    public qh8 l;
    public final long m;
    public boolean n;

    public mh8(toa0 toa0Var, vp8 vp8Var, cp7 cp7Var, boolean z) {
        this.a = toa0Var;
        this.b = cp7Var;
        CardNumberInput cardNumberInput = toa0Var.b;
        this.d = cardNumberInput;
        ExpirationDateInput expirationDateInput = toa0Var.h;
        this.e = expirationDateInput;
        CvnInput cvnInput = toa0Var.f;
        this.f = cvnInput;
        ImageView imageView = toa0Var.e;
        this.h = new hh5(18, this);
        this.m = toa0Var.a.getResources().getInteger(kjh0.paymentsdk_prebuilt_card_number_animation_duration);
        cardNumberInput.setEnableDebranding(z);
        cardNumberInput.setValidator(vp8Var.a);
        cardNumberInput.setOnFinish(new tls(this) { // from class: dh8
            public final /* synthetic */ mh8 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qh8 qh8Var;
                int i = r2;
                zy11 zy11Var = zy11.a;
                mh8 mh8Var = this.b;
                switch (i) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            mh8Var.d(CardInput$State.CARD_NUMBER);
                            tls tlsVar = mh8Var.j;
                            if (tlsVar != null) {
                                tlsVar.invoke(null);
                                break;
                            }
                        } else {
                            qh8 qh8Var2 = mh8Var.l;
                            if (qh8Var2 != null) {
                                qh8Var2.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }
                            mh8Var.d(CardInput$State.CARD_NUMBER_VALID);
                            tls tlsVar2 = mh8Var.j;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(sfb1.d(mh8Var.d.getCardNumber()));
                                break;
                            }
                        }
                        break;
                    case 1:
                        rp8 rp8Var = (rp8) obj;
                        mh8Var.f.setCardType(rp8Var);
                        tls tlsVar3 = mh8Var.k;
                        if (tlsVar3 != null) {
                            tlsVar3.invoke(wme.d(rp8Var.a));
                            break;
                        }
                        break;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean isValid = mh8Var.e.isValid();
                        if (isValid && booleanValue) {
                            mh8Var.f.gainFocus();
                        }
                        if (isValid && (qh8Var = mh8Var.l) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                        }
                        mh8Var.e();
                        break;
                }
                return zy11Var;
            }
        });
        final char c = 1 == true ? 1 : 0;
        cardNumberInput.setOnCardTypeChangedListener(new tls(this) { // from class: dh8
            public final /* synthetic */ mh8 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qh8 qh8Var;
                int i = c;
                zy11 zy11Var = zy11.a;
                mh8 mh8Var = this.b;
                switch (i) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            mh8Var.d(CardInput$State.CARD_NUMBER);
                            tls tlsVar = mh8Var.j;
                            if (tlsVar != null) {
                                tlsVar.invoke(null);
                                break;
                            }
                        } else {
                            qh8 qh8Var2 = mh8Var.l;
                            if (qh8Var2 != null) {
                                qh8Var2.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }
                            mh8Var.d(CardInput$State.CARD_NUMBER_VALID);
                            tls tlsVar2 = mh8Var.j;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(sfb1.d(mh8Var.d.getCardNumber()));
                                break;
                            }
                        }
                        break;
                    case 1:
                        rp8 rp8Var = (rp8) obj;
                        mh8Var.f.setCardType(rp8Var);
                        tls tlsVar3 = mh8Var.k;
                        if (tlsVar3 != null) {
                            tlsVar3.invoke(wme.d(rp8Var.a));
                            break;
                        }
                        break;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean isValid = mh8Var.e.isValid();
                        if (isValid && booleanValue) {
                            mh8Var.f.gainFocus();
                        }
                        if (isValid && (qh8Var = mh8Var.l) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                        }
                        mh8Var.e();
                        break;
                }
                return zy11Var;
            }
        });
        cardNumberInput.setOnFocus(new u08(6, cardNumberInput, this));
        cardNumberInput.setCallback(new sls(this) { // from class: ih8
            public final /* synthetic */ mh8 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i = r2;
                zy11 zy11Var = zy11.a;
                mh8 mh8Var = this.b;
                switch (i) {
                    case 0:
                        mh8Var.a();
                        break;
                    case 1:
                        mh8Var.b();
                        break;
                    case 2:
                        mh8Var.f.gainFocus();
                        break;
                    default:
                        if (mh8Var.f.isValid() && (qh8Var = mh8Var.l) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        mh8Var.e();
                        break;
                }
                return zy11Var;
            }
        });
        final char c2 = 1 == true ? 1 : 0;
        cardNumberInput.setOnKeyboardAction(new sls(this) { // from class: ih8
            public final /* synthetic */ mh8 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i = c2;
                zy11 zy11Var = zy11.a;
                mh8 mh8Var = this.b;
                switch (i) {
                    case 0:
                        mh8Var.a();
                        break;
                    case 1:
                        mh8Var.b();
                        break;
                    case 2:
                        mh8Var.f.gainFocus();
                        break;
                    default:
                        if (mh8Var.f.isValid() && (qh8Var = mh8Var.l) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        mh8Var.e();
                        break;
                }
                return zy11Var;
            }
        });
        expirationDateInput.setValidator(vp8Var.b);
        final int i = 2;
        expirationDateInput.setCallback(new tls(this) { // from class: dh8
            public final /* synthetic */ mh8 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qh8 qh8Var;
                int i2 = i;
                zy11 zy11Var = zy11.a;
                mh8 mh8Var = this.b;
                switch (i2) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            mh8Var.d(CardInput$State.CARD_NUMBER);
                            tls tlsVar = mh8Var.j;
                            if (tlsVar != null) {
                                tlsVar.invoke(null);
                                break;
                            }
                        } else {
                            qh8 qh8Var2 = mh8Var.l;
                            if (qh8Var2 != null) {
                                qh8Var2.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }
                            mh8Var.d(CardInput$State.CARD_NUMBER_VALID);
                            tls tlsVar2 = mh8Var.j;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(sfb1.d(mh8Var.d.getCardNumber()));
                                break;
                            }
                        }
                        break;
                    case 1:
                        rp8 rp8Var = (rp8) obj;
                        mh8Var.f.setCardType(rp8Var);
                        tls tlsVar3 = mh8Var.k;
                        if (tlsVar3 != null) {
                            tlsVar3.invoke(wme.d(rp8Var.a));
                            break;
                        }
                        break;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean isValid = mh8Var.e.isValid();
                        if (isValid && booleanValue) {
                            mh8Var.f.gainFocus();
                        }
                        if (isValid && (qh8Var = mh8Var.l) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                        }
                        mh8Var.e();
                        break;
                }
                return zy11Var;
            }
        });
        expirationDateInput.setOnKeyboardAction(new sls(this) { // from class: ih8
            public final /* synthetic */ mh8 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i2 = i;
                zy11 zy11Var = zy11.a;
                mh8 mh8Var = this.b;
                switch (i2) {
                    case 0:
                        mh8Var.a();
                        break;
                    case 1:
                        mh8Var.b();
                        break;
                    case 2:
                        mh8Var.f.gainFocus();
                        break;
                    default:
                        if (mh8Var.f.isValid() && (qh8Var = mh8Var.l) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        mh8Var.e();
                        break;
                }
                return zy11Var;
            }
        });
        cvnInput.setValidator(vp8Var.c);
        final int i2 = 3;
        cvnInput.setCallback(new sls(this) { // from class: ih8
            public final /* synthetic */ mh8 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                mh8 mh8Var = this.b;
                switch (i22) {
                    case 0:
                        mh8Var.a();
                        break;
                    case 1:
                        mh8Var.b();
                        break;
                    case 2:
                        mh8Var.f.gainFocus();
                        break;
                    default:
                        if (mh8Var.f.isValid() && (qh8Var = mh8Var.l) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        mh8Var.e();
                        break;
                }
                return zy11Var;
            }
        });
        boolean z2 = cp7Var != null && a.d.d((FragmentActivity) ((lg) cp7Var).b, b.a) == 0;
        this.g = z2;
        imageView.setVisibility(z2 ? 0 : 8);
        imageView.setOnClickListener(new tf(29, this));
    }

    public final void a() {
        boolean hasError = this.f.getHasError();
        boolean hasError2 = this.e.getHasError();
        boolean hasError3 = this.d.getHasError();
        CardInput$State cardInput$State = this.c;
        Integer num = null;
        if (cardInput$State == CardInput$State.CARD_NUMBER || cardInput$State == CardInput$State.CARD_NUMBER_VALID) {
            Integer valueOf = Integer.valueOf(tyh0.paymentsdk_prebuilt_wrong_card_number_try_again_message);
            if (hasError3) {
                num = valueOf;
            }
        } else if (hasError && hasError2) {
            num = Integer.valueOf(tyh0.paymentsdk_prebuilt_wrong_date_and_code_try_again_message);
        } else if (hasError) {
            num = Integer.valueOf(tyh0.paymentsdk_prebuilt_wrong_code_try_again_message);
        } else if (hasError2) {
            num = Integer.valueOf(tyh0.paymentsdk_prebuilt_wrong_date_try_again_message);
        }
        toa0 toa0Var = this.a;
        if (num == null) {
            toa0Var.g.setVisibility(8);
            return;
        }
        CardInputViewImpl cardInputViewImpl = toa0Var.a;
        TextView textView = toa0Var.g;
        String string = cardInputViewImpl.getContext().getResources().getString(num.intValue());
        qh8 qh8Var = this.l;
        if (qh8Var != null) {
            qh8Var.invoke(new zyv(string));
        }
        textView.setText(string);
        textView.setVisibility(0);
    }

    public final void b() {
        if (this.c == CardInput$State.CARD_NUMBER_VALID) {
            if (this.e.isValid()) {
                CvnInput cvnInput = this.f;
                if (cvnInput.isValid()) {
                    d(CardInput$State.CARD_DETAILS_VALID);
                    cvnInput.gainFocus();
                    return;
                }
            }
            d(CardInput$State.CARD_DETAILS);
            a();
        }
    }

    public final void c(boolean z) {
        toa0 toa0Var = this.a;
        toa0Var.h.setVisibility(z ? 0 : 8);
        toa0Var.f.setVisibility(z ? 0 : 8);
        toa0Var.i.setVisibility(z ? 0 : 8);
        toa0Var.c.setVisibility(z ? 0 : 8);
    }

    public final void d(CardInput$State cardInput$State) {
        CardInput$State cardInput$State2 = this.c;
        if (cardInput$State == cardInput$State2) {
            return;
        }
        final int i = 1;
        final int i2 = 0;
        boolean z = cardInput$State == CardInput$State.CARD_DETAILS || cardInput$State == CardInput$State.CARD_DETAILS_VALID;
        boolean z2 = cardInput$State2 == CardInput$State.CARD_NUMBER || cardInput$State2 == CardInput$State.CARD_NUMBER_VALID;
        long j = this.m;
        toa0 toa0Var = this.a;
        if (z && z2) {
            c(true);
            if (this.g) {
                toa0Var.e.setVisibility(8);
                toa0Var.d.setVisibility(8);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(toa0Var.b.getWidth(), toa0Var.a.getResources().getDimensionPixelSize(kvg0.paymentsdk_prebuilt_card_number_input_collapsed_width));
            ofInt.setDuration(j);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gh8
                public final /* synthetic */ mh8 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i;
                    mh8 mh8Var = this.b;
                    switch (i3) {
                        case 0:
                            CardNumberInput cardNumberInput = mh8Var.a.b;
                            ViewGroup.LayoutParams layoutParams = cardNumberInput.getLayoutParams();
                            if (layoutParams == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                cardNumberInput.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            CardNumberInput cardNumberInput2 = mh8Var.a.b;
                            ViewGroup.LayoutParams layoutParams2 = cardNumberInput2.getLayoutParams();
                            if (layoutParams2 == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                cardNumberInput2.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt.start();
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.yandex.payment.sdk.ui.logic.CardInputViewController$collapseCardNumber$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    CardNumberInput cardNumberInput = mh8.this.a.b;
                    ViewGroup.LayoutParams layoutParams = cardNumberInput.getLayoutParams();
                    if (layoutParams == null) {
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    }
                    layoutParams.width = mh8.this.a.a.getResources().getDimensionPixelSize(kvg0.paymentsdk_prebuilt_card_number_input_collapsed_width);
                    cardNumberInput.setLayoutParams(layoutParams);
                    mh8.this.a.b.setState(CardNumberInput.State.MASKED);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            this.d.dropFocus();
            ExpirationDateInput expirationDateInput = this.e;
            if (expirationDateInput.isValid()) {
                this.f.gainFocus();
            } else {
                expirationDateInput.gainFocus();
            }
        } else if (!z && !z2) {
            c(false);
            TextView textView = toa0Var.g;
            CardNumberInput cardNumberInput = toa0Var.b;
            textView.setVisibility(8);
            cardNumberInput.setState(CardNumberInput.State.FULL);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(cardNumberInput.getWidth(), toa0Var.a.getResources().getDimensionPixelSize(kvg0.paymentsdk_prebuilt_card_number_input_expanded_width));
            ofInt2.setDuration(j);
            ofInt2.setInterpolator(new DecelerateInterpolator());
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gh8
                public final /* synthetic */ mh8 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    mh8 mh8Var = this.b;
                    switch (i3) {
                        case 0:
                            CardNumberInput cardNumberInput2 = mh8Var.a.b;
                            ViewGroup.LayoutParams layoutParams = cardNumberInput2.getLayoutParams();
                            if (layoutParams == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                cardNumberInput2.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            CardNumberInput cardNumberInput22 = mh8Var.a.b;
                            ViewGroup.LayoutParams layoutParams2 = cardNumberInput22.getLayoutParams();
                            if (layoutParams2 == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                cardNumberInput22.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt2.start();
            ofInt2.addListener(new Animator.AnimatorListener() { // from class: com.yandex.payment.sdk.ui.logic.CardInputViewController$expandCardNumber$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    CardNumberInput cardNumberInput2 = mh8.this.a.b;
                    ViewGroup.LayoutParams layoutParams = cardNumberInput2.getLayoutParams();
                    if (layoutParams == null) {
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    }
                    layoutParams.width = mh8.this.a.a.getResources().getDimensionPixelSize(kvg0.paymentsdk_prebuilt_card_number_input_expanded_width);
                    cardNumberInput2.setLayoutParams(layoutParams);
                    mh8 mh8Var = mh8.this;
                    if (mh8Var.g) {
                        mh8Var.a.e.setVisibility(0);
                        mh8.this.a.d.setVisibility(0);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        ky7 ky7Var = this.i;
        if (ky7Var != null) {
            ky7Var.invoke(this.c, cardInput$State);
        }
        this.c = cardInput$State;
    }

    public final void e() {
        d((this.d.getReady() && this.e.isValid() && this.f.isValid()) ? CardInput$State.CARD_DETAILS_VALID : CardInput$State.CARD_DETAILS);
        a();
    }
}
