package com.ybsdk.feature.savings.internal.screens.account;

import defpackage.uc5;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$1 extends FunctionReferenceImpl implements wls {
    public SavingsAccountFragment$adapter$2$1(uc5 uc5Var) {
        super(2, uc5Var, a.class, "onWidgetButtonClick", "onWidgetButtonClick(Ljava/lang/String;Ljava/lang/String;)Z", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(((a) this.receiver).t0((String) obj, (String) obj2));
    }
}
