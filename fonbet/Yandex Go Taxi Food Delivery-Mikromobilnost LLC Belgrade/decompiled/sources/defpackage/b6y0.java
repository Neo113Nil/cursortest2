package defpackage;

import android.os.SystemClock;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b6y0 implements c6y0 {
    public final TaxiOrderSessionCheckpoint a;
    public final long b;

    public b6y0(TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint, long j) {
        this.a = taxiOrderSessionCheckpoint;
        this.b = j;
    }

    @Override // defpackage.c6y0
    public final TaxiOrderSessionCheckpoint a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6y0)) {
            return false;
        }
        b6y0 b6y0Var = (b6y0) obj;
        return this.a == b6y0Var.a && this.b == b6y0Var.b;
    }

    @Override // defpackage.c6y0
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Timestamp(checkpoint=" + this.a + ", timestamp=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ b6y0(TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint) {
        this(taxiOrderSessionCheckpoint, SystemClock.elapsedRealtime());
    }
}
