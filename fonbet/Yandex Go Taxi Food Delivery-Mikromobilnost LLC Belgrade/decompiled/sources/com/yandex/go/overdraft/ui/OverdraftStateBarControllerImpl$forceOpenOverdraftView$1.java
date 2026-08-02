package com.yandex.go.overdraft.ui;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.domain.i;
import defpackage.h0a0;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pep0;
import defpackage.pz80;
import defpackage.qz80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.ui.OverdraftStateBarControllerImpl$forceOpenOverdraftView$1", f = "OverdraftStateBarControllerImpl.kt", l = {204, 212}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftStateBarControllerImpl$forceOpenOverdraftView$1 extends SuspendLambda implements wls {
    final /* synthetic */ OverdraftContext $context;
    final /* synthetic */ o2y0 $orderHolder;
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftStateBarControllerImpl$forceOpenOverdraftView$1(g gVar, o2y0 o2y0Var, OverdraftContext overdraftContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$orderHolder = o2y0Var;
        this.$context = overdraftContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftStateBarControllerImpl$forceOpenOverdraftView$1(this.this$0, this.$orderHolder, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftStateBarControllerImpl$forceOpenOverdraftView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object h;
        OverdraftContext overdraftContext;
        o2y0 o2y0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.l.a().b.a.isEmpty()) {
                g gVar = this.this$0;
                i iVar = gVar.l;
                List l = ((com.yandex.go.taxi.order.provider.a) gVar.k).l();
                this.label = 1;
                obj = iVar.b(l, this);
            }
            OverdraftContext overdraftContext2 = this.$context;
            g gVar2 = this.this$0;
            this.L$0 = overdraftContext2;
            this.label = 2;
            h = g.h(gVar2, this);
            if (h != coroutineSingletons) {
                overdraftContext = overdraftContext2;
                obj = h;
                pz80 pz80Var = new pz80(overdraftContext, null, (h0a0) obj);
                g gVar3 = this.this$0;
                ((pep0) gVar3.w).f(gVar3.v, pz80Var, hxx.a);
                return zy11.a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            overdraftContext = (OverdraftContext) this.L$0;
            kotlin.b.b(obj);
            pz80 pz80Var2 = new pz80(overdraftContext, null, (h0a0) obj);
            g gVar32 = this.this$0;
            ((pep0) gVar32.w).f(gVar32.v, pz80Var2, hxx.a);
            return zy11.a;
        }
        kotlin.b.b(obj);
        if (((Boolean) obj).booleanValue() && (o2y0Var = this.$orderHolder) != null) {
            qz80 qz80Var = new qz80(this.$context, o2y0Var);
            g gVar4 = this.this$0;
            ((pep0) gVar4.w).f(gVar4.v, qz80Var, hxx.a);
            return zy11.a;
        }
        OverdraftContext overdraftContext22 = this.$context;
        g gVar22 = this.this$0;
        this.L$0 = overdraftContext22;
        this.label = 2;
        h = g.h(gVar22, this);
        if (h != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
