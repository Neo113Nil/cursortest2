package com.yandex.go.profile.domain.divkit.variables;

import defpackage.h3y;
import defpackage.nwl;
import defpackage.om;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class a extends nwl {
    public final h3y b;
    public final h3y c;
    public final h3y d;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        super(h3yVar);
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
    }

    @Override // defpackage.nwl
    public final void a(tse tseVar) {
        tje.N(tseVar, null, null, new AccountVariableHandler$init$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.q(kotlinx.coroutines.flow.e.n(((ru.yandex.taxi.profile.a) this.b.get()).d, ((ru.yandex.taxi.startup.launch.h) this.c.get()).Pg(), ((ru.yandex.taxi.am.g) this.d.get()).a(), new AccountVariableHandler$init$1(4, this, a.class, "createState", "createState(Lcom/yandex/go/user_profile/models/NameAndRating;Ljava/lang/String;Lru/yandex/taxi/am/Account;)Lcom/yandex/go/profile/domain/divkit/variables/AccountVariableHandler$State;", 4)), om.a)), null, this), 3);
    }
}
