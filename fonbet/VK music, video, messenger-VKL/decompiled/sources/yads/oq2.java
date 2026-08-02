package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class oq2 extends BroadcastReceiver {
    public final /* synthetic */ rq2 a;

    public oq2(rq2 rq2Var) {
        this.a = rq2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.a.a();
    }
}
