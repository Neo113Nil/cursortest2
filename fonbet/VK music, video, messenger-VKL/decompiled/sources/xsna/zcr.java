package xsna;

import android.view.ViewGroup;

/* compiled from: ProductFilterAdapter.kt */
/* loaded from: classes18.dex */
public final class zcr extends p1u0<vcr<?>> {
    public final int a;
    public final izs<ViewGroup, vfz<? extends vcr<?>>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public zcr(int i, izs<? super ViewGroup, ? extends vfz<? extends vcr<?>>> izsVar) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vcr<?>> b(ViewGroup viewGroup) {
        return this.b.invoke(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof vcr) && ((vcr) hfzVar).c() == this.a;
    }
}
