package com.yandex.passport.internal.ui.bouncer.roundabout;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.RoundaboutSlab", f = "RoundaboutSlab.kt", l = {82, MSException.ERROR_INVALID_PASSWORD}, m = "performBind")
/* loaded from: classes2.dex */
final class RoundaboutSlab$performBind$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundaboutSlab$performBind$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(null, this);
    }
}
