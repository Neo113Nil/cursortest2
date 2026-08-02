package xsna;

/* compiled from: CatalogEventBuses.kt */
/* loaded from: classes16.dex */
public final class z4a {
    public final m3a a;
    public final b5a b;

    public z4a(m3a m3aVar, b5a b5aVar) {
        this.a = m3aVar;
        this.b = b5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4a)) {
            return false;
        }
        z4a z4aVar = (z4a) obj;
        return epx.f(this.a, z4aVar.a) && epx.f(this.b, z4aVar.b);
    }

    public final int hashCode() {
        m3a m3aVar = this.a;
        int hashCode = (m3aVar == null ? 0 : m3aVar.hashCode()) * 31;
        b5a b5aVar = this.b;
        return hashCode + (b5aVar != null ? b5aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogEventBuses(catalogClickEventsBus=" + this.a + ", catalogAnalyticsEventsBus=" + this.b + ')';
    }
}
