package xsna;

/* compiled from: DisclaimerInfo.kt */
/* loaded from: classes14.dex */
public final class z0n {
    public final String a;
    public final String b;

    public z0n(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0n)) {
            return false;
        }
        z0n z0nVar = (z0n) obj;
        return epx.f(this.a, z0nVar.a) && epx.f(this.b, z0nVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisclaimerInfo(ageRestrictions=");
        sb.append(this.a);
        sb.append(", disclaimerText=");
        return ho8.a(sb, this.b, ')');
    }
}
