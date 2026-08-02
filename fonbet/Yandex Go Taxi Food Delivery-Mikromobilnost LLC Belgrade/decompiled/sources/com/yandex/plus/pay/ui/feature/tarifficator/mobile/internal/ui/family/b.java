package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import defpackage.ajo;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.i7t;
import defpackage.jnd0;
import defpackage.k3v0;
import defpackage.m3v0;
import defpackage.obp;
import defpackage.sbp;
import defpackage.tje;
import defpackage.wap;
import defpackage.yr31;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends yr31 {
    public final n0 A;
    public final n0 B;
    public final r0 C;
    public final r0 D;
    public final jnd0 b;
    public final i7t c;
    public final k3v0 w;
    public final obp x;
    public final ajo y;
    public wap z;

    public b(jnd0 jnd0Var, i7t i7tVar, k3v0 k3v0Var, obp obpVar, ajo ajoVar) {
        this.b = jnd0Var;
        this.c = i7tVar;
        this.w = k3v0Var;
        this.x = obpVar;
        this.y = ajoVar;
        n0 c = ffx.c(0, 0, null, 7);
        this.A = c;
        this.B = c;
        r0 c2 = bvf0.c(sbp.a);
        this.C = c2;
        this.D = c2;
        tje.N(ds31.a(this), null, null, new FamilyViewModel$setContentState$1(this, null), 3);
    }

    public final void W() {
        ((m3v0) this.w).b(SuccessFlowScreen.FAMILY_INVITATION);
    }
}
