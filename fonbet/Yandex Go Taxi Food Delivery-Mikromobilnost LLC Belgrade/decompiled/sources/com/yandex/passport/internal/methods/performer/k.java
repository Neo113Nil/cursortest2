package com.yandex.passport.internal.methods.performer;

import android.os.Bundle;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.report.ja;
import com.yandex.passport.internal.report.md;

/* loaded from: classes8.dex */
public final class k implements w0 {
    public final com.yandex.passport.internal.push.d0 a;
    public final com.yandex.passport.internal.push.e0 b;
    public final com.yandex.passport.internal.report.reporters.u0 c;

    public k(com.yandex.passport.internal.push.d0 d0Var, com.yandex.passport.internal.push.e0 e0Var, com.yandex.passport.internal.report.reporters.u0 u0Var) {
        this.a = d0Var;
        this.b = e0Var;
        this.c = u0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        boolean z;
        com.yandex.passport.internal.methods.i0 i0Var = (com.yandex.passport.internal.methods.i0) x2Var;
        com.yandex.passport.internal.flags.presentation.s0 s0Var = new com.yandex.passport.internal.flags.presentation.s0(3, this, i0Var);
        com.yandex.passport.internal.push.e0 e0Var = this.b;
        Bundle a = e0Var.a();
        if (a == null || !((Boolean) s0Var.invoke(a)).booleanValue()) {
            z = false;
        } else {
            e0Var.b().clear();
            z = true;
        }
        if (z) {
            String str = (String) i0Var.b.c;
            com.yandex.passport.internal.report.reporters.u0 u0Var = this.c;
            u0Var.getClass();
            u0Var.f(ja.w, new md(str, 7));
        }
        return Boolean.valueOf(z);
    }
}
