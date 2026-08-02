package com.yandex.go.chargers.offer.data.mappers;

import defpackage.mvg;
import defpackage.t2a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper", f = "ChargersOfferUiStateMapper.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "getLegalTerms-1HzRdYc", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$getLegalTerms$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$getLegalTerms$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, this);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        CharSequence charSequence = (CharSequence) b;
        if (charSequence != null) {
            return new t2a(charSequence);
        }
        return null;
    }
}
