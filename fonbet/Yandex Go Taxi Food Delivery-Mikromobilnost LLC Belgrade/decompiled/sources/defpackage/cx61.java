package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes4.dex */
public final class cx61 extends SoftReference implements uv61 {
    public Object a;
    public long b;

    @Override // defpackage.uv61
    public final boolean a(long j) {
        boolean z = j <= this.b && get() != 0;
        if (!z) {
            a();
        }
        return z;
    }

    @Override // defpackage.uv61
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.uv61
    public final Object c() {
        return get();
    }

    @Override // defpackage.uv61
    public final void a() {
        clear();
        this.a = null;
        this.b = -1L;
    }
}
