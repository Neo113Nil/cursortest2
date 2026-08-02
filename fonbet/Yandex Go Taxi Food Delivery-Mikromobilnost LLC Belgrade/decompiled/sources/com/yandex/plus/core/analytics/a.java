package com.yandex.plus.core.analytics;

import defpackage.b3u0;
import defpackage.bvf0;
import defpackage.i4j0;
import defpackage.ike;
import defpackage.jse;
import defpackage.rgo;
import defpackage.thl0;
import defpackage.tje;
import defpackage.uhl0;
import defpackage.w8o;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class a implements i4j0 {
    public final ike a;

    public a(jse jseVar) {
        this.a = bvf0.a(jseVar);
    }

    @Override // defpackage.w8o
    public final void a() {
        w8o b = b();
        if (b != null) {
            b.a();
        }
    }

    public abstract w8o b();

    public abstract rgo c();

    public abstract thl0 d();

    public abstract uhl0 e();

    public abstract b3u0 f();

    @Override // defpackage.pcj
    public final void reportDiagnosticEvent(String str, Map map) {
        uhl0 e = e();
        thl0 d = d();
        if (e == null || d == null) {
            return;
        }
        tje.N(this.a, null, null, new BaseReporters$reportDiagnosticEvent$1(d, str, map, e, null), 3);
    }

    @Override // defpackage.w8o
    public final void reportError(String str, String str2, Throwable th) {
        w8o b = b();
        if (b != null) {
            b.reportError(str, str2, th);
        }
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, String str2) {
        rgo c = c();
        if (c != null) {
            c.reportEvent(str, str2);
        }
    }

    @Override // defpackage.b3u0
    public final void reportStatboxEvent(String str, String str2) {
        b3u0 f = f();
        if (f != null) {
            f.reportStatboxEvent(str, str2);
        }
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, Map map) {
        rgo c = c();
        if (c != null) {
            c.reportEvent(str, map);
        }
    }

    @Override // defpackage.b3u0
    public final void reportStatboxEvent(String str, Map map) {
        b3u0 f = f();
        if (f != null) {
            f.reportStatboxEvent(str, map);
        }
    }
}
