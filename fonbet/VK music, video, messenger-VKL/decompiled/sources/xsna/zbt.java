package xsna;

/* compiled from: GamesCatalogGiftIcon.kt */
/* loaded from: classes17.dex */
public final class zbt {
    public final boolean a;
    public final izt b;
    public final String c;

    public zbt(boolean z, izt iztVar, String str) {
        this.a = z;
        this.b = iztVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbt)) {
            return false;
        }
        zbt zbtVar = (zbt) obj;
        return this.a == zbtVar.a && epx.f(this.b, zbtVar.b) && epx.f(this.c, zbtVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        izt iztVar = this.b;
        int hashCode2 = (hashCode + (iztVar == null ? 0 : iztVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogGiftIcon(redDot=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", tooltip=");
        return ho8.a(sb, this.c, ')');
    }
}
