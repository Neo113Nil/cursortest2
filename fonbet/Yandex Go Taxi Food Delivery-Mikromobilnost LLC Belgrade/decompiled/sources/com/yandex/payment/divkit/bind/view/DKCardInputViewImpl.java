package com.yandex.payment.divkit.bind.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.Space;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.CardInputView;
import com.yandex.xplat.payment.sdk.ButtonNameForAnalytics;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.Scenario;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.azv;
import defpackage.b64;
import defpackage.bzv;
import defpackage.cma1;
import defpackage.cp7;
import defpackage.czv;
import defpackage.d1;
import defpackage.egb1;
import defpackage.epa0;
import defpackage.g8e;
import defpackage.l9h0;
import defpackage.mjf;
import defpackage.ny61;
import defpackage.prf;
import defpackage.qh8;
import defpackage.qv90;
import defpackage.r891;
import defpackage.rv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tls;
import defpackage.ulh0;
import defpackage.vrf;
import defpackage.vv90;
import defpackage.w511;
import defpackage.wj00;
import defpackage.wj91;
import defpackage.wrf;
import defpackage.wyv;
import defpackage.xyv;
import defpackage.y22;
import defpackage.y891;
import defpackage.yv90;
import defpackage.yyv;
import defpackage.zy11;
import defpackage.zyv;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJG\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u00020\u00172\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u00172\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010 J%\u0010#\u001a\u00020\u00172\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001cH\u0016¢\u0006\u0004\b#\u0010 J'\u0010%\u001a\u00020\u00172\u0016\u0010\u001e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001cH\u0016¢\u0006\u0004\b%\u0010 J%\u0010'\u001a\u00020\u00172\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001cH\u0016¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020\u0017H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0019\u0010+\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0017H\u0016¢\u0006\u0004\b0\u0010\u001bJ\u001f\u00103\u001a\u00020\u00172\u0006\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020$H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u0010\u001bJ#\u00108\u001a\u00020\u00172\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u001cH\u0016¢\u0006\u0004\b8\u0010 J\u000f\u00109\u001a\u00020\u001dH\u0016¢\u0006\u0004\b9\u0010:J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010FR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010GR$\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/yandex/payment/divkit/bind/view/DKCardInputViewImpl;", "Lcom/yandex/payment/sdk/ui/CardInputView;", "Lprf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/payment/sdk/ui/CardInputMode;", "mode", "Lcom/yandex/payment/sdk/core/data/CardValidationConfig;", "validationConfig", "Lcp7;", "cameraCardScanner", "Lrwo;", "eventReporter", "", "enableDebranding", "isNoCvnMir", "isCardScannerEnabled", "Lzy11;", "setup", "(Lcom/yandex/payment/sdk/ui/CardInputMode;Lcom/yandex/payment/sdk/core/data/CardValidationConfig;Lcp7;Lrwo;ZZZ)V", "proceedToCardDetails", "()V", "Lkotlin/Function1;", "Lcom/yandex/payment/sdk/ui/CardInput$State;", "listener", "setFragmentOnStateChangeListener", "(Ltls;)V", "setOnStateChangeListener", "Lvyv;", "setInputErrorListener", "", "setMaskedCardNumberListener", "Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "setCardPaymentSystemListener", "focusInput", "Lvv90;", "api", "setPaymentApi", "(Lvv90;)V", "save", "setSaveCardOnPayment", "(Z)V", "provideCardData", "card", MetaDataField.DATE_FIELD, "setNfcCardAndDate", "(Ljava/lang/String;Ljava/lang/String;)V", "setCardForbiddenState", "reset", "helpCallback", "setHelpCallback", "getState", "()Lcom/yandex/payment/sdk/ui/CardInput$State;", "Lcom/yandex/xplat/payment/sdk/NewCard;", "getNewCard", "()Lcom/yandex/xplat/payment/sdk/NewCard;", "Lepa0;", "binding", "Lepa0;", "Lcom/yandex/payment/divkit/bind/view/a;", "controller", "Lcom/yandex/payment/divkit/bind/view/a;", "cardInputMode", "Lcom/yandex/payment/sdk/ui/CardInputMode;", "Lrwo;", "Lvv90;", "fragmentStateListener", "Ltls;", "getMode", "()Lcom/yandex/payment/sdk/ui/CardInputMode;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKCardInputViewImpl extends CardInputView implements prf {
    private vv90 api;
    private final epa0 binding;
    private CardInputMode cardInputMode;
    private a controller;
    private rwo eventReporter;
    private tls fragmentStateListener;

    public DKCardInputViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ulh0.paymentsdk_dk_card_input_view_impl, this);
        int i2 = l9h0.paymentsdk_prebuilt_card_binding_layout;
        if (((LinearLayout) cma1.O(i2, this)) != null) {
            i2 = l9h0.paymentsdk_prebuilt_card_number_input;
            DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) cma1.O(i2, this);
            if (dKCardNumberInput != null) {
                i2 = l9h0.paymentsdk_prebuilt_card_number_to_expiration_date_space;
                Space space = (Space) cma1.O(i2, this);
                if (space != null) {
                    i2 = l9h0.paymentsdk_prebuilt_card_root_layout;
                    if (((LinearLayout) cma1.O(i2, this)) != null) {
                        i2 = l9h0.paymentsdk_prebuilt_cvn_input;
                        DKCvnInput dKCvnInput = (DKCvnInput) cma1.O(i2, this);
                        if (dKCvnInput != null) {
                            i2 = l9h0.paymentsdk_prebuilt_expiration_date_input;
                            DKExpirationDateInput dKExpirationDateInput = (DKExpirationDateInput) cma1.O(i2, this);
                            if (dKExpirationDateInput != null) {
                                i2 = l9h0.paymentsdk_prebuilt_expiration_date_to_cvn_space;
                                Space space2 = (Space) cma1.O(i2, this);
                                if (space2 != null) {
                                    this.binding = new epa0(this, dKCardNumberInput, space, dKCvnInput, dKExpirationDateInput, space2);
                                    return;
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
    public static final zy11 setOnStateChangeListener$lambda$0(DKCardInputViewImpl dKCardInputViewImpl, tls tlsVar, CardInput$State cardInput$State, CardInput$State cardInput$State2) {
        CardInputMode cardInputMode = dKCardInputViewImpl.cardInputMode;
        if (cardInputMode == null) {
            cardInputMode = null;
        }
        if (cardInputMode == CardInputMode.PayAndBind && cardInput$State2 != cardInput$State && cardInput$State2 == CardInput$State.CARD_DETAILS && cardInput$State == CardInput$State.CARD_NUMBER_VALID) {
            rwo rwoVar = dKCardInputViewImpl.eventReporter;
            rwo rwoVar2 = rwoVar != null ? rwoVar : null;
            sv90 sv90Var = qv90.a;
            Scenario d = r891.d(dKCardInputViewImpl.getMode());
            sv90Var.getClass();
            ((y22) rwoVar2).a(sv90.v(d));
        }
        tls tlsVar2 = dKCardInputViewImpl.fragmentStateListener;
        if (tlsVar2 != null) {
            tlsVar2.invoke(cardInput$State2);
        }
        if (tlsVar != null) {
            tlsVar.invoke(cardInput$State2);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setup$lambda$0(rwo rwoVar, CardInputMode cardInputMode, czv czvVar) {
        String value;
        String value2;
        String str;
        String value3;
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
        } else {
            String str2 = null;
            if (czvVar instanceof yyv) {
                int i = wrf.a[((yyv) czvVar).a.ordinal()];
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
                } else if (i != 4) {
                    if (i != 5) {
                        w511.b();
                        return null;
                    }
                    sv90 sv90Var6 = qv90.a;
                    Scenario d6 = r891.d(cardInputMode);
                    if (d6 != null) {
                        sv90Var6.getClass();
                        str = "Cканирование карты прошло успешно в сценарии ".concat(sv90.r(d6));
                    } else {
                        sv90Var6.getClass();
                        str = "Cканирование карты прошло успешно";
                    }
                    wj00 wj00Var = new wj00(0);
                    if (d6 != null && (value3 = d6.getValue()) != null) {
                        str2 = value3;
                    }
                    if (str2 != null) {
                        wj00Var.k("scenario", str2);
                    }
                    wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str);
                    ((y22) rwoVar).a(y891.c("payment_form_card_scanner_completed", wj00Var));
                }
            } else if (czvVar instanceof zyv) {
                sv90 sv90Var7 = qv90.a;
                String str3 = ((zyv) czvVar).a;
                sv90Var7.getClass();
                ((y22) rwoVar).a(sv90.K(str3));
            } else {
                if (czvVar instanceof wyv) {
                    sv90 sv90Var8 = qv90.a;
                    Scenario d7 = r891.d(cardInputMode);
                    wyv wyvVar = (wyv) czvVar;
                    boolean z2 = wyvVar.a;
                    ButtonNameForAnalytics buttonNameForAnalytics = wyvVar.b;
                    sv90Var8.getClass();
                    String str4 = z2 ? "доступна" : "недоступна";
                    int i2 = rv90.e[buttonNameForAnalytics.ordinal()];
                    String l = b64.l("Кнопка ", i2 != 1 ? i2 != 2 ? "" : "scanner_button" : "close_scanner_button", " ", str4);
                    if (d7 != null) {
                        l = g8e.p(l, " в сценарии ", sv90.r(d7));
                    }
                    wj00 wj00Var2 = new wj00(0);
                    if (d7 != null && (value2 = d7.getValue()) != null) {
                        str2 = value2;
                    }
                    if (str2 != null) {
                        wj00Var2.k("scenario", str2);
                    }
                    wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
                    ((y22) rwoVar).a(y891.c("payment_form_button_available", wj00Var2));
                } else {
                    if (!(czvVar instanceof xyv)) {
                        w511.b();
                        return null;
                    }
                    sv90 sv90Var9 = qv90.a;
                    Scenario d8 = r891.d(cardInputMode);
                    ButtonNameForAnalytics buttonNameForAnalytics2 = ((xyv) czvVar).a;
                    sv90Var9.getClass();
                    int i3 = rv90.e[buttonNameForAnalytics2.ordinal()];
                    String concat = "Нажата кнопка ".concat(i3 != 1 ? i3 != 2 ? "" : "scanner_button" : "close_scanner_button");
                    if (d8 != null) {
                        concat = g8e.p(concat, " в сценарии ", sv90.r(d8));
                    }
                    wj00 wj00Var3 = new wj00(0);
                    if (d8 != null && (value = d8.getValue()) != null) {
                        str2 = value;
                    }
                    if (str2 != null) {
                        wj00Var3.k("scenario", str2);
                    }
                    wj00Var3.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                    ((y22) rwoVar).a(y891.c("payment_form_button_pressed", wj00Var3));
                }
            }
        }
        return zy11.a;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void focusInput() {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        DKCardNumberInput dKCardNumberInput = aVar.e;
        DKCvnInput dKCvnInput = aVar.g;
        DKExpirationDateInput dKExpirationDateInput = aVar.f;
        int i = vrf.a[aVar.d.ordinal()];
        if (i == 1) {
            dKCardNumberInput.gainFocus();
            return;
        }
        if (i == 2) {
            dKCardNumberInput.gainFocus();
            return;
        }
        if (i == 3) {
            dKCvnInput.gainFocus();
            return;
        }
        if (i != 4) {
            w511.b();
        } else if (dKExpirationDateInput.isValid()) {
            dKCvnInput.gainFocus();
        } else {
            dKExpirationDateInput.gainFocus();
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

    @Override // defpackage.prf
    public NewCard getNewCard() {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.a();
    }

    public CardInput$State getState() {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.d;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void proceedToCardDetails() {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c();
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void provideCardData() {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        NewCard a = aVar.a();
        if (a != null) {
            CardInputMode cardInputMode = this.cardInputMode;
            int i = wrf.b[(cardInputMode != null ? cardInputMode : null).ordinal()];
            if (i == 1) {
                vv90 vv90Var = this.api;
                if (vv90Var != null) {
                    ((yv90) wj91.a(vv90Var)).a(a);
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
                ((yv90) wj91.a(vv90Var2)).f(a);
            }
        }
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void reset() {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.getClass();
        aVar.e(CardInput$State.CARD_NUMBER);
        aVar.e.reset();
        aVar.f.reset();
        aVar.g.reset();
        this.api = null;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setCardForbiddenState() {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.f.reset();
        aVar.g.reset();
        aVar.e(CardInput$State.CARD_NUMBER);
        aVar.e.showError();
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void setCardPaymentSystemListener(tls listener) {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.p = listener;
    }

    @Override // defpackage.prf
    public void setFragmentOnStateChangeListener(tls listener) {
        this.fragmentStateListener = listener;
    }

    @Override // defpackage.prf
    public void setHelpCallback(tls helpCallback) {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.g.setHelpCallback(helpCallback);
    }

    @Override // defpackage.prf
    public void setInputErrorListener(tls listener) {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.n = listener;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void setMaskedCardNumberListener(tls listener) {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.o = listener;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setNfcCardAndDate(String card, String date) {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        CardInput$State cardInput$State = aVar.d;
        DKExpirationDateInput dKExpirationDateInput = aVar.f;
        DKCardNumberInput dKCardNumberInput = aVar.e;
        if (cardInput$State != CardInput$State.CARD_DETAILS && cardInput$State != CardInput$State.CARD_DETAILS_VALID) {
            dKCardNumberInput.setExternalPreparedNumber(card);
            dKExpirationDateInput.setDate(date);
            return;
        }
        dKExpirationDateInput.reset();
        aVar.g.reset();
        dKCardNumberInput.reset();
        aVar.e(CardInput$State.CARD_NUMBER);
        new Handler(Looper.getMainLooper()).postDelayed(new d1(28, aVar, card, date), aVar.l);
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView, defpackage.bg8
    public void setOnStateChangeListener(tls listener) {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.m = new mjf(1, this, listener);
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setPaymentApi(vv90 api) {
        this.api = api;
    }

    @Override // com.yandex.payment.sdk.ui.CardInputView
    public void setSaveCardOnPayment(boolean save) {
        a aVar = this.controller;
        if (aVar == null) {
            aVar = null;
        }
        aVar.r = save;
    }

    public final void setup(CardInputMode mode, CardValidationConfig validationConfig, cp7 cameraCardScanner, rwo eventReporter, boolean enableDebranding, boolean isNoCvnMir, boolean isCardScannerEnabled) {
        this.eventReporter = eventReporter;
        this.cardInputMode = mode;
        a aVar = new a(this.binding, egb1.a(validationConfig), cameraCardScanner, enableDebranding, isNoCvnMir, isCardScannerEnabled);
        this.controller = aVar;
        final int i = 1;
        final qh8 qh8Var = new qh8(eventReporter, mode, i);
        final int i2 = 0;
        aVar.e.setInputEventListener(new tls() { // from class: trf
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                qh8 qh8Var2 = qh8Var;
                czv czvVar = (czv) obj;
                switch (i3) {
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
        aVar.f.setInputEventListener(new tls() { // from class: trf
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                qh8 qh8Var2 = qh8Var;
                czv czvVar = (czv) obj;
                switch (i3) {
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
        aVar.g.setInputEventListener(new tls() { // from class: trf
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i32 = i3;
                zy11 zy11Var = zy11.a;
                qh8 qh8Var2 = qh8Var;
                czv czvVar = (czv) obj;
                switch (i32) {
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
        aVar.q = qh8Var;
        qh8Var.invoke(new wyv(aVar.j, ButtonNameForAnalytics.SCANNER_BUTTON));
    }

    public DKCardInputViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DKCardInputViewImpl(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DKCardInputViewImpl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
