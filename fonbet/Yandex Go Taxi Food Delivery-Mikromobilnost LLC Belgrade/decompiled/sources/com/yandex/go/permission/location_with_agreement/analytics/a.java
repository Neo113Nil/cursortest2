package com.yandex.go.permission.location_with_agreement.analytics;

import defpackage.dho;
import defpackage.lx4;
import defpackage.pj;
import defpackage.w511;
import java.util.HashMap;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class a {
    public final lx4 a;
    public final pj b;
    public final dho c;

    public a(lx4 lx4Var, pj pjVar, dho dhoVar) {
        this.a = lx4Var;
        this.b = pjVar;
        this.c = dhoVar;
    }

    public final void a() {
        i d = ((j) this.a).d("LocationPermissionPriming.completed");
        c(d, LocationWithAgreementAnalytics$MarkedEvents.Permission, true);
        d.m();
    }

    public final void b() {
        pj pjVar = this.b;
        pjVar.getClass();
        pjVar.a.a("LocationPermissionPriming.started", new HashMap(), 1, new HashMap());
        this.c.c(LocationWithAgreementAnalytics$MarkedEvents.Permission);
    }

    public final void c(i iVar, LocationWithAgreementAnalytics$MarkedEvents locationWithAgreementAnalytics$MarkedEvents, boolean z) {
        Float a;
        dho dhoVar = this.c;
        if (z) {
            a = dhoVar.b(locationWithAgreementAnalytics$MarkedEvents);
        } else {
            if (z) {
                w511.b();
                return;
            }
            a = dhoVar.a(locationWithAgreementAnalytics$MarkedEvents);
        }
        if (a != null) {
            iVar.a.put("duration", String.valueOf(a.floatValue()));
        }
    }

    public final void d() {
        i d = ((j) this.a).d("LocationPermissionPriming.requestError");
        c(d, LocationWithAgreementAnalytics$MarkedEvents.HttpRequest, true);
        d.m();
    }

    public final void e() {
        this.c.c(LocationWithAgreementAnalytics$MarkedEvents.HttpRequest);
    }

    public final void f() {
        i d = ((j) this.a).d("LocationPermissionPriming.requestSuccess");
        c(d, LocationWithAgreementAnalytics$MarkedEvents.HttpRequest, true);
        d.m();
    }

    public final void g(boolean z) {
        i d = ((j) this.a).d("LocationPermissionPriming.geoPermissionUpdate");
        c(d, LocationWithAgreementAnalytics$MarkedEvents.Permission, false);
        d.g("isGeoAuthorized", z);
        d.m();
    }
}
