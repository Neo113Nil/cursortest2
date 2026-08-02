package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import defpackage.pey;

/* loaded from: classes.dex */
public final class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, Lifecycle.Event event) {
        if (activity instanceof pey) {
            Lifecycle lifecycle = ((pey) activity).getLifecycle();
            if (lifecycle instanceof t) {
                ((t) lifecycle).g(event);
            }
        }
    }

    public static void b(Activity activity) {
        ReportFragment.LifecycleCallbacks.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new ReportFragment.LifecycleCallbacks());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
