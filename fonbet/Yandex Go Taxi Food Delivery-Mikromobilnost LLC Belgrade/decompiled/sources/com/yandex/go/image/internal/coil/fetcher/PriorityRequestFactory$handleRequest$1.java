package com.yandex.go.image.internal.coil.fetcher;

import defpackage.mvg;
import java.lang.AutoCloseable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.PriorityRequestFactory", f = "PriorityRequestFactory.kt", l = {67, HProv.PP_VERSION_EX}, m = "handleRequest", v = 2)
/* loaded from: classes.dex */
final class PriorityRequestFactory$handleRequest$1<T extends AutoCloseable> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityRequestFactory$handleRequest$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, null, null, this);
    }
}
