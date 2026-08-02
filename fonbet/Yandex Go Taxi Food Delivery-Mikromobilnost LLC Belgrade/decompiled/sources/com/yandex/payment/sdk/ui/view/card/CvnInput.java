package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.a5f;
import defpackage.azv;
import defpackage.bk;
import defpackage.bzv;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.czv;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.hxe;
import defpackage.iog0;
import defpackage.jby;
import defpackage.kc8;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.of8;
import defpackage.ong0;
import defpackage.q501;
import defpackage.qjd;
import defpackage.r891;
import defpackage.rp8;
import defpackage.sls;
import defpackage.tls;
import defpackage.tyh0;
import defpackage.up8;
import defpackage.woa0;
import defpackage.xlh0;
import defpackage.znb1;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\fJ\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010,J!\u00100\u001a\u00020\n2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010<\u001a\u0004\b>\u0010?\"\u0004\b@\u0010 R$\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010)R\"\u0010E\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/card/CvnInput;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateLengthFilter", "()V", "", "shouldShowError", "onFinishEditing", "(Z)V", "hideError", "updateVisibility", "gainFocus", "Lof8;", "Lkc8;", "cvnValidator", "setValidator", "(Lof8;)V", "Lrp8;", "type", "setCardType", "(Lrp8;)V", "Lkotlin/Function0;", "onCvnFinishEditing", "setCallback", "(Lsls;)V", "", "getCvn", "()Ljava/lang/String;", "Lup8;", "validate", "()Lup8;", "reset", "isValid", "()Z", "visibility", "setVisibility", "(I)V", "Lkotlin/Function1;", "Lczv;", "listener", "setInputEventListener", "(Ltls;)V", "Lwoa0;", "binding", "Lwoa0;", "validator", "Lof8;", "hintZeroSymbol", "Ljava/lang/String;", "requestedVisibility", CA20Status.STATUS_USER_I, "callback", "Lsls;", "onKeyboardAction", "getOnKeyboardAction", "()Lsls;", "setOnKeyboardAction", "value", "hasError", "Z", "getHasError", "inputEventListener", "Ltls;", "cardType", "Lrp8;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CvnInput extends LinearLayout {
    private final woa0 binding;
    private sls callback;
    private rp8 cardType;
    private boolean hasError;
    private final String hintZeroSymbol;
    private tls inputEventListener;
    private sls onKeyboardAction;
    private int requestedVisibility;
    private of8 validator;

    public CvnInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_cvn_input, this);
        int i2 = o9h0.paymentsdk_prebuilt_cvn_input_label;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = o9h0.paymentsdk_prebuilt_cvn_input_text;
            EditText editText = (EditText) cma1.O(i2, this);
            if (editText != null) {
                this.binding = new woa0(this, textView, editText);
                this.hintZeroSymbol = getResources().getString(tyh0.paymentsdk_prebuilt_card_cvn_hint_zero_sym);
                this.requestedVisibility = getVisibility();
                this.callback = new hxe(24);
                this.onKeyboardAction = new hxe(25);
                this.inputEventListener = new a5f(15);
                this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                setOrientation(1);
                setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.card.CvnInput$special$$inlined$doAfterTextChanged$1
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s) {
                        tls tlsVar;
                        tlsVar = CvnInput.this.inputEventListener;
                        tlsVar.invoke(new bzv(TextFieldNameForAnalytics.CVN));
                        CvnInput.this.onFinishEditing(false);
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence text, int start, int before, int count) {
                    }
                });
                editText.setOnFocusChangeListener(new bk(9, this));
                editText.setOnEditorActionListener(new ff2(7, this));
                updateLengthFilter();
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CvnInput cvnInput, View view, boolean z) {
        cvnInput.inputEventListener.invoke(new azv(z, TextFieldNameForAnalytics.CVN));
        if (z) {
            return;
        }
        onFinishEditing$default(cvnInput, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(CvnInput cvnInput, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        cvnInput.onKeyboardAction.invoke();
        return true;
    }

    private final void hideError() {
        this.binding.b.setTextColor(r891.f(getContext().getTheme(), ong0.paymentsdk_prebuilt_cardNumberHintColor));
        this.hasError = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 inputEventListener$lambda$0(czv czvVar) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishEditing(boolean shouldShowError) {
        up8 validate = validate();
        if (shouldShowError) {
            if (validate == null || evu0.J(getCvn())) {
                hideError();
            } else {
                this.hasError = true;
                this.binding.b.setTextColor(r891.f(getContext().getTheme(), iog0.colorError));
            }
        } else if (validate == null) {
            hideError();
        }
        this.callback.invoke();
    }

    public static /* synthetic */ void onFinishEditing$default(CvnInput cvnInput, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cvnInput.onFinishEditing(z);
    }

    private final void updateLengthFilter() {
        this.binding.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.cardType.d)});
    }

    private final void updateVisibility() {
        if (this.cardType.d == 0) {
            super.setVisibility(8);
        }
    }

    public final void gainFocus() {
        requestFocus();
        EditText editText = this.binding.c;
        editText.requestFocus();
        editText.post(new ce0(editText, 22));
    }

    public final String getCvn() {
        Editable text = this.binding.c.getText();
        if (text == null) {
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

    public final boolean getHasError() {
        return this.hasError;
    }

    public final sls getOnKeyboardAction() {
        return this.onKeyboardAction;
    }

    public final boolean isValid() {
        return validate() == null;
    }

    public final void reset() {
        this.binding.c.setText((CharSequence) null);
    }

    public final void setCallback(sls onCvnFinishEditing) {
        this.callback = onCvnFinishEditing;
    }

    public final void setCardType(rp8 type) {
        this.cardType = type;
        this.binding.c.setHint(cvu0.u(type.d, this.hintZeroSymbol));
        updateLengthFilter();
        updateVisibility();
    }

    public final void setInputEventListener(tls listener) {
        this.inputEventListener = listener;
    }

    public final void setOnKeyboardAction(sls slsVar) {
        this.onKeyboardAction = slsVar;
    }

    public final void setValidator(of8 cvnValidator) {
        this.validator = cvnValidator;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        this.requestedVisibility = visibility;
        updateVisibility();
    }

    public final up8 validate() {
        kc8 kc8Var = new kc8(getCvn());
        of8 of8Var = this.validator;
        if (of8Var == null) {
            of8Var = null;
        }
        qjd a = of8Var.a();
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        ArrayList arrayList = rp8.f;
        a.c(new jby(q501.r(cardPaymentSystem, false).d));
        return a.b(kc8Var);
    }

    public CvnInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CvnInput(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CvnInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
