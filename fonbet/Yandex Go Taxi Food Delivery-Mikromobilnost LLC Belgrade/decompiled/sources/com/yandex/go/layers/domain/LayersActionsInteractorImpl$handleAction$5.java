package com.yandex.go.layers.domain;

import defpackage.jyi;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.vpr;
import defpackage.wls;
import defpackage.y9q0;
import defpackage.ysd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfxe0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.layers.domain.LayersActionsInteractorImpl$handleAction$5", f = "LayersActionsInteractorImpl.kt", l = {188, 189, 190}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LayersActionsInteractorImpl$handleAction$5 extends SuspendLambda implements wls {
    final /* synthetic */ pm00 $actionInfo;
    final /* synthetic */ nm00 $newEvent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActionsInteractorImpl$handleAction$5(nm00 nm00Var, pm00 pm00Var, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$newEvent = nm00Var;
        this.this$0 = gVar;
        this.$actionInfo = pm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LayersActionsInteractorImpl$handleAction$5 layersActionsInteractorImpl$handleAction$5 = new LayersActionsInteractorImpl$handleAction$5(this.$newEvent, this.$actionInfo, this.this$0, continuation);
        layersActionsInteractorImpl$handleAction$5.L$0 = obj;
        return layersActionsInteractorImpl$handleAction$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActionsInteractorImpl$handleAction$5) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (((ru.yandex.taxi.map_common.b) r8).d(r2, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
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
            y9q0 y9q0Var = new y9q0(this.$newEvent.a);
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
            kotlin.b.b(obj);
            jyi jyiVar = new jyi(this.$newEvent.a);
            this.L$0 = null;
            this.label = 3;
        }
        ysd0 ysd0Var = this.this$0.b;
        pm00 pm00Var = this.$actionInfo;
        this.L$0 = vprVar;
        this.label = 2;
    }
}
