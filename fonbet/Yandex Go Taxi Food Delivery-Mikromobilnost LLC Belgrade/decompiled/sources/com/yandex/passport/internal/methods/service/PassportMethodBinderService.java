package com.yandex.passport.internal.methods.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.methods.p1;
import com.yandex.passport.internal.methods.performer.m0;
import com.yandex.passport.internal.methods.performer.p;
import com.yandex.passport.internal.methods.q0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yandex/passport/internal/methods/service/PassportMethodBinderService;", "Landroid/app/Service;", "<init>", "()V", "Lzy11;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Messenger;", "messenger", "Landroid/os/Messenger;", "Companion", "com/yandex/passport/internal/methods/service/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportMethodBinderService extends Service {
    public static final int $stable = 8;
    public static final a Companion = new a();
    public static final String KEY_ARGS = "args";
    public static final String KEY_METHOD_NAME = "method_name";
    public static final String KEY_REQUEST_ID = "request_id";
    private final HandlerThread handlerThread = new HandlerThread("PassportMethodBinderService");
    private Messenger messenger;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        final p getAccountByUidPerformer = a.getGetAccountByUidPerformer();
        final m0 getTokenPerformer = a.getGetTokenPerformer();
        this.handlerThread.start();
        final Looper looper = this.handlerThread.getLooper();
        this.messenger = new Messenger(new Handler(looper) { // from class: com.yandex.passport.internal.methods.service.PassportMethodBinderService$onCreate$1
            private static final Result handleMessage$lambda$1(p pVar, q0 q0Var) {
                return new Result(pVar.a(q0Var));
            }

            private static final Result handleMessage$lambda$2(m0 m0Var, p1 p1Var) {
                return new Result(m0Var.a(p1Var));
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                String string;
                Bundle bundle;
                Bundle bundle2;
                Object obj = msg.obj;
                Bundle bundle3 = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle3 == null || (string = bundle3.getString(PassportMethodBinderService.KEY_METHOD_NAME)) == null) {
                    return;
                }
                Bundle bundle4 = bundle3.getBundle("args");
                if (bundle4 == null) {
                    bundle4 = new Bundle();
                }
                bundle4.setClassLoader(PassportMethodBinderService.this.getClassLoader());
                long j = bundle3.getLong("request_id");
                if (string.equals("GetAccountByUid")) {
                    q0 q0Var = new q0(bundle4);
                    Object value = handleMessage$lambda$1(getAccountByUidPerformer, q0Var).getValue();
                    Throwable a2 = Result.a(value);
                    if (a2 == null) {
                        bundle2 = new Bundle();
                        q0Var.d.d(bundle2, value);
                    } else {
                        bundle = new Bundle();
                        bundle.putSerializable(Constants.KEY_EXCEPTION, a2);
                        bundle2 = bundle;
                    }
                } else {
                    if (!string.equals("GetToken")) {
                        return;
                    }
                    p1 p1Var = new p1(bundle4);
                    Object value2 = handleMessage$lambda$2(getTokenPerformer, p1Var).getValue();
                    Throwable a3 = Result.a(value2);
                    if (a3 == null) {
                        bundle2 = new Bundle();
                        p1Var.e.d(bundle2, value2);
                    } else {
                        bundle = new Bundle();
                        bundle.putSerializable(Constants.KEY_EXCEPTION, a3);
                        bundle2 = bundle;
                    }
                }
                try {
                    Messenger messenger = msg.replyTo;
                    if (messenger != null) {
                        Message obtain = Message.obtain();
                        obtain.what = msg.what;
                        obtain.obj = bundle2;
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("request_id", j);
                        obtain.setData(bundle5);
                        messenger.send(obtain);
                    }
                } catch (RemoteException e) {
                    c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "", e);
                    }
                }
            }
        });
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.handlerThread.quit();
        super.onDestroy();
    }
}
