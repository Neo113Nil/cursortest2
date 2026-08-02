package defpackage;

/* loaded from: classes10.dex */
public final class ngv {
    public final mgv a;
    public final int b;

    public ngv(mgv mgvVar, int i) {
        this.a = mgvVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngv)) {
            return false;
        }
        ngv ngvVar = (ngv) obj;
        return this.a.equals(ngvVar.a) && this.b == ngvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return oyr.s(sb, this.b, ')');
    }
}
