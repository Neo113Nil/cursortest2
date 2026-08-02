package com.yandex.go.overdraft.domain;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import defpackage.aug;
import defpackage.jy60;
import defpackage.k7x0;
import defpackage.mhf;
import defpackage.pav;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.yy80;

/* loaded from: classes8.dex */
public final class d implements jy60 {
    public final Context a;
    public final tse b;
    public final Lifecycle c;
    public final tj60 d;
    public final aug e;
    public final k7x0 f;
    public final pav g;
    public final mhf h;
    public final yy80 i;

    public d(Context context, tse tseVar, Lifecycle lifecycle, tj60 tj60Var, aug augVar, k7x0 k7x0Var, pav pavVar, mhf mhfVar, yy80 yy80Var) {
        this.a = context;
        this.b = tseVar;
        this.c = lifecycle;
        this.d = tj60Var;
        this.e = augVar;
        this.f = k7x0Var;
        this.g = pavVar;
        this.h = mhfVar;
        this.i = yy80Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "DebtTopNotificationController";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new DebtTopNotificationController$onFirstContentfulPaint$1(this, null), 3);
    }
}
