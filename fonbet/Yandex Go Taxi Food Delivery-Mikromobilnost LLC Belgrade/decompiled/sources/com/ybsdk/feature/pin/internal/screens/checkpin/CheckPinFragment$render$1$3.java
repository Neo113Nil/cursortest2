package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.ds31;
import defpackage.sls;
import defpackage.tje;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CheckPinFragment$render$1$3 extends FunctionReferenceImpl implements sls {
    public CheckPinFragment$render$1$3(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onSuccessInput", "onSuccessInput()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m461invoke() {
        b bVar = (b) this.receiver;
        bVar.getClass();
        tje.N(ds31.a(bVar), null, null, new CheckPinViewModel$onSuccessInput$1(bVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m461invoke();
        return zy11.a;
    }
}
