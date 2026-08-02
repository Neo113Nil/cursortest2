package yads;

/* loaded from: classes10.dex */
public final class mf2 implements xq {
    public static final mf2 c = new mf2(new dw0().a());
    public final ew0 b;

    public mf2(ew0 ew0Var) {
        this.b = ew0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mf2) {
            return this.b.equals(((mf2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
