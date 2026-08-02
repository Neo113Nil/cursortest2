package com.ybsdk.feature.card.internal.presentation.singlecard;

import defpackage.ds31;
import defpackage.o8r0;
import defpackage.rgs0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SingleCardFragment$onCreate$3 extends FunctionReferenceImpl implements tls {
    public SingleCardFragment$onCreate$3(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onSettingsVerificationTokenReceived", "onSettingsVerificationTokenReceived(Ljava/lang/String;)V", 0);
    }

    public final void i(String str) {
        a aVar = (a) this.receiver;
        o8r0 o8r0Var = ((rgs0) aVar.X()).f.c;
        if (o8r0Var == null) {
            return;
        }
        tje.N(ds31.a(aVar), null, null, new SingleCardViewModel$onSettingsVerificationTokenReceived$1(aVar, o8r0Var, str, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
