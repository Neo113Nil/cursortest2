package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.api.u0;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.social.esia.EsiaInternalBindProperties;
import defpackage.x40;

/* loaded from: classes8.dex */
public final class t extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        com.yandex.passport.internal.social.esia.d dVar = EsiaBindActivity.Companion;
        EsiaInternalBindProperties.UserAwareRequest a = s.a(a0.a0((u0) obj));
        dVar.getClass();
        return com.yandex.passport.internal.social.esia.d.a(context, a);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return com.yandex.passport.api.r.g(i, intent);
    }
}
