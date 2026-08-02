package com.yandex.go.shortcuts.impl;

import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ tls a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(tls tlsVar, b bVar) {
        this.a = tlsVar;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tls tlsVar = this.a;
        zy11 zy11Var = zy11.a;
        if (tlsVar == null) {
            return zy11Var;
        }
        tje.N(this.b.n, null, null, new ShortcutsOnItemClickInteractorImpl$openStoryByAction$1$1(tlsVar, null), 3);
        return zy11Var;
    }
}
