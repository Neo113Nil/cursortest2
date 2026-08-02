package com.yandex.go.external_service.delegates;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import defpackage.bgc;
import defpackage.bp90;
import defpackage.cvq0;
import defpackage.dke;
import defpackage.fva0;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.h1p;
import defpackage.ien;
import defpackage.og21;
import defpackage.p6j0;
import defpackage.pzt0;
import defpackage.q7w0;
import defpackage.rnc;
import defpackage.rvq0;
import defpackage.s2p;
import defpackage.sls;
import defpackage.tje;
import defpackage.tzf;
import defpackage.v8w0;
import defpackage.vdn;
import defpackage.x6w0;
import defpackage.yrv0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.n;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class c implements rnc {
    public final x6w0 a;
    public final q7w0 b;
    public final ru.yandex.taxi.launch.c c;
    public final n d;
    public final s2p e;
    public final p6j0 f;
    public final yrv0 g;
    public final rvq0 h;
    public final Lifecycle i;
    public final tzf j;
    public final bp90 k;
    public pzt0 l;
    public pzt0 m;

    public c(x6w0 x6w0Var, q7w0 q7w0Var, ru.yandex.taxi.launch.c cVar, n nVar, s2p s2pVar, p6j0 p6j0Var, yrv0 yrv0Var, rvq0 rvq0Var, Lifecycle lifecycle, tzf tzfVar, bp90 bp90Var) {
        this.a = x6w0Var;
        this.b = q7w0Var;
        this.c = cVar;
        this.d = nVar;
        this.e = s2pVar;
        this.f = p6j0Var;
        this.g = yrv0Var;
        this.h = rvq0Var;
        this.i = lifecycle;
        this.j = tzfVar;
        this.k = bp90Var;
    }

    @Override // defpackage.rnc
    public final void a(sls slsVar, sls slsVar2) {
        this.e.a(slsVar, slsVar2);
    }

    @Override // defpackage.rnc
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.rnc
    public final void h() {
        this.h.a(ServiceLoadingEvent.WEB_VIEW_READY);
        h1p h1pVar = this.a.a;
        Map e = gw00.e(new Pair("is_passport_ready", Boolean.valueOf(this.k.a)));
        yrv0 yrv0Var = this.g;
        fva0.b(yrv0Var.c, g8e.o("Superapp.Showcase.LoadingIndicatorDisappeared.", h1pVar.getValue()), PerformanceAnalytics$Type.Loading, null, 4);
        j jVar = (j) yrv0Var.a;
        jVar.s("Superapp.Showcase.LoadingIndicatorDisappeared");
        v8w0 v8w0Var = yrv0Var.f;
        String value = h1pVar.getValue();
        String b = yrv0Var.b();
        v8w0Var.getClass();
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put(Constants.KEY_SERVICE, value);
        }
        if (b != null) {
            hashMap.put("originScreen", b);
        }
        v8w0Var.a.a("Superapp.Showcase.LoadingIndicatorDisappeared", hashMap, 1, new HashMap());
        if (yrv0Var.h.b.equals(h1pVar)) {
            i d = jVar.d("Superapp.Showcase.ContentShown");
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("open_reason", yrv0Var.h.a.a);
            linkedHashMap.put(Constants.KEY_SERVICE, yrv0Var.h.b.getValue());
            d.a((System.currentTimeMillis() - yrv0Var.h.c) / 1000.0d, "time_since_appeared");
            linkedHashMap.putAll(e);
            d.e = true;
            d.m();
        }
    }

    @Override // defpackage.rnc
    public final void i(boolean z, dke dkeVar) {
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.l = tje.N(r.a(this.i), null, null, new MainDelegate$requestAuthData$1(this, z, dkeVar, null), 3);
    }

    @Override // defpackage.rnc
    public final void j(vdn vdnVar) {
        tje.N(r.a(this.i), null, null, new MainDelegate$requestLastGeoPosition$1(this, vdnVar, null), 3);
    }

    @Override // defpackage.rnc
    public final void k(String str, boolean z) {
        pzt0 pzt0Var = this.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        Uri parse = Uri.parse(str);
        if (!og21.b(parse) || z) {
            this.m = tje.N(r.a(this.i), null, null, new MainDelegate$openUrl$1(this, parse, null), 3);
        } else {
            this.e.d(str);
        }
    }

    @Override // defpackage.rnc
    public final ien l() {
        return this.b;
    }

    @Override // defpackage.rnc
    public final void m() {
        this.e.a(new MainDelegate$authorize$1(0, this.e, s2p.class, "close", "close()V", 0), new bgc(12));
    }

    @Override // defpackage.rnc
    public final cvq0 n() {
        return this.a.a();
    }
}
