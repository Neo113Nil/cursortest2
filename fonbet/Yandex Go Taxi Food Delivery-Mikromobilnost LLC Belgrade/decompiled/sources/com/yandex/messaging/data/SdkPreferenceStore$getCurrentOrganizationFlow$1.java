package com.yandex.messaging.data;

import defpackage.fi9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.data.SdkPreferenceStore$getCurrentOrganizationFlow$1", f = "SdkPreferenceStore.kt", l = {30, 31}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SdkPreferenceStore$getCurrentOrganizationFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkPreferenceStore$getCurrentOrganizationFlow$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SdkPreferenceStore$getCurrentOrganizationFlow$1 sdkPreferenceStore$getCurrentOrganizationFlow$1 = new SdkPreferenceStore$getCurrentOrganizationFlow$1(this.this$0, continuation);
        sdkPreferenceStore$getCurrentOrganizationFlow$1.L$0 = obj;
        return sdkPreferenceStore$getCurrentOrganizationFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkPreferenceStore$getCurrentOrganizationFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            Long l = new Long(this.this$0.c());
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        e eVar = this.this$0;
        eVar.getClass();
        fi9 i2 = kotlinx.coroutines.flow.e.i(new SdkPreferenceStore$preferenceChangeFlow$3(eVar, null));
        e eVar2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = i2.collect(new c(new d(new b(vprVar, eVar2))), this);
        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            collect = zy11Var;
        }
        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
