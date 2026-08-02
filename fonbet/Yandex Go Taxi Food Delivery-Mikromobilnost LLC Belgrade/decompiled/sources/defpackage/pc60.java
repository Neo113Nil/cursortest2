package defpackage;

/* loaded from: classes.dex */
public final class pc60 implements oc60 {
    public final hc60 a;
    public final w030 b;
    public final i130 c;

    public pc60(hc60 hc60Var, w030 w030Var, i130 i130Var) {
        this.a = hc60Var;
        this.b = w030Var;
        this.c = i130Var;
    }

    public final ej1 b(boolean z) {
        w030 a = z ? this.c.a() : this.b;
        mc mcVar = this.a.a;
        return new ej1((y50) mcVar.a.get(), (lc60) mcVar.b.get(), a, 12);
    }
}
