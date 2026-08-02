package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: classes2.dex */
public final class fey implements DefaultLifecycleObserver {
    public static final fey a = new fey();
    public static volatile boolean b;

    static {
        new Handler(Looper.getMainLooper()).post(new vpa(12));
        b = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        b = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        b = false;
    }
}
