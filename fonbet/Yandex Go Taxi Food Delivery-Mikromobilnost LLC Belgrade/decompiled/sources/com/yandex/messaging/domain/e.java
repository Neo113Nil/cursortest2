package com.yandex.messaging.domain;

import com.yandex.messaging.ChatRequest;
import defpackage.g92;
import defpackage.kse;
import defpackage.lqo;
import defpackage.p4t;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.vds0;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class e extends vds0 {
    public final p4t b;
    public final com.yandex.messaging.domain.personal.organization.employee.b c;
    public final lqo d;

    public e(kse kseVar, p4t p4tVar, com.yandex.messaging.domain.personal.organization.employee.b bVar, lqo lqoVar) {
        super(kseVar.e);
        this.b = p4tVar;
        this.c = bVar;
        this.d = lqoVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return !this.d.a(tz10.L) ? new g92(2, EmptyList.a) : new m0(this.c.a(), this.b.a((ChatRequest) obj), new GetChatBadgesUseCase$run$1(3, null));
    }
}
