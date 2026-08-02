package androidx.emoji2.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import defpackage.oun;

/* loaded from: classes10.dex */
public class EmojiTextView extends TextView {
    private oun mEmojiTextViewHelper;
    private boolean mInitialized;

    public EmojiTextView(Context context) {
        super(context);
        init();
    }

    private oun getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new oun(this, true);
        }
        return this.mEmojiTextViewHelper;
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        getEmojiTextViewHelper().a.P();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().a.G(z);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a.q(inputFilterArr));
    }

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
