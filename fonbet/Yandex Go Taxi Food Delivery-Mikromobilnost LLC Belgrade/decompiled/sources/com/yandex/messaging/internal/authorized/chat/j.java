package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.internal.ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1;
import defpackage.doc;
import defpackage.k020;
import defpackage.ks10;
import defpackage.kse;
import defpackage.lqo;
import defpackage.naz0;
import defpackage.oab;
import defpackage.tje;
import defpackage.to3;

/* loaded from: classes15.dex */
public final class j {
    public final to3 a;
    public final naz0 b;
    public final oab c;
    public final k020 d;
    public final lqo e;
    public final kse f;
    public final ks10 g;
    public final doc h;

    public j(to3 to3Var, naz0 naz0Var, oab oabVar, k020 k020Var, lqo lqoVar, kse kseVar, ks10 ks10Var, doc docVar) {
        this.a = to3Var;
        this.b = naz0Var;
        this.c = oabVar;
        this.d = k020Var;
        this.e = lqoVar;
        this.f = kseVar;
        this.g = ks10Var;
        this.h = docVar;
    }

    public final Object a(String str, ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1 chatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1) {
        return tje.k0(this.f.e, new MessageSearchController$search$2(this, str, null), chatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1);
    }
}
