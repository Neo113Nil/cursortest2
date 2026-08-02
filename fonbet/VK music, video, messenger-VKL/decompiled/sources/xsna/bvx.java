package xsna;

/* compiled from: ScrollParams.kt */
/* loaded from: classes2.dex */
public final class bvx implements zfh0 {
    public final long a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;

    public bvx(int i, String str, long j, int i2, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str;
    }

    @Override // xsna.zfh0
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvx)) {
            return false;
        }
        bvx bvxVar = (bvx) obj;
        return this.a == bvxVar.a && this.b == bvxVar.b && this.c == bvxVar.c && this.d == bvxVar.d && epx.f(this.e, bvxVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(shy.a(this.c, shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemScrollParams(id=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", offsetY=");
        sb.append(this.c);
        sb.append(", smoothScroll=");
        sb.append(this.d);
        sb.append(", tag=");
        return ho8.a(sb, this.e, ')');
    }
}
