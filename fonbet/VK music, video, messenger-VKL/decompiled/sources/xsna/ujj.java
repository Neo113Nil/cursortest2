package xsna;

/* compiled from: ContentProductsDependencies.kt */
/* loaded from: classes18.dex */
public final class ujj {
    public final q530 a;
    public final kw00 b;
    public final m08 c;
    public final rw9 d;
    public final isq e;
    public final xd10 f;
    public final sz00 g;
    public final kz00 h;
    public final fy9 i;
    public final maz j;
    public final lt00 k;

    public ujj(q530 q530Var, kw00 kw00Var, m08 m08Var, rw9 rw9Var, isq isqVar, yd10 yd10Var, sz00 sz00Var, kz00 kz00Var, fy9 fy9Var, maz mazVar, lt00 lt00Var) {
        this.a = q530Var;
        this.b = kw00Var;
        this.c = m08Var;
        this.d = rw9Var;
        this.e = isqVar;
        this.f = yd10Var;
        this.g = sz00Var;
        this.h = kz00Var;
        this.i = fy9Var;
        this.j = mazVar;
        this.k = lt00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujj)) {
            return false;
        }
        ujj ujjVar = (ujj) obj;
        return epx.f(this.a, ujjVar.a) && epx.f(this.b, ujjVar.b) && epx.f(this.c, ujjVar.c) && epx.f(this.d, ujjVar.d) && epx.f(this.e, ujjVar.e) && epx.f(this.f, ujjVar.f) && epx.f(this.g, ujjVar.g) && epx.f(this.h, ujjVar.h) && epx.f(this.i, ujjVar.i) && epx.f(this.j, ujjVar.j) && epx.f(this.k, ujjVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContentProductsDependencies(moderationWrapper=" + this.a + ", marketCountersManager=" + this.b + ", bookmarksManager=" + this.c + ", cartEventsManager=" + this.d + ", faveToggler=" + this.e + ", marketService=" + this.f + ", goodsRouter=" + this.g + ", goodDialogsRouter=" + this.h + ", cartRouter=" + this.i + ", linker=" + this.j + ", marketAnalytics=" + this.k + ')';
    }
}
