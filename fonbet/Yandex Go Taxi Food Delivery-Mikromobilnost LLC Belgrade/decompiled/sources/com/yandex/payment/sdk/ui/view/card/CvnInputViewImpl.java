package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.CvnInputView;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import defpackage.asw;
import defpackage.bk;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.j8h;
import defpackage.jby;
import defpackage.kc8;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.q501;
import defpackage.qjd;
import defpackage.r891;
import defpackage.rp8;
import defpackage.tls;
import defpackage.tyh0;
import defpackage.up8;
import defpackage.vv90;
import defpackage.xlh0;
import defpackage.xoa0;
import defpackage.yv90;
import defpackage.znb1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00102\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00102\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00102R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/card/CvnInputViewImpl;", "Lcom/yandex/payment/sdk/ui/CvnInputView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getCvn", "()Ljava/lang/String;", "Lup8;", "validate", "()Lup8;", "Lzy11;", "updateLengthFilter", "()V", "", "shouldShowError", "onFinishEditing", "(Z)V", "Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "system", "setCardPaymentSystem", "(Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;)V", "Lvv90;", "api", "setPaymentApi", "(Lvv90;)V", "provideCvn", "focusInput", "reset", "isReady", "()Z", "Lkotlin/Function1;", "listener", "setOnReadyListener", "(Ltls;)V", "setOnCvnInputFocusChangeListener", "Lxoa0;", "binding", "Lxoa0;", "Lj8h;", "validator", "Lj8h;", "Lrp8;", "cardType", "Lrp8;", "Ltls;", "Lasw;", "paymentApi", "Lasw;", "readyToProvide", "Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CvnInputViewImpl extends CvnInputView {
    private final xoa0 binding;
    private rp8 cardType;
    private tls listener;
    private asw paymentApi;
    private boolean readyToProvide;
    private tls setOnCvnInputFocusChangeListener;
    private j8h validator;

    public CvnInputViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_cvn_input_view_impl, this);
        int i2 = o9h0.paymentsdk_prebuilt_cvn_field;
        if (((TextInputEditText) cma1.O(i2, this)) != null) {
            i2 = o9h0.paymentsdk_prebuilt_cvn_layout;
            TextInputLayout textInputLayout = (TextInputLayout) cma1.O(i2, this);
            if (textInputLayout != null) {
                this.binding = new xoa0(this, textInputLayout);
                this.validator = new j8h();
                this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                EditText editText = textInputLayout.getEditText();
                if (editText != null) {
                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl$special$$inlined$doAfterTextChanged$1
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable s) {
                            CvnInputViewImpl.this.onFinishEditing(false);
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence text, int start, int before, int count) {
                        }
                    });
                }
                EditText editText2 = textInputLayout.getEditText();
                if (editText2 != null) {
                    editText2.setOnFocusChangeListener(new bk(10, this));
                }
                updateLengthFilter();
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CvnInputViewImpl cvnInputViewImpl, View view, boolean z) {
        tls tlsVar = cvnInputViewImpl.setOnCvnInputFocusChangeListener;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(z));
        }
        if (z) {
            return;
        }
        onFinishEditing$default(cvnInputViewImpl, false, 1, null);
    }

    private final String getCvn() {
        String str;
        Editable text;
        EditText editText = this.binding.b.getEditText();
        if (editText == null || (text = editText.getText()) == null) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char charAt = text.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishEditing(boolean shouldShowError) {
        this.binding.b.setErrorEnabled(false);
        this.binding.b.setError(null);
        up8 validate = validate();
        if (shouldShowError && validate != null && !evu0.J(getCvn())) {
            this.binding.b.setErrorEnabled(true);
            TextInputLayout textInputLayout = this.binding.b;
            String str = validate.a;
            if (str == null) {
                str = getResources().getString(tyh0.paymentsdk_prebuilt_wrong_cvv_message);
            }
            textInputLayout.setError(str);
        }
        boolean z = validate == null;
        if (this.readyToProvide != z) {
            this.readyToProvide = z;
            tls tlsVar = this.listener;
            if (tlsVar != null) {
                tlsVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    public static /* synthetic */ void onFinishEditing$default(CvnInputViewImpl cvnInputViewImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cvnInputViewImpl.onFinishEditing(z);
    }

    private final void updateLengthFilter() {
        InputFilter.LengthFilter[] lengthFilterArr = {new InputFilter.LengthFilter(this.cardType.d)};
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.setFilters(lengthFilterArr);
        }
    }

    private final up8 validate() {
        kc8 kc8Var = new kc8(getCvn());
        qjd a = this.validator.a();
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        ArrayList arrayList = rp8.f;
        a.c(new jby(q501.r(cardPaymentSystem, false).d));
        return a.b(kc8Var);
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView
    public void focusInput() {
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.requestFocus();
            editText.post(new ce0(editText, 22));
        }
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView
    /* renamed from: isReady, reason: from getter */
    public boolean getReadyToProvide() {
        return this.readyToProvide;
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView, defpackage.rnf
    public void provideCvn() {
        asw aswVar = this.paymentApi;
        if (aswVar != null) {
            ((yv90) aswVar).h(getCvn());
        }
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView
    public void reset() {
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.setText((CharSequence) null);
        }
        this.binding.b.setErrorEnabled(false);
        this.binding.b.setError(null);
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView
    public void setCardPaymentSystem(com.yandex.payment.sdk.core.data.CardPaymentSystem system) {
        ArrayList arrayList = rp8.f;
        this.cardType = q501.r(znb1.j(system), false);
        updateLengthFilter();
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView
    public void setOnCvnInputFocusChangeListener(tls listener) {
        this.setOnCvnInputFocusChangeListener = listener;
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView
    public void setOnReadyListener(tls listener) {
        this.listener = listener;
    }

    @Override // com.yandex.payment.sdk.ui.CvnInputView, defpackage.rnf
    public void setPaymentApi(vv90 api) {
        this.paymentApi = api != null ? r891.c(api) : null;
    }

    public CvnInputViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CvnInputViewImpl(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CvnInputViewImpl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
