package xsna;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes13.dex */
public final class ia0 {
    public static final ia0 c = new ia0();
    public final HashMap a = new HashMap();
    public final Object b = new Object();

    /* compiled from: ActivityLifecycleListener.java */
    public static class a {

        @NonNull
        public final Activity a;

        @NonNull
        public final e6 b;

        @NonNull
        public final Object c;

        public a(@NonNull Activity activity, @NonNull Object obj, @NonNull e6 e6Var) {
            this.a = activity;
            this.b = e6Var;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.c.equals(this.c) && aVar.b == this.b && aVar.a == this.a;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    public static class b extends c4z {
        public final ArrayList b;

        public b(t4z t4zVar) {
            super(t4zVar);
            this.b = new ArrayList();
            this.mLifecycleFragment.Hm("StorageOnStopCallback", this);
        }

        @Override // xsna.c4z
        public final void onStop() {
            ArrayList arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.b);
                this.b.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null) {
                    aVar.b.run();
                    ia0.c.a(aVar.c);
                }
            }
        }
    }

    public final void a(@NonNull Object obj) {
        synchronized (this.b) {
            try {
                a aVar = (a) this.a.get(obj);
                if (aVar != null) {
                    t4z fragment = c4z.getFragment(new y3z(aVar.a));
                    b bVar = (b) fragment.Y3(b.class, "StorageOnStopCallback");
                    if (bVar == null) {
                        bVar = new b(fragment);
                    }
                    synchronized (bVar.b) {
                        bVar.b.remove(aVar);
                    }
                }
            } finally {
            }
        }
    }

    public final void b(@NonNull Activity activity, @NonNull Object obj, @NonNull e6 e6Var) {
        synchronized (this.b) {
            a aVar = new a(activity, obj, e6Var);
            t4z fragment = c4z.getFragment(new y3z(activity));
            b bVar = (b) fragment.Y3(b.class, "StorageOnStopCallback");
            if (bVar == null) {
                bVar = new b(fragment);
            }
            synchronized (bVar.b) {
                bVar.b.add(aVar);
            }
            this.a.put(obj, aVar);
        }
    }
}
