package com.yandex.mobile.drive.tools;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.bv2;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/mobile/drive/tools/MainActivityStartedCallbacks;", "Lcom/yandex/mobile/drive/tools/SimpleActivityLifecycleCallbacks;", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Lzy11;", "start", "()V", "stop", "register", "unregister", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "Landroid/app/Application;", "", "started", "Z", "value", "registered", "getRegistered", "()Z", "Lbv2;", "owner", "Lbv2;", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MainActivityStartedCallbacks implements SimpleActivityLifecycleCallbacks {
    private final Application app;
    private bv2 owner;
    private boolean registered;
    private boolean started;

    public MainActivityStartedCallbacks(Application application) {
        this.app = application;
    }

    private final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        onActivityStarted();
    }

    private final void stop() {
        if (this.started) {
            this.started = false;
            onActivityStopped();
        }
    }

    public final boolean getRegistered() {
        return this.registered;
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
    }

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public abstract void onActivityStarted();

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    public abstract void onActivityStopped();

    @Override // com.yandex.mobile.drive.tools.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public final void register() {
        this.registered = true;
        this.app.registerActivityLifecycleCallbacks(this);
        start();
    }

    public final void unregister() {
        this.registered = false;
        this.app.unregisterActivityLifecycleCallbacks(this);
        stop();
    }
}
