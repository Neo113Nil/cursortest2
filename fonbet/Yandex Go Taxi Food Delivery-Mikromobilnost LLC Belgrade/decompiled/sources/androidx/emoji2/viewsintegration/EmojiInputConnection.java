package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import defpackage.ftn;

/* loaded from: classes.dex */
final class EmojiInputConnection extends InputConnectionWrapper {
    private final a mEmojiCompatDeleteHelper;
    private final TextView mTextView;

    public static class a {
    }

    public EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.mTextView = textView;
        this.mEmojiCompatDeleteHelper = aVar;
        aVar.getClass();
        if (ftn.e()) {
            ftn.a().m(editorInfo);
        }
    }

    private Editable getEditable() {
        return this.mTextView.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.mEmojiCompatDeleteHelper;
        Editable editable = getEditable();
        aVar.getClass();
        return androidx.emoji2.text.b.c(this, editable, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        a aVar = this.mEmojiCompatDeleteHelper;
        Editable editable = getEditable();
        aVar.getClass();
        return androidx.emoji2.text.b.c(this, editable, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }
}
