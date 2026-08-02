package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.azv;
import defpackage.bk;
import defpackage.bqa0;
import defpackage.bzv;
import defpackage.cma1;
import defpackage.czv;
import defpackage.evu0;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.kby;
import defpackage.ny61;
import defpackage.of8;
import defpackage.pk8;
import defpackage.q501;
import defpackage.qjd;
import defpackage.rlh0;
import defpackage.rp8;
import defpackage.ryh0;
import defpackage.sd8;
import defpackage.sfb1;
import defpackage.tfb1;
import defpackage.tls;
import defpackage.up8;
import defpackage.yyv;
import defpackage.znb1;
import defpackage.zy11;
import defpackage.zyv;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ!\u0010\u001f\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R(\u00106\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/CardNumberView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "shouldShowError", "Lzy11;", "onFinishEditing", "(Z)V", "updateCardType", "()V", "Lof8;", "Lpk8;", "cardNumberValidator", "setValidator", "(Lof8;)V", "Lkotlin/Function1;", "", "onCardNumberFinishEditing", "setCallback", "(Ltls;)V", "Lrp8;", "listener", "setOnCardTypeChangedListener", "Landroid/text/Editable;", "addOnTextChangedListener", "getCardNumber", "()Ljava/lang/String;", "Lup8;", "validate", "()Lup8;", "isValid", "()Z", "Lczv;", "setInputEventListener", "Lbqa0;", "binding", "Lbqa0;", "validator", "Lof8;", "callback", "Ltls;", "onCardTypeChangedListener", "cardType", "Lrp8;", "inputEventListener", "Landroid/view/View;", "value", "focusableInput", "Landroid/view/View;", "getFocusableInput", "()Landroid/view/View;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardNumberView extends FrameLayout {
    private final bqa0 binding;
    private tls callback;
    private rp8 cardType;
    private View focusableInput;
    private tls inputEventListener;
    private tls onCardTypeChangedListener;
    private of8 validator;

    public CardNumberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(rlh0.paymentsdk_view_card_number, this);
        int i2 = j9h0.field;
        if (((TextInputEditText) cma1.O(i2, this)) != null) {
            i2 = j9h0.layout;
            TextInputLayout textInputLayout = (TextInputLayout) cma1.O(i2, this);
            if (textInputLayout != null) {
                i2 = j9h0.payments_ic_camera;
                if (((ImageView) cma1.O(i2, this)) != null) {
                    this.binding = new bqa0(this, textInputLayout);
                    this.callback = new sd8(15);
                    this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                    this.inputEventListener = new sd8(16);
                    this.focusableInput = textInputLayout.getEditText();
                    EditText editText = textInputLayout.getEditText();
                    if (editText != null) {
                        editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.CardNumberView.1
                            private String current = "";

                            @Override // android.text.TextWatcher
                            public void afterTextChanged(Editable s) {
                                if (jl40.l(s.toString(), this.current)) {
                                    return;
                                }
                                StringBuilder sb = new StringBuilder();
                                int length = s.length();
                                for (int i3 = 0; i3 < length; i3++) {
                                    char charAt = s.charAt(i3);
                                    if (Character.isDigit(charAt)) {
                                        sb.append(charAt);
                                    }
                                }
                                ArrayList arrayList = rp8.f;
                                rp8 s2 = q501.s(sb.toString());
                                if (sb.length() <= ((Number) a.Z(s2.c)).intValue()) {
                                    this.current = tfb1.f(sb.toString(), s2.e);
                                    s.setFilters(new InputFilter[0]);
                                }
                                int length2 = s.length();
                                String str = this.current;
                                s.replace(0, length2, str, 0, str.length());
                                CardNumberView.this.updateCardType();
                                CardNumberView.this.onFinishEditing(false);
                                CardNumberView.this.inputEventListener.invoke(new bzv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }

                            @Override // android.text.TextWatcher
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                            }

                            @Override // android.text.TextWatcher
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                            }
                        });
                    }
                    EditText editText2 = textInputLayout.getEditText();
                    if (editText2 != null) {
                        editText2.setOnFocusChangeListener(new bk(5, this));
                        return;
                    }
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CardNumberView cardNumberView, View view, boolean z) {
        cardNumberView.inputEventListener.invoke(new azv(z, TextFieldNameForAnalytics.CARD_NUMBER));
        if (z) {
            return;
        }
        onFinishEditing$default(cardNumberView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 callback$lambda$0(String str) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 inputEventListener$lambda$0(czv czvVar) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishEditing(boolean shouldShowError) {
        String string;
        this.binding.b.setErrorEnabled(false);
        this.binding.b.setError(null);
        up8 validate = validate();
        String cardNumber = getCardNumber();
        if (validate == null || (string = validate.a) == null) {
            string = getResources().getString(ryh0.paymentsdk_wrong_card_number_message);
        }
        if (shouldShowError && validate != null && !evu0.J(cardNumber)) {
            this.binding.b.setErrorEnabled(true);
            this.binding.b.setError(string);
            this.inputEventListener.invoke(new zyv(string));
        } else if (validate == null) {
            this.inputEventListener.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
        }
        this.callback.invoke(validate == null ? sfb1.d(cardNumber) : "");
    }

    public static /* synthetic */ void onFinishEditing$default(CardNumberView cardNumberView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cardNumberView.onFinishEditing(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCardType() {
        ArrayList arrayList = rp8.f;
        rp8 s = q501.s(getCardNumber());
        if (this.cardType.a != s.a) {
            this.cardType = s;
            tls tlsVar = this.onCardTypeChangedListener;
            if (tlsVar != null) {
                tlsVar.invoke(s);
            }
        }
    }

    public final void addOnTextChangedListener(final tls listener) {
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.CardNumberView$addOnTextChangedListener$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    if (s != null) {
                        tls.this.invoke(s);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
        }
    }

    public final String getCardNumber() {
        Editable text;
        EditText editText = this.binding.b.getEditText();
        if (editText == null || (text = editText.getText()) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char charAt = text.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public final View getFocusableInput() {
        return this.focusableInput;
    }

    public final boolean isValid() {
        return validate() == null;
    }

    public final void setCallback(tls onCardNumberFinishEditing) {
        this.callback = onCardNumberFinishEditing;
    }

    public final void setInputEventListener(tls listener) {
        this.inputEventListener = listener;
    }

    public final void setOnCardTypeChangedListener(tls listener) {
        this.onCardTypeChangedListener = listener;
    }

    public final void setValidator(of8 cardNumberValidator) {
        this.validator = cardNumberValidator;
    }

    public final up8 validate() {
        pk8 pk8Var = new pk8(getCardNumber());
        of8 of8Var = this.validator;
        if (of8Var == null) {
            of8Var = null;
        }
        qjd a = of8Var.a();
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        ArrayList arrayList = rp8.f;
        a.c(new kby(q501.r(cardPaymentSystem, false).c));
        return a.b(pk8Var);
    }

    public CardNumberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CardNumberView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CardNumberView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
