package xsna;

import java.util.List;

/* compiled from: SemanticsUtils.android.kt */
/* loaded from: classes11.dex */
public final class jgi0 {
    public final xfi0 a;
    public final qg50 b;

    public jgi0(igi0 igi0Var, f9x<lgi0> f9xVar) {
        this.a = igi0Var.d;
        List j = igi0.j(4, igi0Var);
        this.b = new qg50(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            igi0 igi0Var2 = (igi0) j.get(i);
            if (f9xVar.a(igi0Var2.f)) {
                this.b.b(igi0Var2.f);
            }
        }
    }
}
