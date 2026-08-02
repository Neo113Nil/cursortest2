package com.ybsdk.network.retrofit;

import defpackage.bvf0;
import defpackage.d5j0;
import defpackage.gy4;
import defpackage.ike;
import defpackage.mdh;
import defpackage.qu;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.yk7;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes8.dex */
public abstract class a implements Call {
    public final Call a;
    public final qu b;
    public final Call c;
    public final e w;
    public final gy4 x;
    public final ike y;

    public a(Call call, e eVar, gy4 gy4Var, qu quVar) {
        this.a = call;
        this.b = quVar;
        this.c = call;
        this.w = eVar;
        this.x = gy4Var;
        sjh sjhVar = uyj.a;
        this.y = bvf0.a(mdh.b);
    }

    public abstract Call a(Call call);

    public abstract Serializable b(Continuation continuation);

    @Override // retrofit2.Call
    public final void cancel() {
        bvf0.i(this.y, "Call explicitly cancelled", null);
        this.a.cancel();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return a(this.c.clone());
    }

    @Override // retrofit2.Call
    public final Response execute() {
        return Response.b(this.b.invoke(new IllegalStateException("With suspended calls only enqueue() method used")));
    }

    @Override // retrofit2.Call
    public final d5j0 k() {
        return this.a.k();
    }

    @Override // retrofit2.Call
    public final void k0(yk7 yk7Var) {
        tje.N(this.y, null, null, new BaseCall$enqueue$1(this, yk7Var, null), 3);
    }

    @Override // retrofit2.Call
    public final boolean l1() {
        return this.a.l1();
    }

    @Override // retrofit2.Call
    public final boolean n() {
        return this.a.n();
    }
}
