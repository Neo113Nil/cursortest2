package com.yandex.div.legacy.widget;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.d8w0;
import defpackage.m810;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0016\b\u0010\u0018\u0000 %2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ1\u0010\u0016\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006'"}, d2 = {"Lcom/yandex/div/legacy/widget/SuperLineHeightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "invalidateTextPadding", "()V", "", "shouldReapplyExtraSpacing", "()Z", "fixLineHeight", "", "text", "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "getCompoundPaddingTop", "()I", "getCompoundPaddingBottom", "lineSpacingExtraTop", CA20Status.STATUS_USER_I, "lineSpacingExtraBottom", "shouldAddExtraSpacing", "Z", "lastMeasuredHeight", "Companion", "d8w0", "div-legacy_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class SuperLineHeightTextView extends AppCompatTextView {
    private static final d8w0 Companion = new d8w0();

    @Deprecated
    public static final int NOT_SET = -1;
    private int lastMeasuredHeight;
    private int lineSpacingExtraBottom;
    private int lineSpacingExtraTop;
    private boolean shouldAddExtraSpacing;

    public /* synthetic */ SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean fixLineHeight() {
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        CharSequence text = getText();
        Layout layout = getLayout();
        float lineSpacingExtra = getLineSpacingExtra();
        if (layout == null || !this.shouldAddExtraSpacing || measuredWidth <= 0 || lineSpacingExtra <= 0.0f || TextUtils.isEmpty(text) || getLayout().getLineCount() != 1) {
            return false;
        }
        this.lineSpacingExtraTop = m810.b(lineSpacingExtra / 2.0f);
        this.lineSpacingExtraBottom = ((int) lineSpacingExtra) / 2;
        this.shouldAddExtraSpacing = false;
        return true;
    }

    private final void invalidateTextPadding() {
        this.shouldAddExtraSpacing = true;
        this.lineSpacingExtraTop = 0;
        this.lineSpacingExtraBottom = 0;
    }

    private final boolean shouldReapplyExtraSpacing() {
        int i = this.lastMeasuredHeight;
        if (i == -1) {
            return false;
        }
        return ((this.lineSpacingExtraTop == 0 && this.lineSpacingExtraBottom == 0) || i - getMeasuredHeight() == 0) ? false : true;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.lineSpacingExtraBottom;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.lineSpacingExtraTop;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (shouldReapplyExtraSpacing()) {
            invalidateTextPadding();
        }
        if (fixLineHeight()) {
            int measuredHeightAndState = getMeasuredHeightAndState();
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(measuredHeightAndState) + this.lineSpacingExtraTop + this.lineSpacingExtraBottom, View.MeasureSpec.getMode(measuredHeightAndState)));
        }
        this.lastMeasuredHeight = getMeasuredHeight();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        invalidateTextPadding();
    }

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SuperLineHeightTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.shouldAddExtraSpacing = true;
        this.lastMeasuredHeight = -1;
    }
}
