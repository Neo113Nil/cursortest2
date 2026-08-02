package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.jnd0;
import defpackage.k3v0;
import defpackage.lde;
import defpackage.m3v0;
import defpackage.nce;
import defpackage.pde;
import defpackage.tje;
import defpackage.yr31;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a extends yr31 {
    public final r0 A;
    public final jnd0 b;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a c;
    public final k3v0 w;
    public final lde x;
    public nce y;
    public final r0 z;

    public a(jnd0 jnd0Var, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar, k3v0 k3v0Var, lde ldeVar) {
        this.b = jnd0Var;
        this.c = aVar;
        this.w = k3v0Var;
        this.x = ldeVar;
        r0 c = bvf0.c(pde.a);
        this.z = c;
        this.A = c;
        tje.N(ds31.a(this), null, null, new ContactsViewModel$setContentState$1(this, null), 3);
    }

    public final void W() {
        ((m3v0) this.w).b(SuccessFlowScreen.CONTACTS);
    }
}
