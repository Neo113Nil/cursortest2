package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.t2;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.usecase.t1;

/* loaded from: classes8.dex */
public final class l1 implements w0 {
    public final t1 a;
    public final com.yandex.passport.internal.methods.performer.error.a b;

    public l1(t1 t1Var, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = t1Var;
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new UpdateAvatarPerformer$performMethod$1((t2) x2Var, this, null));
    }
}
