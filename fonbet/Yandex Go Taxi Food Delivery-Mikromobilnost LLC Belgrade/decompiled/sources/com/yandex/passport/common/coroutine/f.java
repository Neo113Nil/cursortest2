package com.yandex.passport.common.coroutine;

import com.yandex.passport.internal.util.p;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class f implements e {
    public final b a;

    public f(b bVar) {
        this.a = bVar;
    }

    public final ike a(boolean z) {
        b bVar = this.a;
        return bvf0.a((z ? bVar.b : bVar.a).plus(jl40.a()).plus(p.o("main")));
    }
}
