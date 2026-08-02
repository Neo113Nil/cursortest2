package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: LifecycleCameraRepository.java */
/* loaded from: classes11.dex */
public final class e4z {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque<f5z> d = new ArrayDeque<>();

    /* compiled from: LifecycleCameraRepository.java */
    public static abstract class a {
        @NonNull
        public abstract CameraUseCaseAdapter.a a();

        @NonNull
        public abstract f5z b();
    }

    /* compiled from: LifecycleCameraRepository.java */
    public static class b implements e5z {
        public final e4z b;
        public final f5z c;

        public b(f5z f5zVar, e4z e4zVar) {
            this.c = f5zVar;
            this.b = e4zVar;
        }

        @androidx.lifecycle.o(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(f5z f5zVar) {
            e4z e4zVar = this.b;
            synchronized (e4zVar.a) {
                try {
                    b b = e4zVar.b(f5zVar);
                    if (b == null) {
                        return;
                    }
                    e4zVar.f(f5zVar);
                    Iterator it = ((Set) e4zVar.c.get(b)).iterator();
                    while (it.hasNext()) {
                        e4zVar.b.remove((a) it.next());
                    }
                    e4zVar.c.remove(b);
                    b.c.getLifecycle().removeObserver(b);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @androidx.lifecycle.o(Lifecycle.Event.ON_START)
        public void onStart(f5z f5zVar) {
            this.b.e(f5zVar);
        }

        @androidx.lifecycle.o(Lifecycle.Event.ON_STOP)
        public void onStop(f5z f5zVar) {
            this.b.f(f5zVar);
        }
    }

    public final void a(@NonNull d4z d4zVar, @NonNull List list) {
        synchronized (this.a) {
            obr.b(!list.isEmpty());
            f5z f = d4zVar.f();
            Iterator it = ((Set) this.c.get(b(f))).iterator();
            while (it.hasNext()) {
                d4z d4zVar2 = (d4z) this.b.get((a) it.next());
                d4zVar2.getClass();
                if (!d4zVar2.equals(d4zVar) && !d4zVar2.i().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                synchronized (d4zVar.d.h) {
                }
                synchronized (d4zVar.b) {
                    d4zVar.d.a(list);
                }
                if (f.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
                    e(f);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    public final b b(f5z f5zVar) {
        synchronized (this.a) {
            try {
                for (b bVar : this.c.keySet()) {
                    if (f5zVar.equals(bVar.c)) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(f5z f5zVar) {
        synchronized (this.a) {
            try {
                b b2 = b(f5zVar);
                if (b2 == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(b2)).iterator();
                while (it.hasNext()) {
                    d4z d4zVar = (d4z) this.b.get((a) it.next());
                    d4zVar.getClass();
                    if (!d4zVar.i().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(d4z d4zVar) {
        synchronized (this.a) {
            try {
                f5z f = d4zVar.f();
                en5 en5Var = new en5(f, d4zVar.d.e);
                b b2 = b(f);
                Set hashSet = b2 != null ? (Set) this.c.get(b2) : new HashSet();
                hashSet.add(en5Var);
                this.b.put(en5Var, d4zVar);
                if (b2 == null) {
                    b bVar = new b(f, this);
                    this.c.put(bVar, hashSet);
                    f.getLifecycle().addObserver(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(f5z f5zVar) {
        synchronized (this.a) {
            try {
                if (c(f5zVar)) {
                    if (this.d.isEmpty()) {
                        this.d.push(f5zVar);
                    } else {
                        f5z peek = this.d.peek();
                        if (!f5zVar.equals(peek)) {
                            g(peek);
                            this.d.remove(f5zVar);
                            this.d.push(f5zVar);
                        }
                    }
                    h(f5zVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(f5z f5zVar) {
        synchronized (this.a) {
            try {
                this.d.remove(f5zVar);
                g(f5zVar);
                if (!this.d.isEmpty()) {
                    h(this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(f5z f5zVar) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(b(f5zVar))).iterator();
                while (it.hasNext()) {
                    d4z d4zVar = (d4z) this.b.get((a) it.next());
                    d4zVar.getClass();
                    d4zVar.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(f5z f5zVar) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(b(f5zVar))).iterator();
                while (it.hasNext()) {
                    d4z d4zVar = (d4z) this.b.get((a) it.next());
                    d4zVar.getClass();
                    if (!d4zVar.i().isEmpty()) {
                        d4zVar.k();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
