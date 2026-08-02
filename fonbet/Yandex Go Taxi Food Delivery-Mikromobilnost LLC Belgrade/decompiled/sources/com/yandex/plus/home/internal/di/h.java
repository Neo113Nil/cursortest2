package com.yandex.plus.home.internal.di;

import defpackage.ike;
import defpackage.syq0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes8.dex */
public final /* synthetic */ class h implements tls {
    public final /* synthetic */ ike a;
    public final /* synthetic */ syq0 b;

    public /* synthetic */ h(ike ikeVar, syq0 syq0Var) {
        this.a = ikeVar;
        this.b = syq0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        tje.N(this.a, null, null, new PlusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1(((Boolean) obj).booleanValue(), this.b, null), 3);
        return zy11.a;
    }
}
