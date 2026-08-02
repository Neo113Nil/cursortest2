package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* loaded from: classes.dex */
public final class ql5 extends j5k.e.d.AbstractC3105e {
    public final j5k.e.d.AbstractC3105e.b a;
    public final String b;
    public final String c;
    public final long d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    /* loaded from: classes13.dex */
    public static final class a extends j5k.e.d.AbstractC3105e.a {
        public rl5 a;
        public String b;
        public String c;
        public long d;
        public byte e;

        public final ql5 a() {
            rl5 rl5Var;
            String str;
            String str2;
            if (this.e == 1 && (rl5Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new ql5(rl5Var, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.b == null) {
                sb.append(" parameterKey");
            }
            if (this.c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }

        public final a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.b = str;
            return this;
        }

        public final a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.c = str;
            return this;
        }

        public final a d(long j) {
            this.d = j;
            this.e = (byte) (this.e | 1);
            return this;
        }
    }

    public ql5(rl5 rl5Var, String str, String str2, long j) {
        this.a = rl5Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // xsna.j5k.e.d.AbstractC3105e
    @NonNull
    public final String a() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.AbstractC3105e
    @NonNull
    public final String b() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.AbstractC3105e
    @NonNull
    public final j5k.e.d.AbstractC3105e.b c() {
        return this.a;
    }

    @Override // xsna.j5k.e.d.AbstractC3105e
    @NonNull
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.AbstractC3105e)) {
            return false;
        }
        j5k.e.d.AbstractC3105e abstractC3105e = (j5k.e.d.AbstractC3105e) obj;
        return this.a.equals(abstractC3105e.c()) && this.b.equals(abstractC3105e.a()) && this.c.equals(abstractC3105e.b()) && this.d == abstractC3105e.d();
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return efz.b(this.d, "}", sb);
    }
}
