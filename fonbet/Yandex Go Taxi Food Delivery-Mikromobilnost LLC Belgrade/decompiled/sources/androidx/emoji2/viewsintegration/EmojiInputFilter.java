package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import defpackage.btn;
import defpackage.ftn;

/* loaded from: classes.dex */
final class EmojiInputFilter implements InputFilter {
    private btn mInitCallback;
    private final TextView mTextView;

    public EmojiInputFilter(TextView textView) {
        this.mTextView = textView;
    }

    public static void updateSelection(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.mTextView.isInEditMode()) {
            int c = ftn.a().c();
            if (c != 0) {
                if (c == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != this.mTextView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        CharSequence charSequence2 = charSequence;
                        return ftn.a().i(0, charSequence2.length(), charSequence2, Integer.MAX_VALUE, 0);
                    }
                }
            }
            ftn.a().k(getInitCallback());
            return charSequence;
        }
        return charSequence;
    }

    public btn getInitCallback() {
        if (this.mInitCallback == null) {
            this.mInitCallback = new b(this.mTextView, this);
        }
        return this.mInitCallback;
    }
}
