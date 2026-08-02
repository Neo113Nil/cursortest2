package xsna;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class afz0 {
    public static final WeakHashMap a = new WeakHashMap();

    public static void a(View view, vlv vlvVar) {
        vlv vlvVar2;
        b(vlvVar);
        WeakHashMap weakHashMap = a;
        WeakReference weakReference = (WeakReference) weakHashMap.get(view);
        if (weakReference != null && (vlvVar2 = (vlv) weakReference.get()) != null) {
            vlvVar2.a();
        }
        weakHashMap.put(view, new WeakReference(vlvVar));
    }

    public static void b(vlv vlvVar) {
        vlv vlvVar2;
        WeakHashMap weakHashMap = a;
        for (Map.Entry entry : weakHashMap.entrySet()) {
            View view = (View) entry.getKey();
            WeakReference weakReference = (WeakReference) entry.getValue();
            if (weakReference != null && ((vlvVar2 = (vlv) weakReference.get()) == null || vlvVar2 == vlvVar)) {
                weakHashMap.remove(view);
                return;
            }
        }
    }
}
