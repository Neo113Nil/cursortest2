package com.yandex.go.superapp_favorites.router;

import com.yandex.go.superapp_favorites.data.SuperappFavoritesFilter;
import defpackage.cys0;
import defpackage.eja1;
import defpackage.eqh;
import defpackage.faw0;
import defpackage.gaw0;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.ihr;
import defpackage.jhr;
import defpackage.kaw0;
import defpackage.m580;
import defpackage.miv0;
import defpackage.n3w;
import defpackage.nag;
import defpackage.naw0;
import defpackage.oaw0;
import defpackage.raw0;
import defpackage.rct0;
import defpackage.rhr;
import defpackage.tje;
import defpackage.tse;
import defpackage.uzu0;
import defpackage.v8c0;
import defpackage.xvf0;
import defpackage.yvf0;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes14.dex */
public final class a extends jhr {
    public final i6r F;
    public final b G;

    public a(i6r i6rVar, yvf0 yvf0Var, b bVar) {
        super(yvf0Var);
        this.F = i6rVar;
        this.G = bVar;
    }

    @Override // defpackage.jhr, defpackage.h55
    public final void J(Object obj) {
        super.J((oaw0) obj);
        tje.N(eja1.s(this), null, null, new SuperappFavoritesInnerRouter$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.jhr
    public final rhr Q(Object obj) {
        tse o = o();
        ihr ihrVar = new ihr(this);
        String str = ((oaw0) obj).a;
        SuperappFavoritesFilter superappFavoritesFilter = str != null ? new SuperappFavoritesFilter(str) : null;
        kaw0 kaw0Var = new kaw0();
        kaw0Var.a = superappFavoritesFilter;
        i6r i6rVar = this.F;
        i6rVar.getClass();
        xvf0 b = i5m.b(raw0.a);
        xvf0 b2 = i5m.b(new uzu0(new nag(i6rVar, 19), 8));
        nag nagVar = new nag(i6rVar, 18);
        n3w a = n3w.a(o);
        n3w a2 = n3w.a(ihrVar);
        eqh eqhVar = new eqh();
        nag nagVar2 = new nag(i6rVar, 14);
        xvf0 b3 = i5m.b(new uzu0(new nag(i6rVar, 11), 7));
        xvf0 b4 = i5m.b(new cys0((Object) nagVar2, b3, 28));
        gaw0 gaw0Var = faw0.a;
        xvf0 b5 = i5m.b(new com.yandex.go.superapp_favorites.di.b(nagVar, a, gaw0Var, b, a2, eqhVar, b4));
        nag nagVar3 = new nag(i6rVar, 16);
        uzu0 uzu0Var = new uzu0(new nag(i6rVar, 10), 5);
        n3w a3 = n3w.a(kaw0Var);
        nag nagVar4 = new nag(i6rVar, 15);
        xvf0 b6 = i5m.b(new cys0((Object) uzu0Var, (xvf0) new cys0((Object) a3, (xvf0) nagVar4, 26), 25));
        v8c0 v8c0Var = new v8c0(a3, 22);
        uzu0 uzu0Var2 = new uzu0(new cys0((Object) new nag(i6rVar, 8), (xvf0) nagVar3, 29), 6);
        nag nagVar5 = new nag(i6rVar, 9);
        nag nagVar6 = new nag(i6rVar, 17);
        eqh.a(eqhVar, i5m.b(new m580(b, b2, b5, nagVar3, b6, b3, v8c0Var, uzu0Var2, new naw0(nagVar5, b3, nagVar6))));
        xvf0 b7 = i5m.b(new naw0(nagVar5, nagVar6, i5m.b(new cys0((Object) new nag(i6rVar, 12), (xvf0) eqhVar, 27))));
        nag nagVar7 = new nag(i6rVar, 13);
        xvf0 b8 = i5m.b(new miv0(b2, 19));
        return (rhr) i5m.b(new rct0(eqhVar, gaw0Var, i5m.b(new rct0(b7, nagVar7, nagVar4, b3, b8)), i5m.b(new miv0(b8, 20)), b4, 12, false)).get();
    }
}
