package com.yandex.passport.internal.methods.performer;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.UploadDiaryPerformer$performMethod$1", f = "UploadDiaryPerformer.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UploadDiaryPerformer$performMethod$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ n1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadDiaryPerformer$performMethod$1(n1 n1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = n1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UploadDiaryPerformer$performMethod$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UploadDiaryPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.report.diary.o oVar = this.this$0.a;
        this.label = 1;
        Object a = oVar.a(zy11.a, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
