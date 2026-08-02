package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.payment.sdk.ui.logic.SlashSpan;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.azv;
import defpackage.bk;
import defpackage.bzv;
import defpackage.cao;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.czv;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.iog0;
import defpackage.l0o;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.of8;
import defpackage.ong0;
import defpackage.opa0;
import defpackage.r891;
import defpackage.sls;
import defpackage.tls;
import defpackage.tyh0;
import defpackage.up8;
import defpackage.vro;
import defpackage.xlh0;
import defpackage.ze8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001HB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b&\u0010\u0017J!\u0010)\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\u001aJ\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b2\u0010\fR\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R(\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010A\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010ER\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00109¨\u0006I"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/card/ExpirationDateInput;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "gainFocus", "()V", "reset", "Lof8;", "Lze8;", "expirationDateValidator", "setValidator", "(Lof8;)V", "Lkotlin/Function1;", "", "onExpirationDateFinishEditing", "setCallback", "(Ltls;)V", "", "getExpirationMonth", "()Ljava/lang/String;", "getExpirationYear", "isValid", "()Z", "Lup8;", "validate", "()Lup8;", MetaDataField.DATE_FIELD, "setExternalDate", "(Ljava/lang/String;)V", "Lczv;", "listener", "setInputEventListener", "canMoveFocus", "shouldShowError", "onFinishEditing", "(ZZ)V", "hideError", "getString", "Landroid/text/Editable;", "editable", "prependLeadingZero", "(Landroid/text/Editable;)V", "addDateSlash", "setInputFilters", "Lopa0;", "binding", "Lopa0;", "validator", "Lof8;", "callback", "Ltls;", "Lkotlin/Function0;", "onKeyboardAction", "Lsls;", "getOnKeyboardAction", "()Lsls;", "setOnKeyboardAction", "(Lsls;)V", "hasError", "Z", "getHasError", "setHasError", "(Z)V", "inputEventListener", "Companion", "vro", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExpirationDateInput extends LinearLayout {
    private static final vro Companion = new vro();

    @Deprecated
    public static final int MAX_MONTH_CHARS = 2;

    @Deprecated
    public static final int MAX_NUM_CHARS = 4;

    @Deprecated
    public static final int MAX_YEAR_CHARS = 2;
    private final opa0 binding;
    private tls callback;
    private boolean hasError;
    private tls inputEventListener;
    private sls onKeyboardAction;
    private of8 validator;

    public ExpirationDateInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_expiration_date_input, this);
        int i2 = o9h0.paymentsdk_prebuilt_expiration_date_input_label;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = o9h0.paymentsdk_prebuilt_expiration_date_input_text;
            EditText editText = (EditText) cma1.O(i2, this);
            if (editText != null) {
                this.binding = new opa0(this, textView, editText);
                this.callback = new l0o(13);
                this.onKeyboardAction = new cao(21);
                this.inputEventListener = new l0o(14);
                setOrientation(1);
                setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                setInputFilters();
                editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.card.ExpirationDateInput.1
                    private boolean mChangeWasAddition;

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        int length = editable.length();
                        if (this.mChangeWasAddition) {
                            ExpirationDateInput.this.inputEventListener.invoke(new bzv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                            if (length == 1 && Character.getNumericValue(editable.charAt(0)) > 1) {
                                ExpirationDateInput.this.prependLeadingZero(editable);
                            }
                        }
                        for (SlashSpan slashSpan : (SlashSpan[]) editable.getSpans(0, length, SlashSpan.class)) {
                            editable.removeSpan(slashSpan);
                        }
                        ExpirationDateInput.this.addDateSlash(editable);
                        ExpirationDateInput.this.onFinishEditing(true, length == 4);
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        this.mChangeWasAddition = count > before;
                    }
                });
                editText.setOnFocusChangeListener(new bk(19, this));
                editText.setOnEditorActionListener(new ff2(12, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ExpirationDateInput expirationDateInput, View view, boolean z) {
        expirationDateInput.inputEventListener.invoke(new azv(z, TextFieldNameForAnalytics.EXPIRATION_DATE));
        if (z) {
            return;
        }
        onFinishEditing$default(expirationDateInput, false, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(ExpirationDateInput expirationDateInput, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        expirationDateInput.onKeyboardAction.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDateSlash(Editable editable) {
        if (2 <= editable.length()) {
            editable.setSpan(new SlashSpan(), 1, 2, 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 callback$lambda$0(boolean z) {
        return zy11.a;
    }

    private final String getString() {
        String obj;
        Editable text = this.binding.c.getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
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
    public final void onFinishEditing(boolean canMoveFocus, boolean shouldShowError) {
        up8 validate = validate();
        if (shouldShowError) {
            if (validate == null || evu0.J(getString())) {
                hideError();
            } else {
                String str = validate.a;
                if (str == null) {
                    str = getResources().getString(tyh0.paymentsdk_prebuilt_wrong_date_message);
                }
                announceForAccessibility(str);
                this.binding.b.setTextColor(r891.f(getContext().getTheme(), iog0.colorError));
                this.hasError = true;
            }
        } else if (validate == null) {
            hideError();
        }
        this.callback.invoke(Boolean.valueOf(canMoveFocus));
    }

    public static /* synthetic */ void onFinishEditing$default(ExpirationDateInput expirationDateInput, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        expirationDateInput.onFinishEditing(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prependLeadingZero(Editable editable) {
        editable.replace(0, 1, "0").append(editable.charAt(0));
    }

    private final void setInputFilters() {
        this.binding.c.setFilters(new InputFilter[]{new DigitsKeyListener(), new InputFilter.LengthFilter(4)});
    }

    public final void gainFocus() {
        requestFocus();
        EditText editText = this.binding.c;
        editText.requestFocus();
        editText.post(new ce0(editText, 22));
    }

    public final String getExpirationMonth() {
        String string = getString();
        return string.length() < 2 ? "" : string.substring(0, 2);
    }

    public final String getExpirationYear() {
        String string = getString();
        return string.length() == 4 ? string.substring(2) : "";
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

    public final void setCallback(tls onExpirationDateFinishEditing) {
        this.callback = onExpirationDateFinishEditing;
    }

    public final void setExternalDate(String date) {
        this.binding.c.setText(date);
    }

    public final void setHasError(boolean z) {
        this.hasError = z;
    }

    public final void setInputEventListener(tls listener) {
        this.inputEventListener = listener;
    }

    public final void setOnKeyboardAction(sls slsVar) {
        this.onKeyboardAction = slsVar;
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

    public ExpirationDateInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ExpirationDateInput(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ExpirationDateInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
