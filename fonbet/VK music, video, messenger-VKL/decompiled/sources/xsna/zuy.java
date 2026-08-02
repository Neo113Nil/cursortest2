package xsna;

/* compiled from: LazyListItemProvider.kt */
/* loaded from: classes11.dex */
public final class zuy implements yuy {
    public final xvy a;
    public final wuy b;
    public final lsy c;
    public final androidx.compose.foundation.lazy.layout.d d;

    public zuy(xvy xvyVar, wuy wuyVar, lsy lsyVar, androidx.compose.foundation.lazy.layout.d dVar) {
        this.a = xvyVar;
        this.b = wuyVar;
        this.c = lsyVar;
        this.d = dVar;
    }

    @Override // xsna.yuy
    public final jty a() {
        return this.d;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final int b(Object obj) {
        return this.d.b(obj);
    }

    @Override // xsna.yuy
    public final ng50 c() {
        ng50 ng50Var = this.b.b;
        return ng50Var != null ? ng50Var : b9x.a;
    }

    @Override // xsna.yuy
    public final lsy e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuy)) {
            return false;
        }
        return epx.f(this.b, ((zuy) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final void f(int i, Object obj, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-462424778);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.y(obj) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:76)");
            }
            jvi.a(obj, i, this.a.s, kai.c(-824725566, new joa(this, i, 2), M), M, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ohf(i, i2, 2, this, obj);
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
        Object a = this.d.a(i);
        return a == null ? this.b.m(i) : a;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
