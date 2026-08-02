package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.core.data.PersonalInfo;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.gv40;
import defpackage.hqa0;
import defpackage.j9h0;
import defpackage.jl8;
import defpackage.ny61;
import defpackage.of8;
import defpackage.rlh0;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.tls;
import defpackage.up8;
import defpackage.vp8;
import defpackage.z4b0;
import defpackage.zvr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/PersonalInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "shouldShowError", "Lzy11;", "onPhoneFinishEditing", "(Z)V", "Lcom/yandex/payment/sdk/core/data/PersonalInfo;", "getPersonalInfo", "()Lcom/yandex/payment/sdk/core/data/PersonalInfo;", "Lcom/yandex/payment/sdk/model/data/PersonalInfoVisibility;", "visibility", "setPersonalInfoVisibility", "(Lcom/yandex/payment/sdk/model/data/PersonalInfoVisibility;)V", "info", "setPersonalInfo", "(Lcom/yandex/payment/sdk/core/data/PersonalInfo;)V", "Lkotlin/Function0;", "onFinishEditing", "setCallback", "(Lsls;)V", "Lkotlin/Function1;", "onEmailFocusChanged", "(Ltls;)V", "Lvp8;", "validators", "setValidators", "(Lvp8;)V", "Lhqa0;", "binding", "Lhqa0;", "Lof8;", "Ljl8;", "phoneValidator", "Lof8;", "Lcom/yandex/payment/sdk/ui/view/EmailView;", "emailView", "Lcom/yandex/payment/sdk/ui/view/EmailView;", "getEmailView", "()Lcom/yandex/payment/sdk/ui/view/EmailView;", "callback", "Lsls;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersonalInfoView extends ConstraintLayout {
    private final hqa0 binding;
    private sls callback;
    private final EmailView emailView;
    private of8 phoneValidator;

    public PersonalInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(rlh0.paymentsdk_view_personal_info, this);
        int i2 = j9h0.email_view;
        EmailView emailView = (EmailView) cma1.O(i2, this);
        if (emailView != null) {
            i2 = j9h0.first_name;
            TextInputEditText textInputEditText = (TextInputEditText) cma1.O(i2, this);
            if (textInputEditText != null) {
                i2 = j9h0.first_name_layout;
                TextInputLayout textInputLayout = (TextInputLayout) cma1.O(i2, this);
                if (textInputLayout != null) {
                    i2 = j9h0.last_name;
                    TextInputEditText textInputEditText2 = (TextInputEditText) cma1.O(i2, this);
                    if (textInputEditText2 != null) {
                        i2 = j9h0.last_name_layout;
                        TextInputLayout textInputLayout2 = (TextInputLayout) cma1.O(i2, this);
                        if (textInputLayout2 != null) {
                            i2 = j9h0.phone;
                            TextInputEditText textInputEditText3 = (TextInputEditText) cma1.O(i2, this);
                            if (textInputEditText3 != null) {
                                i2 = j9h0.phone_layout;
                                TextInputLayout textInputLayout3 = (TextInputLayout) cma1.O(i2, this);
                                if (textInputLayout3 != null) {
                                    this.binding = new hqa0(this, emailView, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, textInputEditText3, textInputLayout3);
                                    this.emailView = emailView;
                                    final int i3 = 0;
                                    this.callback = new z4b0(i3);
                                    EditText editText = textInputLayout.getEditText();
                                    if (editText != null) {
                                        editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.PersonalInfoView$special$$inlined$doAfterTextChanged$1
                                            @Override // android.text.TextWatcher
                                            public void afterTextChanged(Editable s) {
                                                sls slsVar;
                                                slsVar = PersonalInfoView.this.callback;
                                                slsVar.invoke();
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
                                        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a5b0
                                            public final /* synthetic */ PersonalInfoView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                int i4 = i3;
                                                PersonalInfoView personalInfoView = this.b;
                                                switch (i4) {
                                                    case 0:
                                                        PersonalInfoView._init_$lambda$1(personalInfoView, view, z);
                                                        break;
                                                    case 1:
                                                        PersonalInfoView._init_$lambda$3(personalInfoView, view, z);
                                                        break;
                                                    default:
                                                        PersonalInfoView._init_$lambda$5(personalInfoView, view, z);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    EditText editText3 = textInputLayout2.getEditText();
                                    if (editText3 != null) {
                                        editText3.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.PersonalInfoView$special$$inlined$doAfterTextChanged$2
                                            @Override // android.text.TextWatcher
                                            public void afterTextChanged(Editable s) {
                                                sls slsVar;
                                                slsVar = PersonalInfoView.this.callback;
                                                slsVar.invoke();
                                            }

                                            @Override // android.text.TextWatcher
                                            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                                            }

                                            @Override // android.text.TextWatcher
                                            public void onTextChanged(CharSequence text, int start, int before, int count) {
                                            }
                                        });
                                    }
                                    EditText editText4 = textInputLayout2.getEditText();
                                    if (editText4 != null) {
                                        final int i4 = 1;
                                        editText4.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a5b0
                                            public final /* synthetic */ PersonalInfoView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                int i42 = i4;
                                                PersonalInfoView personalInfoView = this.b;
                                                switch (i42) {
                                                    case 0:
                                                        PersonalInfoView._init_$lambda$1(personalInfoView, view, z);
                                                        break;
                                                    case 1:
                                                        PersonalInfoView._init_$lambda$3(personalInfoView, view, z);
                                                        break;
                                                    default:
                                                        PersonalInfoView._init_$lambda$5(personalInfoView, view, z);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    EditText editText5 = textInputLayout3.getEditText();
                                    if (editText5 != null) {
                                        editText5.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.PersonalInfoView$special$$inlined$doAfterTextChanged$3
                                            @Override // android.text.TextWatcher
                                            public void afterTextChanged(Editable s) {
                                                PersonalInfoView.this.onPhoneFinishEditing(false);
                                            }

                                            @Override // android.text.TextWatcher
                                            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                                            }

                                            @Override // android.text.TextWatcher
                                            public void onTextChanged(CharSequence text, int start, int before, int count) {
                                            }
                                        });
                                    }
                                    EditText editText6 = textInputLayout3.getEditText();
                                    if (editText6 != null) {
                                        final int i5 = 2;
                                        editText6.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a5b0
                                            public final /* synthetic */ PersonalInfoView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                int i42 = i5;
                                                PersonalInfoView personalInfoView = this.b;
                                                switch (i42) {
                                                    case 0:
                                                        PersonalInfoView._init_$lambda$1(personalInfoView, view, z);
                                                        break;
                                                    case 1:
                                                        PersonalInfoView._init_$lambda$3(personalInfoView, view, z);
                                                        break;
                                                    default:
                                                        PersonalInfoView._init_$lambda$5(personalInfoView, view, z);
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
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
    public static final void _init_$lambda$1(PersonalInfoView personalInfoView, View view, boolean z) {
        if (z) {
            return;
        }
        personalInfoView.callback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(PersonalInfoView personalInfoView, View view, boolean z) {
        if (z) {
            return;
        }
        personalInfoView.callback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(PersonalInfoView personalInfoView, View view, boolean z) {
        if (z) {
            return;
        }
        onPhoneFinishEditing$default(personalInfoView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onEmailFocusChanged$lambda$0(tls tlsVar, boolean z) {
        tlsVar.invoke(Boolean.valueOf(z));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPhoneFinishEditing(boolean shouldShowError) {
        Editable text;
        this.binding.h.setErrorEnabled(false);
        this.binding.h.setError(null);
        EditText editText = this.binding.h.getEditText();
        String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        if (!evu0.J(obj)) {
            of8 of8Var = this.phoneValidator;
            up8 b = (of8Var != null ? of8Var : null).b(new jl8(obj));
            if (b != null && shouldShowError) {
                this.binding.h.setErrorEnabled(true);
                TextInputLayout textInputLayout = this.binding.h;
                String str = b.a;
                if (str == null) {
                    str = getResources().getString(ryh0.paymentsdk_phone_error);
                }
                textInputLayout.setError(str);
            }
        }
        this.callback.invoke();
    }

    public static /* synthetic */ void onPhoneFinishEditing$default(PersonalInfoView personalInfoView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        personalInfoView.onPhoneFinishEditing(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setCallback$lambda$0(sls slsVar) {
        slsVar.invoke();
        return zy11.a;
    }

    public final EmailView getEmailView() {
        return this.emailView;
    }

    public final PersonalInfo getPersonalInfo() {
        Editable text = this.binding.c.getText();
        String obj = text != null ? text.toString() : null;
        Editable text2 = this.binding.e.getText();
        String obj2 = text2 != null ? text2.toString() : null;
        Editable text3 = this.binding.g.getText();
        return new PersonalInfo(obj, obj2, text3 != null ? text3.toString() : null, this.emailView.getEmail());
    }

    public final void onEmailFocusChanged(tls onEmailFocusChanged) {
        this.binding.b.setOnFocusChanged(new gv40(9, onEmailFocusChanged));
    }

    public final void setCallback(sls onFinishEditing) {
        this.callback = onFinishEditing;
        this.binding.b.setCallback(new zvr(19, onFinishEditing));
    }

    public final void setPersonalInfo(PersonalInfo info) {
        this.binding.c.setText(info.getFirstName());
        this.binding.e.setText(info.getLastName());
        this.binding.g.setText(info.getPhone());
        this.emailView.setEmail(info.getEmail());
    }

    public final void setPersonalInfoVisibility(PersonalInfoVisibility visibility) {
        this.binding.d.setVisibility(visibility.shouldShowName() ? 0 : 8);
        this.binding.f.setVisibility(visibility.shouldShowName() ? 0 : 8);
        this.binding.h.setVisibility(visibility.shouldShowPhone() ? 0 : 8);
        this.binding.b.setVisibility(visibility.shouldShowEmail() ? 0 : 8);
    }

    public final void setValidators(vp8 validators) {
        this.binding.b.setValidator(validators.d);
        this.phoneValidator = validators.e;
    }

    public PersonalInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PersonalInfoView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PersonalInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
