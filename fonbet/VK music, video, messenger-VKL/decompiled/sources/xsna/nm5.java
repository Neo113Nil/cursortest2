package xsna;

import androidx.annotation.NonNull;

/* compiled from: AutoValue_ImmutableImageInfo.java */
/* loaded from: classes11.dex */
public final class nm5 extends row {
    public final d0o0 a;
    public final long b;
    public final int c;

    public nm5(d0o0 d0o0Var, long j, int i) {
        if (d0o0Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.a = d0o0Var;
        this.b = j;
        this.c = i;
    }

    @Override // xsna.ojw
    public final int b() {
        return this.c;
    }

    @Override // xsna.ojw
    @NonNull
    public final d0o0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof row) {
            row rowVar = (row) obj;
            if (this.a.equals(((nm5) rowVar).a)) {
                nm5 nm5Var = (nm5) rowVar;
                if (this.b == nm5Var.b && this.c == nm5Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.ojw
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        return h5s.c(this.c, "}", sb);
    }
}
