package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class dgx extends n3a {
    public final n3a a;
    public final String b;

    public dgx(String str, n3a n3aVar) {
        this.a = n3aVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgx)) {
            return false;
        }
        dgx dgxVar = (dgx) obj;
        return epx.f(this.a, dgxVar.a) && epx.f(this.b, dgxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalCommand(wrappedCmd=");
        sb.append(this.a);
        sb.append(", entryPointToken=");
        return ho8.a(sb, this.b, ')');
    }
}
