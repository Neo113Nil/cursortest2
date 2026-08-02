package com.yandex.passport.internal.methods.performer;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.methods.performer.UpdateAuthCookiePerformer", f = "UpdateAuthCookiePerformer.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52}, m = "updateCookie")
/* loaded from: classes15.dex */
final class UpdateAuthCookiePerformer$updateCookie$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAuthCookiePerformer$updateCookie$1(k1 k1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k1.b(this.this$0, null, null, this);
    }
}
