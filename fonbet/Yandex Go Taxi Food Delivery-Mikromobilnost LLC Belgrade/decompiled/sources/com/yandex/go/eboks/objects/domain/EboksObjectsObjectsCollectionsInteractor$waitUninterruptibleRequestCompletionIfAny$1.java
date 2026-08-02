package com.yandex.go.eboks.objects.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.shn;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lshn;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.domain.EboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1", f = "EboksObjectsObjectsCollectionsInteractor.kt", l = {152, 154}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1 extends SuspendLambda implements wls {
    final /* synthetic */ rsn $emitHolder;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1(rsn rsnVar, Continuation continuation) {
        super(2, continuation);
        this.$emitHolder = rsnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1 eboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1 = new EboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1(this.$emitHolder, continuation);
        eboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1.L$0 = obj;
        return eboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsObjectsCollectionsInteractor$waitUninterruptibleRequestCompletionIfAny$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r7.a(r6) == r1) goto L22;
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
            shn shnVar = (shn) this.$emitHolder.a;
            if (shnVar != null && shnVar.b && shnVar != null && (r7 = shnVar.d) != null) {
                this.L$0 = vprVar;
                this.label = 1;
            }
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
            ((Result) obj).getClass();
        }
        Object obj2 = this.$emitHolder.b;
        this.L$0 = null;
        this.label = 2;
    }
}
