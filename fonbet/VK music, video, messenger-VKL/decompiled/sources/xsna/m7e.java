package xsna;

/* compiled from: ClipsFeedItemSideControlsConfig.kt */
/* loaded from: classes16.dex */
public final class m7e {
    public final c3f0 a;
    public final ceg b;
    public final yaj0 c;
    public final dtq d;
    public final r830 e;

    public m7e() {
        this((c3f0) null, (ceg) null, (yaj0) null, (dtq) null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7e)) {
            return false;
        }
        m7e m7eVar = (m7e) obj;
        return epx.f(this.a, m7eVar.a) && epx.f(this.b, m7eVar.b) && epx.f(this.c, m7eVar.c) && epx.f(this.d, m7eVar.d) && epx.f(this.e, m7eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClipsFeedItemSideControlsConfig(reactionsConfig=" + this.a + ", commentsConfig=" + this.b + ", sharesConfig=" + this.c + ", favoritesConfig=" + this.d + ", moreConfig=" + this.e + ')';
    }

    public m7e(c3f0 c3f0Var, ceg cegVar, yaj0 yaj0Var, dtq dtqVar, r830 r830Var) {
        this.a = c3f0Var;
        this.b = cegVar;
        this.c = yaj0Var;
        this.d = dtqVar;
        this.e = r830Var;
    }

    public /* synthetic */ m7e(c3f0 c3f0Var, ceg cegVar, yaj0 yaj0Var, dtq dtqVar, int i) {
        this((i & 1) != 0 ? new c3f0(0) : c3f0Var, (i & 2) != 0 ? new ceg(null, null, 15) : cegVar, (i & 4) != 0 ? new yaj0(null, null, 15) : yaj0Var, (i & 8) != 0 ? new dtq(null, 7) : dtqVar, new r830(0));
    }
}
