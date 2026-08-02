package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.content.Context;
import defpackage.rol0;

/* loaded from: classes2.dex */
public final class e1 implements com.yandex.passport.common.mvi.a {
    public final Context a;

    public e1(Context context) {
        this.a = context;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 19), r0Var, new SocialActionActor$act$1(this, null));
    }
}
