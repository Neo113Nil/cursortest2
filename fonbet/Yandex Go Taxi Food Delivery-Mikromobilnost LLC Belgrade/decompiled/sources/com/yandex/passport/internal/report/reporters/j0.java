package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.u8;

/* loaded from: classes15.dex */
public final class j0 extends l3 {
    public j0(com.yandex.passport.internal.report.j jVar) {
        super(jVar);
    }

    public final void j(Exception exc, String str) {
        f(u8.w, new com.yandex.passport.internal.report.a(str, 26, false), new ld(exc));
    }
}
