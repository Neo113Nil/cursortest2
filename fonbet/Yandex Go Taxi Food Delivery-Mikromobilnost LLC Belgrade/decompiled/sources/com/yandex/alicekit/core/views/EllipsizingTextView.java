package com.yandex.alicekit.core.views;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.nrn;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public class EllipsizingTextView extends AppCompatTextView {
    private static final List<Character> CHARS_TO_TRUNCATE = Arrays.asList('.', Character.valueOf(HexString.CHAR_COMMA), '!', '?', 8230, ':', ';');
    private boolean mCutWords;
    private CharSequence mEllipsis;
    private int mExtraPadding;
    private boolean mFixLineHeight;
    private boolean mInternalTextChange;
    private int mLastLinePadding;
    private CharSequence mOriginalText;
    private boolean mShouldAddExtraSpacing;
    private boolean mShouldEllipsize;

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEllipsis = String.valueOf((char) 8230);
        this.mCutWords = false;
        this.mFixLineHeight = true;
        this.mShouldEllipsize = true;
        this.mInternalTextChange = false;
        this.mShouldAddExtraSpacing = true;
        this.mExtraPadding = 0;
        this.mLastLinePadding = 0;
    }

    private void applyEllipsisSpans(SpannableStringBuilder spannableStringBuilder) {
        CharSequence charSequence = this.mEllipsis;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                spannableStringBuilder.removeSpan(obj);
                spannableStringBuilder.setSpan(obj, spannableStringBuilder.length() - (spannable.length() - spannable.getSpanStart(obj)), spannableStringBuilder.length() - (spannable.length() - spannable.getSpanEnd(obj)), spannable.getSpanFlags(obj));
            }
        }
    }

    private boolean fixLineHeight() {
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
        float lineSpacingExtra = getLineSpacingExtra();
        boolean z = getMaxLines() == 1 || getLayout().getLineCount() == 1;
        if (!this.mShouldAddExtraSpacing || measuredWidth <= 0 || measuredHeight <= 0 || lineSpacingExtra <= 0.0f || TextUtils.isEmpty(getText()) || !z) {
            return false;
        }
        this.mExtraPadding = Math.round(lineSpacingExtra / 2.0f);
        this.mShouldAddExtraSpacing = false;
        return true;
    }

    private void fixSpans(SpannableStringBuilder spannableStringBuilder, int i) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
            int spanEnd = spannableStringBuilder.getSpanEnd(obj);
            if (spanEnd >= i) {
                int spanStart = spannableStringBuilder.getSpanStart(obj);
                int spanFlags = spannableStringBuilder.getSpanFlags(obj) & (-52);
                spannableStringBuilder.removeSpan(obj);
                spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags | 34);
            }
        }
    }

    private static int getWholeWordLength(CharSequence charSequence, int i) {
        if (i != 0 && i < charSequence.length()) {
            if (isPartOfWord(charSequence.charAt(i))) {
                while (i > 0 && Character.isLetterOrDigit(charSequence.charAt(i - 1))) {
                    i--;
                }
            }
            while (i > 0 && shouldBeRemovedBeforeElipsis(charSequence.charAt(i - 1))) {
                i--;
            }
        }
        return i;
    }

    private boolean hasMaxLines() {
        return getMaxLines() >= 0 && getMaxLines() != Integer.MAX_VALUE;
    }

    private static boolean isPartOfWord(char c) {
        return Character.isLetterOrDigit(c) || c == '-';
    }

    private void setTextInternal(CharSequence charSequence) {
        this.mInternalTextChange = true;
        setText(charSequence);
        this.mInternalTextChange = false;
    }

    private static boolean shouldBeRemovedBeforeElipsis(char c) {
        return Character.isWhitespace(c) || CHARS_TO_TRUNCATE.contains(Character.valueOf(c));
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.mExtraPadding;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.mExtraPadding;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z || this.mShouldEllipsize) {
            tryToEllipsizeText();
            this.mShouldEllipsize = false;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mFixLineHeight && fixLineHeight()) {
            super.onMeasure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mInternalTextChange) {
            return;
        }
        if (this.mFixLineHeight || hasMaxLines()) {
            this.mOriginalText = charSequence;
            this.mShouldEllipsize = true;
            this.mShouldAddExtraSpacing = true;
            this.mExtraPadding = 0;
            requestLayout();
        }
    }

    public final void setCutWords(boolean z) {
        this.mCutWords = z;
    }

    public void setEllipsis(char c) {
        this.mEllipsis = String.valueOf(c);
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public final void setFixLineHeight(boolean z) {
        this.mFixLineHeight = z;
    }

    public void setLastLinePadding(int i) {
        this.mLastLinePadding = i;
    }

    public void tryToEllipsizeText() {
        if (hasMaxLines()) {
            int maxLines = getMaxLines();
            int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            if (maxLines <= 0 || TextUtils.isEmpty(this.mOriginalText) || width <= 0) {
                setTextInternal(null);
                return;
            }
            int a = nrn.a(this.mOriginalText, this, maxLines, this.mLastLinePadding);
            if (a == this.mOriginalText.length()) {
                setTextInternal(this.mOriginalText);
                return;
            }
            if (a <= 0) {
                setTextInternal(null);
                return;
            }
            if (!this.mCutWords) {
                a = getWholeWordLength(this.mOriginalText, a);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.mOriginalText);
            fixSpans(spannableStringBuilder, a);
            spannableStringBuilder.replace(a, spannableStringBuilder.length(), this.mEllipsis);
            applyEllipsisSpans(spannableStringBuilder);
            setTextInternal(spannableStringBuilder);
        }
    }

    public void setEllipsis(CharSequence charSequence) {
        this.mEllipsis = charSequence;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizingTextView(Context context) {
        this(context, null, 0);
    }
}
