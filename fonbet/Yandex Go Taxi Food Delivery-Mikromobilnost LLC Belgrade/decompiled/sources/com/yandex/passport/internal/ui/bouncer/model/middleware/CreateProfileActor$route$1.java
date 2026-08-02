package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.CreateProfileActor", f = "CreateProfileActor.kt", l = {33}, m = "route")
/* loaded from: classes2.dex */
final class CreateProfileActor$route$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateProfileActor$route$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return r.b(this.this$0, null, null, this);
    }
}
