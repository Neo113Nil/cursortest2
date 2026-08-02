package com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.kh91;
import defpackage.m9h0;
import defpackage.mpg0;
import defpackage.ny61;
import defpackage.vlh0;
import defpackage.wuj0;
import defpackage.zar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010\u000fR\u001a\u0010)\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00101\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\"R$\u00104\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b2\u0010/\"\u0004\b3\u0010\"¨\u00065"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/CardNumberInputView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "isLocked", "Lzy11;", "setLocked$flex_impl_18_1_0_release", "(Z)V", "setLocked", "showKeyboard", "gainFocus$flex_impl_18_1_0_release", "gainFocus", "image", "updateCardTypeView$flex_impl_18_1_0_release", "(I)V", "updateCardTypeView", "moveCursor$flex_impl_18_1_0_release", "()V", "moveCursor", "isLightTheme", "showError$flex_impl_18_1_0_release", "(Z)Z", "showError", "", "text", "setCardNumberIfNew$flex_impl_18_1_0_release", "(Ljava/lang/String;)V", "setCardNumberIfNew", "hideError$flex_impl_18_1_0_release", "hideError", "initTextColor$flex_impl_18_1_0_release", "initTextColor", "Lzar;", "binding", "Lzar;", "getBinding$flex_impl_18_1_0_release", "()Lzar;", "value", "getTextFieldValue", "()Ljava/lang/String;", "setTextFieldValue", "textFieldValue", "getTextFieldValueMasked$flex_impl_18_1_0_release", "setTextFieldValueMasked$flex_impl_18_1_0_release", "textFieldValueMasked", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardNumberInputView extends LinearLayout {
    private final zar binding;

    public CardNumberInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(vlh0.finsdk_view_card_number_input, this);
        int i3 = m9h0.finsdkPanInputLabel;
        TextView textView = (TextView) cma1.O(i3, this);
        if (textView != null) {
            i3 = m9h0.finsdkPanInputText;
            EditText editText = (EditText) cma1.O(i3, this);
            if (editText != null) {
                i3 = m9h0.finsdkPanInputTextHint;
                TextView textView2 = (TextView) cma1.O(i3, this);
                if (textView2 != null) {
                    i3 = m9h0.finsdkPanInputTextMasked;
                    EditText editText2 = (EditText) cma1.O(i3, this);
                    if (editText2 != null) {
                        final zar zarVar = new zar(this, textView, editText, textView2, editText2);
                        this.binding = zarVar;
                        setOrientation(1);
                        setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                        textView2.setVisibility(editText.getText().length() == 0 ? 0 : 8);
                        editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CardNumberInputView$_init_$lambda$0$$inlined$doAfterTextChanged$1
                            @Override // android.text.TextWatcher
                            public void afterTextChanged(Editable s) {
                                zar.this.d.setVisibility((s == null || s.length() == 0) ? 0 : 8);
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
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    public static /* synthetic */ void gainFocus$flex_impl_18_1_0_release$default(CardNumberInputView cardNumberInputView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cardNumberInputView.gainFocus$flex_impl_18_1_0_release(z);
    }

    private final String getTextFieldValue() {
        return this.binding.c.getText().toString();
    }

    private final void setTextFieldValue(String str) {
        this.binding.c.setText(str);
    }

    public final void gainFocus$flex_impl_18_1_0_release(boolean showKeyboard) {
        EditText editText = this.binding.c;
        if (showKeyboard) {
            editText.requestFocus();
            editText.post(new ce0(editText, 13));
        }
    }

    /* renamed from: getBinding$flex_impl_18_1_0_release, reason: from getter */
    public final zar getBinding() {
        return this.binding;
    }

    public final String getTextFieldValueMasked$flex_impl_18_1_0_release() {
        String str;
        Editable text = this.binding.e.getText();
        if (text != null) {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char charAt = text.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final void hideError$flex_impl_18_1_0_release(boolean isLightTheme) {
        TextView textView = this.binding.b;
        Resources resources = getResources();
        int i = isLightTheme ? mpg0.finsdk_text_secondary : mpg0.finsdk_text_secondary_dark;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
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
        this.binding.e.setHintTextColor(getResources().getColor(isLightTheme ? mpg0.finsdk_text_tertiary : mpg0.finsdk_text_tertiary_dark, getContext().getTheme()));
        this.binding.e.setTextColor(getResources().getColor(isLightTheme ? mpg0.finsdk_text_primary : mpg0.finsdk_text_primary_dark, getContext().getTheme()));
    }

    public final void moveCursor$flex_impl_18_1_0_release() {
        EditText editText = this.binding.c;
        Editable text = editText.getText();
        if (text != null) {
            editText.setSelection(text.length());
        }
    }

    public final void setCardNumberIfNew$flex_impl_18_1_0_release(String text) {
        if (cvu0.v(this.binding.c.getText().toString(), " ", "", false).equals(text)) {
            return;
        }
        this.binding.c.setText(text);
    }

    public final void setLocked$flex_impl_18_1_0_release(boolean isLocked) {
        zar zarVar = this.binding;
        TextView textView = zarVar.b;
        kh91.c(textView, isLocked);
        textView.setClickable(false);
        kh91.c(zarVar.c, isLocked);
        kh91.c(zarVar.e, isLocked);
    }

    public final void setTextFieldValueMasked$flex_impl_18_1_0_release(String str) {
        this.binding.e.setText(str);
    }

    public final boolean showError$flex_impl_18_1_0_release(boolean isLightTheme) {
        hideError$flex_impl_18_1_0_release(isLightTheme);
        boolean z = !evu0.J(getTextFieldValue());
        TextView textView = this.binding.b;
        Resources resources = getResources();
        int i = mpg0.finsdk_text_negative;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
        return z;
    }

    public final void updateCardTypeView$flex_impl_18_1_0_release(int image) {
        this.binding.c.setCompoundDrawablesRelativeWithIntrinsicBounds(image, 0, 0, 0);
        this.binding.e.setCompoundDrawablesRelativeWithIntrinsicBounds(image, 0, 0, 0);
    }

    public CardNumberInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CardNumberInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CardNumberInputView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ CardNumberInputView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
