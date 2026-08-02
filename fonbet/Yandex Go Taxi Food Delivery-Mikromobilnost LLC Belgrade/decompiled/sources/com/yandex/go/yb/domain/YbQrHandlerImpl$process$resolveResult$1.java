package com.yandex.go.yb.domain;

import defpackage.hg51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lvh51;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.YbQrHandlerImpl$process$resolveResult$1", f = "YbQrHandlerImpl.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbQrHandlerImpl$process$resolveResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $qrLink;
    final /* synthetic */ hg51 $resolver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbQrHandlerImpl$process$resolveResult$1(hg51 hg51Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$resolver = hg51Var;
        this.$qrLink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbQrHandlerImpl$process$resolveResult$1(this.$resolver, this.$qrLink, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbQrHandlerImpl$process$resolveResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hg51 hg51Var = this.$resolver;
            String str = this.$qrLink;
            this.label = 1;
            b = ((com.ybsdk.api.qr.internal.a) hg51Var).b(str, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
