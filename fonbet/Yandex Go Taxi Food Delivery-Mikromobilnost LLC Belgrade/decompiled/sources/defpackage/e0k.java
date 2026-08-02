package defpackage;

/* loaded from: classes8.dex */
public final class e0k {
    public final rkj a;
    public final rkj b;
    public final rkj c;
    public final rkj d;

    public e0k(int i) {
        this(new rkj(0), new rkj(0), new rkj(0), new rkj(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0k)) {
            return false;
        }
        e0k e0kVar = (e0k) obj;
        return jl40.l(this.a, e0kVar.a) && jl40.l(this.b, e0kVar.b) && jl40.l(this.c, e0kVar.c) && jl40.l(this.d, e0kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingsSettings(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ')';
    }

    public e0k(rkj rkjVar, rkj rkjVar2, rkj rkjVar3, rkj rkjVar4) {
        this.a = rkjVar;
        this.b = rkjVar2;
        this.c = rkjVar3;
        this.d = rkjVar4;
    }

    public e0k() {
        this(0);
    }
}
