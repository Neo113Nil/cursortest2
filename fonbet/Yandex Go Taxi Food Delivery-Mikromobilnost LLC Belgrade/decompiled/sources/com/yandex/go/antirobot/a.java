package com.yandex.go.antirobot;

import androidx.lifecycle.Lifecycle;
import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public final c a;
    public final tse b;
    public final Lifecycle c;

    public a(c cVar, tse tseVar, Lifecycle lifecycle) {
        this.a = cVar;
        this.b = tseVar;
        this.c = lifecycle;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.b, null, null, new AntirobotTokenRefresherInteractor$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AntirobotTokenRefresherInteractor";
    }
}
