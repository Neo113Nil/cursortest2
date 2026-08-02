package xsna;

/* compiled from: LazyLayoutPager.kt */
/* loaded from: classes11.dex */
public final class qb90 implements androidx.compose.foundation.lazy.layout.b {
    public final mc90 a;
    public final androidx.compose.foundation.lazy.layout.a<jb90> b;
    public final androidx.compose.foundation.lazy.layout.d c;

    public qb90(mc90 mc90Var, pb90 pb90Var, androidx.compose.foundation.lazy.layout.d dVar) {
        this.a = mc90Var;
        this.b = pb90Var;
        this.c = dVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final int b(Object obj) {
        return this.c.b(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb90)) {
            return false;
        }
        return epx.f(this.b, ((qb90) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final void f(int i, Object obj, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        Object obj2;
        androidx.compose.runtime.a M = aVar.M(-1201380429);
        int i4 = (M.o(i) ? 4 : 2) | i2 | (M.y(obj) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1201380429, i4, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:219)");
            }
            i3 = i;
            obj2 = obj;
            jvi.a(obj2, i3, this.a.z, kai.c(1142237095, new a71(this, i, 1), M), M, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
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
            s.d = new rc50(this, i3, obj2, i2);
        }
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
}
