package xsna;

/* compiled from: ClipsDrafts.kt */
/* loaded from: classes16.dex */
public final class gud {
    public final int a;
    public final String b;

    public gud(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gud)) {
            return false;
        }
        gud gudVar = (gud) obj;
        return this.a == gudVar.a && epx.f(this.b, gudVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDrafts(count=");
        sb.append(this.a);
        sb.append(", cover=");
        return ho8.a(sb, this.b, ')');
    }
}
