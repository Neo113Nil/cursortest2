package xsna;

/* compiled from: LiveDescriptionItem.kt */
/* loaded from: classes3.dex */
public final class djz implements hfz {
    public final String b;
    public final CharSequence c;
    public final int d;
    public final int e;

    public djz(int i, int i2, CharSequence charSequence, String str) {
        this.b = str;
        this.c = charSequence;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djz)) {
            return false;
        }
        djz djzVar = (djz) obj;
        return epx.f(this.b, djzVar.b) && epx.f(this.c, djzVar.c) && this.d == djzVar.d && this.e == djzVar.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, u11.c(this.b.hashCode() * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveDescriptionItem(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append((Object) this.c);
        sb.append(", viewsCount=");
        sb.append(this.d);
        sb.append(", nowWatchingCount=");
        return vu5.b(sb, this.e, ')');
    }
}
