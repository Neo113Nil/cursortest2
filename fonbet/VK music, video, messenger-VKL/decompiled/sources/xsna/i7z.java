package xsna;

/* compiled from: LimitQueryParams.kt */
/* loaded from: classes3.dex */
public final class i7z {
    public final long a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public i7z(long j, int i, int i2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i == 0 || i2 == 0;
        this.e = i > -1;
        if (i < -1 || i2 < -1) {
            throw new IllegalArgumentException(efz.a(i, i2, "Incorrect limit query params: eventsAmount=", ", sizeInKb="));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i7z) {
            i7z i7zVar = (i7z) obj;
            if (this.a == i7zVar.a && this.b == i7zVar.b && this.c == i7zVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitQueryParams(timestamp=");
        sb.append((Object) my1.b(this.a));
        sb.append(", eventsAmount=");
        sb.append(this.b);
        sb.append(", sizeInKb=");
        return vu5.b(sb, this.c, ')');
    }
}
