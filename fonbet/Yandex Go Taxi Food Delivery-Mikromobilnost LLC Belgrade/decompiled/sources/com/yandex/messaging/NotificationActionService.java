package com.yandex.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.s0;
import defpackage.d240;
import defpackage.enp0;
import defpackage.i3y;
import defpackage.p8g;
import defpackage.th40;
import defpackage.v320;
import defpackage.z8g;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/NotificationActionService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Lzy11;", "onTimeout", "(I)V", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lenp0;", "sdkComponent$delegate", "Li3y;", "getSdkComponent", "()Lenp0;", "sdkComponent", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationActionService extends Service {
    public static final int $stable = 8;

    /* renamed from: sdkComponent$delegate, reason: from kotlin metadata */
    private final i3y sdkComponent = kotlin.a.a(new d240(29, this));

    private final enp0 getSdkComponent() {
        return (enp0) this.sdkComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onStartCommand$lambda$2$lambda$1(Intent intent, NotificationActionService notificationActionService, Intent intent2, v320 v320Var) {
        ((p8g) v320Var).e().b(intent);
        new s0(notificationActionService).a(intent2.getIntExtra("id", 0), intent2.getStringExtra("tag"));
        return zy11.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null) {
            ((z8g) getSdkComponent()).b().a(new th40(4, intent, this, intent));
        }
        stopSelf(startId);
        return 2;
    }

    @Override // android.app.Service
    public void onTimeout(int startId) {
        super.onTimeout(startId);
        stopSelf(startId);
    }
}
