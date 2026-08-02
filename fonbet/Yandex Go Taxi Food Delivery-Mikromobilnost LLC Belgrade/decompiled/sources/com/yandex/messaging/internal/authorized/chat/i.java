package com.yandex.messaging.internal.authorized.chat;

import defpackage.h3t0;
import defpackage.o1b0;
import defpackage.r1s;
import defpackage.rol0;
import defpackage.sb7;

/* loaded from: classes15.dex */
public final class i {
    public final o1b0 a;
    public final sb7 b;
    public final r1s c;

    public i(o1b0 o1b0Var, sb7 sb7Var, r1s r1sVar) {
        this.a = o1b0Var;
        this.b = sb7Var;
        this.c = r1sVar;
    }

    public final rol0 a(h3t0 h3t0Var) {
        return new rol0(new InviteHashController$subscribe$1(h3t0Var, this, null));
    }
}
