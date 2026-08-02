package yads;

/* loaded from: classes10.dex */
public final class h4 extends mn3 {
    public static final /* synthetic */ int d = 0;
    public final m4 c;

    public h4(m4 m4Var, g92 g92Var) {
        super(g92Var);
        this.c = m4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return h4.class.equals(obj != null ? obj.getClass() : null) && this.c == ((h4) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
