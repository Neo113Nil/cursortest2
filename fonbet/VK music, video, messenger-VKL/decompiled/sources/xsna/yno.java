package xsna;

/* compiled from: DuplicateEventfulStateFilter.kt */
/* loaded from: classes3.dex */
public final class yno implements x0q {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.x0q
    public final boolean a(ry40 ry40Var, ry40 ry40Var2) {
        if (ry40Var == 0) {
            return true;
        }
        return !(((v0q) ry40Var2).a().getClass() == ((v0q) ry40Var).a().getClass() && ry40Var2.c.hashCode() == ry40Var.c.hashCode());
    }

    @Override // xsna.x0q
    public final String getTag() {
        return "DuplicateEventfulStateFilter";
    }
}
