package com.yandex.passport.sloth.ui;

import defpackage.j18;
import defpackage.mf60;
import defpackage.t40;
import defpackage.u40;

/* loaded from: classes2.dex */
public final class c0 implements u40 {
    public final /* synthetic */ j18 a;

    public c0(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        t40 t40Var = (t40) obj;
        j18 j18Var = this.a;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(t40Var);
        }
    }
}
