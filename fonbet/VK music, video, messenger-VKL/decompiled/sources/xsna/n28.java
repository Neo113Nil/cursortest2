package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: BotActionVc.kt */
/* loaded from: classes2.dex */
public final class n28 extends Handler {
    public final /* synthetic */ m28 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n28(m28 m28Var, Looper looper) {
        super(looper);
        this.a = m28Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        m28.c(this.a, message.what);
    }
}
