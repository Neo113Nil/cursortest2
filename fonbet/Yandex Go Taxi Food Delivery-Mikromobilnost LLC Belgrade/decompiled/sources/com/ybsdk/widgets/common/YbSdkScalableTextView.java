package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.w3i0;
import defpackage.w511;
import defpackage.wv51;
import defpackage.x4c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00012B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rJ#\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/ybsdk/widgets/common/YbSdkScalableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "ensureTextSize", "()Z", "Lzy11;", "updateColor", "()V", "setBigSizeState", "setSmallSizeState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestEnsureTextSizeRecalculation", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "color", "setTextColor", "(I)V", "needEnsureTextSize", "Z", "Landroid/text/TextPaint;", "mPaint$delegate", "Li3y;", "getMPaint", "()Landroid/text/TextPaint;", "mPaint", "smallTextStyleResId", CA20Status.STATUS_USER_I, "bigTextStyleResId", "textColor", "Ljava/lang/Integer;", "Lcom/ybsdk/widgets/common/YbSdkScalableTextView$TextSizeType;", "value", ClidProvider.STATE, "Lcom/ybsdk/widgets/common/YbSdkScalableTextView$TextSizeType;", "setState", "(Lcom/ybsdk/widgets/common/YbSdkScalableTextView$TextSizeType;)V", "TextSizeType", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YbSdkScalableTextView extends AppCompatTextView {
    private final int bigTextStyleResId;

    /* renamed from: mPaint$delegate, reason: from kotlin metadata */
    private final i3y mPaint;
    private boolean needEnsureTextSize;
    private final int smallTextStyleResId;
    private TextSizeType state;
    private Integer textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/YbSdkScalableTextView$TextSizeType;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL_TEXT", "BIG_TEXT", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextSizeType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextSizeType[] $VALUES;
        public static final TextSizeType SMALL_TEXT = new TextSizeType("SMALL_TEXT", 0);
        public static final TextSizeType BIG_TEXT = new TextSizeType("BIG_TEXT", 1);

        private static final /* synthetic */ TextSizeType[] $values() {
            return new TextSizeType[]{SMALL_TEXT, BIG_TEXT};
        }

        static {
            TextSizeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private TextSizeType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TextSizeType valueOf(String str) {
            return (TextSizeType) Enum.valueOf(TextSizeType.class, str);
        }

        public static TextSizeType[] values() {
            return (TextSizeType[]) $VALUES.clone();
        }
    }

    public YbSdkScalableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.needEnsureTextSize = true;
        this.mPaint = kotlin.a.a(new wv51(0, this));
        this.state = TextSizeType.BIG_TEXT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3i0.YbSdkScalableTextView);
        int resourceId = obtainStyledAttributes.getResourceId(w3i0.YbSdkScalableTextView_ybsdk_smallTextStyle, 0);
        this.smallTextStyleResId = resourceId;
        int resourceId2 = obtainStyledAttributes.getResourceId(w3i0.YbSdkScalableTextView_ybsdk_bigTextStyle, 0);
        this.bigTextStyleResId = resourceId2;
        if (resourceId2 == 0 || resourceId == 0) {
            x4c.g("BankSdkScalableBalanceTextView: missing styles", null, null, null, 14);
        }
        obtainStyledAttributes.recycle();
        setBigSizeState();
    }

    private final boolean ensureTextSize() {
        TextSizeType textSizeType = this.state;
        TextSizeType textSizeType2 = ((float) getMeasuredWidth()) < getMPaint().measureText(getText().toString()) ? TextSizeType.SMALL_TEXT : TextSizeType.BIG_TEXT;
        setState(textSizeType2);
        return textSizeType != textSizeType2;
    }

    private final TextPaint getMPaint() {
        return (TextPaint) this.mPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint mPaint_delegate$lambda$0(YbSdkScalableTextView ybSdkScalableTextView) {
        return new TextPaint(ybSdkScalableTextView.getPaint());
    }

    private final void setBigSizeState() {
        setTextAppearance(this.bigTextStyleResId);
        updateColor();
    }

    private final void setSmallSizeState() {
        setTextAppearance(this.smallTextStyleResId);
        updateColor();
    }

    private final void setState(TextSizeType textSizeType) {
        if (this.state != textSizeType) {
            this.state = textSizeType;
            int i = r.a[textSizeType.ordinal()];
            if (i == 1) {
                setSmallSizeState();
            } else if (i == 2) {
                setBigSizeState();
            } else {
                w511.b();
            }
        }
    }

    private final void updateColor() {
        Integer num = this.textColor;
        if (num != null) {
            setTextColor(num.intValue());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.needEnsureTextSize) {
            if (ensureTextSize()) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            this.needEnsureTextSize = false;
        }
    }

    public final void requestEnsureTextSizeRecalculation() {
        this.needEnsureTextSize = false;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if (!jl40.l(text, getText())) {
            this.needEnsureTextSize = true;
            requestLayout();
        }
        super.setText(text, type);
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        this.textColor = Integer.valueOf(color);
        super.setTextColor(color);
    }

    public /* synthetic */ YbSdkScalableTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YbSdkScalableTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
