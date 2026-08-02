package xsna;

/* compiled from: ClipsFeedItemSideControlsState.kt */
/* loaded from: classes16.dex */
public final class n7e {
    public final q6f0 a;
    public final ggg b;
    public final abj0 c;
    public final itq d;
    public final t930 e;

    public n7e(q6f0 q6f0Var, ggg gggVar, abj0 abj0Var, itq itqVar, t930 t930Var) {
        this.a = q6f0Var;
        this.b = gggVar;
        this.c = abj0Var;
        this.d = itqVar;
        this.e = t930Var;
    }

    public static n7e a(n7e n7eVar, q6f0 q6f0Var, itq itqVar, int i) {
        if ((i & 1) != 0) {
            q6f0Var = n7eVar.a;
        }
        q6f0 q6f0Var2 = q6f0Var;
        ggg gggVar = n7eVar.b;
        abj0 abj0Var = n7eVar.c;
        if ((i & 8) != 0) {
            itqVar = n7eVar.d;
        }
        t930 t930Var = n7eVar.e;
        n7eVar.getClass();
        return new n7e(q6f0Var2, gggVar, abj0Var, itqVar, t930Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7e)) {
            return false;
        }
        n7e n7eVar = (n7e) obj;
        return epx.f(this.a, n7eVar.a) && epx.f(this.b, n7eVar.b) && epx.f(this.c, n7eVar.c) && epx.f(this.d, n7eVar.d) && epx.f(this.e, n7eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClipsFeedItemSideControlsState(reactionsState=" + this.a + ", commentsState=" + this.b + ", sharesState=" + this.c + ", favoritesState=" + this.d + ", moreState=" + this.e + ')';
    }

    public n7e() {
        this(new q6f0((e7z) null, (zbn) null, 7), new ggg((ceg) null, 3), new abj0((yaj0) null, 3), new itq(null, 7), new t930((r830) null, 3));
    }
}
