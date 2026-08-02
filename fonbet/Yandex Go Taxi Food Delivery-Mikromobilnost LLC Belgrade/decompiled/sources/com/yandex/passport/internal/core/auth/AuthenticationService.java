package com.yandex.passport.internal.core.auth;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.yandex.passport.legacy.a;

/* loaded from: classes15.dex */
public class AuthenticationService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a.a("onBind: intent=" + intent);
        return com.yandex.passport.internal.di.a.a().getAuthenticator().getIBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        a.a("onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        a.a("onDestroy");
    }
}
