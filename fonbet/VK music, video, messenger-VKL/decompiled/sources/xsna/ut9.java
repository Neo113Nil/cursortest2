package xsna;

/* compiled from: ProfileCard.kt */
/* loaded from: classes16.dex */
public final class ut9 {
    public final phw a;
    public final com.vk.core.compose.component.semantics.a b;
    public final gzs<s3q0> c;

    public ut9() {
        throw null;
    }

    public ut9(phw phwVar, com.vk.core.compose.component.semantics.a aVar, gzs gzsVar) {
        this.a = phwVar;
        this.b = aVar;
        this.c = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut9)) {
            return false;
        }
        ut9 ut9Var = (ut9) obj;
        return epx.f(this.a, ut9Var.a) && epx.f(this.b, ut9Var.b) && epx.f(this.c, ut9Var.c);
    }

    public final int hashCode() {
        phw phwVar = this.a;
        int b = qoy.b((phwVar == null ? 0 : phwVar.hashCode()) * 31, 31, false);
        com.vk.core.compose.component.semantics.a aVar = this.b;
        int hashCode = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
        gzs<s3q0> gzsVar = this.c;
        return hashCode + (gzsVar != null ? gzsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(content=");
        sb.append(this.a);
        sb.append(", isNft=false, semanticsConfiguration=");
        sb.append(this.b);
        sb.append(", onClick=");
        return uf3.d(sb, this.c, ')');
    }
}
