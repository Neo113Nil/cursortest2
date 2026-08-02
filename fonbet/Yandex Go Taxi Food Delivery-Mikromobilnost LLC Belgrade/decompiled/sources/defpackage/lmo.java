package defpackage;

/* loaded from: classes5.dex */
public final class lmo {
    public final ssd0 a;
    public final hnm b;
    public final String c;

    public lmo(ssd0 ssd0Var, hnm hnmVar, String str) {
        this.a = ssd0Var;
        this.b = hnmVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lmo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lmo lmoVar = (lmo) obj;
        return this.a.equals(lmoVar.a) && this.b.equals(lmoVar.b) && jl40.l(this.c, lmoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
