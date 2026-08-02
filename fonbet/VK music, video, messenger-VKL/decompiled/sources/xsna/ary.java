package xsna;

/* compiled from: LazyGridItemProvider.kt */
/* loaded from: classes11.dex */
public final class ary implements yqy {
    public final dsy a;
    public final wqy b;
    public final androidx.compose.foundation.lazy.layout.d c;

    public ary(dsy dsyVar, wqy wqyVar, androidx.compose.foundation.lazy.layout.d dVar) {
        this.a = dsyVar;
        this.b = wqyVar;
        this.c = dVar;
    }

    @Override // xsna.yqy
    public final jty a() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final int b(Object obj) {
        return this.c.b(obj);
    }

    @Override // xsna.yqy
    public final ng50 c() {
        this.b.getClass();
        return b9x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ary)) {
            return false;
        }
        return epx.f(this.b, ((ary) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final void f(int i, Object obj, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        Object obj2;
        androidx.compose.runtime.a M = aVar.M(1493551140);
        int i4 = (M.o(i) ? 4 : 2) | i2 | (M.y(obj) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1493551140, i4, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:79)");
            }
            i3 = i;
            obj2 = obj;
            jvi.a(obj2, i3, this.a.q, kai.c(726189336, new zqy(this, i), M), M, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = i;
            obj2 = obj;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o7c(this, i3, obj2, i2);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final Object g(int i) {
        return this.b.k(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final int getItemCount() {
        return this.b.l().b;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final Object h(int i) {
        Object a = this.c.a(i);
        return a == null ? this.b.m(i) : a;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.yqy
    public final xry i() {
        return this.b.a;
    }
}
