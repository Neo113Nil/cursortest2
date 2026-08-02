package com.yandex.passport.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.SendAuthToTrackRequest$RequestFactory", f = "SendAuthToTrackRequest.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "createRequest")
/* loaded from: classes15.dex */
final class SendAuthToTrackRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAuthToTrackRequest$RequestFactory$createRequest$1(sb sbVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
