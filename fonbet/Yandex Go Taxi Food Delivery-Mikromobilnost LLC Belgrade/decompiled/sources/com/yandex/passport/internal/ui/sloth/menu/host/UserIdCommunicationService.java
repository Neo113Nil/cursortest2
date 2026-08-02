package com.yandex.passport.internal.ui.sloth.menu.host;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.lifecycle.LifecycleService;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.eja1;
import defpackage.fyc;
import defpackage.i5m;
import defpackage.tje;
import defpackage.uw51;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/menu/host/UserIdCommunicationService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "Lzy11;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/Messenger;", "messenger", "Landroid/os/Messenger;", "Companion", "com/yandex/passport/internal/ui/sloth/menu/host/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserIdCommunicationService extends LifecycleService {
    public static final int $stable = 8;
    public static final b Companion = new b();
    public static final String HOST_COMMAND = "HOST_COMMAND";
    public static final int MSG_HOST_RESPONSE = 11;
    private Messenger messenger;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public IBinder onBind(Intent intent) {
        super.onBind(intent);
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        fyc fycVar = f.a;
        a aVar = new a();
        aVar.a = i5m.c(d.a);
        fycVar.T(aVar);
        final Looper mainLooper = Looper.getMainLooper();
        this.messenger = new Messenger(new Handler(mainLooper) { // from class: com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService$onCreate$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Object obj = msg.obj;
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                String string = bundle != null ? bundle.getString("ID_COMMAND") : null;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    uw51.w("Get message from UserMenuActivity: ", string, LogLevel.DEBUG, null, 8);
                }
                tje.N(eja1.s(UserIdCommunicationService.this), null, null, new UserIdCommunicationService$onCreate$1$handleMessage$2(string, msg.replyTo, null), 3);
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        fyc fycVar = f.a;
        fycVar.a(null);
        fycVar.T(null);
        this.messenger = null;
        super.onDestroy();
    }
}
