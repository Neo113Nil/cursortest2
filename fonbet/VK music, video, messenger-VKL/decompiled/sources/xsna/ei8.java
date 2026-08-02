package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1;
import xsna.ei8;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class ei8<T> extends k6j<T> {
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public ei8(Context context, hwx0 hwx0Var) {
        super(context, hwx0Var);
        this.f = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            public final /* synthetic */ ei8<Object> a;

            {
                this.a = this;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                this.a.f(intent);
            }
        };
    }

    @Override // xsna.k6j
    public final void c() {
        m100 c = m100.c();
        int i = fi8.a;
        c.getClass();
        this.b.registerReceiver(this.f, e());
    }

    @Override // xsna.k6j
    public final void d() {
        m100 c = m100.c();
        int i = fi8.a;
        c.getClass();
        this.b.unregisterReceiver(this.f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
