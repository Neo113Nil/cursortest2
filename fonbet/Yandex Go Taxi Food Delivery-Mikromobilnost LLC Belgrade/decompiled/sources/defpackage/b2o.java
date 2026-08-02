package defpackage;

import com.bumptech.glide.load.engine.c;

/* loaded from: classes10.dex */
public final class b2o implements otj0 {
    public final boolean a;
    public final boolean b;
    public final otj0 c;
    public final c w;
    public final khx x;
    public int y;
    public boolean z;

    public b2o(otj0 otj0Var, boolean z, boolean z2, khx khxVar, c cVar) {
        z2a1.e(otj0Var, "Argument must not be null");
        this.c = otj0Var;
        this.a = z;
        this.b = z2;
        this.x = khxVar;
        z2a1.e(cVar, "Argument must not be null");
        this.w = cVar;
    }

    @Override // defpackage.otj0
    public final synchronized void a() {
        if (this.y > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.z) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.z = true;
        if (this.b) {
            this.c.a();
        }
    }

    @Override // defpackage.otj0
    public final Class b() {
        return this.c.b();
    }

    public final synchronized void c() {
        if (this.z) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.y++;
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            int i = this.y;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.y = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.w.d(this.x, this);
        }
    }

    @Override // defpackage.otj0
    public final Object get() {
        return this.c.get();
    }

    @Override // defpackage.otj0
    public final int getSize() {
        return this.c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.w + ", key=" + this.x + ", acquired=" + this.y + ", isRecycled=" + this.z + ", resource=" + this.c + '}';
    }
}
