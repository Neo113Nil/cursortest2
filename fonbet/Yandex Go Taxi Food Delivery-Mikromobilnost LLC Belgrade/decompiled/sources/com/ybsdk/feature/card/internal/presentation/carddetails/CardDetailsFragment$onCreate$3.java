package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.feature.card.internal.interactors.e;
import defpackage.o8r0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CardDetailsFragment$onCreate$3 extends FunctionReferenceImpl implements sls {
    public CardDetailsFragment$onCreate$3(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onSettings2faCancelled", "onSettings2faCancelled()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        e eVar = ((b) this.receiver).W;
        o8r0 o8r0Var = eVar.a.a().h.c;
        if (o8r0Var != null) {
            eVar.f(o8r0Var);
        } else {
            x4c.g("cancel2fa: settingWaitingFor2fa is null unexpectedly", null, null, null, 14);
        }
        return zy11.a;
    }
}
