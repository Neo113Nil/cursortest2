package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.GetClientTokenActor", f = "GetClientTokenActor.kt", l = {BlendingGradientView.BASE_ALPHA, 157}, m = "getAccountForMasterMember")
/* loaded from: classes2.dex */
final class GetClientTokenActor$getAccountForMasterMember$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClientTokenActor$getAccountForMasterMember$1(a0 a0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, this);
    }
}
