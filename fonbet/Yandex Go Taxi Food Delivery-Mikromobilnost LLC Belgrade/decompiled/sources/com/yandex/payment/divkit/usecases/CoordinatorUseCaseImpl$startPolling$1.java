package com.yandex.payment.divkit.usecases;

import defpackage.bgc;
import defpackage.dt20;
import defpackage.j5b;
import defpackage.jiu;
import defpackage.kdd0;
import defpackage.loe;
import defpackage.m3v;
import defpackage.mqu;
import defpackage.mvg;
import defpackage.mz91;
import defpackage.ny61;
import defpackage.syu;
import defpackage.tls;
import defpackage.w18;
import defpackage.wdz;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.ys5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly6f0;", "Lqyj0;", "Lk2e0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.CoordinatorUseCaseImpl$startPolling$1", f = "CoordinatorUseCase.kt", l = {46}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class CoordinatorUseCaseImpl$startPolling$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorUseCaseImpl$startPolling$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoordinatorUseCaseImpl$startPolling$1 coordinatorUseCaseImpl$startPolling$1 = new CoordinatorUseCaseImpl$startPolling$1(this.this$0, continuation);
        coordinatorUseCaseImpl$startPolling$1.L$0 = obj;
        return coordinatorUseCaseImpl$startPolling$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoordinatorUseCaseImpl$startPolling$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            m3v m3vVar = bVar.b;
            String token = bVar.a.getToken();
            final j5b j5bVar = new j5b(y6f0Var);
            w18 w18Var = new w18();
            final int i3 = 0;
            dt20 dt20Var = new dt20(new tls() { // from class: l3v
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    j5b j5bVar2 = j5bVar;
                    switch (i4) {
                        case 0:
                            j5bVar2.e((ct20) obj2);
                            break;
                        default:
                            j5bVar2.b((String) obj2);
                            break;
                    }
                    return zy11Var;
                }
            }, new tls() { // from class: l3v
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i4 = i2;
                    zy11 zy11Var = zy11.a;
                    j5b j5bVar2 = j5bVar;
                    switch (i4) {
                        case 0:
                            j5bVar2.e((ct20) obj2);
                            break;
                        default:
                            j5bVar2.b((String) obj2);
                            break;
                    }
                    return zy11Var;
                }
            }, m3vVar.b);
            mz91.c(new mqu(1, m3vVar, token), new ys5(dt20Var, 2), new kdd0((Object) null, new wdz(), m3vVar.c.a, w18Var)).g(new jiu(dt20Var)).h(new jiu(11)).f(new jiu(12)).d(new syu(m3vVar)).h(new loe(y6f0Var, 0)).b(new loe(y6f0Var, 1));
            bgc bgcVar = new bgc(12);
            this.L$0 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bgcVar, this) == coroutineSingletons) {
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
