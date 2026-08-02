package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* compiled from: WebAppAutoDisposable.kt */
/* loaded from: classes6.dex */
public final class ydx0 extends xdx0 {
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c c;

    public ydx0(FragmentActivity fragmentActivity, io.reactivex.rxjava3.disposables.c cVar) {
        this.b = fragmentActivity;
        this.c = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        FragmentActivity fragmentActivity = this.b;
        if (fragmentActivity.equals(activity)) {
            fragmentActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.c.dispose();
        }
    }
}
