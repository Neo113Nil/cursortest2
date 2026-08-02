package xsna;

/* compiled from: ReviewBlockTextBody.kt */
/* loaded from: classes18.dex */
public final class sgg0 {
    public final us2 a;
    public final boolean b;
    public final gzs<s3q0> c;

    public sgg0() {
        throw null;
    }

    public sgg0(us2 us2Var, boolean z, gzs gzsVar) {
        this.a = us2Var;
        this.b = z;
        this.c = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgg0)) {
            return false;
        }
        sgg0 sgg0Var = (sgg0) obj;
        return epx.f(this.a, sgg0Var.a) && this.b == sgg0Var.b && epx.f(this.c, sgg0Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, false);
        gzs<s3q0> gzsVar = this.c;
        return (b + (gzsVar != null ? gzsVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "ReviewBlockTextBody(text=" + ((Object) this.a) + ", isExpanded=" + this.b + ", showCollapseText=false, onExpand=" + this.c + ", onCollapse=null)";
    }
}
