package com.yandex.passport.internal.push;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.api.PushPlatform;
import defpackage.d6z;
import defpackage.s8o;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class q0 extends r0 {
    public final Context a;
    public final PushPlatform b;
    public final String c;

    public q0(Context context, PushPlatform pushPlatform, String str) {
        this.a = context;
        this.b = pushPlatform;
        this.c = str;
    }

    @Override // com.yandex.passport.internal.push.r0
    public final Intent a() {
        PassportPushRegistrationService.Companion.getClass();
        return d6z.B(this.a, PassportPushRegistrationService.class, s8o.d(new Pair[]{new Pair("intent_type", "token_changed"), new Pair("platform", this.b), new Pair("new_token", this.c)}));
    }

    @Override // com.yandex.passport.internal.push.r0
    public final x b() {
        return new v(this.b, this.c);
    }
}
