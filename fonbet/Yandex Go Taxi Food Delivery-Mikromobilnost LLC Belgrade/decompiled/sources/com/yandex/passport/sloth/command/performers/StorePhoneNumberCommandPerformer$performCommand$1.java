package com.yandex.passport.sloth.command.performers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.command.performers.StorePhoneNumberCommandPerformer", f = "StorePhoneNumberCommandPerformer.kt", l = {24}, m = "performCommand")
/* loaded from: classes2.dex */
final class StorePhoneNumberCommandPerformer$performCommand$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorePhoneNumberCommandPerformer$performCommand$1(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
