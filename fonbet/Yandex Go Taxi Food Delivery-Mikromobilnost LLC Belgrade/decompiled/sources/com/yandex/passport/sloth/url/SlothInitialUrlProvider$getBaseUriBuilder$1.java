package com.yandex.passport.sloth.url;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.url.SlothInitialUrlProvider", f = "SlothInitialUrlProvider.kt", l = {351, 358, 364, 367, 370, 377, 378, 384, 392, 394, 396, 398, 399, 403}, m = "getBaseUriBuilder")
/* loaded from: classes2.dex */
final class SlothInitialUrlProvider$getBaseUriBuilder$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothInitialUrlProvider$getBaseUriBuilder$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, this);
    }
}
