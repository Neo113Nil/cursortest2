package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;
import defpackage.w53;

/* loaded from: classes15.dex */
public abstract class a extends com.yandex.passport.internal.ui.base.h {
    public final o A;
    public final c0 B;
    public final com.yandex.passport.internal.interaction.d C;

    public a(o oVar, c0 c0Var) {
        this.A = oVar;
        this.B = c0Var;
        com.yandex.passport.internal.interaction.d dVar = new com.yandex.passport.internal.interaction.d(new com.yandex.passport.internal.core.accounts.p(this, oVar));
        Z(dVar);
        this.C = dVar;
    }

    public abstract ModernAccount a0(GimapTrack gimapTrack);

    public void b0(GimapError gimapError) {
        c0 c0Var = this.B;
        c0Var.getClass();
        w53 w53Var = new w53();
        w53Var.put("error", gimapError.errorMessage);
        c0Var.a.a(com.yandex.passport.internal.analytics.f.f, w53Var);
    }
}
