package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.azv;
import defpackage.bk;
import defpackage.bzv;
import defpackage.cao;
import defpackage.cma1;
import defpackage.czv;
import defpackage.eqa0;
import defpackage.evu0;
import defpackage.j9h0;
import defpackage.l0o;
import defpackage.ny61;
import defpackage.of8;
import defpackage.rlh0;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.tls;
import defpackage.up8;
import defpackage.yyv;
import defpackage.ze8;
import defpackage.zro;
import defpackage.zy11;
import defpackage.zyv;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 82\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0011J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u0011J\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0\"¢\u0006\u0004\b+\u0010%J\u000f\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/ExpirationDateView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "shouldShowError", "Lzy11;", "onFinishEditing", "(Z)V", "", "getString", "()Ljava/lang/String;", "Landroid/text/Editable;", "editable", "prependLeadingZero", "(Landroid/text/Editable;)V", "addDateSlash", "setInputFilters", "()V", "Lof8;", "Lze8;", "expirationDateValidator", "setValidator", "(Lof8;)V", "Lkotlin/Function0;", "onExpirationDateFinishEditing", "setCallback", "(Lsls;)V", "Lkotlin/Function1;", "listener", "addOnTextChangedListener", "(Ltls;)V", "getExpirationMonth", "getExpirationYear", "isValid", "()Z", "Lczv;", "setInputEventListener", "Lup8;", "validate", "()Lup8;", "Leqa0;", "binding", "Leqa0;", "validator", "Lof8;", "callback", "Lsls;", "inputEventListener", "Ltls;", "Companion", "zro", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExpirationDateView extends FrameLayout {
    public static final zro Companion = new zro();
    public static final int MAX_NUM_CHARS = 4;
    private final eqa0 binding;
    private sls callback;
    private tls inputEventListener;
    private of8 validator;

    public ExpirationDateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(rlh0.paymentsdk_view_expiration_date, this);
        int i2 = j9h0.field;
        if (((TextInputEditText) cma1.O(i2, this)) != null) {
            i2 = j9h0.layout;
            TextInputLayout textInputLayout = (TextInputLayout) cma1.O(i2, this);
            if (textInputLayout != null) {
                this.binding = new eqa0(this, textInputLayout);
                this.callback = new cao(22);
                this.inputEventListener = new l0o(15);
                setInputFilters();
                EditText editText = textInputLayout.getEditText();
                if (editText != null) {
                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.ExpirationDateView.1
                        private boolean mChangeWasAddition;

                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            if (this.mChangeWasAddition) {
                                if (editable.length() == 1 && Character.getNumericValue(editable.charAt(0)) > 1) {
                                    ExpirationDateView.this.prependLeadingZero(editable);
                                }
                                ExpirationDateView.this.inputEventListener.invoke(new bzv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                            }
                            for (SlashSpan slashSpan : (SlashSpan[]) editable.getSpans(0, editable.length(), SlashSpan.class)) {
                                editable.removeSpan(slashSpan);
                            }
                            ExpirationDateView.this.addDateSlash(editable);
                            ExpirationDateView.this.onFinishEditing(false);
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            this.mChangeWasAddition = count > before;
                        }
                    });
                }
                EditText editText2 = textInputLayout.getEditText();
                if (editText2 != null) {
                    editText2.setOnFocusChangeListener(new bk(20, this));
                    return;
                }
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ExpirationDateView expirationDateView, View view, boolean z) {
        expirationDateView.inputEventListener.invoke(new azv(z, TextFieldNameForAnalytics.EXPIRATION_DATE));
        if (z) {
            return;
        }
        onFinishEditing$default(expirationDateView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDateSlash(Editable editable) {
        if (2 <= editable.length()) {
            editable.setSpan(new SlashSpan(), 1, 2, 33);
        }
    }

    private final String getString() {
        Editable text;
        String obj;
        EditText editText = this.binding.b.getEditText();
        return (editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null) ? "" : obj;
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
            string = getResources().getString(ryh0.paymentsdk_wrong_date_message);
        }
        if (shouldShowError && validate != null && !evu0.J(getString())) {
            this.binding.b.setErrorEnabled(true);
            this.binding.b.setError(string);
            this.inputEventListener.invoke(new zyv(string));
        } else if (validate == null) {
            this.inputEventListener.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
        }
        this.callback.invoke();
    }

    public static /* synthetic */ void onFinishEditing$default(ExpirationDateView expirationDateView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        expirationDateView.onFinishEditing(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prependLeadingZero(Editable editable) {
        editable.replace(0, 1, "0").append(editable.charAt(0));
    }

    private final void setInputFilters() {
        InputFilter[] inputFilterArr = {new DigitsKeyListener(), new InputFilter.LengthFilter(4)};
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.setFilters(inputFilterArr);
        }
    }

    public final void addOnTextChangedListener(final tls listener) {
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.ExpirationDateView$addOnTextChangedListener$$inlined$doAfterTextChanged$1
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

    public final String getExpirationMonth() {
        return getString().length() < 2 ? "" : getString().substring(0, 2);
    }

    public final String getExpirationYear() {
        return getString().length() == 4 ? getString().substring(2) : "";
    }

    public final boolean isValid() {
        return validate() == null;
    }

    public final void setCallback(sls onExpirationDateFinishEditing) {
        this.callback = onExpirationDateFinishEditing;
    }

    public final void setInputEventListener(tls listener) {
        this.inputEventListener = listener;
    }

    public final void setValidator(of8 expirationDateValidator) {
        this.validator = expirationDateValidator;
    }

    public final up8 validate() {
        of8 of8Var = this.validator;
        if (of8Var == null) {
            of8Var = null;
        }
        return of8Var.b(new ze8(getExpirationMonth(), getExpirationYear()));
    }

    public ExpirationDateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ExpirationDateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ExpirationDateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
