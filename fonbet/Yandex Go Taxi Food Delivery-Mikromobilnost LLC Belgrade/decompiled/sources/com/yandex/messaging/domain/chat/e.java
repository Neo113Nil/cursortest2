package com.yandex.messaging.domain.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.v;
import defpackage.g92;
import defpackage.kse;
import defpackage.lqo;
import defpackage.n1f;
import defpackage.p4t;
import defpackage.r96;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.vds0;
import defpackage.w5t;
import defpackage.zrm;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class e extends vds0 {
    public final zrm b;
    public final w5t c;
    public final lqo d;
    public final p4t e;

    public e(kse kseVar, zrm zrmVar, w5t w5tVar, lqo lqoVar, p4t p4tVar) {
        super(kseVar.b);
        this.b = zrmVar;
        this.c = w5tVar;
        this.d = lqoVar;
        this.e = p4tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        r96 r96Var = tz10.m;
        lqo lqoVar = this.d;
        if (!lqoVar.a(r96Var) || !lqoVar.a(tz10.j)) {
            return new g92(2, Boolean.FALSE);
        }
        zrm zrmVar = this.b;
        v vVar = (v) zrmVar.b;
        zy11 zy11Var = zy11.a;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(new n1f(21, vVar.a(zy11Var), zrmVar)), this.c.a(zy11Var), this.e.a(chatRequest), new IsOrganizationUpdateAvailableUseCase$run$1(4, null)));
    }
}
