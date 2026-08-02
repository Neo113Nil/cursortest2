package com.ybsdk.widgets.common;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.lwg0;
import defpackage.ohg;
import defpackage.rje;
import defpackage.sm91;
import defpackage.vvg0;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 12\u00020\u0001:\u000223B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/ybsdk/widgets/common/DashboardBalanceTextView;", "Lcom/ybsdk/core/design/spoiler/SpoilerTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "ensureTextSize", "()Z", "Lzy11;", "setTextSizeBig", "()V", "setTextSizeSmall", "", "totalScrollRange", "collapsedPercentage", "", "verticalOffset", "targetX", "updateAnimationByPercent", "(FFII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "needEnsureTextSize", "Z", "Landroid/text/TextPaint;", "mPaint", "Landroid/text/TextPaint;", "Lcom/ybsdk/widgets/common/DashboardBalanceTextView$TextSizeType;", "value", ClidProvider.STATE, "Lcom/ybsdk/widgets/common/DashboardBalanceTextView$TextSizeType;", "setState", "(Lcom/ybsdk/widgets/common/DashboardBalanceTextView$TextSizeType;)V", "collapsedBalanceTextSize", "F", "getCollapsedBalanceTopMargin", "()I", "collapsedBalanceTopMargin", "Companion", "TextSizeType", "ohg", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DashboardBalanceTextView extends SpoilerTextView {
    public static final ohg Companion = new ohg();
    private static final float PERCENT_100 = 100.0f;
    private final float collapsedBalanceTextSize;
    private final TextPaint mPaint;
    private boolean needEnsureTextSize;
    private TextSizeType state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/DashboardBalanceTextView$TextSizeType;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL_TEXT", "BIG_TEXT", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public DashboardBalanceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.needEnsureTextSize = true;
        TextPaint textPaint = new TextPaint(getPaint());
        textPaint.setTextSize(getResources().getDimension(vvg0.ybsdk_textsize_numbers2));
        this.mPaint = textPaint;
        this.state = TextSizeType.BIG_TEXT;
        this.collapsedBalanceTextSize = rje.d(vvg0.ybsdk_textsize_title1, context);
    }

    private final boolean ensureTextSize() {
        TextSizeType textSizeType = this.state;
        TextSizeType textSizeType2 = ((float) getMeasuredWidth()) < this.mPaint.measureText(getText().toString()) ? TextSizeType.SMALL_TEXT : TextSizeType.BIG_TEXT;
        setState(textSizeType2);
        return textSizeType != textSizeType2;
    }

    private final int getCollapsedBalanceTopMargin() {
        if (this.state == TextSizeType.BIG_TEXT) {
            return rje.d(lwg0.ybsdk_dashboard_collapsed_balance_top_margin, getContext());
        }
        return rje.d(vvg0.ybsdk_lineheight_numbers2, getContext()) - rje.d(vvg0.ybsdk_lineheight_numbers3, getContext());
    }

    private final void setState(TextSizeType textSizeType) {
        if (this.state != textSizeType) {
            this.state = textSizeType;
            int i = b.a[textSizeType.ordinal()];
            if (i == 1) {
                setTextSizeSmall();
            } else if (i == 2) {
                setTextSizeBig();
            } else {
                w511.b();
            }
        }
    }

    private final void setTextSizeBig() {
        setTextSize(0, getResources().getDimension(vvg0.ybsdk_textsize_numbers2));
        setLineHeight((int) getResources().getDimension(vvg0.ybsdk_lineheight_numbers2));
    }

    private final void setTextSizeSmall() {
        setTextSize(0, getResources().getDimension(vvg0.ybsdk_textsize_numbers3));
        setLineHeight((int) getResources().getDimension(vvg0.ybsdk_lineheight_numbers3));
    }

    @Override // com.ybsdk.core.design.spoiler.SpoilerTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.needEnsureTextSize) {
            if (ensureTextSize()) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            this.needEnsureTextSize = false;
        }
    }

    @Override // com.ybsdk.core.design.spoiler.SpoilerTextView, android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if (!jl40.l(text, getText())) {
            this.needEnsureTextSize = true;
            requestLayout();
        }
        super.setText(text, type);
    }

    public final void updateAnimationByPercent(float totalScrollRange, float collapsedPercentage, int verticalOffset, int targetX) {
        if (getPivotY() == 0.0f) {
            setPivotY(getMeasuredHeight() / 2.0f);
        }
        setTranslationX((targetX / 100.0f) * collapsedPercentage);
        setTranslationY((((totalScrollRange - getTop()) + getCollapsedBalanceTopMargin()) / 100.0f) * collapsedPercentage);
        sm91.a(this, this, verticalOffset, totalScrollRange, kp50.w(this.collapsedBalanceTextSize));
    }

    public /* synthetic */ DashboardBalanceTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardBalanceTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
