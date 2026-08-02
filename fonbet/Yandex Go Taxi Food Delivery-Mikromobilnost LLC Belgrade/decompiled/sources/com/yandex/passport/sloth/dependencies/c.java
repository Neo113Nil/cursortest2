package com.yandex.passport.sloth.dependencies;

import com.yandex.passport.internal.sloth.n;
import com.yandex.passport.internal.sloth.p;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes2.dex */
public final class c implements v7p {
    public final /* synthetic */ int a;
    public final b b;

    public /* synthetic */ c(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return bVar.a;
            case 1:
                com.yandex.passport.internal.sloth.d dVar = bVar.k;
                q5z.i(dVar);
                return dVar;
            case 2:
                com.yandex.passport.internal.sloth.e eVar = bVar.c;
                q5z.i(eVar);
                return eVar;
            case 3:
                com.yandex.passport.internal.sloth.f fVar = bVar.e;
                q5z.i(fVar);
                return fVar;
            case 4:
                com.yandex.passport.internal.sloth.c cVar = bVar.l;
                q5z.i(cVar);
                return cVar;
            case 5:
                com.yandex.passport.common.coroutine.a aVar = bVar.b;
                q5z.i(aVar);
                return aVar;
            case 6:
                return bVar.g;
            case 7:
                g gVar = bVar.h;
                q5z.i(gVar);
                return gVar;
            case 8:
                com.yandex.passport.common.ui.lang.b bVar2 = bVar.i;
                q5z.i(bVar2);
                return bVar2;
            case 9:
                n nVar = bVar.f;
                q5z.i(nVar);
                return nVar;
            case 10:
                h hVar = bVar.d;
                q5z.i(hVar);
                return hVar;
            default:
                p pVar = bVar.j;
                q5z.i(pVar);
                return pVar;
        }
    }
}
