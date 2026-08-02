package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import xsna.c63;

/* compiled from: AppLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class h63 extends ja0 {
    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, final Bundle bundle) {
        int i = c63.c;
        boolean z = i == 0;
        c63.c = i + 1;
        c63.l = false;
        c63 c63Var = c63.a;
        c63.h = new WeakReference<>(activity);
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().m(activity);
        }
        if (z) {
            ((Handler) c63.b.getValue()).post(new Runnable() { // from class: xsna.g63
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = bundle != null;
                    Iterator<c63.b> it2 = c63.i.iterator();
                    while (it2.hasNext()) {
                        it2.next().z(z2);
                    }
                }
            });
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().n(activity);
        }
        int i = c63.c - 1;
        c63.c = i;
        if (i == 0) {
            Iterator<c63.b> it2 = c63.i.iterator();
            while (it2.hasNext()) {
                it2.next().s();
            }
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c63.e--;
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().o(activity);
        }
        c63.g = c63.e > 0;
        if (!c63.g) {
            Iterator<c63.b> it2 = c63.i.iterator();
            while (it2.hasNext()) {
                it2.next().v();
            }
        }
        ((Handler) c63.b.getValue()).postDelayed(new f63(), 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        super.onActivityPreDestroyed(activity);
        if (c63.c == 1) {
            Iterator<T> it = c63.i.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).w();
            }
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean z = c63.f;
        boolean z2 = c63.g;
        int i = c63.e + 1;
        c63.e = i;
        c63.f = i > 0;
        c63.g = c63.e > 0;
        c63 c63Var = c63.a;
        c63.h = new WeakReference<>(activity);
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().p(activity);
        }
        if (!z2) {
            Iterator<c63.b> it2 = c63.i.iterator();
            while (it2.hasNext()) {
                it2.next().y(activity);
            }
        }
        if (z) {
            return;
        }
        Iterator<c63.b> it3 = c63.i.iterator();
        while (it3.hasNext()) {
            it3.next().x(activity);
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c63.d++;
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().q(activity, c63.d == 1);
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c63.d--;
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().r(activity, c63.d == 0);
        }
        ((Handler) c63.b.getValue()).postDelayed(new e63(), 1000L);
    }
}
