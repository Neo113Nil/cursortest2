package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.div.R$styleable;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import xsna.epx;
import xsna.zcl;

/* compiled from: EllipsizedTextView.kt */
/* loaded from: classes7.dex */
public class EllipsizedTextView extends SuperLineHeightTextView {
    public static final Companion Companion = new Companion(null);
    private boolean autoEllipsize;
    private final AutoEllipsizeHelper autoEllipsizeHelper;
    private float cachedEllipsisWidth;
    private CharSequence displayText;
    private CharSequence ellipsis;
    private TextUtils.TruncateAt ellipsisLocation;
    private CharSequence ellipsizedText;
    private boolean isEllipsizeRequested;
    private boolean isInternalTextChange;
    private boolean isRemeasureNeeded;
    private int lastMeasuredHeight;
    private int lastMeasuredWidth;
    private CharSequence originalText;

    /* compiled from: EllipsizedTextView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EllipsizedTextView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int calculateFittedSymbols(CharSequence charSequence, CharSequence charSequence2) {
        int availableWidth;
        if (charSequence.length() == 0 || getMaxLines() == 0 || (availableWidth = availableWidth()) <= 0) {
            return 0;
        }
        Layout layoutTextWithHyphenation = TextViewsKt.isHyphenationEnabled(this) ? layoutTextWithHyphenation(charSequence, availableWidth) : layoutText(charSequence, availableWidth);
        int lineCount = layoutTextWithHyphenation.getLineCount();
        float lineWidth = layoutTextWithHyphenation.getLineWidth(lineCount - 1);
        if (lineCount < getMaxLines() || (lineCount == getMaxLines() && lineWidth <= availableWidth)) {
            this.isRemeasureNeeded = true;
            return charSequence.length();
        }
        if (this.cachedEllipsisWidth == -1.0f) {
            this.cachedEllipsisWidth = layoutText$default(this, charSequence2, 0, 2, null).getLineWidth(0);
        }
        this.isRemeasureNeeded = true;
        float f = availableWidth - this.cachedEllipsisWidth;
        int offsetForHorizontal = layoutTextWithHyphenation.getOffsetForHorizontal(getMaxLines() - 1, f);
        while (layoutTextWithHyphenation.getPrimaryHorizontal(offsetForHorizontal) > f && offsetForHorizontal > 0) {
            offsetForHorizontal--;
        }
        return (offsetForHorizontal <= 0 || !Character.isHighSurrogate(charSequence.charAt(offsetForHorizontal + (-1)))) ? offsetForHorizontal : offsetForHorizontal - 1;
    }

    private final CharSequence ellipsize(CharSequence charSequence) {
        CharSequence charSequence2;
        int calculateFittedSymbols;
        if (charSequence == null || charSequence.length() == 0 || (calculateFittedSymbols = calculateFittedSymbols(charSequence, (charSequence2 = this.ellipsis))) <= 0) {
            return null;
        }
        if (calculateFittedSymbols == charSequence.length()) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, 0, calculateFittedSymbols);
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }

    private final void ellipsizeIfNeeded() {
        CharSequence charSequence = this.ellipsizedText;
        boolean z = noMaxLines() || epx.f(this.ellipsis, "…");
        if (this.ellipsizedText != null || !z) {
            if (z) {
                CharSequence charSequence2 = this.originalText;
                if (charSequence2 != null) {
                    this.isRemeasureNeeded = !charSequence2.equals(charSequence);
                } else {
                    charSequence2 = null;
                }
                setEllipsizedText(charSequence2);
            } else {
                setEllipsizedText(ellipsize(this.originalText));
            }
        }
        this.isEllipsizeRequested = false;
    }

    private final void invalidateEllipsis() {
        this.cachedEllipsisWidth = -1.0f;
        this.isRemeasureNeeded = false;
    }

    private final Layout layoutText(CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, getPaint(), i, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    public static /* synthetic */ Layout layoutText$default(EllipsizedTextView ellipsizedTextView, CharSequence charSequence, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layoutText");
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return ellipsizedTextView.layoutText(charSequence, i);
    }

    private final Layout layoutTextWithHyphenation(CharSequence charSequence, int i) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
    }

    private final boolean noMaxLines() {
        return getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE;
    }

    private final void onEllipsisChanged(CharSequence charSequence) {
        if (noMaxLines()) {
            super.setEllipsize(null);
        } else if (epx.f(charSequence, "…")) {
            super.setEllipsize(this.ellipsisLocation);
        } else {
            super.setEllipsize(null);
            requestEllipsize();
            invalidateEllipsis();
        }
        requestLayout();
    }

    private final void requestEllipsize() {
        this.isEllipsizeRequested = true;
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.ellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.isInternalTextChange = true;
        super.setText(charSequence);
        this.isInternalTextChange = false;
    }

    private final void sizeChangeInternal(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        requestEllipsize();
    }

    public final int availableWidth() {
        return (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
    }

    public final boolean getAutoEllipsize() {
        return this.autoEllipsize;
    }

    public final CharSequence getDisplayText() {
        return this.displayText;
    }

    public final DrawingPassOverrideStrategy getDrawingPassOverrideStrategy$div_release() {
        return this.autoEllipsizeHelper.getDrawingPassOverrideStrategy();
    }

    public final CharSequence getEllipsis() {
        return this.ellipsis;
    }

    public final TextUtils.TruncateAt getEllipsisLocation() {
        return this.ellipsisLocation;
    }

    public final CharSequence getEllipsizedText() {
        return this.ellipsizedText;
    }

    public final int getLastMeasuredHeight() {
        return this.lastMeasuredHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        CharSequence charSequence = this.originalText;
        return charSequence == null ? "" : charSequence;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.autoEllipsizeHelper.onViewAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.autoEllipsizeHelper.onViewDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        sizeChangeInternal(getMeasuredWidth(), getMeasuredHeight(), this.lastMeasuredWidth, this.lastMeasuredHeight);
        if (this.isEllipsizeRequested) {
            ellipsizeIfNeeded();
            CharSequence charSequence = this.ellipsizedText;
            if (charSequence != null) {
                if (!this.isRemeasureNeeded) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    super.onMeasure(i, i2);
                }
            }
        }
        this.lastMeasuredWidth = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        sizeChangeInternal(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.isInternalTextChange) {
            return;
        }
        this.originalText = charSequence;
        requestLayout();
        requestEllipsize();
    }

    public final void setAutoEllipsize(boolean z) {
        this.autoEllipsize = z;
        this.autoEllipsizeHelper.setEnabled(z);
    }

    public final void setDrawingPassOverrideStrategy$div_release(DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.autoEllipsizeHelper.setDrawingPassOverrideStrategy(drawingPassOverrideStrategy);
    }

    public final void setEllipsis(CharSequence charSequence) {
        onEllipsisChanged(charSequence);
        this.ellipsis = charSequence;
    }

    public final void setEllipsisLocation(TextUtils.TruncateAt truncateAt) {
        this.ellipsisLocation = truncateAt;
        if (truncateAt == null) {
            setAutoEllipsize(false);
        }
        onEllipsisChanged(this.ellipsis);
    }

    public final void setInternalTextChange(boolean z) {
        this.isInternalTextChange = z;
    }

    public final void setLastMeasuredHeight(int i) {
        this.lastMeasuredHeight = i;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i == getMaxLines()) {
            return;
        }
        super.setMaxLines(i);
        onEllipsisChanged(this.ellipsis);
        requestEllipsize();
        invalidateEllipsis();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.displayText = charSequence;
        super.setText(charSequence, bufferType);
    }

    public EllipsizedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CharSequence charSequence = "…";
        this.ellipsis = "…";
        this.ellipsisLocation = TextUtils.TruncateAt.END;
        this.lastMeasuredWidth = -1;
        this.lastMeasuredHeight = -1;
        this.cachedEllipsisWidth = -1.0f;
        this.autoEllipsizeHelper = new AutoEllipsizeHelper(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EllipsizedTextView, i, 0);
            try {
                CharSequence text = obtainStyledAttributes.getText(R$styleable.EllipsizedTextView_ellipsis);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        onEllipsisChanged(this.ellipsis);
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    public static /* synthetic */ void getDisplayText$annotations() {
    }

    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }
}
