package com.yandex.plus.treasury.impl;

import androidx.fragment.app.FragmentActivity;
import defpackage.eja1;
import defpackage.i4u;
import defpackage.jg51;
import defpackage.lg51;
import defpackage.tje;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class a implements jg51 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ c c;

    public a(FragmentActivity fragmentActivity, c cVar) {
        this.b = fragmentActivity;
        this.c = cVar;
    }

    @Override // defpackage.jg51
    public final void p(lg51 lg51Var) {
        if (this.a.compareAndSet(false, true)) {
            tje.N(eja1.s(this.b), null, null, new PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorize$1(this, this.c, lg51Var, null), 3);
        }
    }

    @Override // defpackage.jg51
    public final void r(i4u i4uVar) {
        if (this.a.compareAndSet(false, true)) {
            tje.N(eja1.s(this.b), null, null, new PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1(this, this.c, i4uVar, null), 3);
        }
    }
}
