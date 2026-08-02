package com.yandex.messaging.data;

import defpackage.e9e;
import defpackage.fi9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.data.SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1", f = "SdkPreferenceStore.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ e9e $listener$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1(Continuation continuation, e eVar, e9e e9eVar) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$listener$inlined = e9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1 sdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1 = new SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1(continuation, this.this$0, this.$listener$inlined);
        sdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1.L$0 = obj;
        return sdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            eVar.getClass();
            fi9 i2 = kotlinx.coroutines.flow.e.i(new SdkPreferenceStore$preferenceChangeFlow$3(eVar, null));
            p9g0 p9g0Var = new p9g0(14, this.$listener$inlined, this.this$0);
            this.label = 1;
            Object collect = i2.collect(new c(new d(p9g0Var)), this);
            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                collect = zy11Var;
            }
            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
