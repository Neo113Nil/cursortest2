package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import defpackage.btn;
import defpackage.ftn;

/* loaded from: classes.dex */
final class EmojiTextWatcher implements TextWatcher {
    private final EditText mEditText;
    private final boolean mExpectInitializedEmojiCompat;
    private btn mInitCallback;
    private int mLastEditLength;
    private int mLastEditPosition;
    private int mMaxEmojiCount = Integer.MAX_VALUE;
    private int mEmojiReplaceStrategy = 0;
    private boolean mEnabled = true;

    public EmojiTextWatcher(EditText editText, boolean z) {
        this.mEditText = editText;
        this.mExpectInitializedEmojiCompat = z;
    }

    public static void processTextOnEnablingEvent(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ftn.a().j(editableText);
            EmojiInputFilter.updateSelection(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean shouldSkipForDisabledOrNotConfigured() {
        if (this.mEnabled) {
            return (this.mExpectInitializedEmojiCompat || ftn.e()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.mEditText.isInEditMode() || shouldSkipForDisabledOrNotConfigured()) {
            return;
        }
        int i = this.mLastEditPosition;
        int i2 = this.mLastEditLength;
        if (i2 > 0) {
            int c = ftn.a().c();
            if (c != 0) {
                if (c == 1) {
                    ftn.a().i(i, i + i2, editable, this.mMaxEmojiCount, this.mEmojiReplaceStrategy);
                    return;
                } else if (c != 3) {
                    return;
                }
            }
            ftn.a().k(getInitCallback());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public int getEmojiReplaceStrategy() {
        return this.mEmojiReplaceStrategy;
    }

    public btn getInitCallback() {
        if (this.mInitCallback == null) {
            this.mInitCallback = new d(this.mEditText);
        }
        return this.mInitCallback;
    }

    public int getMaxEmojiCount() {
        return this.mMaxEmojiCount;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.mLastEditPosition = i;
        this.mLastEditLength = i3;
    }

    public void setEmojiReplaceStrategy(int i) {
        this.mEmojiReplaceStrategy = i;
    }

    public void setEnabled(boolean z) {
        if (this.mEnabled != z) {
            if (this.mInitCallback != null) {
                ftn.a().l(this.mInitCallback);
            }
            this.mEnabled = z;
            if (z) {
                processTextOnEnablingEvent(this.mEditText, ftn.a().c());
            }
        }
    }

    public void setMaxEmojiCount(int i) {
        this.mMaxEmojiCount = i;
    }
}
