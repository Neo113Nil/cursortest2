package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import com.yandex.passport.internal.methods.n2;
import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class h1 implements w0 {
    public final Context a;
    public final com.yandex.passport.internal.usecase.vpn.b b;
    public final com.yandex.passport.internal.config.o c;

    public h1(Context context, com.yandex.passport.internal.usecase.vpn.b bVar, com.yandex.passport.internal.config.o oVar) {
        this.a = context;
        this.b = bVar;
        this.c = oVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.g(new SetVpnChallengeActivityDisabledPerformer$performMethod$1(this, (n2) x2Var, null));
    }
}
