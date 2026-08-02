package defpackage;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g74 extends gez {
    public final long a;
    public final Integer b;
    public final ComplianceData c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final NetworkConnectionInfo h;
    public final pqo i;

    public g74(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, pqo pqoVar) {
        this.a = j;
        this.b = num;
        this.c = complianceData;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = networkConnectionInfo;
        this.i = pqoVar;
    }

    @Override // defpackage.gez
    public final ComplianceData a() {
        return this.c;
    }

    @Override // defpackage.gez
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.gez
    public final long c() {
        return this.a;
    }

    @Override // defpackage.gez
    public final long d() {
        return this.d;
    }

    @Override // defpackage.gez
    public final pqo e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gez)) {
            return false;
        }
        gez gezVar = (gez) obj;
        if (this.a != gezVar.c()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (gezVar.b() != null) {
                return false;
            }
        } else if (!num.equals(gezVar.b())) {
            return false;
        }
        ComplianceData complianceData = this.c;
        if (complianceData == null) {
            if (gezVar.a() != null) {
                return false;
            }
        } else if (!complianceData.equals(gezVar.a())) {
            return false;
        }
        if (this.d != gezVar.d()) {
            return false;
        }
        if (!Arrays.equals(this.e, gezVar instanceof g74 ? ((g74) gezVar).e : gezVar.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (gezVar.h() != null) {
                return false;
            }
        } else if (!str.equals(gezVar.h())) {
            return false;
        }
        if (this.g != gezVar.i()) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = this.h;
        if (networkConnectionInfo == null) {
            if (gezVar.f() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(gezVar.f())) {
            return false;
        }
        pqo pqoVar = this.i;
        return pqoVar == null ? gezVar.e() == null : pqoVar.equals(gezVar.e());
    }

    @Override // defpackage.gez
    public final NetworkConnectionInfo f() {
        return this.h;
    }

    @Override // defpackage.gez
    public final byte[] g() {
        return this.e;
    }

    @Override // defpackage.gez
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
        pqo pqoVar = this.i;
        return hashCode5 ^ (pqoVar != null ? pqoVar.hashCode() : 0);
    }

    @Override // defpackage.gez
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
