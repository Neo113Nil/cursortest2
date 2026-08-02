package com.yandex.go.payments.cards.pci_dss.verification;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.cards.pci_dss.verification.Card3dsPollingBaseRouter", f = "Card3dsPollingBaseRouter.kt", l = {186, 192}, m = "launchCard3dsFailedRouter", v = 2)
/* loaded from: classes13.dex */
final class Card3dsPollingBaseRouter$launchCard3dsFailedRouter$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card3dsPollingBaseRouter$launchCard3dsFailedRouter$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.R(null, this);
    }
}
