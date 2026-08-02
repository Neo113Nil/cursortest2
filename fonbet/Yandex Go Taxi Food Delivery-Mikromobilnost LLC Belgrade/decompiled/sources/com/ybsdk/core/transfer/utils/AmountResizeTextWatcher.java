package com.ybsdk.core.transfer.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.d22;
import defpackage.hc;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.m810;
import defpackage.rje;
import defpackage.vvg0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u000289B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J1\u0010'\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010(J\u0019\u0010,\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/ybsdk/core/transfer/utils/AmountResizeTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/content/Context;", "context", "Landroid/widget/EditText;", "amountEditText", "Landroid/widget/TextView;", "currencyText", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/view/ViewGroup;)V", "Lzy11;", "updateInputSize", "()V", "", "currentLength", "handleResizeAfterMinFound", "(I)V", "detectMinTextResizeLength", "", "isDefault", "Lcom/ybsdk/core/transfer/utils/AmountResizeTextWatcher$TextInputSize;", "getTextInputSize", "(Z)Lcom/ybsdk/core/transfer/utils/AmountResizeTextWatcher$TextInputSize;", "textSizeType", "", "getTextSizeFloat", "(Lcom/ybsdk/core/transfer/utils/AmountResizeTextWatcher$TextInputSize;)F", "textSize", "setTextSize", "(F)V", "amountMeetsLimits", "()Z", "", "s", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Landroid/content/Context;", "Landroid/widget/EditText;", "Landroid/widget/TextView;", "Landroid/view/ViewGroup;", "", "textBefore", "Ljava/lang/String;", "minTextResizeLength", "Ljava/lang/Integer;", "Companion", "TextInputSize", "d22", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AmountResizeTextWatcher implements TextWatcher {
    private final EditText amountEditText;
    private final ViewGroup container;
    private final Context context;
    private final TextView currencyText;
    private Integer minTextResizeLength;
    private String textBefore = "";
    private static final d22 Companion = new d22();
    private static final int ADDITIONAL_SPACE_RESERVES = kp50.q(24.0f) + m810.b(52.0f * Resources.getSystem().getDisplayMetrics().scaledDensity);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/core/transfer/utils/AmountResizeTextWatcher$TextInputSize;", "", "", "sizeResId", CA20Status.STATUS_USER_I, "a", "()I", "DEFAULT", "SMALL", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextInputSize {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextInputSize[] $VALUES;
        public static final TextInputSize DEFAULT;
        public static final TextInputSize SMALL;
        private final int sizeResId;

        static {
            TextInputSize textInputSize = new TextInputSize("DEFAULT", 0, vvg0.ybsdk_textsize_numbers2);
            DEFAULT = textInputSize;
            TextInputSize textInputSize2 = new TextInputSize("SMALL", 1, vvg0.ybsdk_textsize_numbers3);
            SMALL = textInputSize2;
            TextInputSize[] textInputSizeArr = {textInputSize, textInputSize2};
            $VALUES = textInputSizeArr;
            $ENTRIES = a.a(textInputSizeArr);
        }

        public TextInputSize(String str, int i, int i2) {
            this.sizeResId = i2;
        }

        public static TextInputSize valueOf(String str) {
            return (TextInputSize) Enum.valueOf(TextInputSize.class, str);
        }

        public static TextInputSize[] values() {
            return (TextInputSize[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getSizeResId() {
            return this.sizeResId;
        }
    }

    public AmountResizeTextWatcher(Context context, EditText editText, TextView textView, ViewGroup viewGroup) {
        this.context = context;
        this.amountEditText = editText;
        this.currencyText = textView;
        this.container = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void afterTextChanged$lambda$0(AmountResizeTextWatcher amountResizeTextWatcher, Editable editable) {
        String str;
        amountResizeTextWatcher.updateInputSize();
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        amountResizeTextWatcher.textBefore = str;
    }

    private final boolean amountMeetsLimits() {
        return this.container.getMeasuredWidth() > (this.currencyText.getMeasuredWidth() + this.amountEditText.getMeasuredWidth()) + ADDITIONAL_SPACE_RESERVES;
    }

    private final void detectMinTextResizeLength(int currentLength) {
        TextInputSize textInputSize = getTextInputSize(amountMeetsLimits());
        float textSizeFloat = getTextSizeFloat(textInputSize);
        TextInputSize textInputSize2 = TextInputSize.SMALL;
        if (textInputSize == textInputSize2) {
            this.minTextResizeLength = Integer.valueOf(currentLength);
        }
        if (textSizeFloat != this.amountEditText.getTextSize() && textInputSize == textInputSize2) {
            setTextSize(textSizeFloat);
        }
    }

    private final TextInputSize getTextInputSize(boolean isDefault) {
        return isDefault ? TextInputSize.DEFAULT : TextInputSize.SMALL;
    }

    private final float getTextSizeFloat(TextInputSize textSizeType) {
        return rje.d(textSizeType.getSizeResId(), this.context);
    }

    private final void handleResizeAfterMinFound(int currentLength) {
        setTextSize(getTextSizeFloat(getTextInputSize(currentLength < this.minTextResizeLength.intValue())));
    }

    private final void setTextSize(float textSize) {
        this.amountEditText.setTextSize(0, textSize);
        this.currencyText.setTextSize(0, textSize);
    }

    private final void updateInputSize() {
        Editable text;
        String str = this.textBefore;
        Editable text2 = this.amountEditText.getText();
        if (jl40.l(str, text2 != null ? text2.toString() : null) || (text = this.amountEditText.getText()) == null) {
            return;
        }
        int length = text.length();
        if (this.minTextResizeLength != null) {
            handleResizeAfterMinFound(length);
        } else {
            detectMinTextResizeLength(length);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        this.amountEditText.post(new hc(15, this, s));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
