package xsna;

import android.content.Context;

/* compiled from: LocalizedText.kt */
/* loaded from: classes5.dex */
public final class dxz<T> implements wwz {
    public final T a;
    public final cxz<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public dxz(T t, cxz<? super T> cxzVar) {
        this.a = t;
        this.b = cxzVar;
    }

    @Override // xsna.wwz
    public final String a(Context context) {
        return this.b.a(context, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxz)) {
            return false;
        }
        dxz dxzVar = (dxz) obj;
        return epx.f(this.a, dxzVar.a) && epx.f(this.b, dxzVar.b);
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + '}';
    }
}
