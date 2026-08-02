package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.core.net.entities.SearchParams;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.e100;
import defpackage.j18;
import defpackage.jo3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.to3;
import defpackage.tse;
import defpackage.uo3;
import defpackage.wls;
import defpackage.yjt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1", f = "MessageSearchController.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ SearchParams $params$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1(Continuation continuation, j jVar, SearchParams searchParams) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$params$inlined = searchParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1 messageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1 = new MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1(continuation, this.this$0, this.$params$inlined);
        messageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1.L$0 = obj;
        return messageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        j jVar = this.this$0;
        to3 to3Var = jVar.a;
        SearchParams searchParams = this.$params$inlined;
        j18Var.w(new uo3(tseVar, new cn2(to3Var.a.a(new jo3((yjt) null, to3Var, searchParams, new e100(9, j18Var, jVar, searchParams))), 1), 22));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
