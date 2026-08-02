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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfxe0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.layers.domain.LayersActionsInteractorImpl$handleAction$3", f = "LayersActionsInteractorImpl.kt", l = {169, HProv.PP_REFCOUNT, HProv.PP_EXPORT_CSP, 173}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LayersActionsInteractorImpl$handleAction$3 extends SuspendLambda implements wls {
    final /* synthetic */ pm00 $actionInfo;
    final /* synthetic */ nm00 $newEvent;
    final /* synthetic */ nm00 $prevEvent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActionsInteractorImpl$handleAction$3(nm00 nm00Var, nm00 nm00Var2, pm00 pm00Var, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$prevEvent = nm00Var;
        this.$newEvent = nm00Var2;
        this.this$0 = gVar;
        this.$actionInfo = pm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LayersActionsInteractorImpl$handleAction$3 layersActionsInteractorImpl$handleAction$3 = new LayersActionsInteractorImpl$handleAction$3(this.$prevEvent, this.$newEvent, this.$actionInfo, this.this$0, continuation);
        layersActionsInteractorImpl$handleAction$3.L$0 = obj;
        return layersActionsInteractorImpl$handleAction$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActionsInteractorImpl$handleAction$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (((ru.yandex.taxi.map_common.b) r9).d(r2, r8) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L27;
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
            nm00 nm00Var = this.$prevEvent;
            if (nm00Var != null) {
                jyi jyiVar = new jyi(nm00Var.a);
                this.L$0 = vprVar;
                this.label = 1;
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            kotlin.b.b(obj);
            ysd0 ysd0Var = this.this$0.b;
            pm00 pm00Var = this.$actionInfo;
            this.L$0 = vprVar;
            this.label = 3;
        } else {
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            jyi jyiVar2 = new jyi(this.$newEvent.a);
            this.L$0 = null;
            this.label = 4;
        }
        y9q0 y9q0Var = new y9q0(this.$newEvent.a);
        this.L$0 = vprVar;
        this.label = 2;
    }
}
