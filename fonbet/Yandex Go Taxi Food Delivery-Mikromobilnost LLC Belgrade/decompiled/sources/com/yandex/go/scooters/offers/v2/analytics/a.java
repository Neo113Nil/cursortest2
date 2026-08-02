package com.yandex.go.scooters.offers.v2.analytics;

import defpackage.g8e;
import defpackage.qv10;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a {
    public final ScootersOfferCardPerformanceAnalytics$OfferType a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public a(ScootersOfferCardPerformanceAnalytics$OfferType scootersOfferCardPerformanceAnalytics$OfferType, long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = scootersOfferCardPerformanceAnalytics$OfferType;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
    }

    public static a a(a aVar, ScootersOfferCardPerformanceAnalytics$OfferType scootersOfferCardPerformanceAnalytics$OfferType, long j, long j2, long j3, long j4, long j5, int i) {
        ScootersOfferCardPerformanceAnalytics$OfferType scootersOfferCardPerformanceAnalytics$OfferType2 = (i & 1) != 0 ? aVar.a : scootersOfferCardPerformanceAnalytics$OfferType;
        long j6 = (i & 2) != 0 ? aVar.b : j;
        long j7 = (i & 4) != 0 ? aVar.c : j2;
        long j8 = (i & 8) != 0 ? aVar.d : j3;
        long j9 = (i & 16) != 0 ? aVar.e : j4;
        long j10 = (i & 32) != 0 ? aVar.f : j5;
        long j11 = aVar.g;
        aVar.getClass();
        return new a(scootersOfferCardPerformanceAnalytics$OfferType2, j6, j7, j8, j9, j10, j11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
    }

    public final int hashCode() {
        ScootersOfferCardPerformanceAnalytics$OfferType scootersOfferCardPerformanceAnalytics$OfferType = this.a;
        return Long.hashCode(this.g) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c((scootersOfferCardPerformanceAnalytics$OfferType == null ? 0 : scootersOfferCardPerformanceAnalytics$OfferType.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Snapshot(offerType=");
        sb.append(this.a);
        sb.append(", cardBuildingTimestamp=");
        sb.append(this.b);
        x4e.A(this.c, ", requestTimestamp=", ", responseTimestamp=", sb);
        sb.append(this.d);
        x4e.A(this.e, ", preparingTimestamp=", ", renderTimestamp=", sb);
        sb.append(this.f);
        return g8e.l(this.g, ", startTime=", Extension.C_BRAKE, sb);
    }
}
