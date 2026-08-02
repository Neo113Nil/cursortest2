package defpackage;

import android.os.Bundle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m5g0 {
    public final String a;
    public final long b;
    public final long c;

    public m5g0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("has_xiva_data", true);
        bundle.putString("transit_id", this.a);
        bundle.putLong("receive_ts", this.b);
        bundle.putLong("receive_ts_uptime", this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5g0)) {
            return false;
        }
        m5g0 m5g0Var = (m5g0) obj;
        return jl40.l(this.a, m5g0Var.a) && this.b == m5g0Var.b && this.c == m5g0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.c) + qv10.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return g8e.l(this.c, ", receiveUptimeTs=", Extension.C_BRAKE, x4e.l("PushXivaData(transitId=", this.a, ", receiveTs=", this.b));
    }
}
