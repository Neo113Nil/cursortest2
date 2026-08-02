package xsna;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.c;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
/* loaded from: classes.dex */
public final class ndp implements InputFilter {
    public final TextView a;
    public a b;

    /* compiled from: EmojiInputFilter.java */
    /* loaded from: classes12.dex */
    public static class a extends c.f implements Runnable {
        public final WeakReference b;
        public final WeakReference c;

        public a(TextView textView, ndp ndpVar) {
            this.b = new WeakReference(textView);
            this.c = new WeakReference(ndpVar);
        }

        @Override // androidx.emoji2.text.c.f
        public final void b() {
            Handler handler;
            TextView textView = (TextView) this.b.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.b.get();
            InputFilter inputFilter = (InputFilter) this.c.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.c a = androidx.emoji2.text.c.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a.getClass();
                            length = text.length();
                        }
                        CharSequence g = a.g(0, length, 0, text);
                        if (text == g) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(g);
                        int selectionEnd = Selection.getSelectionEnd(g);
                        textView.setText(g);
                        if (g instanceof Spannable) {
                            Spannable spannable = (Spannable) g;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public ndp(@NonNull TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int c = androidx.emoji2.text.c.a().c();
        if (c != 0) {
            if (c == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.c.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (c != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.c a2 = androidx.emoji2.text.c.a();
        if (this.b == null) {
            this.b = new a(textView, this);
        }
        a2.h(this.b);
        return charSequence;
    }
}
