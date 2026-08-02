package xsna;

/* compiled from: CommunityMarksStatisticParticularItem.kt */
/* loaded from: classes18.dex */
public final class x9h implements hfz {
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public x9h(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9h)) {
            return false;
        }
        x9h x9hVar = (x9h) obj;
        return this.b == x9hVar.b && this.c == x9hVar.c && this.d == x9hVar.d && epx.f(this.e, x9hVar.e);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityMarksStatisticParticularItem(mark=");
        sb.append(this.b);
        sb.append(", marksCount=");
        sb.append(this.c);
        sb.append(", percentage=");
        sb.append(this.d);
        sb.append(", marksStatisticContentDescription=");
        return ho8.a(sb, this.e, ')');
    }
}
