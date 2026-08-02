package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.usecase.i1;
import defpackage.hs31;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class a1 implements hs31 {
    public final k0 a;
    public final a b;
    public final com.yandex.passport.internal.push.h c;
    public final com.yandex.passport.internal.sloth.performers.webcard.g w;
    public final k1 x;
    public final i1 y;

    public a1(k0 k0Var, a aVar, com.yandex.passport.internal.push.h hVar, com.yandex.passport.internal.sloth.performers.webcard.g gVar, k1 k1Var, i1 i1Var) {
        this.a = k0Var;
        this.b = aVar;
        this.c = hVar;
        this.w = gVar;
        this.x = k1Var;
        this.y = i1Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        return new d1(this.a, this.b, this.c, this.w, this.x, this.y);
    }
}
