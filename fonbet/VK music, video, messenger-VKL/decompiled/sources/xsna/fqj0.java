package xsna;

import android.view.ViewGroup;
import xsna.hfz;

/* compiled from: SimpleDelegate.kt */
/* loaded from: classes17.dex */
public final class fqj0<T extends hfz> extends p1u0<T> {
    public final Class<?> a;
    public final izs<ViewGroup, vfz<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public fqj0(Class<?> cls, izs<? super ViewGroup, ? extends vfz<T>> izsVar) {
        this.a = cls;
        this.b = izsVar;
    }

    @Override // xsna.p1u0
    public final vfz<T> b(ViewGroup viewGroup) {
        return this.b.invoke(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return this.a.isAssignableFrom(hfzVar.getClass());
    }
}
