package com.yandex.passport.internal.social.esia;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.social.esia.EsiaBindStoreFactory$ExecutorImpl", f = "EsiaBindStoreFactory.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, 144}, m = "onInit")
/* loaded from: classes15.dex */
final class EsiaBindStoreFactory$ExecutorImpl$onInit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsiaBindStoreFactory$ExecutorImpl$onInit$1(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(this);
    }
}
