package com.yandex.go.pickup_from_photo.data;

import defpackage.bjb0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vtx0;
import defpackage.w8v;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a {
    public final vtx0 a;
    public final tt2 b;
    public final bjb0 c;

    public a(vtx0 vtx0Var, tt2 tt2Var, bjb0 bjb0Var) {
        this.a = vtx0Var;
        this.b = tt2Var;
        this.c = bjb0Var;
    }

    public final Object a(w8v w8vVar, com.yandex.go.pickup_from_photo.domain.a aVar, com.yandex.go.pickup_from_photo.domain.b bVar, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PhotoRepository$takeAndSavePhoto$2(this, w8vVar, aVar, bVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
