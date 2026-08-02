package defpackage;

import kotlin.sequences.b;

/* loaded from: classes5.dex */
public final class pym implements rym {
    @Override // defpackage.rym
    public final Double a(Double d, mp60 mp60Var, boolean z) {
        Double valueOf;
        s5r s5rVar = new s5r(b.o(b.g(new h73(1, ((xy40) mp60Var).i()), new yce(z, 4)), new urm(5)));
        if (s5rVar.hasNext()) {
            double doubleValue = ((Number) s5rVar.next()).doubleValue();
            while (s5rVar.hasNext()) {
                doubleValue = Math.max(doubleValue, ((Number) s5rVar.next()).doubleValue());
            }
            valueOf = Double.valueOf(doubleValue);
        } else {
            valueOf = null;
        }
        return d == null ? valueOf : valueOf == null ? d : Double.valueOf(Math.max(d.doubleValue(), valueOf.doubleValue()));
    }
}
