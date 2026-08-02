package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class p550 extends t550 {
    public final Class r;

    public p550(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            w511.g(cls, " does not implement Parcelable.");
            throw null;
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            ny61.j(e);
            throw null;
        }
    }

    @Override // defpackage.t550
    public final Object a(Bundle bundle, String str) {
        return (Parcelable[]) bundle.get(str);
    }

    @Override // defpackage.t550
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.t550
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // defpackage.t550
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p550.class.equals(obj.getClass())) {
            return false;
        }
        return jl40.l(this.r, ((p550) obj).r);
    }

    @Override // defpackage.t550
    public final boolean f(Object obj, Object obj2) {
        return d73.b((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
