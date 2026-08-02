package com.yandex.messaging.views;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.yandex.alicekit.core.views.EllipsizingTextView;
import defpackage.oun;

@Deprecated
/* loaded from: classes11.dex */
public class AppCompatEmojiTextView extends EllipsizingTextView {
    private oun mEmojiTextViewHelper;

    public AppCompatEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getEmojiTextViewHelper().a.P();
        setCutWords(true);
        setFixLineHeight(false);
    }

    private oun getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new oun(this, true);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().a.G(z);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a.q(inputFilterArr));
    }

    public AppCompatEmojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatEmojiTextView(Context context) {
        this(context, null);
    }
}
