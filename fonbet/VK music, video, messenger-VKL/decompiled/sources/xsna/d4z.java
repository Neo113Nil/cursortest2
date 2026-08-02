package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LifecycleCamera.java */
/* loaded from: classes11.dex */
public final class d4z implements e5z, lf9 {
    public final f5z c;
    public final CameraUseCaseAdapter d;
    public final Object b = new Object();
    public boolean e = false;

    public d4z(f5z f5zVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.c = f5zVar;
        this.d = cameraUseCaseAdapter;
        if (f5zVar.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.f();
        } else {
            cameraUseCaseAdapter.j();
        }
        f5zVar.getLifecycle().addObserver(this);
    }

    @NonNull
    public final CameraControlInternal a() {
        return this.d.b.h();
    }

    @NonNull
    public final ui9 b() {
        return this.d.b.c();
    }

    public final f5z f() {
        f5z f5zVar;
        synchronized (this.b) {
            f5zVar = this.c;
        }
        return f5zVar;
    }

    @NonNull
    public final List<vfq0> i() {
        List<vfq0> unmodifiableList;
        synchronized (this.b) {
            unmodifiableList = Collections.unmodifiableList(this.d.k());
        }
        return unmodifiableList;
    }

    public final void j() {
        synchronized (this.b) {
            try {
                if (this.e) {
                    return;
                }
                onStop(this.c);
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.b) {
            try {
                if (this.e) {
                    this.e = false;
                    if (this.c.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
                        onStart(this.c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(f5z f5zVar) {
        synchronized (this.b) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.d;
            cameraUseCaseAdapter.l((ArrayList) cameraUseCaseAdapter.k());
        }
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_START)
    public void onStart(f5z f5zVar) {
        synchronized (this.b) {
            try {
                if (!this.e) {
                    this.d.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_STOP)
    public void onStop(f5z f5zVar) {
        synchronized (this.b) {
            try {
                if (!this.e) {
                    this.d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
