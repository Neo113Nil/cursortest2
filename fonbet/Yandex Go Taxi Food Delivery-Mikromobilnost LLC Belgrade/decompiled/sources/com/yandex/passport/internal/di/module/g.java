package com.yandex.passport.internal.di.module;

import com.yandex.passport.data.network.mb;
import com.yandex.passport.data.network.z1;
import com.yandex.passport.internal.database.PassportDatabase;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class g implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;

    public /* synthetic */ g(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                PassportDatabase passportDatabase = (PassportDatabase) xvf0Var.get();
                ((e) obj).getClass();
                com.yandex.passport.internal.database.diary.d T0 = passportDatabase.T0();
                q5z.i(T0);
                return T0;
            case 1:
                com.yandex.passport.internal.network.c cVar = (com.yandex.passport.internal.network.c) ((com.yandex.passport.common.coroutine.g) xvf0Var).get();
                ((h) obj).getClass();
                return cVar;
            case 2:
                com.yandex.passport.internal.network.d dVar = (com.yandex.passport.internal.network.d) ((mb) xvf0Var).get();
                ((h) obj).getClass();
                return dVar;
            case 3:
                com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) ((z1) xvf0Var).get();
                ((h) obj).getClass();
                return lVar;
            case 4:
                com.yandex.passport.internal.clipboard.a aVar = (com.yandex.passport.internal.clipboard.a) ((com.yandex.passport.common.coroutine.g) xvf0Var).get();
                ((n) obj).getClass();
                return aVar;
            case 5:
                return new com.yandex.passport.internal.sloth.n((com.yandex.passport.internal.config.h) ((yvf0) obj).get(), (com.yandex.passport.internal.ui.common.web.b) ((com.yandex.passport.internal.badges.d) xvf0Var).get());
            default:
                return new com.yandex.passport.internal.ui.sloth.menu.o((com.yandex.passport.internal.sloth.performers.usermenu.a) ((com.yandex.passport.common.coroutine.g) obj).get(), (com.yandex.passport.internal.sloth.performers.usermenu.d) ((com.yandex.passport.common.coroutine.g) xvf0Var).get());
        }
    }
}
