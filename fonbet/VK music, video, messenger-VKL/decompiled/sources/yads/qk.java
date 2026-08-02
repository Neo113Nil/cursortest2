package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class qk extends BroadcastReceiver implements Runnable {
    public final rk b;
    public final Handler c;
    public final /* synthetic */ sk d;

    public qk(sk skVar, Handler handler, xn0 xn0Var) {
        this.d = skVar;
        this.c = handler;
        this.b = xn0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.c) {
            ((xn0) this.b).a.a(-1, 3, false);
        }
    }
}
