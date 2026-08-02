package com.ybsdk.feature.savings.internal.screens.account;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$7 extends FunctionReferenceImpl implements tls {
    public SavingsAccountFragment$adapter$2$7(SavingsAccountFragment savingsAccountFragment) {
        super(1, savingsAccountFragment, SavingsAccountFragment.class, "onIncomeWidgetProgressTouch", "onIncomeWidgetProgressTouch(Z)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((SavingsAccountFragment) this.receiver).onIncomeWidgetProgressTouch(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
