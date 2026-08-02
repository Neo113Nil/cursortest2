package xsna;

/* compiled from: ClipsViewedTimeChecker.kt */
/* loaded from: classes17.dex */
public final class lde {
    public final int a;
    public final String b;

    public lde(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lde)) {
            return false;
        }
        lde ldeVar = (lde) obj;
        return this.a == ldeVar.a && epx.f(this.b, ldeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGridKey(position=");
        sb.append(this.a);
        sb.append(", videoTrackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
