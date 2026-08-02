package coil3.graphics;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {213, 40}, m = "decode", v = 1)
/* renamed from: coil3.decode.BitmapFactoryDecoder$decode$1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0135BitmapFactoryDecoder$decode$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0138a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135BitmapFactoryDecoder$decode$1(C0138a c0138a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c0138a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
