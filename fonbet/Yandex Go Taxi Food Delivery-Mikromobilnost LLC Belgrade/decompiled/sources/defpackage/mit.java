package defpackage;

/* loaded from: classes14.dex */
public final class mit implements uej {
    public final o2y0 a;
    public final pzi0 b;

    public mit(o2y0 o2y0Var, pzi0 pzi0Var) {
        this.a = o2y0Var;
        this.b = pzi0Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        mit mitVar = (mit) obj;
        return this.a == mitVar.a && this.b.test(mitVar.b);
    }
}
