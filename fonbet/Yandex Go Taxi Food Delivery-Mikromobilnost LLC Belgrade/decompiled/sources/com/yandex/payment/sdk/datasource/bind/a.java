package com.yandex.payment.sdk.datasource.bind;

import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import defpackage.apa1;
import defpackage.bvf0;
import defpackage.e98;
import defpackage.ffx;
import defpackage.g98;
import defpackage.ike;
import defpackage.ju5;
import defpackage.kn8;
import defpackage.on8;
import defpackage.qg8;
import defpackage.r501;
import defpackage.rwo;
import defpackage.ryj0;
import defpackage.sr4;
import defpackage.tje;
import defpackage.uyj;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public abstract class a extends qg8 {
    public static final n0 k = ffx.c(1, 1, null, 4);
    public ju5 h;
    public final ike i;
    public final boolean j;

    public a(rwo rwoVar) {
        super(rwoVar);
        ike a = bvf0.a(uyj.b);
        this.i = a;
        boolean e = apa1.e(FeatureFlag.BIND_CARD_MEDIATOR_REFACTORING);
        this.j = e;
        if (e) {
            tje.N(a, null, null, new BindCardMediator$1(this, null), 3);
        }
    }

    @Override // defpackage.qg8
    public final void b() {
        on8 on8Var = this.f;
        if (on8Var != null) {
            on8Var.b(kn8.a);
        }
        g98 g98Var = this.d;
        if (g98Var != null) {
            g98Var.e(e98.a);
        }
        ryj0 r501Var = this.j ? new r501(8) : new sr4(7, this);
        ju5 ju5Var = this.h;
        if (ju5Var != null) {
            ju5Var.q(r501Var);
        }
    }
}
