package com.yandex.go.lottie_loader;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ssz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lnsz;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Lnsz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lottie_loader.LottieLoaderImpl$loadAnimation$2$1$1", f = "LottieLoaderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LottieLoaderImpl$loadAnimation$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ InputStream $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieLoaderImpl$loadAnimation$2$1$1(InputStream inputStream, Continuation continuation) {
        super(2, continuation);
        this.$it = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LottieLoaderImpl$loadAnimation$2$1$1(this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LottieLoaderImpl$loadAnimation$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return ssz.d(this.$it, null).a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
