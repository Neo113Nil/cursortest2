package xsna;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ub9;

/* compiled from: SurfaceRequest.java */
/* loaded from: classes11.dex */
public final class zjn0 {
    public final Size a;
    public final boolean b;
    public final CameraInternal c;
    public final ub9.d d;
    public final ub9.a<Surface> e;
    public final ub9.d f;
    public final ub9.a<Void> g;
    public final b h;

    @Nullable
    public bo5 i;

    @Nullable
    public v5d0 j;

    @Nullable
    public Executor k;

    /* compiled from: SurfaceRequest.java */
    public class a implements o0t<Void> {
        public final /* synthetic */ ub9.a b;
        public final /* synthetic */ ub9.d c;

        public a(ub9.a aVar, ub9.d dVar) {
            this.b = aVar;
            this.c = dVar;
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            if (th instanceof e) {
                obr.f(null, this.c.cancel(false));
            } else {
                obr.f(null, this.b.b(null));
            }
        }

        @Override // xsna.o0t
        public final void onSuccess(@Nullable Void r2) {
            obr.f(null, this.b.b(null));
        }
    }

    /* compiled from: SurfaceRequest.java */
    public class b extends DeferrableSurface {
        public b() {
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        @NonNull
        public final ugz<Surface> e() {
            return zjn0.this.d;
        }
    }

    /* compiled from: SurfaceRequest.java */
    public class c implements o0t<Surface> {
        public final /* synthetic */ ugz b;
        public final /* synthetic */ ub9.a c;
        public final /* synthetic */ String d;

        public c(ugz ugzVar, ub9.a aVar, String str) {
            this.b = ugzVar;
            this.c = aVar;
            this.d = str;
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            boolean z = th instanceof CancellationException;
            ub9.a aVar = this.c;
            if (z) {
                obr.f(null, aVar.d(new e(i5s.a(new StringBuilder(), this.d, " cancelled."), th)));
            } else {
                aVar.b(null);
            }
        }

        @Override // xsna.o0t
        public final void onSuccess(@Nullable Surface surface) {
            r0t.f(true, this.b, this.c, xo9.g());
        }
    }

    /* compiled from: SurfaceRequest.java */
    public class d implements o0t<Void> {
        public final /* synthetic */ o7j b;
        public final /* synthetic */ Surface c;

        public d(o7j o7jVar, Surface surface) {
            this.b = o7jVar;
            this.c = surface;
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            obr.f("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof e);
            this.b.accept(new ao5(1, this.c));
        }

        @Override // xsna.o0t
        public final void onSuccess(@Nullable Void r3) {
            this.b.accept(new ao5(0, this.c));
        }
    }

    /* compiled from: SurfaceRequest.java */
    public static final class e extends RuntimeException {
    }

    /* compiled from: SurfaceRequest.java */
    public static abstract class f {
        public abstract int a();

        @NonNull
        public abstract Surface b();
    }

    /* compiled from: SurfaceRequest.java */
    public static abstract class g {
        @NonNull
        public abstract Rect a();

        public abstract int b();

        public abstract int c();
    }

    /* compiled from: SurfaceRequest.java */
    public interface h {
    }

    public zjn0(@NonNull Size size, @NonNull CameraInternal cameraInternal, boolean z) {
        this.a = size;
        this.c = cameraInternal;
        this.b = z;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + X3.j.e;
        AtomicReference atomicReference = new AtomicReference(null);
        ub9.d a2 = ub9.a(new rj7(atomicReference, str));
        ub9.a<Void> aVar = (ub9.a) atomicReference.get();
        aVar.getClass();
        this.g = aVar;
        AtomicReference atomicReference2 = new AtomicReference(null);
        ub9.d a3 = ub9.a(new u2t(atomicReference2, str));
        this.f = a3;
        r0t.a(a3, new a(aVar, a2), xo9.g());
        ub9.a aVar2 = (ub9.a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        ub9.d a4 = ub9.a(new uj0(atomicReference3, str));
        this.d = a4;
        ub9.a<Surface> aVar3 = (ub9.a) atomicReference3.get();
        aVar3.getClass();
        this.e = aVar3;
        b bVar = new b();
        this.h = bVar;
        ugz e2 = r0t.e(bVar.e);
        r0t.a(a4, new c(e2, aVar2, str), xo9.g());
        e2.addListener(new u12(this, 12), xo9.g());
    }

    public final void a(@NonNull Surface surface, @NonNull Executor executor, @NonNull o7j<f> o7jVar) {
        if (!this.e.b(surface)) {
            ub9.d dVar = this.d;
            if (!dVar.isCancelled()) {
                obr.f(null, dVar.c.isDone());
                try {
                    dVar.get();
                    executor.execute(new xz3(5, o7jVar, surface));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new vo2(5, o7jVar, surface));
                    return;
                }
            }
        }
        r0t.a(this.f, new d(o7jVar, surface), executor);
    }
}
