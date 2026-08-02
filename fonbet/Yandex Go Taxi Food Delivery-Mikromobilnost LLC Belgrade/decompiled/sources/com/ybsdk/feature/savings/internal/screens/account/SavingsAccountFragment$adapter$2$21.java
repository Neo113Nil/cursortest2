package com.ybsdk.feature.savings.internal.screens.account;

import defpackage.g8e;
import defpackage.rt1;
import defpackage.uc5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$21 extends FunctionReferenceImpl implements wls {
    public SavingsAccountFragment$adapter$2$21(uc5 uc5Var) {
        super(2, uc5Var, a.class, "onDetailsCopyClick", "onDetailsCopyClick(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) this.receiver;
        rt1 rt1Var = aVar.E.f0;
        rt1Var.a.a("savings.account.account_details.copy", g8e.w(1, "requisite_name", (String) obj));
        aVar.x0((String) obj2);
        return zy11.a;
    }
}
