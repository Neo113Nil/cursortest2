package com.yandex.go.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import defpackage.ffx;
import defpackage.h6r;
import defpackage.lx4;
import defpackage.p1g0;
import defpackage.q5z;
import defpackage.wwg;
import defpackage.zzf;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/broadcast/NotificationDismissReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        q5z.Y(intent);
        NotificationShareData notificationShareData = (NotificationShareData) ffx.P(intent, "notification_share_data_extra", NotificationShareData.class);
        if (notificationShareData == null) {
            return;
        }
        zzf zzfVar = (zzf) ((h6r) wwg.e(context, h6r.class));
        i d = ((j) ((lx4) zzfVar.Y.get())).d("Push.Dismissed");
        d.a.putAll(notificationShareData.getAllParams());
        d.m();
        String pushId = notificationShareData.getPushId();
        if (pushId != null) {
            ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) zzfVar.k5.get()).a.get()).b(pushId, PushAckStatus.DISMISSED);
        }
    }
}
