package com.yandex.payment.divkit.usecases;

import defpackage.jse;
import defpackage.mdh;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vv90;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r {
    public final vv90 a;
    public final rwo b;
    public final jse c;

    public r(vv90 vv90Var, rwo rwoVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = vv90Var;
        this.b = rwoVar;
        this.c = mdhVar;
    }

    public final Object a(Continuation continuation) {
        return tje.k0(this.c, new PlusCardSyncingUseCaseImpl$start$2(this, null), continuation);
    }
}
