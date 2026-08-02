package com.yandex.passport.internal.link_auth;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.common.coroutine.b;
import com.yandex.passport.internal.flags.j;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.passport.common.coroutine.a a;
    public final j b;
    public final com.yandex.passport.common.a c;
    public final SharedPreferences d;

    public a(Context context, com.yandex.passport.common.coroutine.a aVar, j jVar, com.yandex.passport.common.a aVar2) {
        this.a = aVar;
        this.b = jVar;
        this.c = aVar2;
        this.d = context.getSharedPreferences("polling", 0);
    }

    public final Object a(Continuation continuation) {
        Object k0 = tje.k0(((b) this.a).d, new PollingStorage$update$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
