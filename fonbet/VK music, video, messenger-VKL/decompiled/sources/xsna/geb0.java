package xsna;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;

/* compiled from: PlaylistStatusBarColorDelegate.kt */
/* loaded from: classes3.dex */
public final class geb0 {
    public final WeakReference<Activity> a;

    public geb0(FragmentActivity fragmentActivity) {
        this.a = new WeakReference<>(fragmentActivity);
    }

    public final void a(float f) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        boolean M = dhr0.M();
        WeakReference<Activity> weakReference = this.a;
        if (f <= 0.5f || M) {
            Activity activity = weakReference.get();
            if (activity != null) {
                p90.b(activity, activity.getColor(R.color.transparent), false);
            }
            Activity activity2 = weakReference.get();
            if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            awt0.e(8192, decorView);
            return;
        }
        Activity activity3 = weakReference.get();
        if (activity3 != null) {
            p90.b(activity3, activity3.getColor(R.color.transparent), false);
        }
        Activity activity4 = weakReference.get();
        if (activity4 == null || (window2 = activity4.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        awt0.c(8192, decorView2);
    }
}
