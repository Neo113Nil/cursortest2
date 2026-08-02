package com.yandex.messaging.domain.folders;

import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.z3b;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.folders.GetFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3", f = "GetFolderChatsDisplayDataUseCase.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class GetFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3 getFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3 = new GetFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3(3, (Continuation) obj3);
        getFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3.L$0 = (vpr) obj;
        getFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return getFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            List d0 = j73.d0((z3b[]) ((Object[]) this.L$1));
            this.label = 1;
            if (vprVar.emit(d0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
