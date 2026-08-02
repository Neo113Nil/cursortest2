package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class q implements w0 {
    public final Context a;
    public final com.yandex.passport.internal.core.accounts.n b;

    public q(Context context, com.yandex.passport.internal.core.accounts.n nVar) {
        this.a = context;
        this.b = nVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.g(new GetAccountSubtitlePerformer$performMethod$1((com.yandex.passport.internal.methods.s0) x2Var, this, null));
    }
}
