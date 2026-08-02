package xsna;

/* compiled from: VkLinkAnnotation.kt */
/* loaded from: classes17.dex */
public final class h2v0 {
    public final String a;
    public final zqv0 b;
    public final i9z c;

    public h2v0(String str, zqv0 zqv0Var, i9z i9zVar) {
        this.a = str;
        this.b = zqv0Var;
        this.c = i9zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2v0)) {
            return false;
        }
        h2v0 h2v0Var = (h2v0) obj;
        return epx.f(this.a, h2v0Var.a) && epx.f(this.b, h2v0Var.b) && epx.f(this.c, h2v0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zqv0 zqv0Var = this.b;
        int hashCode2 = (hashCode + (zqv0Var != null ? zqv0Var.hashCode() : 0)) * 31;
        i9z i9zVar = this.c;
        return hashCode2 + (i9zVar != null ? i9zVar.hashCode() : 0);
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VkLinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
