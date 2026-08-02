package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.brg0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.ebr;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.kyp0;
import defpackage.ny61;
import defpackage.omh0;
import defpackage.th91;
import defpackage.tls;
import defpackage.ugh0;
import defpackage.vxh0;
import defpackage.wuj0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 02\u00020\u0001:\u00011B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R2\u0010%\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010/\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u001d¨\u00062"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/SecretCodeInputView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "codeType", "", "customLabel", "Lzy11;", "setSecurityCodeType", "(ILjava/lang/String;)V", "", "isLocked", "setLocked", "(Z)V", "gainFocus", "()V", "updateLengthFilter", "showError", "()Z", "hideError", "text", "setTextIfNew$features_bdui_release", "(Ljava/lang/String;)V", "setTextIfNew", "Lebr;", "binding", "Lebr;", "getBinding", "()Lebr;", "Lkotlin/Function1;", "onError", "Ltls;", "getOnError", "()Ltls;", "setOnError", "(Ltls;)V", "value", "getTextFieldValue", "()Ljava/lang/String;", "setTextFieldValue", "textFieldValue", "Companion", "kyp0", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SecretCodeInputView extends LinearLayout {
    private static final kyp0 Companion = new kyp0();
    private static final int MAX_CHAR_COUNT = 4;
    private final ebr binding;
    private tls onError;

    public SecretCodeInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(omh0.finsdk_view_secret_code_input, this);
        int i3 = ugh0.finsdkCvvInputLabel;
        TextView textView = (TextView) cma1.O(i3, this);
        if (textView != null) {
            i3 = ugh0.finsdkCvvInputText;
            EditText editText = (EditText) cma1.O(i3, this);
            if (editText != null) {
                i3 = ugh0.finsdkCvvInputTextHint;
                TextView textView2 = (TextView) cma1.O(i3, this);
                if (textView2 != null) {
                    final ebr ebrVar = new ebr(this, textView, editText, textView2);
                    this.binding = ebrVar;
                    setOrientation(1);
                    setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                    textView2.setVisibility(editText.getText().length() == 0 ? 0 : 8);
                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.SecretCodeInputView$_init_$lambda$1$$inlined$doAfterTextChanged$1
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable s) {
                            ebr.this.d.setVisibility((s == null || s.length() == 0) ? 0 : 8);
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence text, int start, int before, int count) {
                        }
                    });
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final String getTextFieldValue() {
        return this.binding.c.getText().toString();
    }

    private final void setTextFieldValue(String str) {
        this.binding.c.setText(str);
    }

    public final void gainFocus() {
        EditText editText = this.binding.c;
        editText.requestFocus();
        editText.post(new ce0(editText, 14));
    }

    public final ebr getBinding() {
        return this.binding;
    }

    public final tls getOnError() {
        return this.onError;
    }

    public final void hideError() {
        TextView textView = this.binding.b;
        Resources resources = getResources();
        int i = brg0.finsdk_text_secondary;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
        tls tlsVar = this.onError;
        if (tlsVar != null) {
            tlsVar.invoke(null);
        }
    }

    public final void setLocked(boolean isLocked) {
        ebr ebrVar = this.binding;
        TextView textView = ebrVar.b;
        th91.g(textView, isLocked);
        textView.setClickable(false);
        th91.g(ebrVar.c, isLocked);
    }

    public final void setOnError(tls tlsVar) {
        this.onError = tlsVar;
    }

    public final void setSecurityCodeType(int codeType, String customLabel) {
        TextView textView = this.binding.b;
        if (customLabel == null) {
            customLabel = getResources().getString(codeType);
        }
        textView.setText(customLabel);
    }

    public final void setTextIfNew$features_bdui_release(String text) {
        if (jl40.l(this.binding.c.getText().toString(), text)) {
            return;
        }
        this.binding.c.setText(text);
    }

    public final boolean showError() {
        hideError();
        boolean z = !evu0.J(getTextFieldValue());
        TextView textView = this.binding.b;
        Resources resources = getResources();
        int i = brg0.finsdk_text_negative;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
        tls tlsVar = this.onError;
        if (tlsVar != null) {
            tlsVar.invoke(getResources().getString(vxh0.finsdk_wrong_cvv));
        }
        return z;
    }

    public final void updateLengthFilter() {
        this.binding.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(4)});
    }

    public SecretCodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SecretCodeInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ SecretCodeInputView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public SecretCodeInputView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
