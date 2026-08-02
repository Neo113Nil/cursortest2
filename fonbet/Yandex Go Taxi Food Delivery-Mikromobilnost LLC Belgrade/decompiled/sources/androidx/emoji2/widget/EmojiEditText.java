package androidx.emoji2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.viewsintegration.a;
import defpackage.m4i0;

/* loaded from: classes10.dex */
public class EmojiEditText extends EditText {
    private a mEmojiEditTextHelper;
    private boolean mInitialized;

    public EmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, R.attr.editTextStyle, 0);
    }

    private a getEmojiEditTextHelper() {
        if (this.mEmojiEditTextHelper == null) {
            this.mEmojiEditTextHelper = new a(this, true);
        }
        return this.mEmojiEditTextHelper;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        int i3;
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m4i0.EmojiEditText, i, i2);
            i3 = obtainStyledAttributes.getInteger(m4i0.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        } else {
            i3 = 0;
        }
        setMaxEmojiCount(i3);
        setKeyListener(super.getKeyListener());
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().a;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().c(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            getEmojiEditTextHelper().getClass();
            keyListener = a.a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        getEmojiEditTextHelper().f(i);
    }

    public EmojiEditText(Context context) {
        super(context);
        init(null, 0, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }
}
