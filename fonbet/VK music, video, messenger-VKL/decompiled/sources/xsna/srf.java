package xsna;

import xsna.uuf;

/* compiled from: ClipsWrapperImmediateViewState.kt */
/* loaded from: classes17.dex */
public final class srf {
    public final uuf.f a;
    public final uuf.j b;
    public final uuf.g c;
    public final uuf.e d;
    public final uuf.i e;
    public final uuf.c f;

    public srf(zrf zrfVar, euf eufVar, lsf lsfVar, uuf.e eVar, wtf wtfVar, uuf.c cVar) {
        this.a = zrfVar;
        this.b = eufVar;
        this.c = lsfVar;
        this.d = eVar;
        this.e = wtfVar;
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srf)) {
            return false;
        }
        srf srfVar = (srf) obj;
        return epx.f(this.a, srfVar.a) && epx.f(this.b, srfVar.b) && epx.f(this.c, srfVar.c) && epx.f(this.d, srfVar.d) && epx.f(this.e, srfVar.e) && epx.f(this.f, srfVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClipsWrapperImmediateViewState(items=" + this.a + ", title=" + this.b + ", navigationButton=" + this.c + ", extraButtons=" + this.d + ", statistics=" + this.e + ", decoration=" + this.f + ')';
    }
}
