package com.yandex.go.chargers.passes.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.passes.ui.ChargersPassesUiStateMapper", f = "ChargersPassesUiStateMapper.kt", l = {HProv.PP_NK_SYNC, 122, HProv.PP_PASSWD_TERM, HProv.PP_SECURITY_LEVEL, 130}, m = "mapOfferBottom", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesUiStateMapper$mapOfferBottom$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesUiStateMapper$mapOfferBottom$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(false, null, null, this);
    }
}
