package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf9z;", "Lvn11;", "Companion", "e9z", "d9z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class f9z implements vn11 {
    public static final e9z Companion = new e9z();
    public static final f9z k = new f9z(0);
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public /* synthetic */ f9z(int i, boolean z, long j, long j2, long j3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i & 4) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
        if ((i & 8) == 0) {
            this.e = 0L;
        } else {
            this.e = j3;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z4;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z5;
        }
        if ((i & 256) == 0) {
            this.j = false;
        } else {
            this.j = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9z)) {
            return false;
        }
        f9z f9zVar = (f9z) obj;
        return this.b == f9zVar.b && this.c == f9zVar.c && this.d == f9zVar.d && this.e == f9zVar.e && this.f == f9zVar.f && this.g == f9zVar.g && this.h == f9zVar.h && this.i == f9zVar.i && this.j == f9zVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + unr0.e(unr0.e(unr0.e(unr0.e(qv10.c(qv10.c(qv10.c(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationInfoPollingExperiment(enabled=");
        sb.append(this.b);
        sb.append(", pollingTimeoutSec=");
        sb.append(this.c);
        x4e.A(this.d, ", pollingIntervalSec=", ", maxCountCoordinates=", sb);
        sb.append(this.e);
        sb.append(", requestPollingFinalSuggest=");
        sb.append(this.f);
        n.z(", restartRequestPollingFinalSuggestWhenExpandApp=", ", suspendCollectWhenOnStop=", sb, this.g, this.h);
        n.z(", sendWarmUpLocationsInCoordProviders=", ", fusedSetupInitialGeoLocation=", sb, this.i, this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public f9z(int i) {
        this.b = false;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public f9z() {
        this(0);
    }
}
