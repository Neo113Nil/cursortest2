package com.yandex.passport.internal.sloth;

import android.content.Context;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.ui.domik.webam.WebAmRegistrationType;
import com.yandex.passport.sloth.data.SlothRegistrationType;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class h {
    public final Context a;
    public final com.yandex.passport.common.coroutine.a b;
    public final e c;
    public final o d;
    public final f e;
    public final com.yandex.passport.internal.flags.j f;
    public final m g;
    public final com.yandex.passport.common.ui.lang.b h;
    public final p i;
    public final n j;
    public final d k;
    public final c l;

    public h(Context context, com.yandex.passport.common.coroutine.a aVar, e eVar, o oVar, f fVar, com.yandex.passport.internal.flags.j jVar, m mVar, com.yandex.passport.common.ui.lang.b bVar, p pVar, n nVar, d dVar, c cVar) {
        this.a = context;
        this.b = aVar;
        this.c = eVar;
        this.d = oVar;
        this.e = fVar;
        this.f = jVar;
        this.g = mVar;
        this.h = bVar;
        this.i = pVar;
        this.j = nVar;
        this.k = dVar;
        this.l = cVar;
    }

    public final com.yandex.passport.sloth.dependencies.b a() {
        SlothRegistrationType slothRegistrationType;
        Context applicationContext = this.a.getApplicationContext();
        com.yandex.passport.internal.flags.b bVar = q.o;
        com.yandex.passport.internal.flags.j jVar = this.f;
        int i = g.b[((WebAmRegistrationType) jVar.b(bVar)).ordinal()];
        if (i == 1) {
            slothRegistrationType = SlothRegistrationType.Portal;
        } else if (i == 2) {
            slothRegistrationType = SlothRegistrationType.Neophonish;
        } else if (i == 3) {
            slothRegistrationType = SlothRegistrationType.Doregish;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            slothRegistrationType = SlothRegistrationType.Nothing;
        }
        SlothRegistrationType slothRegistrationType2 = slothRegistrationType;
        boolean booleanValue = ((Boolean) jVar.b(q.J)).booleanValue();
        boolean booleanValue2 = ((Boolean) jVar.b(q.K)).booleanValue();
        boolean booleanValue3 = ((Boolean) jVar.b(q.O)).booleanValue();
        return new com.yandex.passport.sloth.dependencies.b(applicationContext, this.b, this.c, this.d, this.e, this.j, new com.yandex.passport.sloth.dependencies.d(slothRegistrationType2, booleanValue, booleanValue2, ((Boolean) jVar.b(q.L)).booleanValue(), ((Boolean) jVar.b(q.M)).booleanValue(), ((Boolean) jVar.b(q.N)).booleanValue(), booleanValue3, ((Boolean) jVar.b(q.P)).booleanValue(), ((Boolean) jVar.b(q.Q)).booleanValue(), ((Boolean) jVar.b(q.A)).booleanValue()), this.g, this.h, this.i, this.k, this.l);
    }
}
