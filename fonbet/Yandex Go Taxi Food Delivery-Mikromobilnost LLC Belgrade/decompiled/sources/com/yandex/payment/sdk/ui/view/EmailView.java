package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.bk;
import defpackage.cma1;
import defpackage.dqa0;
import defpackage.evu0;
import defpackage.fgn;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.of8;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.tls;
import defpackage.up8;
import defpackage.urm;
import defpackage.xe8;
import defpackage.xlh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R.\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/EmailView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "shouldShowError", "Lzy11;", "onFinishEditing", "(Z)V", "Lof8;", "Lxe8;", "emailValidator", "setValidator", "(Lof8;)V", "Lkotlin/Function0;", "onEmailFinishEditing", "setCallback", "(Lsls;)V", "", "email", "setEmail", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "isValid", "()Z", "Ldqa0;", "binding", "Ldqa0;", "validator", "Lof8;", "callback", "Lsls;", "Ljava/lang/String;", "Lkotlin/Function1;", "onFocusChanged", "Ltls;", "getOnFocusChanged", "()Ltls;", "setOnFocusChanged", "(Ltls;)V", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmailView extends LinearLayout {
    private final dqa0 binding;
    private sls callback;
    private String email;
    private tls onFocusChanged;
    private of8 validator;

    public EmailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_view_email, this);
        int i2 = o9h0.field;
        if (((TextInputEditText) cma1.O(i2, this)) != null) {
            i2 = o9h0.hint;
            if (((TextView) cma1.O(i2, this)) != null) {
                i2 = o9h0.layout;
                TextInputLayout textInputLayout = (TextInputLayout) cma1.O(i2, this);
                if (textInputLayout != null) {
                    this.binding = new dqa0(this, textInputLayout);
                    this.callback = new fgn(19);
                    this.onFocusChanged = new urm(26);
                    setOrientation(1);
                    EditText editText = textInputLayout.getEditText();
                    if (editText != null) {
                        editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.EmailView$special$$inlined$doAfterTextChanged$1
                            @Override // android.text.TextWatcher
                            public void afterTextChanged(Editable s) {
                                EmailView.this.onFinishEditing(false);
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
                        editText2.setOnFocusChangeListener(new bk(18, this));
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
    public static final void _init_$lambda$1(EmailView emailView, View view, boolean z) {
        emailView.onFocusChanged.invoke(Boolean.valueOf(z));
        if (z) {
            return;
        }
        onFinishEditing$default(emailView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishEditing(boolean shouldShowError) {
        Editable text;
        this.email = null;
        this.binding.b.setErrorEnabled(false);
        this.binding.b.setError(null);
        EditText editText = this.binding.b.getEditText();
        String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        if (!evu0.J(obj)) {
            of8 of8Var = this.validator;
            up8 b = (of8Var != null ? of8Var : null).b(new xe8(obj));
            if (b == null) {
                this.email = obj;
            } else if (shouldShowError) {
                this.binding.b.setErrorEnabled(true);
                TextInputLayout textInputLayout = this.binding.b;
                String str = b.a;
                if (str == null) {
                    str = getResources().getString(ryh0.paymentsdk_email_error);
                }
                textInputLayout.setError(str);
            }
        }
        this.callback.invoke();
    }

    public static /* synthetic */ void onFinishEditing$default(EmailView emailView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        emailView.onFinishEditing(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onFocusChanged$lambda$0(boolean z) {
        return zy11.a;
    }

    public final String getEmail() {
        return this.email;
    }

    public final tls getOnFocusChanged() {
        return this.onFocusChanged;
    }

    public final boolean isValid() {
        String str = this.email;
        return !(str == null || evu0.J(str));
    }

    public final void setCallback(sls onEmailFinishEditing) {
        this.callback = onEmailFinishEditing;
    }

    public final void setEmail(String email) {
        this.email = email;
        EditText editText = this.binding.b.getEditText();
        if (editText != null) {
            editText.setText(email);
        }
    }

    public final void setOnFocusChanged(tls tlsVar) {
        this.onFocusChanged = tlsVar;
    }

    public final void setValidator(of8 emailValidator) {
        this.validator = emailValidator;
    }

    public EmailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EmailView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EmailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
