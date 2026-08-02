package defpackage;

/* loaded from: classes2.dex */
public final class h560 implements hs31 {
    public final b560 a;
    public final px90 b;
    public final p560 c;
    public final cg8 w;

    public h560(b560 b560Var, px90 px90Var, p560 p560Var, cg8 cg8Var) {
        this.a = b560Var;
        this.b = px90Var;
        this.c = p560Var;
        this.w = cg8Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (!cls.equals(k560.class)) {
            ny61.r("Unknown view model");
            return null;
        }
        return new k560(this.a, this.b, this.c, this.w);
    }
}
