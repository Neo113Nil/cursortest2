package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.CardInputView;
import com.yandex.xplat.payment.sdk.BankName;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.Scenario;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.azv;
import defpackage.bzv;
import defpackage.cma1;
import defpackage.cp7;
import defpackage.czv;
import defpackage.d1;
import defpackage.egb1;
import defpackage.kh8;
import defpackage.ky7;
import defpackage.mh8;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.qh8;
import defpackage.qv90;
import defpackage.r891;
import defpackage.rh8;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tls;
import defpackage.toa0;
import defpackage.vv90;
import defpackage.w511;
import defpackage.wyv;
import defpackage.xlh0;
import defpackage.xyv;
import defpackage.y22;
import defpackage.yv90;
import defpackage.yyv;
import defpackage.zy11;
import defpackage.zyv;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u00142\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00142\u0016\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ%\u0010!\u001a\u00020\u00142\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019H\u0016¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u0019\u0010%\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0018J\u001f\u0010.\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010\u0018R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010:R\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/yandex/payment/sdk/ui/view/card/CardInputViewImpl;", "Lcom/yandex/payment/sdk/ui/CardInputView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/payment/sdk/ui/CardInputMode;", "mode", "Lcom/yandex/payment/sdk/core/data/CardValidationConfig;", "validationConfig", "Lcp7;", "cameraCardScanner", "Lrwo;", "eventReporter", "", "enableDebranding", "Lzy11;", "setup", "(Lcom/yandex/payment/sdk/ui/CardInputMode;Lcom/yandex/payment/sdk/core/data/CardValidationConfig;Lcp7;Lrwo;Z)V", "proceedToCardDetails", "()V", "Lkotlin/Function1;", "Lcom/yandex/payment/sdk/ui/CardInput$State;", "listener", "setOnStateChangeListener", "(Ltls;)V", "", "setMaskedCardNumberListener", "Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "setCardPaymentSystemListener", "focusInput", "Lvv90;", "api", "setPaymentApi", "(Lvv90;)V", "save", "setSaveCardOnPayment", "(Z)V", "provideCardData", "reset", "card", MetaDataField.DATE_FIELD, "setNfcCardAndDate", "(Ljava/lang/String;Ljava/lang/String;)V", "setCardForbiddenState", "Ltoa0;", "binding", "Ltoa0;", "Lmh8;", "controller", "Lmh8;", "cardInputMode", "Lcom/yandex/payment/sdk/ui/CardInputMode;", "Lrwo;", "Lvv90;", "getMode", "()Lcom/yandex/payment/sdk/ui/CardInputMode;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardInputViewImpl extends CardInputView {
    private vv90 api;
    private final toa0 binding;
    private CardInputMode cardInputMode;
    private mh8 controller;
    private rwo eventReporter;

    public CardInputViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_card_input_view_impl, this);
        int i2 = o9h0.paymentsdk_prebuilt_card_binding_layout;
        if (((LinearLayout) cma1.O(i2, this)) != null) {
            i2 = o9h0.paymentsdk_prebuilt_card_number_input;
            CardNumberInput cardNumberInput = (CardNumberInput) cma1.O(i2, this);
            if (cardNumberInput != null) {
                i2 = o9h0.paymentsdk_prebuilt_card_number_to_expiration_date_space;
                Space space = (Space) cma1.O(i2, this);
                if (space != null) {
                    i2 = o9h0.paymentsdk_prebuilt_card_number_to_scanner_space;
                    Space space2 = (Space) cma1.O(i2, this);
                    if (space2 != null) {
                        i2 = o9h0.paymentsdk_prebuilt_card_root_layout;
                        if (((LinearLayout) cma1.O(i2, this)) != null) {
                            i2 = o9h0.paymentsdk_prebuilt_card_scanner;
                            ImageView imageView = (ImageView) cma1.O(i2, this);
                            if (imageView != null) {
                                i2 = o9h0.paymentsdk_prebuilt_cvn_input;
                                CvnInput cvnInput = (CvnInput) cma1.O(i2, this);
                                if (cvnInput != null) {
                                    i2 = o9h0.paymentsdk_prebuilt_error_text;
                                    TextView textView = (TextView) cma1.O(i2, this);
                                    if (textView != null) {
                                        i2 = o9h0.paymentsdk_prebuilt_expiration_date_input;
                                        ExpirationDateInput expirationDateInput = (ExpirationDateInput) cma1.O(i2, this);
                                        if (expirationDateInput != null) {
                                            i2 = o9h0.paymentsdk_prebuilt_expiration_date_to_cvn_space;
                                            Space space3 = (Space) cma1.O(i2, this);
                                            if (space3 != null) {
                                                this.binding = new toa0(this, cardNumberInput, space, space2, imageView, cvnInput, textView, expirationDateInput, space3);
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
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnStateChangeListener$lambda$0(CardInputViewImpl cardInputViewImpl, tls tlsVar, CardInput$State cardInput$State, CardInput$State cardInput$State2) {
        CardInputMode cardInputMode = cardInputViewImpl.cardInputMode;
        if (cardInputMode == null) {
            cardInputMode = null;
        }
        if (cardInputMode == CardInputMode.PayAndBind && cardInput$State2 != cardInput$State && cardInput$State2 == CardInput$State.CARD_DETAILS && cardInput$State == CardInput$State.CARD_NUMBER_VALID) {
            rwo rwoVar = cardInputViewImpl.eventReporter;
            rwo rwoVar2 = rwoVar != null ? rwoVar : null;
            sv90 sv90Var = qv90.a;
            Scenario d = r891.d(cardInputViewImpl.getMode());
            sv90Var.getClass();
            ((y22) rwoVar2).a(sv90.v(d));
        }
        if (tlsVar != null) {
            tlsVar.invoke(cardInput$State2);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setup$lambda$0(rwo rwoVar, CardInputMode cardInputMode, czv czvVar) {
        if (czvVar instanceof azv) {
            sv90 sv90Var = qv90.a;
            azv azvVar = (azv) czvVar;
            TextFieldNameForAnalytics textFieldNameForAnalytics = azvVar.b;
            boolean z = azvVar.a;
            Scenario d = r891.d(cardInputMode);
            sv90Var.getClass();
            ((y22) rwoVar).a(sv90.z0(textFieldNameForAnalytics, z, d));
        } else if (czvVar instanceof bzv) {
            sv90 sv90Var2 = qv90.a;
            TextFieldNameForAnalytics textFieldNameForAnalytics2 = ((bzv) czvVar).a;
            Scenario d2 = r891.d(cardInputMode);
            sv90Var2.getClass();
            ((y22) rwoVar).a(sv90.w(textFieldNameForAnalytics2, d2));
        } else if (czvVar instanceof yyv) {
            int i = rh8.a[((yyv) czvVar).a.ordinal()];
            if (i == 1) {
                sv90 sv90Var3 = qv90.a;
                Scenario d3 = r891.d(cardInputMode);
                sv90Var3.getClass();
                ((y22) rwoVar).a(sv90.I(d3));
            } else if (i == 2) {
                sv90 sv90Var4 = qv90.a;
                Scenario d4 = r891.d(cardInputMode);
                sv90Var4.getClass();
                ((y22) rwoVar).a(sv90.J(d4));
            } else if (i == 3) {
                sv90 sv90Var5 = qv90.a;
                Scenario d5 = r891.d(cardInputMode);
                sv90Var5.getClass();
                ((y22) rwoVar).a(sv90.H(d5));
            } else if (i != 4 && i != 5) {
                w511.b();
                return null;
            }
        } else if (czvVar instanceof zyv) {
            sv90 sv90Var6 = qv90.a;
            String str = ((zyv) czvVar).a;
            sv90Var6.getClass();
            ((y22) rwoVar).a(sv90.K(str));
        } else if (!(czvVar instanceof xyv) && !(czvVar instanceof wyv)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void focusInput() {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        CardNumberInput cardNumberInput = mh8Var.d;
        ExpirationDateInput expirationDateInput = mh8Var.e;
        CvnInput cvnInput = mh8Var.f;
        int i = kh8.a[mh8Var.c.ordinal()];
        if (i == 1) {
            cardNumberInput.gainFocus();
            return;
        }
        if (i == 2) {
            cardNumberInput.gainFocus();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                cvnInput.gainFocus();
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (expirationDateInput.isValid()) {
            cvnInput.gainFocus();
        } else {
            expirationDateInput.gainFocus();
        }
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public CardInputMode getMode() {
        CardInputMode cardInputMode = this.cardInputMode;
        if (cardInputMode == null) {
            return null;
        }
        return cardInputMode;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void proceedToCardDetails() {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        mh8Var.b();
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void provideCardData() {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        CvnInput cvnInput = mh8Var.f;
        ExpirationDateInput expirationDateInput = mh8Var.e;
        CardNumberInput cardNumberInput = mh8Var.d;
        NewCard newCard = (cardNumberInput.getReady() && expirationDateInput.isValid() && cvnInput.isValid()) ? new NewCard(cardNumberInput.getCardNumber(), expirationDateInput.getExpirationMonth(), expirationDateInput.getExpirationYear(), cvnInput.getCvn(), mh8Var.n, BankName.UnknownBank) : null;
        if (newCard != null) {
            CardInputMode cardInputMode = this.cardInputMode;
            int i = rh8.b[(cardInputMode != null ? cardInputMode : null).ordinal()];
            if (i == 1) {
                vv90 vv90Var = this.api;
                if (vv90Var != null) {
                    ((yv90) r891.c(vv90Var)).a(newCard);
                    return;
                }
                return;
            }
            if (i != 2) {
                w511.b();
                return;
            }
            vv90 vv90Var2 = this.api;
            if (vv90Var2 != null) {
                ((yv90) r891.c(vv90Var2)).f(newCard);
            }
        }
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void reset() {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        mh8Var.getClass();
        mh8Var.d(CardInput$State.CARD_NUMBER);
        mh8Var.d.reset();
        mh8Var.e.reset();
        mh8Var.f.reset();
        this.api = null;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setCardForbiddenState() {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        mh8Var.e.reset();
        mh8Var.f.reset();
        mh8Var.d(CardInput$State.CARD_NUMBER);
        mh8Var.d.showError();
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void setCardPaymentSystemListener(tls listener) {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        mh8Var.k = listener;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void setMaskedCardNumberListener(tls listener) {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        mh8Var.j = listener;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setNfcCardAndDate(String card, String date) {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        CardInput$State cardInput$State = mh8Var.c;
        ExpirationDateInput expirationDateInput = mh8Var.e;
        CardNumberInput cardNumberInput = mh8Var.d;
        if (cardInput$State != CardInput$State.CARD_DETAILS && cardInput$State != CardInput$State.CARD_DETAILS_VALID) {
            cardNumberInput.setExternalPreparedNumber(card);
            expirationDateInput.setExternalDate(date);
            return;
        }
        expirationDateInput.reset();
        mh8Var.f.reset();
        cardNumberInput.reset();
        mh8Var.d(CardInput$State.CARD_NUMBER);
        new Handler(Looper.getMainLooper()).postDelayed(new d1(13, mh8Var, card, date), mh8Var.m);
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void setOnStateChangeListener(tls listener) {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        mh8Var.i = new ky7(6, this, listener);
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setPaymentApi(vv90 api) {
        this.api = api;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setSaveCardOnPayment(boolean save) {
        mh8 mh8Var = this.controller;
        if (mh8Var == null) {
            mh8Var = null;
        }
        mh8Var.n = save;
    }

    public final void setup(CardInputMode mode, CardValidationConfig validationConfig, cp7 cameraCardScanner, rwo eventReporter, boolean enableDebranding) {
        this.eventReporter = eventReporter;
        mh8 mh8Var = new mh8(this.binding, egb1.a(validationConfig), cameraCardScanner, enableDebranding);
        this.controller = mh8Var;
        final int i = 0;
        final qh8 qh8Var = new qh8(eventReporter, mode, i);
        mh8Var.d.setInputEventListener(new tls() { // from class: fh8
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                qh8 qh8Var2 = qh8Var;
                czv czvVar = (czv) obj;
                switch (i2) {
                    case 0:
                        qh8Var2.invoke(czvVar);
                        break;
                    case 1:
                        qh8Var2.invoke(czvVar);
                        break;
                    default:
                        qh8Var2.invoke(czvVar);
                        break;
                }
                return zy11Var;
            }
        });
        final int i2 = 1;
        mh8Var.e.setInputEventListener(new tls() { // from class: fh8
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                qh8 qh8Var2 = qh8Var;
                czv czvVar = (czv) obj;
                switch (i22) {
                    case 0:
                        qh8Var2.invoke(czvVar);
                        break;
                    case 1:
                        qh8Var2.invoke(czvVar);
                        break;
                    default:
                        qh8Var2.invoke(czvVar);
                        break;
                }
                return zy11Var;
            }
        });
        final int i3 = 2;
        mh8Var.f.setInputEventListener(new tls() { // from class: fh8
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i3;
                zy11 zy11Var = zy11.a;
                qh8 qh8Var2 = qh8Var;
                czv czvVar = (czv) obj;
                switch (i22) {
                    case 0:
                        qh8Var2.invoke(czvVar);
                        break;
                    case 1:
                        qh8Var2.invoke(czvVar);
                        break;
                    default:
                        qh8Var2.invoke(czvVar);
                        break;
                }
                return zy11Var;
            }
        });
        mh8Var.l = qh8Var;
        this.cardInputMode = mode;
    }

    public CardInputViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CardInputViewImpl(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CardInputViewImpl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
