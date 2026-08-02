package xsna;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import xsna.f000;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
public final class fn5 extends f000 {
    public final long a;
    public final Integer b;
    public final ComplianceData c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final NetworkConnectionInfo h;
    public final i9q i;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes12.dex */
    public static final class a extends f000.a {
        public Long a;
        public Integer b;
        public com.google.android.datatransport.cct.internal.c c;
        public Long d;
        public byte[] e;
        public String f;
        public Long g;
        public com.google.android.datatransport.cct.internal.d h;
        public am5 i;

        public final fn5 a() {
            String str = this.a == null ? " eventTimeMs" : "";
            if (this.d == null) {
                str = str.concat(" eventUptimeMs");
            }
            if (this.g == null) {
                str = fo8.a(str, " timezoneOffsetSeconds");
            }
            if (str.isEmpty()) {
                return new fn5(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e, this.f, this.g.longValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(@Nullable com.google.android.datatransport.cct.internal.c cVar) {
            this.c = cVar;
            return this;
        }

        public final a c(@Nullable Integer num) {
            this.b = num;
            return this;
        }

        public final a d(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public final a e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public final a f(@Nullable am5 am5Var) {
            this.i = am5Var;
            return this;
        }

        public final a g(@Nullable com.google.android.datatransport.cct.internal.d dVar) {
            this.h = dVar;
            return this;
        }

        public final a h(@Nullable byte[] bArr) {
            this.e = bArr;
            return this;
        }

        public final a i(@Nullable String str) {
            this.f = str;
            return this;
        }

        public final a j(long j) {
            this.g = Long.valueOf(j);
            return this;
        }
    }

    public fn5(long j, Integer num, com.google.android.datatransport.cct.internal.c cVar, long j2, byte[] bArr, String str, long j3, com.google.android.datatransport.cct.internal.d dVar, am5 am5Var) {
        this.a = j;
        this.b = num;
        this.c = cVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = dVar;
        this.i = am5Var;
    }

    @Override // xsna.f000
    @Nullable
    public final ComplianceData a() {
        return this.c;
    }

    @Override // xsna.f000
    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Override // xsna.f000
    public final long c() {
        return this.a;
    }

    @Override // xsna.f000
    public final long d() {
        return this.d;
    }

    @Override // xsna.f000
    @Nullable
    public final i9q e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f000)) {
            return false;
        }
        f000 f000Var = (f000) obj;
        if (this.a != f000Var.c()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (f000Var.b() != null) {
                return false;
            }
        } else if (!num.equals(f000Var.b())) {
            return false;
        }
        ComplianceData complianceData = this.c;
        if (complianceData == null) {
            if (f000Var.a() != null) {
                return false;
            }
        } else if (!complianceData.equals(f000Var.a())) {
            return false;
        }
        if (this.d != f000Var.d()) {
            return false;
        }
        if (!Arrays.equals(this.e, f000Var instanceof fn5 ? ((fn5) f000Var).e : f000Var.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (f000Var.h() != null) {
                return false;
            }
        } else if (!str.equals(f000Var.h())) {
            return false;
        }
        if (this.g != f000Var.i()) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = this.h;
        if (networkConnectionInfo == null) {
            if (f000Var.f() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(f000Var.f())) {
            return false;
        }
        i9q i9qVar = this.i;
        return i9qVar == null ? f000Var.e() == null : i9qVar.equals(f000Var.e());
    }

    @Override // xsna.f000
    @Nullable
    public final NetworkConnectionInfo f() {
        return this.h;
    }

    @Override // xsna.f000
    @Nullable
    public final byte[] g() {
        return this.e;
    }

    @Override // xsna.f000
    @Nullable
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.c;
        int hashCode2 = (hashCode ^ (complianceData == null ? 0 : complianceData.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.h;
        int hashCode5 = (i2 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        i9q i9qVar = this.i;
        return hashCode5 ^ (i9qVar != null ? i9qVar.hashCode() : 0);
    }

    @Override // xsna.f000
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
