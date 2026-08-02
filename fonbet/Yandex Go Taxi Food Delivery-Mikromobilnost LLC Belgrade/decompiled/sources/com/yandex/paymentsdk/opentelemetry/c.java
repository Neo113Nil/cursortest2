package com.yandex.paymentsdk.opentelemetry;

import defpackage.bgu;
import defpackage.hlt0;
import defpackage.tls;
import java.util.LinkedHashMap;
import kotlin.random.Random;

/* loaded from: classes2.dex */
public final class c {
    public final String a;
    public final String b;
    public final tls c;
    public String e;
    public long g;
    public long h;
    public final SpanKind d = SpanKind.SPAN_KIND_INTERNAL;
    public final LinkedHashMap f = new LinkedHashMap();

    public c(String str, String str2, tls tlsVar) {
        this.a = str;
        this.b = str2;
        this.c = tlsVar;
    }

    public final hlt0 a() {
        this.h = System.currentTimeMillis() * 1000000;
        hlt0 hlt0Var = new hlt0(this.a, this.b, bgu.e(Random.a.j(8)), this.d, this.e, this.f, this.g, this.h);
        ((OpenTelemetryTracerImpl$spanBuilder$sb$1) this.c).invoke(hlt0Var);
        return hlt0Var;
    }
}
