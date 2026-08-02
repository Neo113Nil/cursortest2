package defpackage;

/* loaded from: classes14.dex */
public final class bjw extends hjw {
    public final String a;
    public final ajw b;
    public final xy40 c;
    public final hz40 d;

    static {
        Object[] objArr = np60.a;
        long[] jArr = cmm0.a;
    }

    public bjw(String str, ajw ajwVar, xy40 xy40Var, hz40 hz40Var) {
        this.a = str;
        this.b = ajwVar;
        this.c = xy40Var;
        this.d = hz40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjw)) {
            return false;
        }
        bjw bjwVar = (bjw) obj;
        return jl40.l(this.a, bjwVar.a) && this.b.equals(bjwVar.b) && this.c.equals(bjwVar.c) && this.d.equals(bjwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
