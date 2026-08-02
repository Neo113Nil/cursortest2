package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;

/* loaded from: classes2.dex */
public final class l {
    public final Activity a;
    public final k b;
    public final g c;
    public final com.yandex.passport.internal.sloth.l d;
    public final com.yandex.passport.internal.common.e e;
    public final h f;
    public final com.yandex.passport.internal.sloth.o g;

    public l(Activity activity, k kVar, com.yandex.passport.common.coroutine.e eVar, g gVar, com.yandex.passport.internal.sloth.l lVar, com.yandex.passport.internal.common.e eVar2, h hVar, com.yandex.passport.internal.sloth.o oVar) {
        this.a = activity;
        this.b = kVar;
        this.c = gVar;
        this.d = lVar;
        this.e = eVar2;
        this.f = hVar;
        this.g = oVar;
    }

    public static /* synthetic */ com.yandex.passport.sloth.ui.dependencies.m b(l lVar, com.yandex.passport.sloth.ui.dependencies.q qVar, com.yandex.passport.sloth.ui.dependencies.o oVar, int i) {
        if ((i & 2) != 0) {
            oVar = new d();
        }
        return lVar.a(qVar, oVar, new n(0));
    }

    public final com.yandex.passport.sloth.ui.dependencies.m a(com.yandex.passport.sloth.ui.dependencies.q qVar, com.yandex.passport.sloth.ui.dependencies.o oVar, com.yandex.passport.sloth.ui.dependencies.p pVar) {
        return new com.yandex.passport.sloth.ui.dependencies.m(this.a, this.b, qVar, this.c, this.d, oVar, this.e, pVar, this.f, this.g);
    }
}
