package com.yandex.go.superapp.web.modal;

import defpackage.ck7;
import defpackage.fvt;
import defpackage.g92;
import defpackage.lvt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.uut;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zut;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.web.modal.WebApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1", f = "WebApiPaymentsDelegate.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class WebApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ zut $bindTokenParams$inlined;
    final /* synthetic */ lvt $requestParams$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1(Continuation continuation, m mVar, lvt lvtVar, zut zutVar) {
        super(3, continuation);
        this.this$0 = mVar;
        this.$requestParams$inlined = lvtVar;
        this.$bindTokenParams$inlined = zutVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WebApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1 webApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1 = new WebApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$requestParams$inlined, this.$bindTokenParams$inlined);
        webApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        webApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1.L$1 = obj2;
        return webApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        tpr tprVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            m mVar = this.this$0;
            lvt lvtVar = this.$requestParams$inlined;
            zut zutVar = this.$bindTokenParams$inlined;
            fvt fvtVar = mVar.b;
            if (!booleanValue) {
                g92Var = new g92(2, new ck7(new IllegalStateException("Google Pay card is no selected")));
            } else if (zutVar.c) {
                tprVar = new h(new f(((com.yandex.go.payments.googlepay.domain.e) fvtVar).k(zutVar)));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!mVar.c(lvtVar.a, lvtVar.b, false)) {
                    new rol0(new WebApiPaymentsDelegate$onGooglePaySelectionUpdate$3(2, null));
                }
                uut uutVar = ((com.yandex.go.payments.googlepay.domain.e) fvtVar).v;
                if (!uutVar.d) {
                    ny61.r("Google Pay card hasn't been selected");
                    return null;
                }
                g92Var = new l(new j(new g92(2, uutVar.a)));
            }
            tprVar = g92Var;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
