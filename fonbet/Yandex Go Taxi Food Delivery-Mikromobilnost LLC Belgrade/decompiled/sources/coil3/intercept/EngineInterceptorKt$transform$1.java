package coil3.intercept;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "coil3.intercept.EngineInterceptorKt", f = "EngineInterceptor.kt", l = {MSException.ERROR_NO_MORE_ITEMS}, m = "transform", v = 1)
/* loaded from: classes.dex */
final class EngineInterceptorKt$transform$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(null, null, null, null, this);
    }
}
