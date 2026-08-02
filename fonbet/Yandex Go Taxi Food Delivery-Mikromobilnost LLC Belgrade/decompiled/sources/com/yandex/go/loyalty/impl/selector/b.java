package com.yandex.go.loyalty.impl.selector;

import defpackage.hwz;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tls;

/* loaded from: classes12.dex */
public final class b implements sy60 {
    public final /* synthetic */ hwz a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ tls c;

    public b(hwz hwzVar, tls tlsVar, tls tlsVar2) {
        this.a = hwzVar;
        this.b = tlsVar;
        this.c = tlsVar2;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    public final void n1() {
        tje.N(this.a.o(), null, null, new LoyaltySelectorInternalRouter$LoyaltySelectorNavigatorImpl$openLoyaltyProgramSignIn$1$onAuthFailure$1(this.c, null), 3);
    }

    public final void o1() {
        tje.N(this.a.o(), null, null, new LoyaltySelectorInternalRouter$LoyaltySelectorNavigatorImpl$openLoyaltyProgramSignIn$1$onAuthSuccess$1(this.b, null), 3);
    }
}
