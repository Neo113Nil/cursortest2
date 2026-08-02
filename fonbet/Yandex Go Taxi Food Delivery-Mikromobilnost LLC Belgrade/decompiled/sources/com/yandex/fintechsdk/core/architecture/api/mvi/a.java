package com.yandex.fintechsdk.core.architecture.api.mvi;

import defpackage.bvf0;
import defpackage.di9;
import defpackage.gci0;
import defpackage.ike;
import defpackage.k5c;
import defpackage.pju0;
import defpackage.sb2;
import defpackage.tje;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final ike a;
    public final r0 b;
    public final kotlinx.coroutines.channels.a c;
    public final kotlinx.coroutines.channels.a d;
    public final pju0 e;
    public final gci0 f;
    public final di9 g;

    public a(Object obj, k5c k5cVar) {
        ike M = bvf0.M(k5cVar, uyj.a);
        this.a = M;
        r0 c = bvf0.c(obj);
        this.b = c;
        kotlinx.coroutines.channels.a a = sb2.a(0, null, null, 7);
        this.c = a;
        this.d = sb2.a(Integer.MAX_VALUE, null, null, 6);
        this.e = new pju0(new FintechStore$context$1(this, null), new FintechStore$context$2(this, null));
        tje.N(M, null, null, new FintechStore$1(this, null), 3);
        this.f = e.d(c);
        this.g = new di9(a);
    }
}
