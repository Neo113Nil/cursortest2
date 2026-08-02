package xsna;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.ArrayList;
import java.util.List;
import xsna.q000;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
public final class hn5 extends q000 {
    public final long a;
    public final long b;
    public final ClientInfo c;
    public final Integer d;
    public final String e;
    public final List<f000> f;
    public final QosTier g;

    /* compiled from: AutoValue_LogRequest.java */
    /* loaded from: classes12.dex */
    public static final class a extends q000.a {
        public Long a;
        public Long b;
        public com.google.android.datatransport.cct.internal.b c;
        public Integer d;
        public String e;
        public ArrayList f;
        public QosTier g;

        public final hn5 c() {
            String str = this.a == null ? " requestTimeMs" : "";
            if (this.b == null) {
                str = str.concat(" requestUptimeMs");
            }
            if (str.isEmpty()) {
                return new hn5(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a d(@Nullable com.google.android.datatransport.cct.internal.b bVar) {
            this.c = bVar;
            return this;
        }

        public final a e(@Nullable ArrayList arrayList) {
            this.f = arrayList;
            return this;
        }

        public final a f(@Nullable QosTier qosTier) {
            this.g = qosTier;
            return this;
        }

        public final a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public final a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public hn5() {
        throw null;
    }

    public hn5(long j, long j2, com.google.android.datatransport.cct.internal.b bVar, Integer num, String str, ArrayList arrayList, QosTier qosTier) {
        this.a = j;
        this.b = j2;
        this.c = bVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = qosTier;
    }

    @Override // xsna.q000
    @Nullable
    public final ClientInfo a() {
        return this.c;
    }

    @Override // xsna.q000
    @Nullable
    public final List<f000> b() {
        return this.f;
    }

    @Override // xsna.q000
    @Nullable
    public final Integer c() {
        return this.d;
    }

    @Override // xsna.q000
    @Nullable
    public final String d() {
        return this.e;
    }

    @Override // xsna.q000
    @Nullable
    public final QosTier e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q000)) {
            return false;
        }
        q000 q000Var = (q000) obj;
        if (this.a != q000Var.f() || this.b != q000Var.g()) {
            return false;
        }
        ClientInfo clientInfo = this.c;
        if (clientInfo == null) {
            if (q000Var.a() != null) {
                return false;
            }
        } else if (!clientInfo.equals(q000Var.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (q000Var.c() != null) {
                return false;
            }
        } else if (!num.equals(q000Var.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (q000Var.d() != null) {
                return false;
            }
        } else if (!str.equals(q000Var.d())) {
            return false;
        }
        List<f000> list = this.f;
        if (list == null) {
            if (q000Var.b() != null) {
                return false;
            }
        } else if (!list.equals(q000Var.b())) {
            return false;
        }
        QosTier qosTier = this.g;
        return qosTier == null ? q000Var.e() == null : qosTier.equals(q000Var.e());
    }

    @Override // xsna.q000
    public final long f() {
        return this.a;
    }

    @Override // xsna.q000
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.c;
        int hashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f000> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.g;
        return hashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
