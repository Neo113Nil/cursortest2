package com.yandex.passport.internal.ui.challenge.vpn;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeStoreFactory$ExecutorImpl", f = "VpnChallengeStoreFactory.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "reloadVpnStatus")
/* loaded from: classes2.dex */
final class VpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(this);
    }
}
