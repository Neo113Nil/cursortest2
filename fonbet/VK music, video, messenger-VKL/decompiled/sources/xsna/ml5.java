package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes.dex */
public final class ml5 extends j5k.e.d.a.b.AbstractC3100d.AbstractC3101a {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    public static final class a extends j5k.e.d.a.b.AbstractC3100d.AbstractC3101a.AbstractC3102a {
        public long a;
        public String b;
        public String c;
        public long d;
        public int e;
        public byte f;

        public final ml5 a() {
            String str;
            if (this.f == 7 && (str = this.b) != null) {
                return new ml5(this.a, str, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.b == null) {
                sb.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
    }

    public ml5(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d.AbstractC3101a
    @Nullable
    public final String a() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d.AbstractC3101a
    public final int b() {
        return this.e;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d.AbstractC3101a
    public final long c() {
        return this.d;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d.AbstractC3101a
    public final long d() {
        return this.a;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d.AbstractC3101a
    @NonNull
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a.b.AbstractC3100d.AbstractC3101a)) {
            return false;
        }
        j5k.e.d.a.b.AbstractC3100d.AbstractC3101a abstractC3101a = (j5k.e.d.a.b.AbstractC3100d.AbstractC3101a) obj;
        if (this.a != abstractC3101a.d() || !this.b.equals(abstractC3101a.e())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (abstractC3101a.a() != null) {
                return false;
            }
        } else if (!str.equals(abstractC3101a.a())) {
            return false;
        }
        return this.d == abstractC3101a.c() && this.e == abstractC3101a.b();
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return h5s.c(this.e, "}", sb);
    }
}
