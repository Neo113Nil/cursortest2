package com.yandex.go.multimodal_route.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ur40;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lew40;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.interactors.MultimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1", f = "MultimodalTaxiRouteInteractorImpl.kt", l = {40, 41, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ur40 $group;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1(g gVar, ur40 ur40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$group = ur40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1 multimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1 = new MultimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1(this.this$0, this.$group, continuation);
        multimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1.L$0 = obj;
        return multimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalTaxiRouteInteractorImpl$multimodalTaxiRouteFlow$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r0.emit(null, r7) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        g gVar = this.this$0;
        List list = this.$group.b;
        this.L$0 = null;
        this.L$1 = vprVar;
        this.label = 2;
        obj = gVar.a(list, this);
    }
}
