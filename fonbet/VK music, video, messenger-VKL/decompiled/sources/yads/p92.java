package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class p92 extends BroadcastReceiver {
    public final /* synthetic */ q92 a;

    public p92(q92 q92Var) {
        this.a = q92Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int b = q92.b(context);
        if (mc3.a < 31 || b != 5) {
            this.a.a(b);
        } else {
            n92.a(context, this.a);
        }
    }
}
