package com.yandex.passport.internal.impl;

import com.yandex.passport.api.k2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/passport/api/k2;", "uid", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/api/k2;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.impl.KPassportUiApiImpl$autologinPerformer$1", f = "KPassportUiApiImpl.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class KPassportUiApiImpl$autologinPerformer$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPassportUiApiImpl$autologinPerformer$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KPassportUiApiImpl$autologinPerformer$1 kPassportUiApiImpl$autologinPerformer$1 = new KPassportUiApiImpl$autologinPerformer$1(this.this$0, continuation);
        kPassportUiApiImpl$autologinPerformer$1.L$0 = obj;
        return kPassportUiApiImpl$autologinPerformer$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KPassportUiApiImpl$autologinPerformer$1) create((k2) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object I;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k2 k2Var = (k2) this.L$0;
            f fVar = this.this$0.b;
            this.label = 1;
            I = fVar.I(k2Var, this);
            if (I == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            I = ((Result) obj).getValue();
        }
        return new Result(I);
    }
}
