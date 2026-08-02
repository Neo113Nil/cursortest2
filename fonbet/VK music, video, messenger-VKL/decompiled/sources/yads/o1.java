package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import xsna.epx;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class o1 {
    public final ArrayList a;

    public o1(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(Activity activity) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((WeakReference) it.next()).get(), activity)) {
                            break;
                        }
                    }
                }
                this.a.add(new WeakReference(activity));
                Objects.toString(activity);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Activity activity) {
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
                        if (epx.f(((WeakReference) obj).get(), activity)) {
                            break;
                        }
                    }
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    this.a.remove(weakReference);
                    Objects.toString(activity);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
