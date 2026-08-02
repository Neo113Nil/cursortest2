package xsna;

import android.app.Activity;

/* compiled from: VKRxExt.kt */
/* loaded from: classes18.dex */
public final class ter0 extends ja0 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c c;

    public ter0(Activity activity, io.reactivex.rxjava3.disposables.c cVar) {
        this.b = activity;
        this.c = cVar;
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.b;
        if (activity.equals(activity2)) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.c.dispose();
        }
    }
}
