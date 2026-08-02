package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;

/* loaded from: classes2.dex */
public final class l extends a {
    public final com.yandex.passport.internal.account.c D;

    public l(o oVar, c0 c0Var, com.yandex.passport.internal.account.c cVar) {
        super(oVar, c0Var);
        this.D = cVar;
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.a
    public final ModernAccount a0(GimapTrack gimapTrack) {
        return this.D.c(this.A.A, gimapTrack.toAuthCredentials());
    }
}
