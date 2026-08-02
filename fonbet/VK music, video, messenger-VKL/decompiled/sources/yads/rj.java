package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes10.dex */
public final class rj extends Handler {
    public final /* synthetic */ tj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(tj tjVar, Looper looper) {
        super(looper);
        this.a = tjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.a(message);
    }
}
