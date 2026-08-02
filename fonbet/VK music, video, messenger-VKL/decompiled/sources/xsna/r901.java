package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class r901 extends BroadcastReceiver {
    public final qj01 a;
    public boolean b;
    public boolean c;

    public r901(qj01 qj01Var) {
        this.a = qj01Var;
    }

    public final void a() {
        qj01 qj01Var = this.a;
        qj01Var.b();
        qj01Var.d().k();
        qj01Var.d().k();
        if (this.b) {
            qj01Var.e().q.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                qj01Var.m.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                qj01Var.e().i.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qj01 qj01Var = this.a;
        qj01Var.b();
        String action = intent.getAction();
        qj01Var.e().q.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            qj01Var.e().l.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        p901 p901Var = qj01Var.c;
        qj01.I(p901Var);
        boolean o = p901Var.o();
        if (this.c != o) {
            this.c = o;
            qj01Var.d().s(new q901(this, o));
        }
    }
}
