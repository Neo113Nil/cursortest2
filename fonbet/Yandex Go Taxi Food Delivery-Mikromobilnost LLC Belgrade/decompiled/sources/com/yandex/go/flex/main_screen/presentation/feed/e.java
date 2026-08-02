package com.yandex.go.flex.main_screen.presentation.feed;

import com.yandex.go.flex.main_screen.experiments.j;
import com.yandex.go.flex.main_screen.interactors.v;
import com.yandex.go.superapp.searchbar.impl.domain.h;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.nbw0;
import defpackage.odw0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class e {
    public final j a;
    public final odw0 b;
    public final nbw0 c;
    public final r0 d;
    public final gci0 e;
    public final r0 f;
    public final gci0 g;

    public e(j jVar, odw0 odw0Var, nbw0 nbw0Var) {
        this.a = jVar;
        this.b = odw0Var;
        this.c = nbw0Var;
        r0 c = bvf0.c(Boolean.FALSE);
        this.d = c;
        this.e = kotlinx.coroutines.flow.e.d(c);
        r0 c2 = bvf0.c(FeedState.CACHE);
        this.f = c2;
        this.g = kotlinx.coroutines.flow.e.d(c2);
    }

    public final m0 a() {
        return new m0(new d(((h) this.b).b(), this), new v(this.c.a.a.a()), new MainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1(this, null));
    }
}
