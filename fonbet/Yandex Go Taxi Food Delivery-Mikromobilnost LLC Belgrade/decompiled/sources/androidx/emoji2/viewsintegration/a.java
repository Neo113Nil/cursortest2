package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import defpackage.ny61;

/* loaded from: classes.dex */
public final class a {
    public int a = Integer.MAX_VALUE;
    public int b = 0;
    public final EditText c;
    public final EmojiTextWatcher d;

    public a(EditText editText, boolean z) {
        this.c = editText;
        EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText, z);
        this.d = emojiTextWatcher;
        editText.addTextChangedListener(emojiTextWatcher);
        editText.setEditableFactory(EmojiEditableFactory.getInstance());
    }

    public static KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    public final boolean b() {
        return this.d.isEnabled();
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(this.c, inputConnection, editorInfo);
    }

    public final void d(int i) {
        this.b = i;
        this.d.setEmojiReplaceStrategy(i);
    }

    public final void e(boolean z) {
        this.d.setEnabled(z);
    }

    public final void f(int i) {
        if (i < 0) {
            ny61.g("maxEmojiCount should be greater than 0");
        } else {
            this.a = i;
            this.d.setMaxEmojiCount(i);
        }
    }
}
