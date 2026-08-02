package com.yandex.plus.home;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "isOfflineModeEnabled", "Lzy11;", "<anonymous>", "(Ltse;Z)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$14", f = "PlusHomeSdkImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusHomeSdkImpl$14 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeSdkImpl$14(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PlusHomeSdkImpl$14 plusHomeSdkImpl$14 = new PlusHomeSdkImpl$14(this.this$0, (Continuation) obj3);
        plusHomeSdkImpl$14.Z$0 = booleanValue;
        zy11 zy11Var = zy11.a;
        plusHomeSdkImpl$14.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z) {
            ((com.yandex.plus.home.graphql.configuration.a) this.this$0.f.v.getValue()).e();
            this.this$0.f.a().h();
        }
        return zy11.a;
    }
}
