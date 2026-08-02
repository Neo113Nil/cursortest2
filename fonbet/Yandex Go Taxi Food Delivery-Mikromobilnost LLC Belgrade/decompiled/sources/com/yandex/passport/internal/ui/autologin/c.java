package com.yandex.passport.internal.ui.autologin;

import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.ui.base.h;
import com.yandex.passport.internal.ui.util.l;
import defpackage.dy40;

/* loaded from: classes2.dex */
public final class c extends h {
    public final com.yandex.passport.internal.account.c A;
    public final UserCredentials B;
    public final c0 C;
    public final dy40 D;
    public final l E = new l();

    public c(com.yandex.passport.internal.account.c cVar, UserCredentials userCredentials, boolean z, c0 c0Var) {
        this.A = cVar;
        this.B = userCredentials;
        this.C = c0Var;
        this.D = new dy40(Boolean.valueOf(z));
    }
}
