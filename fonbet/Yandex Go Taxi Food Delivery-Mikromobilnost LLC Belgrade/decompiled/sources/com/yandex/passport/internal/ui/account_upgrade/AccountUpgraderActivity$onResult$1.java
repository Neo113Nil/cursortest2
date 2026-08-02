package com.yandex.passport.internal.ui.account_upgrade;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity", f = "AccountUpgraderActivity.kt", l = {148, 150}, m = "onResult")
/* loaded from: classes2.dex */
public final class AccountUpgraderActivity$onResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountUpgraderActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUpgraderActivity$onResult$1(AccountUpgraderActivity accountUpgraderActivity, Continuation continuation) {
        super(continuation);
        this.this$0 = accountUpgraderActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object onResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        onResult = this.this$0.onResult(null, this);
        return onResult;
    }
}
