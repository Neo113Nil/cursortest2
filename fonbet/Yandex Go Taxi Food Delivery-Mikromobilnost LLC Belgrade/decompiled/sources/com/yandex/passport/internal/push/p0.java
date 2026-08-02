package com.yandex.passport.internal.push;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.common.core.Uid;
import defpackage.d6z;
import defpackage.s8o;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class p0 extends r0 {
    public final Context a;
    public final Uid b;

    public p0(Context context, Uid uid) {
        this.a = context;
        this.b = uid;
    }

    @Override // com.yandex.passport.internal.push.r0
    public final Intent a() {
        PassportPushRegistrationService.Companion.getClass();
        return d6z.B(this.a, PassportPushRegistrationService.class, s8o.d(new Pair[]{new Pair("intent_type", "remove"), new Pair("uid", this.b)}));
    }

    @Override // com.yandex.passport.internal.push.r0
    public final x b() {
        return new w(this.b);
    }
}
