package xsna;

import androidx.annotation.NonNull;

/* compiled from: EngineResource.java */
/* loaded from: classes12.dex */
public final class vlp<Z> implements hag0<Z> {
    public final boolean b;
    public final boolean c;
    public final hag0<Z> d;
    public final a e;
    public final ady f;
    public int g;
    public boolean h;

    /* compiled from: EngineResource.java */
    public interface a {
        void a(ady adyVar, vlp<?> vlpVar);
    }

    public vlp(hag0<Z> hag0Var, boolean z, boolean z2, ady adyVar, a aVar) {
        nr2.r(hag0Var, "Argument must not be null");
        this.d = hag0Var;
        this.b = z;
        this.c = z2;
        this.f = adyVar;
        nr2.r(aVar, "Argument must not be null");
        this.e = aVar;
    }

    @Override // xsna.hag0
    public final synchronized void a() {
        if (this.g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.h = true;
        if (this.c) {
            this.d.a();
        }
    }

    @Override // xsna.hag0
    @NonNull
    public final Class<Z> b() {
        return this.d.b();
    }

    public final synchronized void c() {
        if (this.h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.g++;
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            int i = this.g;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.g = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.e.a(this.f, this);
        }
    }

    @Override // xsna.hag0
    @NonNull
    public final Z get() {
        return this.d.get();
    }

    @Override // xsna.hag0
    public final int getSize() {
        return this.d.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.b + ", listener=" + this.e + ", key=" + this.f + ", acquired=" + this.g + ", isRecycled=" + this.h + ", resource=" + this.d + '}';
    }
}
