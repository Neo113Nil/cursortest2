package com.yandex.plus.home.graphql.plusstate;

import com.yandex.plus.log.api.LogPriority;
import defpackage.fyy;
import defpackage.gyy;
import defpackage.iyy;
import defpackage.jyy;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lhmd0;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.plusstate.PlusStateRepositoryImpl$waitForPlusState$2", f = "PlusStateRepositoryImpl.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusStateRepositoryImpl$waitForPlusState$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusStateRepositoryImpl$waitForPlusState$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusStateRepositoryImpl$waitForPlusState$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusStateRepositoryImpl$waitForPlusState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fyy fyyVar;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(this.this$0.d(), 11);
            fyy fyyVar2 = fyy.a;
            this.L$0 = fyyVar2;
            this.label = 1;
            Object y = e.y(mthVar, this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            fyyVar = fyyVar2;
            obj = y;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fyyVar = (fyy) this.L$0;
            kotlin.b.b(obj);
        }
        iyy iyyVar = (iyy) obj;
        fyyVar.getClass();
        if (iyyVar instanceof jyy) {
            failure = ((jyy) iyyVar).a();
        } else {
            if (!(iyyVar instanceof gyy)) {
                w511.b();
                return null;
            }
            failure = new Result.Failure(((gyy) iyyVar).a);
        }
        Result result = new Result(failure);
        c cVar = this.this$0;
        Object value = result.getValue();
        rkd0 rkd0Var = cVar.g;
        LogPriority logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "PlusStateRepositoryImpl", "waitForPlusState(): " + ((Object) Result.c(value)), null);
        }
        return result;
    }
}
