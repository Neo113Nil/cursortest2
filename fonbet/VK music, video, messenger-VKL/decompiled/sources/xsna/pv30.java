package xsna;

import android.app.PendingIntent;
import android.content.Context;

/* compiled from: MsgReplyErrorNotification.kt */
/* loaded from: classes5.dex */
public final class pv30 extends com.vk.pushes.notifications.base.a {
    public final qv30 x;
    public final bpn0 y;

    public pv30(Context context, qv30 qv30Var) {
        super(context, qv30Var);
        this.x = qv30Var;
        this.y = new bpn0(new gd0(12, context, this));
    }

    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.y.getValue();
    }
}
