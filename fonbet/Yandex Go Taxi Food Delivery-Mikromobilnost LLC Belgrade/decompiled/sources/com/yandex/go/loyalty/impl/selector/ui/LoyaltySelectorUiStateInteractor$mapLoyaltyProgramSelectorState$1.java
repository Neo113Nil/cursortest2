package com.yandex.go.loyalty.impl.selector.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.loyalty.impl.selector.ui.LoyaltySelectorUiStateInteractor", f = "LoyaltySelectorUiStateInteractor.kt", l = {HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_CONTAINER_EXTENSION_DEL}, m = "mapLoyaltyProgramSelectorState", v = 2)
/* loaded from: classes12.dex */
final class LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, this);
    }
}
