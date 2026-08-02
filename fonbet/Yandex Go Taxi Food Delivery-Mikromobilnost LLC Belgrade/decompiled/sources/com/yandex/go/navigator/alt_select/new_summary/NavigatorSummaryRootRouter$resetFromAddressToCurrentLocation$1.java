package com.yandex.go.navigator.alt_select.new_summary;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.alt_select.new_summary.NavigatorSummaryRootRouter", f = "NavigatorSummaryRootRouter.kt", l = {HProv.PP_NK_SYNC}, m = "resetFromAddressToCurrentLocation", v = 2)
/* loaded from: classes12.dex */
final class NavigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.P(this.this$0, this);
    }
}
