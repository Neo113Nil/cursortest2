package com.yandex.go.taxi.order.experiments;

import defpackage.gsq0;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.x4e;
import defpackage.xn11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/TaxiTravelerPassengerGpsExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/order/experiments/s", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TaxiTravelerPassengerGpsExperiment implements xn11 {
    public static final s Companion = new s();
    public static final TaxiTravelerPassengerGpsExperiment g = new TaxiTravelerPassengerGpsExperiment(0);
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;

    public /* synthetic */ TaxiTravelerPassengerGpsExperiment(int i, int i2, int i3, int i4, long j, long j2) {
        if ((i & 1) == 0) {
            this.b = -1;
        } else {
            this.b = i2;
        }
        if ((i & 2) == 0) {
            this.c = -1L;
        } else {
            this.c = j;
        }
        if ((i & 4) == 0) {
            this.d = -1L;
        } else {
            this.d = j2;
        }
        if ((i & 8) == 0) {
            this.e = -1;
        } else {
            this.e = i3;
        }
        if ((i & 16) == 0) {
            this.f = -1;
        } else {
            this.f = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiTravelerPassengerGpsExperiment)) {
            return false;
        }
        TaxiTravelerPassengerGpsExperiment taxiTravelerPassengerGpsExperiment = (TaxiTravelerPassengerGpsExperiment) obj;
        return this.b == taxiTravelerPassengerGpsExperiment.b && this.c == taxiTravelerPassengerGpsExperiment.c && this.d == taxiTravelerPassengerGpsExperiment.d && this.e == taxiTravelerPassengerGpsExperiment.e && this.f == taxiTravelerPassengerGpsExperiment.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + oyr.b(this.e, qv10.c(qv10.c(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiTravelerPassengerGpsExperiment(passengerGpsAccuracy=");
        sb.append(this.b);
        sb.append(", bufferDurationSec=");
        sb.append(this.c);
        x4e.A(this.d, ", pointTimestampAccuracyMs=", ", necessaryMatchedDistances=", sb);
        return ly3.k(this.e, this.f, ", maxMeanDistanceInMeters=", Extension.C_BRAKE, sb);
    }

    public TaxiTravelerPassengerGpsExperiment(int i) {
        this.b = -1;
        this.c = -1L;
        this.d = -1L;
        this.e = -1;
        this.f = -1;
    }

    public TaxiTravelerPassengerGpsExperiment() {
        this(0);
    }
}
