package com.yandex.go.taxi.order.bubble;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sxu0;
import defpackage.tse;
import defpackage.txu0;
import defpackage.uxu0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$loadIcon$1", f = "StyledOrderBubbleViewHolder.kt", l = {111, HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class StyledOrderBubbleViewHolder$loadIcon$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledOrderBubbleViewHolder$loadIcon$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyledOrderBubbleViewHolder$loadIcon$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StyledOrderBubbleViewHolder$loadIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (com.yandex.go.taxi.order.bubble.g.b(r8, (defpackage.txu0) r1, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            gVar.F = false;
            sxu0 sxu0Var = gVar.a.c;
            if (sxu0Var instanceof txu0) {
                this.L$0 = null;
                this.label = 1;
            } else {
                if (!(sxu0Var instanceof uxu0)) {
                    w511.b();
                    return null;
                }
                this.L$0 = null;
                this.label = 2;
                Object n = bvf0.n(new StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2((uxu0) sxu0Var, gVar, null), this);
                if (n != coroutineSingletons) {
                    n = zy11Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        g gVar2 = this.this$0;
        gVar2.F = true;
        gVar2.c.invoke();
        return zy11Var;
    }
}
