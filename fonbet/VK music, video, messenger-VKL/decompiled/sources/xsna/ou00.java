package xsna;

/* compiled from: MarketCatalogEvents.kt */
/* loaded from: classes16.dex */
public final class ou00 extends lu00 {
    public final String b;

    public ou00(String str) {
        super(str);
        this.b = str;
    }

    @Override // xsna.lu00
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou00) && epx.f(this.b, ((ou00) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketCatalogActionClearFilters(entryPointToken="), this.b, ')');
    }
}
