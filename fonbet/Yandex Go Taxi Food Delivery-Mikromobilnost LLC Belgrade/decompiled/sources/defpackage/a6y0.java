package defpackage;

import android.os.SystemClock;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a6y0 implements c6y0 {
    public final TaxiOrderSessionCheckpoint a;
    public final long b;
    public final long c;
    public final String d;

    public a6y0(TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint, long j, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = taxiOrderSessionCheckpoint;
        this.b = elapsedRealtime;
        this.c = j;
        this.d = str;
    }

    @Override // defpackage.c6y0
    public final TaxiOrderSessionCheckpoint a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6y0)) {
            return false;
        }
        a6y0 a6y0Var = (a6y0) obj;
        return this.a == a6y0Var.a && this.b == a6y0Var.b && this.c == a6y0Var.c && jl40.l(this.d, a6y0Var.d);
    }

    @Override // defpackage.c6y0
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int c = qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Endpoint(checkpoint=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        x4e.A(this.c, ", requestDuration=", ", traceId=", sb);
        return oyr.t(sb, this.d, Extension.C_BRAKE);
    }
}
