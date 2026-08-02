package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.internal.ui.challenge.d;
import com.yandex.passport.internal.ui.challenge.l;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.ChallengeActivity", f = "ChallengeActivity.kt", l = {59, 61}, m = "logic$suspendImpl")
/* loaded from: classes2.dex */
public final class ChallengeActivity$logic$1<R, Component extends d, T extends l> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeActivity<R, Component, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$logic$1(ChallengeActivity challengeActivity, Continuation continuation) {
        super(continuation);
        this.this$0 = challengeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChallengeActivity.logic$suspendImpl(this.this$0, null, this);
    }
}
