package defpackage;

/* loaded from: classes14.dex */
public final class pp70 implements uej {
    public final o2y0 a;
    public final String b;

    public pp70(o2y0 o2y0Var, String str) {
        this.a = o2y0Var;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        pp70 pp70Var = (pp70) obj;
        return this.b.equals(pp70Var.b) && this.a == pp70Var.a;
    }
}
