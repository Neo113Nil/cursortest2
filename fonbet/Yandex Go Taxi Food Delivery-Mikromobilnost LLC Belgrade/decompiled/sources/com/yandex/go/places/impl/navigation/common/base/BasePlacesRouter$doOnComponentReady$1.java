package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$doOnComponentReady$1", f = "BasePlacesRouter.kt", l = {178, 179}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$doOnComponentReady$1 extends SuspendLambda implements wls {
    final /* synthetic */ zls $block;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$doOnComponentReady$1(d dVar, zls zlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$block = zlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasePlacesRouter$doOnComponentReady$1 basePlacesRouter$doOnComponentReady$1 = new BasePlacesRouter$doOnComponentReady$1(this.this$0, this.$block, continuation);
        basePlacesRouter$doOnComponentReady$1.L$0 = obj;
        return basePlacesRouter$doOnComponentReady$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlacesRouter$doOnComponentReady$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r2.invoke(r0, r7, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r7 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh qohVar = this.this$0.S;
            if (qohVar != null) {
                this.L$0 = tseVar;
                this.label = 1;
                obj = qohVar.s(this);
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        a5g a5gVar = (a5g) obj;
        if (a5gVar != null) {
            zls zlsVar = this.$block;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
