package com.yandex.payment.divkit.bind.view;

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
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.a5f;
import defpackage.azv;
import defpackage.bk;
import defpackage.bzv;
import defpackage.ci8;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.czv;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.hxe;
import defpackage.i891;
import defpackage.iog0;
import defpackage.ipa0;
import defpackage.jby;
import defpackage.kc8;
import defpackage.l9h0;
import defpackage.n891;
import defpackage.ny61;
import defpackage.of8;
import defpackage.ong0;
import defpackage.q501;
import defpackage.qjd;
import defpackage.rp8;
import defpackage.rsf;
import defpackage.sls;
import defpackage.tls;
import defpackage.tyh0;
import defpackage.ulh0;
import defpackage.up8;
import defpackage.wj91;
import defpackage.znb1;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\n2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b-\u0010!J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\fJ\u0019\u00103\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u0010\u0015J\u000f\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u0010\fJ\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\fR\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010CR(\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010B\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u001dR$\u0010I\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010'R\"\u0010K\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010CR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/yandex/payment/divkit/bind/view/DKCvnInput;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "gainFocus", "()V", "Lof8;", "Lkc8;", "cvnValidator", "setValidator", "(Lof8;)V", "", BackendConfig.Restrictions.ENABLED, "setNoCvvMirEnabled", "(Z)V", "Lrp8;", "type", "setCardType", "(Lrp8;)V", "Lkotlin/Function0;", "onCvnFinishEditing", "setCallback", "(Lsls;)V", "Lkotlin/Function1;", "helpCallback", "setHelpCallback", "(Ltls;)V", "", "getCvn", "()Ljava/lang/String;", "reset", "isValid", "()Z", "visibility", "setVisibility", "(I)V", "Lczv;", "listener", "setInputEventListener", "Lup8;", "validate", "()Lup8;", "updateLengthFilter", "shouldShowError", "onFinishEditing", "hideError", "updateVisibility", "Lipa0;", "binding", "Lipa0;", "validator", "Lof8;", "noCvvMirEnabled", "Z", "hintZeroSymbol", "Ljava/lang/String;", "requestedVisibility", CA20Status.STATUS_USER_I, "callback", "Lsls;", "Ltls;", "onKeyboardAction", "getOnKeyboardAction", "()Lsls;", "setOnKeyboardAction", "value", "hasError", "getHasError", "inputEventListener", "cardType", "Lrp8;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKCvnInput extends LinearLayout {
    private final ipa0 binding;
    private sls callback;
    private rp8 cardType;
    private boolean hasError;
    private tls helpCallback;
    private final String hintZeroSymbol;
    private tls inputEventListener;
    private boolean noCvvMirEnabled;
    private sls onKeyboardAction;
    private int requestedVisibility;
    private of8 validator;

    public DKCvnInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ulh0.paymentsdk_dk_cvn_input, this);
        int i2 = l9h0.cvn_help_button;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = l9h0.cvn_input_label;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = l9h0.cvn_input_text;
                EditText editText = (EditText) cma1.O(i2, this);
                if (editText != null) {
                    this.binding = new ipa0(this, appCompatImageView, textView, editText);
                    this.hintZeroSymbol = getResources().getString(tyh0.paymentsdk_prebuilt_card_cvn_hint_zero_sym);
                    this.requestedVisibility = getVisibility();
                    this.callback = new hxe(29);
                    this.helpCallback = new a5f(25);
                    this.onKeyboardAction = new rsf(0);
                    this.inputEventListener = new a5f(26);
                    this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                    setOrientation(1);
                    setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.divkit.bind.view.DKCvnInput$special$$inlined$doAfterTextChanged$1
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable s) {
                            tls tlsVar;
                            ipa0 ipa0Var;
                            ipa0 ipa0Var2;
                            tlsVar = DKCvnInput.this.inputEventListener;
                            tlsVar.invoke(new bzv(TextFieldNameForAnalytics.CVN));
                            DKCvnInput.this.onFinishEditing(false);
                            boolean o = n891.o(s != null ? Boolean.valueOf(!evu0.J(s)) : null);
                            DKCvnInput dKCvnInput = DKCvnInput.this;
                            if (o) {
                                ipa0Var2 = dKCvnInput.binding;
                                ipa0Var2.c.setHint("");
                            } else {
                                ipa0Var = dKCvnInput.binding;
                                ipa0Var.c.setHint(tyh0.paymentsdk_prebuilt_card_cvn_hint);
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence text, int start, int before, int count) {
                        }
                    });
                    editText.setOnFocusChangeListener(new bk(13, this));
                    editText.setOnEditorActionListener(new ff2(9, this));
                    appCompatImageView.setOnClickListener(new ci8(22, this));
                    updateLengthFilter();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DKCvnInput dKCvnInput, View view, boolean z) {
        dKCvnInput.inputEventListener.invoke(new azv(z, TextFieldNameForAnalytics.CVN));
        if (z) {
            return;
        }
        onFinishEditing$default(dKCvnInput, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(DKCvnInput dKCvnInput, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        dKCvnInput.onKeyboardAction.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(DKCvnInput dKCvnInput, View view) {
        dKCvnInput.helpCallback.invoke(Integer.valueOf(dKCvnInput.cardType.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 helpCallback$lambda$0(int i) {
        return zy11.a;
    }

    private final void hideError() {
        this.binding.b.setTextColor(i891.i(getContext().getTheme(), ong0.paymentsdk_prebuilt_divkitInputTitleTextColor));
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
                this.binding.b.setTextColor(i891.i(getContext().getTheme(), iog0.colorError));
            }
        } else if (validate == null) {
            hideError();
        }
        this.callback.invoke();
    }

    public static /* synthetic */ void onFinishEditing$default(DKCvnInput dKCvnInput, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        dKCvnInput.onFinishEditing(z);
    }

    private final void updateLengthFilter() {
        this.binding.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.cardType.d)});
    }

    private final void updateVisibility() {
        if (this.cardType.d == 0) {
            super.setVisibility(8);
        }
    }

    private final up8 validate() {
        kc8 kc8Var = new kc8(getCvn());
        of8 of8Var = this.validator;
        if (of8Var == null) {
            of8Var = null;
        }
        qjd a = of8Var.a();
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        boolean z = this.noCvvMirEnabled;
        ArrayList arrayList = rp8.f;
        a.c(new jby(q501.r(cardPaymentSystem, z).d));
        return a.b(kc8Var);
    }

    public final void gainFocus() {
        requestFocus();
        wj91.c(this.binding.c);
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

    public final void setHelpCallback(tls helpCallback) {
        this.helpCallback = helpCallback;
    }

    public final void setInputEventListener(tls listener) {
        this.inputEventListener = listener;
    }

    public final void setNoCvvMirEnabled(boolean enabled) {
        this.noCvvMirEnabled = enabled;
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

    public DKCvnInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DKCvnInput(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DKCvnInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
