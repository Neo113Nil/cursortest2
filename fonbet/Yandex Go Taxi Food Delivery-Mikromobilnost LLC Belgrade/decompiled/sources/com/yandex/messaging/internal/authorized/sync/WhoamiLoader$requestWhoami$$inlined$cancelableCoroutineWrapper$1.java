package com.yandex.messaging.internal.authorized.sync;

import defpackage.b051;
import defpackage.c051;
import defpackage.c18;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.ec31;
import defpackage.j18;
import defpackage.mvg;
import defpackage.n5t0;
import defpackage.ny61;
import defpackage.si3;
import defpackage.tse;
import defpackage.uo3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1", f = "WhoamiLoader.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $guid$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c051 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1(Continuation continuation, c051 c051Var, String str) {
        super(2, continuation);
        this.this$0 = c051Var;
        this.$guid$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1 whoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1 = new WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1(continuation, this.this$0, this.$guid$inlined);
        whoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1.L$0 = obj;
        return whoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        c051 c051Var = this.this$0;
        c051Var.c = ((n5t0) c051Var.b.get()).f(new b051(this.$guid$inlined, c051Var, new si3(j18Var, 17), new si3(j18Var, 18)));
        j18Var.w(new uo3(tseVar, new cn2(new c18(0, new ec31(24, c051Var)), 1), 23));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
