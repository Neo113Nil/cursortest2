package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.push.SilentPushProperties;

/* loaded from: classes8.dex */
public final class l0 implements w0 {
    public final com.yandex.passport.internal.flags.j a;

    public l0(com.yandex.passport.internal.flags.j jVar) {
        this.a = jVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.flags.l lVar = com.yandex.passport.internal.flags.q.l0;
        com.yandex.passport.internal.flags.j jVar = this.a;
        return new SilentPushProperties(((Number) jVar.b(lVar)).intValue(), ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.w0)).booleanValue(), ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.x0)).booleanValue());
    }
}
