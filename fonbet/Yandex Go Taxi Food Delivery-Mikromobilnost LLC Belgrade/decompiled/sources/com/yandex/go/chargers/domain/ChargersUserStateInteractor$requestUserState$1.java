package com.yandex.go.chargers.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.domain.ChargersUserStateInteractor", f = "ChargersUserStateInteractor.kt", l = {HProv.PROV_GOST_2001_DH, HProv.PROV_GOST_2001_DH, HProv.ALG_SID_SHA3_224}, m = "requestUserState", v = 2)
/* loaded from: classes12.dex */
final class ChargersUserStateInteractor$requestUserState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersUserStateInteractor$requestUserState$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
