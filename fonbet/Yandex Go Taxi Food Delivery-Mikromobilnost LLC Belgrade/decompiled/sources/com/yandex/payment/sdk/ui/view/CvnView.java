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
import defpackage.a5f;
import defpackage.azv;
import defpackage.bk;
import defpackage.bzv;
import defpackage.cma1;
import defpackage.cqa0;
import defpackage.czv;
import defpackage.evu0;
import defpackage.hxe;
import defpackage.j9h0;
import defpackage.jby;
import defpackage.kc8;
import defpackage.ny61;
import defpackage.of8;
import defpackage.q501;
import defpackage.qjd;
import defpackage.rlh0;
import defpackage.rp8;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.tls;
import defpackage.up8;
import defpackage.yyv;
import defpackage.znb1;
import defpackage.zy11;
import defpackage.zyv;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u001b\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\fJ\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0004\b.\u0010#R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/CvnView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateLengthFilter", "()V", "", "shouldShowError", "onFinishEditing", "(Z)V", "updateVisibility", "Lof8;", "Lkc8;", "cvnValidator", "setValidator", "(Lof8;)V", "Lrp8;", "type", "setCardType", "(Lrp8;)V", "Lkotlin/Function0;", "onCvnFinishEditing", "setCallback", "(Lsls;)V", "Lkotlin/Function1;", "Landroid/text/Editable;", "listener", "addOnTextChangedListener", "(Ltls;)V", "", "getCvn", "()Ljava/lang/String;", "Lup8;", "validate", "()Lup8;", "reset", "isValid", "()Z", "Lczv;", "setInputEventListener", "Lcqa0;", "binding", "Lcqa0;", "validator", "Lof8;", "callback", "Lsls;", "cardType", "Lrp8;", "inputEventListener", "Ltls;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CvnView extends FrameLayout {
    private final cqa0 binding;
    private sls callback;
    private rp8 cardType;
    private tls inputEventListener;
    private of8 validator;

    public CvnView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(rlh0.paymentsdk_view_cvn, this);
        int i2 = j9h0.field;
        if (((TextInputEditText) cma1.O(i2, this)) != null) {
            i2 = j9h0.info;
            if (((ImageView) cma1.O(i2, this)) != null) {
                i2 = j9h0.layout;
                TextInputLayout textInputLayout = (TextInputLayout) cma1.O(i2, this);
                if (textInputLayout != null) {
                    this.binding = new cqa0(this, textInputLayout);
                    this.callback = new hxe(26);
                    this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                    this.inputEventListener = new a5f(18);
                    EditText editText = textInputLayout.getEditText();
                    if (editText != null) {
                        editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.CvnView$special$$inlined$doAfterTextChanged$1
                            @Override // android.text.TextWatcher
                            public void afterTextChanged(Editable s) {
                                tls tlsVar;
                                tlsVar = CvnView.this.inputEventListener;
                                tlsVar.invoke(new bzv(TextFieldNameForAnalytics.CVN));
                                CvnView.this.onFinishEditing(false);
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
                        editText2.setOnFocusChangeListener(new bk(11, this));
                    }
                    updateLengthFilter();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CvnView cvnView, View view, boolean z) {
        cvnView.inputEventListener.invoke(new azv(z, TextFieldNameForAnalytics.CVN));
        if (z) {
            return;
        }
        onFinishEditing$default(cvnView, false, 1, null);
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
        if (validate == null || (string = validate.a) == null) {
            string = getResources().getString(ryh0.paymentsdk_wrong_cvv_message);
        }
        if (shouldShowError && validate != null && !evu0.J(getCvn())) {
            this.binding.b.setErrorEnabled(true);
            this.binding.b.setError(string);
            this.inputEventListener.invoke(new zyv(string));
        } else if (validate == null) {
            this.inputEventListener.invoke(new yyv(TextFieldNameForAnalytics.CVN));
        }
        this.callback.invoke();
    }

    public static /* synthetic */ void onFinishEditing$default(CvnView cvnView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cvnView.onFinishEditing(z);
    }

    private final void updateLengthFilter() {
        InputFilter.LengthFilter[] lengthFilterArr = {new InputFilter.LengthFilter(this.cardType.d)};
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.setFilters(lengthFilterArr);
        }
    }

    private final void updateVisibility() {
        setVisibility(this.cardType.d == 0 ? 8 : 0);
    }

    public final void addOnTextChangedListener(final tls listener) {
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.CvnView$addOnTextChangedListener$$inlined$doAfterTextChanged$1
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

    public final String getCvn() {
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

    public final boolean isValid() {
        return validate() == null;
    }

    public final void reset() {
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.setText((CharSequence) null);
        }
        this.binding.b.setErrorEnabled(false);
        this.binding.b.setError(null);
    }

    public final void setCallback(sls onCvnFinishEditing) {
        this.callback = onCvnFinishEditing;
    }

    public final void setCardType(rp8 type) {
        this.cardType = type;
        updateLengthFilter();
        updateVisibility();
    }

    public final void setInputEventListener(tls listener) {
        this.inputEventListener = listener;
    }

    public final void setValidator(of8 cvnValidator) {
        this.validator = cvnValidator;
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

    public CvnView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CvnView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CvnView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
