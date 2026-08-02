package com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views;

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
import defpackage.bbr;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.kh91;
import defpackage.m9h0;
import defpackage.mpg0;
import defpackage.nof;
import defpackage.ny61;
import defpackage.syh0;
import defpackage.tls;
import defpackage.vlh0;
import defpackage.wuj0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 22\u00020\u0001:\u00013B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R2\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\f\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u001f¨\u00064"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/CvvInputView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "codeType", "Lzy11;", "setSecurityCodeType", "(I)V", "", "isLocked", "setLocked", "(Z)V", "gainFocus", "()V", "updateLengthFilter", "isLightTheme", "showError", "(Z)Z", "hideError", "initTextColor$flex_impl_18_1_0_release", "initTextColor", "", "text", "setTextIfNew$flex_impl_18_1_0_release", "(Ljava/lang/String;)V", "setTextIfNew", "Lbbr;", "binding", "Lbbr;", "getBinding", "()Lbbr;", "Lkotlin/Function1;", "onError", "Ltls;", "getOnError", "()Ltls;", "setOnError", "(Ltls;)V", "value", "getTextFieldValue", "()Ljava/lang/String;", "setTextFieldValue", "textFieldValue", "Companion", "nof", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CvvInputView extends LinearLayout {
    private static final nof Companion = new nof();
    private static final int MAX_CHAR_COUNT = 4;
    private final bbr binding;
    private tls onError;

    public CvvInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(vlh0.finsdk_view_cvv_input, this);
        int i3 = m9h0.finsdkCvvInputLabel;
        TextView textView = (TextView) cma1.O(i3, this);
        if (textView != null) {
            i3 = m9h0.finsdkCvvInputText;
            EditText editText = (EditText) cma1.O(i3, this);
            if (editText != null) {
                i3 = m9h0.finsdkCvvInputTextHint;
                TextView textView2 = (TextView) cma1.O(i3, this);
                if (textView2 != null) {
                    final bbr bbrVar = new bbr(this, textView, editText, textView2);
                    this.binding = bbrVar;
                    setOrientation(1);
                    setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                    textView2.setVisibility(editText.getText().length() == 0 ? 0 : 8);
                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CvvInputView$_init_$lambda$0$$inlined$doAfterTextChanged$1
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable s) {
                            bbr.this.d.setVisibility((s == null || s.length() == 0) ? 0 : 8);
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
        editText.post(new ce0(editText, 13));
    }

    public final bbr getBinding() {
        return this.binding;
    }

    public final tls getOnError() {
        return this.onError;
    }

    public final void hideError(boolean isLightTheme) {
        TextView textView = this.binding.b;
        Resources resources = getResources();
        int i = isLightTheme ? mpg0.finsdk_text_secondary : mpg0.finsdk_text_secondary_dark;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
        tls tlsVar = this.onError;
        if (tlsVar != null) {
            tlsVar.invoke(null);
        }
    }

    public final void initTextColor$flex_impl_18_1_0_release(boolean isLightTheme) {
        TextView textView = this.binding.d;
        Resources resources = getResources();
        int i = isLightTheme ? mpg0.finsdk_text_tertiary : mpg0.finsdk_text_tertiary_dark;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
        this.binding.c.setHintTextColor(getResources().getColor(isLightTheme ? mpg0.finsdk_text_tertiary : mpg0.finsdk_text_tertiary_dark, getContext().getTheme()));
        this.binding.c.setTextColor(getResources().getColor(isLightTheme ? mpg0.finsdk_text_primary : mpg0.finsdk_text_primary_dark, getContext().getTheme()));
    }

    public final void setLocked(boolean isLocked) {
        bbr bbrVar = this.binding;
        TextView textView = bbrVar.b;
        kh91.c(textView, isLocked);
        textView.setClickable(false);
        kh91.c(bbrVar.c, isLocked);
    }

    public final void setOnError(tls tlsVar) {
        this.onError = tlsVar;
    }

    public final void setSecurityCodeType(int codeType) {
        this.binding.b.setText(getResources().getString(codeType));
    }

    public final void setTextIfNew$flex_impl_18_1_0_release(String text) {
        if (jl40.l(this.binding.c.getText().toString(), text)) {
            return;
        }
        this.binding.c.setText(text);
    }

    public final boolean showError(boolean isLightTheme) {
        hideError(isLightTheme);
        boolean z = !evu0.J(getTextFieldValue());
        TextView textView = this.binding.b;
        Resources resources = getResources();
        int i = mpg0.finsdk_text_negative;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
        tls tlsVar = this.onError;
        if (tlsVar != null) {
            tlsVar.invoke(getResources().getString(syh0.finsdk_wrong_cvv));
        }
        return z;
    }

    public final void updateLengthFilter() {
        this.binding.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(4)});
    }

    public CvvInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CvvInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CvvInputView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ CvvInputView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
