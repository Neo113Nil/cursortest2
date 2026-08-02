package defpackage;

import java.lang.ref.WeakReference;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class h010 {
    public final nq2 a;
    public final oep0 b;
    public WeakReference c = new WeakReference(null);

    public h010(nq2 nq2Var, oep0 oep0Var) {
        this.a = nq2Var;
        this.b = oep0Var;
    }

    public final void a(bn30 bn30Var, b bVar) {
        m950 m950Var = (nz00) this.c.get();
        if (m950Var != null) {
            ((h55) m950Var).i();
        }
        nz00 nz00Var = (nz00) this.a.get();
        mz00 mz00Var = new mz00(bVar, bn30Var, 8);
        this.c = new WeakReference(nz00Var);
        ((pep0) this.b).f(nz00Var, mz00Var, hxx.a);
    }
}
