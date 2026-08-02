package com.yandex.go.layers.domain;

import defpackage.jyi;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ysd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfxe0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.layers.domain.LayersActionsInteractorImpl$handleAction$11", f = "LayersActionsInteractorImpl.kt", l = {246, 248}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LayersActionsInteractorImpl$handleAction$11 extends SuspendLambda implements wls {
    final /* synthetic */ pm00 $actionInfo;
    final /* synthetic */ nm00 $prevEvent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActionsInteractorImpl$handleAction$11(nm00 nm00Var, pm00 pm00Var, g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$actionInfo = pm00Var;
        this.$prevEvent = nm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = this.this$0;
        LayersActionsInteractorImpl$handleAction$11 layersActionsInteractorImpl$handleAction$11 = new LayersActionsInteractorImpl$handleAction$11(this.$prevEvent, this.$actionInfo, gVar, continuation);
        layersActionsInteractorImpl$handleAction$11.L$0 = obj;
        return layersActionsInteractorImpl$handleAction$11;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActionsInteractorImpl$handleAction$11) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (((ru.yandex.taxi.map_common.b) r7).d(r2, r6) == r1) goto L17;
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
            ysd0 ysd0Var = this.this$0.b;
            pm00 pm00Var = this.$actionInfo;
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        nm00 nm00Var = this.$prevEvent;
        if (nm00Var != null) {
            jyi jyiVar = new jyi(nm00Var.a);
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
