package defpackage;

/* loaded from: classes14.dex */
public final class afw {
    public final String a;
    public final String b;

    public afw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afw)) {
            return false;
        }
        afw afwVar = (afw) obj;
        return jl40.l(this.a, afwVar.a) && jl40.l(this.b, afwVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
