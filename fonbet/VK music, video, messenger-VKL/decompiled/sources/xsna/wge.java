package xsna;

import android.app.Activity;
import android.content.Context;

/* compiled from: ClipsInterestsLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class wge extends ja0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c c;

    public wge(Context context, io.reactivex.rxjava3.disposables.c cVar) {
        this.b = context;
        this.c = cVar;
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (epx.f(this.b, activity)) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.c.dispose();
        }
    }
}
