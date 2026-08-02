package xsna;

import android.app.PendingIntent;
import android.content.Context;
import com.vk.pushes.notifications.base.a;

/* compiled from: InteractiveVideoNotification.kt */
/* loaded from: classes5.dex */
public final class kcx extends com.vk.pushes.notifications.base.a {
    public final bpn0 x;
    public final boolean y;

    /* compiled from: InteractiveVideoNotification.kt */
    public static final class a extends a.C1751a {
    }

    public kcx(Context context, a aVar) {
        super(context, aVar);
        this.x = new bpn0(new jz9(context, 2));
        this.y = true;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.x.getValue();
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean y() {
        return this.y;
    }
}
