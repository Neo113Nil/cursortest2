package com.yandex.go.splash.dynamic;

import android.content.Context;
import defpackage.h9n;
import defpackage.lz60;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class b implements lz60 {
    public final a a;
    public final Context b;
    public final h9n c;
    public final tse d;

    public b(a aVar, Context context, h9n h9nVar, tse tseVar) {
        this.a = aVar;
        this.b = context;
        this.c = h9nVar;
        this.d = tseVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        com.yandex.go.coroutines.b.g(this.d, null, null, new DynamicSplashLoader$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "DynamicSplashLoader";
    }
}
