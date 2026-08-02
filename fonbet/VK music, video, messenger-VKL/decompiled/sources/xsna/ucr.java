package xsna;

/* compiled from: PlaylistsFiltersAdapter.kt */
/* loaded from: classes3.dex */
public final class ucr {
    public final int a;
    public final String b;

    public ucr(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucr)) {
            return false;
        }
        ucr ucrVar = (ucr) obj;
        return this.a == ucrVar.a && this.b.equals(ucrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterItem(filter=");
        sb.append(this.a);
        sb.append(", title=");
        return ho8.a(sb, this.b, ')');
    }
}
