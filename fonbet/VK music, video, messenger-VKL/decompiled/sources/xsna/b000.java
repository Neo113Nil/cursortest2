package xsna;

import androidx.annotation.NonNull;
import xsna.vuk0;
import xsna.yhq;

/* compiled from: LockedResource.java */
/* loaded from: classes12.dex */
public final class b000<Z> implements hag0<Z>, yhq.d {
    public static final yhq.c f = yhq.a(20, new a());
    public final vuk0.a b = new vuk0.a();
    public hag0<Z> c;
    public boolean d;
    public boolean e;

    /* compiled from: LockedResource.java */
    public class a implements yhq.b<b000<?>> {
        @Override // xsna.yhq.b
        public final b000<?> create() {
            return new b000<>();
        }
    }

    @Override // xsna.hag0
    public final synchronized void a() {
        this.b.a();
        this.e = true;
        if (!this.d) {
            this.c.a();
            this.c = null;
            f.a(this);
        }
    }

    @Override // xsna.hag0
    @NonNull
    public final Class<Z> b() {
        return this.c.b();
    }

    public final synchronized void c() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            a();
        }
    }

    @Override // xsna.hag0
    @NonNull
    public final Z get() {
        return this.c.get();
    }

    @Override // xsna.hag0
    public final int getSize() {
        return this.c.getSize();
    }

    @Override // xsna.yhq.d
    @NonNull
    public final vuk0.a h() {
        return this.b;
    }
}
