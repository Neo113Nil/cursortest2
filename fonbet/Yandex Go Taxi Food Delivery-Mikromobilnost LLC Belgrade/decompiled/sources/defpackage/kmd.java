package defpackage;

/* loaded from: classes2.dex */
public final class kmd {
    public final String a;
    public final String b;

    public kmd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmd)) {
            return false;
        }
        kmd kmdVar = (kmd) obj;
        return this.a.equals(kmdVar.a) && jl40.l(this.b, kmdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferSwitchToggle(text=");
        sb.append(this.a);
        sb.append(", badgeText=");
        return b64.p(sb, this.b, ')');
    }
}
