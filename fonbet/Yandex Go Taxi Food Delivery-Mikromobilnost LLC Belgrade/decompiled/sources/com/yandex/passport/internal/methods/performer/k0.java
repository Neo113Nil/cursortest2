package com.yandex.passport.internal.methods.performer;

import android.os.Bundle;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.push.PushPayload;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.ka;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.yd;

/* loaded from: classes8.dex */
public final class k0 implements w0 {
    public final com.yandex.passport.internal.flags.j a;
    public final com.yandex.passport.internal.push.d0 b;
    public final com.yandex.passport.internal.push.e0 c;
    public final com.yandex.passport.internal.report.reporters.u0 w;

    public k0(com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.push.d0 d0Var, com.yandex.passport.internal.push.e0 e0Var, com.yandex.passport.internal.report.reporters.u0 u0Var) {
        this.a = jVar;
        this.b = d0Var;
        this.c = e0Var;
        this.w = u0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Bundle a;
        if (!((Boolean) this.a.b(com.yandex.passport.internal.flags.q.k0)).booleanValue() || (a = this.c.a()) == null) {
            return null;
        }
        PushPayload a2 = this.b.a(a);
        long uid = a2.getUid();
        String pushId = a2.getPushId();
        String trackId = a2.getTrackId();
        boolean A = com.yandex.passport.internal.properties.u.A(a2);
        com.yandex.passport.internal.report.reporters.u0 u0Var = this.w;
        u0Var.getClass();
        u0Var.f(ka.w, new jd(Long.valueOf(uid)), new md(pushId, 7), new yd(trackId, 12), new com.yandex.passport.internal.report.i(A, 10));
        if (com.yandex.passport.internal.properties.u.A(a2)) {
            return a2;
        }
        return null;
    }
}
