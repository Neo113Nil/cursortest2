package com.ybsdk.screens.upgrade.presentation.main;

import defpackage.ds31;
import defpackage.sls;
import defpackage.tje;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class UpgradeFragment$onViewCreated$1$2 extends FunctionReferenceImpl implements sls {
    public UpgradeFragment$onViewCreated$1$2(uc5 uc5Var) {
        super(0, uc5Var, a.class, "retry", "retry()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m476invoke() {
        a aVar = (a) this.receiver;
        aVar.getClass();
        tje.N(ds31.a(aVar), null, null, new UpgradeViewModel$retry$1(aVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m476invoke();
        return zy11.a;
    }
}
