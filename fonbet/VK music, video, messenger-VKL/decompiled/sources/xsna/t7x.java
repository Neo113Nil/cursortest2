package xsna;

/* compiled from: InstantJobStorageModel.kt */
/* loaded from: classes2.dex */
public final class t7x {
    public final int a;
    public final long b;
    public final String c;
    public final String d;

    public t7x(int i, String str, String str2, long j) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7x)) {
            return false;
        }
        t7x t7xVar = (t7x) obj;
        return this.a == t7xVar.a && this.b == t7xVar.b && epx.f(this.c, t7xVar.c) && epx.f(this.d, t7xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantJobStorageModel(id=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", args=");
        return ho8.a(sb, this.d, ')');
    }
}
