package com.yandex.go.something_wrong_screen.repository;

import defpackage.cne0;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.something_wrong_screen.repository.SomethingWrongScreenRepositoryImpl$use$2", f = "SomethingWrongScreenRepositoryImpl.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SomethingWrongScreenRepositoryImpl$use$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ cne0 $this_use;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SomethingWrongScreenRepositoryImpl$use$2(b bVar, tls tlsVar, cne0 cne0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = tlsVar;
        this.$this_use = cne0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SomethingWrongScreenRepositoryImpl$use$2(this.this$0, this.$action, this.$this_use, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SomethingWrongScreenRepositoryImpl$use$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        g050 g050Var;
        cne0 cne0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.sync.a aVar = this.this$0.e;
            tlsVar = this.$action;
            cne0 cne0Var2 = this.$this_use;
            this.L$0 = aVar;
            this.L$1 = tlsVar;
            this.L$2 = cne0Var2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            cne0Var = cne0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cne0Var = (cne0) this.L$2;
            tlsVar = (tls) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            return tlsVar.invoke(cne0Var);
        } finally {
            g050Var.d(null);
        }
    }
}
