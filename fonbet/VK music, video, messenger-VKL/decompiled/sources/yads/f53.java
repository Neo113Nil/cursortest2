package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.z27;

/* loaded from: classes10.dex */
public final class f53 extends BroadcastReceiver {
    public final /* synthetic */ g53 a;

    public f53(g53 g53Var) {
        this.a = g53Var;
    }

    public static void a(g53 g53Var) {
        int b = g53.b(g53Var.d, g53Var.g);
        boolean a = g53.a(g53Var.d, g53Var.g);
        if (g53Var.h == b && g53Var.i == a) {
            return;
        }
        g53Var.h = b;
        g53Var.i = a;
        ((xn0) g53Var.c).a(a, b);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g53 g53Var = this.a;
        g53Var.b.post(new z27(g53Var, 20));
    }
}
