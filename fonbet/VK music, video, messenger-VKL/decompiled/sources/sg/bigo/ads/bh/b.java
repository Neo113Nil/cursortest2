package sg.bigo.ads.bh;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class b extends Handler {
    private String a;

    public b(String str, Looper looper) {
        super(looper);
        this.a = str;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    @Override // android.os.Handler
    public final String toString() {
        return i5s.a(new StringBuilder("HandlerEx ("), this.a, ") {}");
    }
}
