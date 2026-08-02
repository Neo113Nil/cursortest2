package com.yandex.go.information;

import com.yandex.go.information.domain.c;
import defpackage.avq0;
import defpackage.bvq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uuv;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.information.ServiceComposeRouter$content$1$1$1", f = "ServiceComposeRouter.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ServiceComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ uuv $it;
    final /* synthetic */ avq0 $navigator;
    int label;
    final /* synthetic */ bvq0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceComposeRouter$content$1$1$1(bvq0 bvq0Var, uuv uuvVar, avq0 avq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bvq0Var;
        this.$it = uuvVar;
        this.$navigator = avq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServiceComposeRouter$content$1$1$1(this.this$0, this.$it, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = this.this$0.I;
            uuv uuvVar = this.$it;
            avq0 avq0Var = this.$navigator;
            this.label = 1;
            if (cVar.a(uuvVar, avq0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
