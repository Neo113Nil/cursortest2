package com.yandex.messaging.ui.polloptioninfo;

import defpackage.cl21;
import defpackage.cn2;
import defpackage.d9g;
import defpackage.eyd0;
import defpackage.fi9;
import defpackage.fyd0;
import defpackage.gbb1;
import defpackage.gyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v790;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.polloptioninfo.PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1", f = "PollVotersDataSource.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ v790 $callback$inlined;
    final /* synthetic */ long $timestamp$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gyd0 this$0;
    final /* synthetic */ eyd0 this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1(eyd0 eyd0Var, Continuation continuation, gyd0 gyd0Var, long j, v790 v790Var) {
        super(2, continuation);
        this.this$0$inline_fun = eyd0Var;
        this.this$0 = gyd0Var;
        this.$timestamp$inlined = j;
        this.$callback$inlined = v790Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1 pollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1 = new PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1(this.this$0$inline_fun, continuation, this.this$0, this.$timestamp$inlined, this.$callback$inlined);
        pollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1.L$0 = obj;
        return pollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eyd0 eyd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            eyd0 eyd0Var2 = this.this$0$inline_fun;
            fi9 d = gbb1.d(this.this$0.c);
            this.L$0 = eyd0Var2;
            this.label = 1;
            Object y = e.y(d, this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            eyd0Var = eyd0Var2;
            obj = y;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eyd0Var = (eyd0) this.L$0;
            kotlin.b.b(obj);
        }
        eyd0Var.a = new cn2(((d9g) ((cl21) obj)).e().f(new fyd0(this.this$0, this.$timestamp$inlined, this.$callback$inlined)), 1);
        return zy11.a;
    }
}
