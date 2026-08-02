package com.yandex.messaging.internal.view.chat;

import com.yandex.messaging.internal.authorized.j;
import defpackage.gbb1;
import defpackage.k020;
import defpackage.kse;
import defpackage.rol0;
import defpackage.tpr;
import kotlinx.coroutines.flow.h;

/* loaded from: classes15.dex */
public final class f {
    public final kse a;
    public final k020 b;
    public final j c;

    public f(kse kseVar, k020 k020Var, j jVar) {
        this.a = kseVar;
        this.b = k020Var;
        this.c = jVar;
    }

    public final tpr a(Object obj) {
        rol0 rol0Var = new rol0(new GetPinnedChatsUseCase$execute$cached$1(this, null));
        kse kseVar = this.a;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.D(new h(new tpr[]{kotlinx.coroutines.flow.e.F(rol0Var, kseVar.b), kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(gbb1.d(this.c), new GetPinnedChatsUseCase$execute$$inlined$flatMapLatest$1(3, null)), kseVar.e)})));
    }
}
