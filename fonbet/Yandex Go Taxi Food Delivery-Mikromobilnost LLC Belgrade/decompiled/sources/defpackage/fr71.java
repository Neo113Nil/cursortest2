package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class fr71 {
    public final ArrayList a;

    public fr71(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(Activity activity) {
        Object obj;
        synchronized (this) {
            try {
                Iterator it = this.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (jl40.l(((WeakReference) obj).get(), activity)) {
                            break;
                        }
                    }
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    this.a.remove(weakReference);
                    Objects.toString(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
