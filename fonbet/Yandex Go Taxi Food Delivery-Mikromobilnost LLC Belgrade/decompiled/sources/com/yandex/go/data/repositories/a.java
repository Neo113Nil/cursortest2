package com.yandex.go.data.repositories;

import defpackage.d9v;
import defpackage.mdh;
import defpackage.rq21;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vtx0;
import defpackage.w8v;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a {
    public final d9v a;
    public final tt2 b;
    public final vtx0 c;
    public final rq21 d;

    public a(d9v d9vVar, tt2 tt2Var, vtx0 vtx0Var, rq21 rq21Var) {
        this.a = d9vVar;
        this.b = tt2Var;
        this.c = vtx0Var;
        this.d = rq21Var;
    }

    public final Object a(w8v w8vVar, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new UserPhotoCameraRepository$takeAndSavePhoto$2(this, w8vVar, null), continuation);
    }
}
