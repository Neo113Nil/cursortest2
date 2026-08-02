package com.yandex.passport.sloth.ui.dependencies;

import android.app.Activity;
import com.yandex.passport.sloth.ui.r;
import defpackage.q5z;
import defpackage.st41;
import defpackage.v7p;

/* loaded from: classes15.dex */
public final class n implements v7p {
    public final /* synthetic */ int a;
    public final m b;

    public /* synthetic */ n(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) mVar.a;
                q5z.i(activity);
                return activity;
            case 1:
                com.yandex.passport.common.common.a aVar = (com.yandex.passport.common.common.a) mVar.g;
                q5z.i(aVar);
                return aVar;
            case 2:
                d dVar = (d) mVar.d;
                q5z.i(dVar);
                return dVar;
            case 3:
                r rVar = (r) mVar.e;
                q5z.i(rVar);
                return rVar;
            case 4:
                o oVar = (o) mVar.f;
                q5z.i(oVar);
                return oVar;
            case 5:
                com.yandex.passport.sloth.dependencies.h hVar = (com.yandex.passport.sloth.dependencies.h) mVar.j;
                q5z.i(hVar);
                return hVar;
            case 6:
                p pVar = (p) mVar.h;
                q5z.i(pVar);
                return pVar;
            case 7:
                com.yandex.passport.sloth.ui.string.a aVar2 = (com.yandex.passport.sloth.ui.string.a) mVar.b;
                q5z.i(aVar2);
                return aVar2;
            case 8:
                st41 st41Var = (st41) mVar.i;
                q5z.i(st41Var);
                return st41Var;
            default:
                q qVar = (q) mVar.c;
                q5z.i(qVar);
                return qVar;
        }
    }
}
