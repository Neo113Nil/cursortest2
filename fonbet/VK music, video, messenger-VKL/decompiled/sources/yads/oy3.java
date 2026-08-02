package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class oy3 extends BroadcastReceiver {
    public final /* synthetic */ py3 a = py3.d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        py3 py3Var;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            py3 py3Var2 = this.a;
            z = true;
            py3Var2.a(true, py3Var2.c);
            py3Var = this.a;
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            py3 py3Var3 = this.a;
            z = false;
            py3Var3.a(false, py3Var3.c);
            py3Var = this.a;
        }
        py3Var.b = z;
    }
}
