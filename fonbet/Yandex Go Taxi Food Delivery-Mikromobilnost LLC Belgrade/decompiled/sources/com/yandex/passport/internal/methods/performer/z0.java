package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.internal.methods.b2;
import com.yandex.passport.internal.methods.x2;
import defpackage.zy11;

/* loaded from: classes8.dex */
public final class z0 implements w0 {
    public final com.yandex.passport.internal.push.k0 a;

    public z0(com.yandex.passport.internal.push.k0 k0Var) {
        this.a = k0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        b2 b2Var = (b2) x2Var;
        PushPlatform pushPlatform = (PushPlatform) b2Var.b.c;
        String str = (String) b2Var.c.c;
        com.yandex.passport.internal.push.k0 k0Var = this.a;
        if (!k0Var.b.m.isEmpty()) {
            k0Var.e.a(k0Var.a(), new com.yandex.passport.internal.push.q0(k0Var.a, pushPlatform, str));
        }
        return zy11.a;
    }
}
