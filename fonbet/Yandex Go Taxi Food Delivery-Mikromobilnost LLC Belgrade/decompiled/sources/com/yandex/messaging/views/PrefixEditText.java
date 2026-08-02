package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.yandex.messaging.views.PrefixEditText;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.evu0;
import defpackage.iog0;
import defpackage.k3i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/views/PrefixEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "Lzy11;", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "selStart", "selEnd", "onSelectionChanged", "(II)V", "getTextEscapePrefix", "()Ljava/lang/CharSequence;", AppSettingsContract$Setting.COLUMN_PREFIX, "Ljava/lang/CharSequence;", "", "prefixSpan", "Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrefixEditText extends AppCompatEditText {
    public static final int $stable = 8;
    private final CharSequence prefix;
    private final Object prefixSpan;

    public PrefixEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.PrefixEditText);
        int color = obtainStyledAttributes.getColor(k3i0.PrefixEditText_prefixColor, getHintTextColors().getDefaultColor());
        CharSequence text = obtainStyledAttributes.getText(k3i0.PrefixEditText_prefix);
        this.prefix = text;
        this.prefixSpan = new ForegroundColorSpan(color);
        obtainStyledAttributes.recycle();
        if (text != null) {
            setFilters(new InputFilter[]{new InputFilter() { // from class: joe0
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                    CharSequence lambda$1$lambda$0;
                    lambda$1$lambda$0 = PrefixEditText.lambda$1$lambda$0(PrefixEditText.this, charSequence, i2, i3, spanned, i4, i5);
                    return lambda$1$lambda$0;
                }
            }});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence lambda$1$lambda$0(PrefixEditText prefixEditText, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i4 > prefixEditText.prefix.length() || charSequence.length() != 0) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }

    public final CharSequence getTextEscapePrefix() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        int length = text.length();
        CharSequence charSequence = this.prefix;
        return evu0.U(0, Math.min(length, charSequence != null ? charSequence.length() : 0), text, "");
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        Editable text = getText();
        int length = text != null ? text.length() : 0;
        CharSequence charSequence = this.prefix;
        int min = Math.min(length, charSequence != null ? charSequence.length() : 0);
        if (selStart < min || selEnd < min) {
            setSelection(Math.max(min, selStart), Math.max(min, selEnd));
        } else {
            super.onSelectionChanged(selStart, selEnd);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        CharSequence charSequence = this.prefix;
        if (charSequence == null || (text != null && evu0.b0(text, charSequence))) {
            super.setText(text, type);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.prefix);
        if (text != null) {
            spannableStringBuilder.append(text);
        }
        spannableStringBuilder.setSpan(this.prefixSpan, 0, this.prefix.length(), 17);
        super.setText(spannableStringBuilder, type);
    }

    public PrefixEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PrefixEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? iog0.editTextStyle : i);
    }

    public PrefixEditText(Context context) {
        this(context, null, 0, 6, null);
    }
}
