package com.yandex.go.superapp.web.domain;

import defpackage.bpt;
import defpackage.fxf0;
import defpackage.mdh;
import defpackage.q0o;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final fxf0 b;
    public final bpt c;

    public a(tt2 tt2Var, fxf0 fxf0Var, bpt bptVar) {
        this.a = tt2Var;
        this.b = fxf0Var;
        this.c = bptVar;
    }

    public final Object a(q0o q0oVar, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new MobEndpointDescriptionProvider$requestEndpointDescription$2(q0oVar, this, null), suspendLambda);
    }
}
