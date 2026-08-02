package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.brg0;
import defpackage.cbr;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.omh0;
import defpackage.rcc;
import defpackage.th91;
import defpackage.ugh0;
import defpackage.uqg;
import defpackage.wuj0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001&B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00168B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0019¨\u0006'"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/DateExpiredInputView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "isLocked", "Lzy11;", "setLocked", "(Z)V", "showError", "()Z", "hideError", "()V", "gainFocus", "setInputFilters", "", "text", "setTextIfNew$features_bdui_release", "(Ljava/lang/String;)V", "setTextIfNew", "Lcbr;", "binding", "Lcbr;", "getBinding", "()Lcbr;", "value", "getTextFieldValue", "()Ljava/lang/String;", "setTextFieldValue", "textFieldValue", "Companion", "uqg", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DateExpiredInputView extends LinearLayout {
    private static final uqg Companion = new uqg();

    @Deprecated
    public static final int MAX_CHAR_COUNT = 4;
    private final cbr binding;

    public DateExpiredInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(omh0.finsdk_view_date_expired_input, this);
        int i3 = ugh0.finsdkExpirationDateInputLabel;
        TextView textView = (TextView) cma1.O(i3, this);
        if (textView != null) {
            i3 = ugh0.finsdkExpirationDateInputText;
            EditText editText = (EditText) cma1.O(i3, this);
            if (editText != null) {
                i3 = ugh0.finsdkExpirationDateInputTextHint;
                TextView textView2 = (TextView) cma1.O(i3, this);
                if (textView2 != null) {
                    final cbr cbrVar = new cbr(this, textView, editText, textView2);
                    this.binding = cbrVar;
                    setOrientation(1);
                    setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                    textView2.setVisibility(editText.getText().length() == 0 ? 0 : 8);
                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.DateExpiredInputView$_init_$lambda$1$$inlined$doAfterTextChanged$1
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable s) {
                            cbr.this.d.setVisibility((s == null || s.length() == 0) ? 0 : 8);
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
        Editable text = this.binding.c.getText();
        String obj = text != null ? text.toString() : null;
        return obj == null ? "" : obj;
    }

    private final void setTextFieldValue(String str) {
        this.binding.c.setText(str);
    }

    public final void gainFocus() {
        EditText editText = this.binding.c;
        editText.requestFocus();
        editText.post(new ce0(editText, 14));
    }

    public final cbr getBinding() {
        return this.binding;
    }

    public final void hideError() {
        TextView textView = this.binding.b;
        Resources resources = getResources();
        int i = brg0.finsdk_text_secondary;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
    }

    public final void setInputFilters() {
        EditText editText = this.binding.c;
        ListBuilder a = rcc.a();
        a.add(new DigitsKeyListener(Locale.getDefault()));
        a.add(new InputFilter.LengthFilter(4));
        editText.setFilters((InputFilter[]) a.j().toArray(new InputFilter[0]));
    }

    public final void setLocked(boolean isLocked) {
        cbr cbrVar = this.binding;
        TextView textView = cbrVar.b;
        th91.g(textView, isLocked);
        textView.setClickable(false);
        th91.g(cbrVar.c, isLocked);
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
        return z;
    }

    public DateExpiredInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public DateExpiredInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ DateExpiredInputView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public DateExpiredInputView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
