package com.yandex.go.layers.domain;

import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.rol0;
import defpackage.txx;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ysd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfxe0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.layers.domain.LayersActionsInteractorImpl$handleAction$12", f = "LayersActionsInteractorImpl.kt", l = {255, 256}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LayersActionsInteractorImpl$handleAction$12 extends SuspendLambda implements wls {
    final /* synthetic */ pm00 $actionInfo;
    final /* synthetic */ nm00 $newEvent;
    final /* synthetic */ nm00 $prevEvent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActionsInteractorImpl$handleAction$12(nm00 nm00Var, nm00 nm00Var2, pm00 pm00Var, g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$actionInfo = pm00Var;
        this.$prevEvent = nm00Var;
        this.$newEvent = nm00Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = this.this$0;
        LayersActionsInteractorImpl$handleAction$12 layersActionsInteractorImpl$handleAction$12 = new LayersActionsInteractorImpl$handleAction$12(this.$prevEvent, this.$newEvent, this.$actionInfo, gVar, continuation);
        layersActionsInteractorImpl$handleAction$12.L$0 = obj;
        return layersActionsInteractorImpl$handleAction$12;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActionsInteractorImpl$handleAction$12) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r14, r0, r13) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (((ru.yandex.taxi.map_common.b) r14).d(r2, r13) == r1) goto L22;
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
        a aVar = this.this$0.c;
        nm00 nm00Var = this.$prevEvent;
        nm00 nm00Var2 = this.$newEvent;
        aVar.getClass();
        txx txxVar = (txx) kotlin.collections.a.b0(aVar.a.a);
        if (!(txxVar instanceof ru.yandex.taxi.logistics.ndd_map.layers.a)) {
            txxVar = null;
        }
        ru.yandex.taxi.logistics.ndd_map.layers.a aVar2 = (ru.yandex.taxi.logistics.ndd_map.layers.a) txxVar;
        rol0 b = aVar2 != null ? aVar2.b(new FinalizeAddressObjectsInteractor$handleFinalizeAction$1(1, aVar, a.class, "waitToCameraMove", "waitToCameraMove(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), nm00Var, nm00Var2) : new rol0(new FinalizeAddressObjectsInteractor$handleFinalizeAction$2(nm00Var, nm00Var2, aVar, null));
        this.L$0 = null;
        this.label = 2;
    }
}
