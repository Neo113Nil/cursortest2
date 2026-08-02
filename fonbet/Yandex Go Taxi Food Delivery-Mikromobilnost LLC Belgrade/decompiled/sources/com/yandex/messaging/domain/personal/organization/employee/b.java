package com.yandex.messaging.domain.personal.organization.employee;

import com.yandex.messaging.internal.authorized.j;
import defpackage.kse;
import defpackage.rol0;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class b {
    public final kse a;
    public final j b;
    public final com.yandex.messaging.domain.personal.a c;

    public b(kse kseVar, j jVar, com.yandex.messaging.domain.personal.a aVar) {
        this.a = kseVar;
        this.b = jVar;
        this.c = aVar;
    }

    public final tpr a() {
        return e.F(e.X(new rol0(new GetPersonalEmployeeInfoUseCase$execute$1(this, null)), new GetPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1(this, null)), this.a.e);
    }
}
