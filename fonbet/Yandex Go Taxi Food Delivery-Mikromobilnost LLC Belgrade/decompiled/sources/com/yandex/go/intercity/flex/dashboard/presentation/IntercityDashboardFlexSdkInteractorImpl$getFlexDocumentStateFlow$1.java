package com.yandex.go.intercity.flex.dashboard.presentation;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pew;
import defpackage.qew;
import defpackage.rew;
import defpackage.vpr;
import defpackage.w511;
import defpackage.x8w;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ly8w;", "Lrew;", "changeData", "Lzy11;", "<anonymous>", "(Lvpr;Lrew;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intercity.flex.dashboard.presentation.IntercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1", f = "IntercityDashboardFlexSdkInteractorImpl.kt", l = {HProv.ALG_SID_SHA3_384, 80, 80}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class IntercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        IntercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1 intercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1 = new IntercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1(this.this$0, (Continuation) obj3);
        intercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1.L$0 = (vpr) obj;
        intercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1.L$1 = (rew) obj2;
        return intercityDashboardFlexSdkInteractorImpl$getFlexDocumentStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        if (r0.emit(r10, r9) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r10 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0.emit(r10, r9) == r2) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        vpr vprVar = (vpr) this.L$0;
        rew rewVar = (rew) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.getClass();
            if (jl40.l(rewVar, pew.b)) {
                str = "is_reloading_payment_method";
            } else {
                if (!(rewVar instanceof qew)) {
                    if (jl40.l(rewVar, pew.c)) {
                        str = "is_reloading_shuttle_point";
                    } else if (!jl40.l(rewVar, pew.a)) {
                        w511.b();
                        return null;
                    }
                }
                str = "is_reloading_intercity_document";
            }
            x8w x8wVar = new x8w(str);
            this.L$0 = vprVar;
            this.L$1 = rewVar;
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
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        g gVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = vprVar;
        this.label = 2;
        obj = g.a(gVar, rewVar, this);
    }
}
