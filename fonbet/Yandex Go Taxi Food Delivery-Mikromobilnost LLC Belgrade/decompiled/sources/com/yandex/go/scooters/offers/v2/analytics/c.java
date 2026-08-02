package com.yandex.go.scooters.offers.v2.analytics;

import defpackage.czf0;
import defpackage.k4o0;
import defpackage.l4o0;
import defpackage.lx4;
import defpackage.m4o0;
import defpackage.o4o0;
import defpackage.w511;

/* loaded from: classes13.dex */
public final class c {
    public final czf0 a;
    public final lx4 b;
    public volatile a c;

    public c(czf0 czf0Var, lx4 lx4Var) {
        this.a = czf0Var;
        this.b = lx4Var;
    }

    public static final void a(c cVar, String str, long j) {
        czf0 czf0Var = cVar.a;
        String concat = "Perf.ScootersOffer.Create.".concat(str);
        czf0Var.getClass();
        czf0.a(j, concat);
    }

    public final void b(o4o0 o4o0Var) {
        ScootersOfferCardPerformanceAnalytics$OfferType scootersOfferCardPerformanceAnalytics$OfferType;
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if ((o4o0Var instanceof k4o0) || (o4o0Var instanceof m4o0)) {
            scootersOfferCardPerformanceAnalytics$OfferType = ScootersOfferCardPerformanceAnalytics$OfferType.SINGLE;
        } else {
            if (!(o4o0Var instanceof l4o0)) {
                w511.b();
                return;
            }
            scootersOfferCardPerformanceAnalytics$OfferType = ScootersOfferCardPerformanceAnalytics$OfferType.PARKING;
        }
        this.c = a.a(aVar, scootersOfferCardPerformanceAnalytics$OfferType, 0L, currentTimeMillis, 0L, 0L, 0L, 122);
    }
}
