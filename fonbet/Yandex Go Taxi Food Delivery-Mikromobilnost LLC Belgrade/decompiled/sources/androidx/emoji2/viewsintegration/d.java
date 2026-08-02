package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.widget.EditText;
import defpackage.btn;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class d extends btn implements Runnable {
    public final WeakReference a;

    public d(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.btn
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        EmojiTextWatcher.processTextOnEnablingEvent((EditText) this.a.get(), 1);
    }
}
