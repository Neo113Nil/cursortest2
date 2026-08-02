package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1;
import defpackage.cl6;

/* loaded from: classes.dex */
public abstract class cl6 extends e8e {
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public cl6(Context context, t951 t951Var) {
        super(context, t951Var);
        this.f = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                cl6.this.f(intent);
            }
        };
    }

    @Override // defpackage.e8e
    public final void c() {
        hgz g = hgz.g();
        int i = dl6.a;
        g.getClass();
        this.b.registerReceiver(this.f, e());
    }

    @Override // defpackage.e8e
    public final void d() {
        hgz g = hgz.g();
        int i = dl6.a;
        g.getClass();
        this.b.unregisterReceiver(this.f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
