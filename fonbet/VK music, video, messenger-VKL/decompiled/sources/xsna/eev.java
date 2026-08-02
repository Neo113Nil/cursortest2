package xsna;

/* compiled from: GamesHorizontalList.kt */
/* loaded from: classes17.dex */
public final class eev {
    public final boolean a;
    public final rha b;
    public final xvy c;

    public eev(boolean z, rha rhaVar, xvy xvyVar) {
        this.a = z;
        this.b = rhaVar;
        this.c = xvyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eev)) {
            return false;
        }
        eev eevVar = (eev) obj;
        return this.a == eevVar.a && epx.f(this.b, eevVar.b) && epx.f(this.c, eevVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "HorizontalListConfig(isHighResolution=" + this.a + ", catalogToggleData=" + this.b + ", parentListState=" + this.c + ')';
    }
}
