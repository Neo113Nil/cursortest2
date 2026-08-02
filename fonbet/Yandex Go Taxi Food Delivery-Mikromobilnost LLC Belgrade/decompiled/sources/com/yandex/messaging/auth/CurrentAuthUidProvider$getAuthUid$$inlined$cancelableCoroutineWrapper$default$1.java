package com.yandex.messaging.auth;

import com.yandex.messaging.internal.authorized.j;
import defpackage.bp5;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.hff;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uo3;
import defpackage.wls;
import defpackage.zs21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.auth.CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1", f = "CurrentAuthUidProvider.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ hff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1(Continuation continuation, hff hffVar) {
        super(2, continuation);
        this.this$0 = hffVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1 currentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1 = new CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1(continuation, this.this$0);
        currentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1.L$0 = obj;
        return currentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        j jVar = this.this$0.a;
        bp5 bp5Var = new bp5(j18Var);
        jVar.getClass();
        j18Var.w(new uo3(tseVar, new cn2(new zs21(jVar, bp5Var), 1), 19));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
