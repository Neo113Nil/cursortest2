package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: DecoderBase.java */
/* loaded from: classes8.dex */
public final class b8l extends Handler {
    public final /* synthetic */ c8l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8l(okz okzVar, Looper looper) {
        super(looper);
        this.a = okzVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 123456) {
            this.a.o();
        } else {
            super.handleMessage(message);
        }
    }
}
