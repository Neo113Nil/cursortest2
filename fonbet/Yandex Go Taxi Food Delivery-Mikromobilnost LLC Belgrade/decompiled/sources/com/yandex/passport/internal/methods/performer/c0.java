package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class c0 implements w0 {
    public final com.yandex.passport.internal.helper.d a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public c0(com.yandex.passport.internal.helper.d dVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new GetDeviceCodePerformer$performMethod$1(this, (com.yandex.passport.internal.methods.f1) x2Var, null));
    }
}
