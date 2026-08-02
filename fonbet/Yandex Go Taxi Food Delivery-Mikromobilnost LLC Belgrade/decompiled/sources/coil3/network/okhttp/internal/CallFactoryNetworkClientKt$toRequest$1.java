package coil3.network.okhttp.internal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "coil3.network.okhttp.internal.CallFactoryNetworkClientKt", f = "CallFactoryNetworkClient.kt", l = {32}, m = "toRequest", v = 1)
/* loaded from: classes.dex */
final class CallFactoryNetworkClientKt$toRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.b(null, this);
    }
}
