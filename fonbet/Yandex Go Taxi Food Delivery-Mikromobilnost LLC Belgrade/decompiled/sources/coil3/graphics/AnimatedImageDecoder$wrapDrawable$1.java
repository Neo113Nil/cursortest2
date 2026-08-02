package coil3.graphics;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {HProv.PP_ENUM_LOG}, m = "wrapDrawable", v = 1)
/* loaded from: classes10.dex */
final class AnimatedImageDecoder$wrapDrawable$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0141a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$wrapDrawable$1(C0141a c0141a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c0141a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
