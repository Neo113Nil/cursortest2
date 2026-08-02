package com.yandex.go.something_wrong_screen.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.something_wrong_screen.repository.SomethingWrongScreenRepositoryImpl", f = "SomethingWrongScreenRepositoryImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "getDeeplinkScreenUiState", v = 2)
/* loaded from: classes13.dex */
final class SomethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SomethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, this);
    }
}
