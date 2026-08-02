package com.yandex.go.wallet.custom.plaque_container;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.wallet.custom.plaque_container.PlaqueContainerHolder", f = "PlaqueContainerHolder.kt", l = {56}, m = "awaitBadgeAvailable", v = 2)
/* loaded from: classes10.dex */
public final class PlaqueContainerHolder$awaitBadgeAvailable$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlaqueContainerHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueContainerHolder$awaitBadgeAvailable$1(PlaqueContainerHolder plaqueContainerHolder, Continuation continuation) {
        super(continuation);
        this.this$0 = plaqueContainerHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitBadgeAvailable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitBadgeAvailable = this.this$0.awaitBadgeAvailable(this);
        return awaitBadgeAvailable;
    }
}
