package com.yandex.go.scooters.passes.active.v3;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.active.v3.ScootersActivePassesV3UiStateMapper", f = "ScootersActivePassesV3UiStateMapper.kt", l = {HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_VERSION_TIMESTAMP}, m = "getButton", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3UiStateMapper$getButton$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3UiStateMapper$getButton$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(this.this$0, null, this);
    }
}
