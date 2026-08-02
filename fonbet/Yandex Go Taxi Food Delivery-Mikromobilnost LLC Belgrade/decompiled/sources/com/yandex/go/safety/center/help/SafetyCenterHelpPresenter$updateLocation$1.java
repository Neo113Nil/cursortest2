package com.yandex.go.safety.center.help;

import defpackage.hrl0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.orl0;
import defpackage.po21;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmo21;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.help.SafetyCenterHelpPresenter$updateLocation$1", f = "SafetyCenterHelpPresenter.kt", l = {HProv.PP_INFO, HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterHelpPresenter$updateLocation$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterHelpPresenter$updateLocation$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SafetyCenterHelpPresenter$updateLocation$1 safetyCenterHelpPresenter$updateLocation$1 = new SafetyCenterHelpPresenter$updateLocation$1(this.this$0, continuation);
        safetyCenterHelpPresenter$updateLocation$1.L$0 = obj;
        return safetyCenterHelpPresenter$updateLocation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterHelpPresenter$updateLocation$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        try {
        } catch (LocationRequirementsException e) {
            e eVar = this.this$0;
            eVar.getClass();
            jst.e.k(e, "Can not get nearest position");
            hrl0 hrl0Var = eVar.y;
            if (!hrl0Var.a()) {
                hrl0Var.c(new orl0(eVar, i2), false);
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            po21 po21Var = this.this$0.C;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
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
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
