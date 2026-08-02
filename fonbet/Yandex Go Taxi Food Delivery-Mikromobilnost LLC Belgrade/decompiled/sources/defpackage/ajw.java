package defpackage;

/* loaded from: classes14.dex */
public final class ajw {
    public final ziw a;
    public final ziw b;

    public ajw(ziw ziwVar, ziw ziwVar2) {
        this.a = ziwVar;
        this.b = ziwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajw)) {
            return false;
        }
        ajw ajwVar = (ajw) obj;
        return jl40.l(this.a, ajwVar.a) && jl40.l(this.b, ajwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
