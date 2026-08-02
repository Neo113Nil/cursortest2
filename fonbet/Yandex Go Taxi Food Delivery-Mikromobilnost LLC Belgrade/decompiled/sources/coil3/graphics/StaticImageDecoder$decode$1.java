package coil3.graphics;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {169}, m = "decode", v = 1)
/* loaded from: classes.dex */
final class StaticImageDecoder$decode$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0139b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticImageDecoder$decode$1(C0139b c0139b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c0139b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
