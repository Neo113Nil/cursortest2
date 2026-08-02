package xsna;

/* compiled from: MarketCatalogEvents.kt */
/* loaded from: classes16.dex */
public final class pu00 extends lu00 {
    public final String b;
    public final String c;

    public pu00(String str, String str2) {
        super(str);
        this.b = str;
        this.c = str2;
    }

    @Override // xsna.lu00
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu00)) {
            return false;
        }
        pu00 pu00Var = (pu00) obj;
        return epx.f(this.b, pu00Var.b) && epx.f(this.c, pu00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogActionReloadWithModifiers(entryPointToken=");
        sb.append(this.b);
        sb.append(", sourceBlockId=");
        return ho8.a(sb, this.c, ')');
    }
}
