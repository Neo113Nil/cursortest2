package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.vk.navigation.NavigationDelegateActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AppStateTracker.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes11.dex */
public final class x93 {
    public static WeakReference<Activity> c;
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static boolean b = true;
    public static final ArrayList d = new ArrayList();

    public static NavigationDelegateActivity a() {
        Object obj;
        Activity activity;
        Iterator it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            WeakReference weakReference = (WeakReference) obj;
            if ((weakReference.get() instanceof NavigationDelegateActivity) && (activity = (Activity) weakReference.get()) != null && !activity.isDestroyed()) {
                break;
            }
        }
        WeakReference weakReference2 = (WeakReference) obj;
        Activity activity2 = weakReference2 != null ? (Activity) weakReference2.get() : null;
        if (activity2 instanceof NavigationDelegateActivity) {
            return (NavigationDelegateActivity) activity2;
        }
        return null;
    }
}
