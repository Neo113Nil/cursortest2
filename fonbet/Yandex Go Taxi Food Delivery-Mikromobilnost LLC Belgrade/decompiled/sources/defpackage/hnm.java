package defpackage;

/* loaded from: classes5.dex */
public final class hnm {
    public final ssd0 a;
    public final String b;

    public hnm(ssd0 ssd0Var, String str) {
        this.a = ssd0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hnm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hnm hnmVar = (hnm) obj;
        return this.a.equals(hnmVar.a) && jl40.l(this.b, hnmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
