package com.yandex.go.payments.shared.family.viewmodels;

import defpackage.kap;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.uap;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class c {
    public final kap a;
    public final ru.yandex.taxi.widget.c b;
    public final uap c;
    public final pdc d;
    public final m0 e;

    public c(kap kapVar, ru.yandex.taxi.widget.c cVar, uap uapVar, pdc pdcVar, pwy0 pwy0Var) {
        this.a = kapVar;
        this.b = cVar;
        this.c = uapVar;
        this.d = pdcVar;
        this.e = new m0(uapVar.a.a(), pwy0Var.a(), new FamilyGroupMenuItemInteractorImpl$state$1(this, null));
    }
}
