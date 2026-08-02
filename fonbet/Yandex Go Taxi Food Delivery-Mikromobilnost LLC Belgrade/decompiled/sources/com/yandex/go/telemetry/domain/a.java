package com.yandex.go.telemetry.domain;

import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;

    public /* synthetic */ a(tt2 tt2Var) {
        this.a = tt2Var;
    }

    public Object a(String str, Continuation continuation) {
        if (str.length() == 0) {
            return "";
        }
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PingInteractor$ping$2(str, null), continuation);
    }

    public Object b(String str, Continuation continuation) {
        if (str.length() == 0) {
            return "";
        }
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new DnsResolveInteractor$resolveDns$2(str, null), continuation);
    }

    public Object c(String str, Continuation continuation) {
        if (str.length() == 0) {
            return "";
        }
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new TraceRouteInteractor$traceRoute$2(str, null), continuation);
    }
}
