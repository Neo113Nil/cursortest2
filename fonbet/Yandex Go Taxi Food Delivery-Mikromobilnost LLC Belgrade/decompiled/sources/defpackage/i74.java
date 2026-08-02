package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* loaded from: classes.dex */
public final class i74 extends ifz {
    public final long a;
    public final long b;
    public final ClientInfo c;
    public final Integer d;
    public final String e;
    public final List f;
    public final QosTier g;

    public i74(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.a = j;
        this.b = j2;
        this.c = clientInfo;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = qosTier;
    }

    @Override // defpackage.ifz
    public final ClientInfo a() {
        return this.c;
    }

    @Override // defpackage.ifz
    public final List b() {
        return this.f;
    }

    @Override // defpackage.ifz
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.ifz
    public final String d() {
        return this.e;
    }

    @Override // defpackage.ifz
    public final QosTier e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ifz)) {
            return false;
        }
        ifz ifzVar = (ifz) obj;
        if (this.a != ifzVar.f() || this.b != ifzVar.g()) {
            return false;
        }
        ClientInfo clientInfo = this.c;
        if (clientInfo == null) {
            if (ifzVar.a() != null) {
                return false;
            }
        } else if (!clientInfo.equals(ifzVar.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (ifzVar.c() != null) {
                return false;
            }
        } else if (!num.equals(ifzVar.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (ifzVar.d() != null) {
                return false;
            }
        } else if (!str.equals(ifzVar.d())) {
            return false;
        }
        List list = this.f;
        if (list == null) {
            if (ifzVar.b() != null) {
                return false;
            }
        } else if (!list.equals(ifzVar.b())) {
            return false;
        }
        QosTier qosTier = this.g;
        return qosTier == null ? ifzVar.e() == null : qosTier.equals(ifzVar.e());
    }

    @Override // defpackage.ifz
    public final long f() {
        return this.a;
    }

    @Override // defpackage.ifz
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
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.g;
        return hashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
