package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import defpackage.btn;
import defpackage.ftn;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b extends btn implements Runnable {
    public final WeakReference a;
    public final WeakReference b;

    public b(TextView textView, EmojiInputFilter emojiInputFilter) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(emojiInputFilter);
    }

    @Override // defpackage.btn
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.a.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence j;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (j = ftn.a().j((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(j);
                int selectionEnd = Selection.getSelectionEnd(j);
                textView.setText(j);
                if (j instanceof Spannable) {
                    EmojiInputFilter.updateSelection((Spannable) j, selectionStart, selectionEnd);
                    return;
                }
                return;
            }
        }
    }
}
