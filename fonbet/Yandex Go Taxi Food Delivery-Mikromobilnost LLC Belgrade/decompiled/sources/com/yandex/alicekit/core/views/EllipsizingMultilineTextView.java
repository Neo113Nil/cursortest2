package com.yandex.alicekit.core.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.nrn;

/* loaded from: classes11.dex */
public abstract class EllipsizingMultilineTextView extends AppCompatTextView {
    private static final char ELLIPSIS = 8230;
    private boolean mInternalTextChange;
    private CharSequence mOriginalText;
    private boolean mShouldEllipsize;

    public EllipsizingMultilineTextView(Context context) {
        super(context);
        this.mShouldEllipsize = true;
        this.mInternalTextChange = false;
    }

    private String ellipsizedText(String str, TextView textView) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        int a = nrn.a(trim, textView, getMaxLineCount(), 0);
        if (a == trim.length()) {
            return trim;
        }
        if (a <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(trim);
        sb.setLength(a);
        sb.append(ELLIPSIS);
        return sb.toString();
    }

    private void setTextInternal(CharSequence charSequence) {
        this.mInternalTextChange = true;
        setText(charSequence);
        this.mInternalTextChange = false;
    }

    public abstract boolean checkLimit();

    public void ellipsizeText() {
        CharSequence charSequence = this.mOriginalText;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (!checkLimit()) {
            setTextInternal(null);
            return;
        }
        String ellipsizedText = ellipsizedText(charSequence2, this);
        if (TextUtils.isEmpty(ellipsizedText)) {
            setTextInternal(null);
        } else {
            setTextInternal(ellipsizedText);
            this.mShouldEllipsize = false;
        }
    }

    public abstract int getLimit();

    public abstract int getMaxLineCount();

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mShouldEllipsize) {
            ellipsizeText();
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (shouldEllipsizeOnSizeChange(i, i2, i3, i4)) {
            this.mShouldEllipsize = true;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mInternalTextChange) {
            return;
        }
        this.mOriginalText = charSequence;
        this.mShouldEllipsize = true;
        requestLayout();
    }

    public abstract boolean shouldEllipsizeOnSizeChange(int i, int i2, int i3, int i4);

    public EllipsizingMultilineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mShouldEllipsize = true;
        this.mInternalTextChange = false;
    }

    public EllipsizingMultilineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShouldEllipsize = true;
        this.mInternalTextChange = false;
    }
}
