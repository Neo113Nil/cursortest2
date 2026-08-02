package com.yandex.go.analytics;

import defpackage.ac20;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    public final ru.yandex.taxi.analytics.g a;
    public final ac20 b;
    public final ike c;

    public b(ru.yandex.taxi.analytics.g gVar, ac20 ac20Var, tt2 tt2Var) {
        this.a = gVar;
        this.b = ac20Var;
        tt2Var.getClass();
        this.c = bvf0.a(uyj.a);
    }

    public final void a(String str) {
        b(str, kotlin.collections.b.f());
    }

    public final void b(String str, Map map) {
        tje.N(this.c, null, null, new DebugAnalyticsImpl$reportEvent$2(this, str, map, null), 3);
    }
}
