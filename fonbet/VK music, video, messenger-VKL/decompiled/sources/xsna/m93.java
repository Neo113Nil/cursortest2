package xsna;

import android.app.Activity;

/* compiled from: AppStartReporterLifecycle.kt */
/* loaded from: classes11.dex */
public final class m93 extends j93 {
    public boolean b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.c.dispose();
    }
}
