package xsna;

/* compiled from: FilteredSourcesCounters.kt */
/* loaded from: classes18.dex */
public final class afr {
    public final int a;
    public final int b;

    public afr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afr)) {
            return false;
        }
        afr afrVar = (afr) obj;
        return this.a == afrVar.a && this.b == afrVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilteredSourcesCounters(profilesCount=");
        sb.append(this.a);
        sb.append(", groupsCount=");
        return vu5.b(sb, this.b, ')');
    }
}
