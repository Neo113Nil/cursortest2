package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes6.dex */
public final class tmm0<T> implements Comparator {
    public final /* synthetic */ smm0 b;

    public tmm0(smm0 smm0Var) {
        this.b = smm0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        otz otzVar = (otz) t;
        smm0 smm0Var = this.b;
        smm0Var.d(otzVar);
        Integer b = otzVar.b();
        otz otzVar2 = (otz) t2;
        smm0Var.d(otzVar2);
        return jw5.b(b, otzVar2.b());
    }
}
