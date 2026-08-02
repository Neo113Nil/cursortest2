package com.yandex.passport.internal.provider.communication;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.lifecycle.LifecycleService;
import defpackage.eja1;
import defpackage.tje;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yandex/passport/internal/provider/communication/HostCommunicationService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "Lzy11;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/Messenger;", "messenger", "Landroid/os/Messenger;", "Companion", "com/yandex/passport/internal/provider/communication/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HostCommunicationService extends LifecycleService {
    public static final int $stable = 8;
    public static final b Companion = new b();
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
        final Looper mainLooper = Looper.getMainLooper();
        this.messenger = new Messenger(new Handler(mainLooper) { // from class: com.yandex.passport.internal.provider.communication.HostCommunicationService$onCreate$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                tje.N(eja1.s(HostCommunicationService.this), null, null, new HostCommunicationService$onCreate$1$handleMessage$1(msg, msg.replyTo, null), 3);
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        this.messenger = null;
        super.onDestroy();
    }
}
