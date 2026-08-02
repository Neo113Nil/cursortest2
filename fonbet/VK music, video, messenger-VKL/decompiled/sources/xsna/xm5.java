package xsna;

import androidx.annotation.NonNull;
import xsna.k6x;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes13.dex */
public final class xm5 extends k6x {
    public final String a;
    public final long b;
    public final long c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    public static final class a extends k6x.a {
        public String a;
        public Long b;
        public Long c;

        public final xm5 a() {
            String str = this.a == null ? " token" : "";
            if (this.b == null) {
                str = str.concat(" tokenExpirationTimestamp");
            }
            if (this.c == null) {
                str = fo8.a(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                return new xm5(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.a = str;
            return this;
        }

        public final a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public final a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public xm5(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // xsna.k6x
    @NonNull
    public final String b() {
        return this.a;
    }

    @Override // xsna.k6x
    @NonNull
    public final long c() {
        return this.c;
    }

    @Override // xsna.k6x
    @NonNull
    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k6x)) {
            return false;
        }
        k6x k6xVar = (k6x) obj;
        return this.a.equals(k6xVar.b()) && this.b == k6xVar.d() && this.c == k6xVar.c();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return efz.b(this.c, "}", sb);
    }
}
