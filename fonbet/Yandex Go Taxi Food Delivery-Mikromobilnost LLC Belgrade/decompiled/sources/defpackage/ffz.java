package defpackage;

/* loaded from: classes2.dex */
public final class ffz {
    public final efz a;
    public final efz b;
    public final efz c;
    public final efz d;
    public final efz e;
    public final efz f;
    public final efz g;
    public final efz h;
    public final efz i;
    public final efz j;

    public ffz(efz efzVar, efz efzVar2, efz efzVar3, efz efzVar4, efz efzVar5, efz efzVar6, efz efzVar7, efz efzVar8, efz efzVar9, efz efzVar10) {
        this.a = efzVar;
        this.b = efzVar2;
        this.c = efzVar3;
        this.d = efzVar4;
        this.e = efzVar5;
        this.f = efzVar6;
        this.g = efzVar7;
        this.h = efzVar8;
        this.i = efzVar9;
        this.j = efzVar10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffz)) {
            return false;
        }
        ffz ffzVar = (ffz) obj;
        return this.a.equals(ffzVar.a) && this.b.equals(ffzVar.b) && this.c.equals(ffzVar.c) && this.d.equals(ffzVar.d) && this.e.equals(ffzVar.e) && this.f.equals(ffzVar.f) && this.g.equals(ffzVar.g) && this.h.equals(ffzVar.h) && this.i.equals(ffzVar.i) && this.j.equals(ffzVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LogDetails(sessionId=" + this.a + ", timestamp=" + this.b + ", tag=" + this.c + ", level=" + this.d + ", rawLevel=" + this.e + ", message=" + this.f + ", location=" + this.g + ", function=" + this.h + ", thread=" + this.i + ", threadSequence=" + this.j + ')';
    }
}
