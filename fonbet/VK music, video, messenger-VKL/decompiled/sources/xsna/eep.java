package xsna;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.emoji2.text.c;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
public final class eep implements TextWatcher {
    public final EditText b;
    public a c;
    public boolean d = true;

    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: classes12.dex */
    public static class a extends c.f implements Runnable {
        public final WeakReference b;

        public a(EditText editText) {
            this.b = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.f
        public final void b() {
            Handler handler;
            EditText editText = (EditText) this.b.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            eep.a((EditText) this.b.get(), 1);
        }
    }

    public eep(EditText editText) {
        this.b = editText;
    }

    public static void a(@Nullable EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c a2 = androidx.emoji2.text.c.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.b;
        if (!editText.isInEditMode() && this.d && androidx.emoji2.text.c.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = androidx.emoji2.text.c.a().c();
            if (c != 0) {
                if (c == 1) {
                    androidx.emoji2.text.c.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (c != 3) {
                    return;
                }
            }
            androidx.emoji2.text.c a2 = androidx.emoji2.text.c.a();
            if (this.c == null) {
                this.c = new a(editText);
            }
            a2.h(this.c);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
