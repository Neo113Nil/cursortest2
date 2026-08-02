package com.yandex.go.account.activity;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.zalogin.k;

/* loaded from: classes.dex */
public final class a implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final k c;

    public a(tse tseVar, Lifecycle lifecycle, k kVar) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = kVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LinkAccountsLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new LinkAccountsLifecycleListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
