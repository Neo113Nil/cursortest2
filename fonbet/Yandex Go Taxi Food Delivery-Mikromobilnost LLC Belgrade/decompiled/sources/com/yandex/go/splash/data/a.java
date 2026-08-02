package com.yandex.go.splash.data;

import com.yandex.go.lifecycle.c;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.tse;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class a extends c {
    public final tse b;
    public final h3y c;
    public final h3y d;
    public final h3y e;

    public a(tse tseVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.b = tseVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
    }

    @Override // com.yandex.go.lifecycle.c
    public final tse a() {
        return this.b;
    }

    @Override // com.yandex.go.lifecycle.c
    public final Object c(Continuation continuation) {
        return bvf0.n(new SplashConfigRepository$obtain$2(this, null), continuation);
    }
}
