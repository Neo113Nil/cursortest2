package com.yandex.go.inapp_calls.navigation.fullscreenintent;

import defpackage.f9j0;
import defpackage.h9j0;
import defpackage.hxx;
import defpackage.j9j0;
import defpackage.mjv;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.navigation.fullscreenintent.FullScreenIntentNotificationHandlerImpl$launchRequestFullScreenModalRouter$1", f = "FullScreenIntentNotificationHandlerImpl.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FullScreenIntentNotificationHandlerImpl$launchRequestFullScreenModalRouter$1 extends SuspendLambda implements wls {
    final /* synthetic */ j9j0 $uiState;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenIntentNotificationHandlerImpl$launchRequestFullScreenModalRouter$1(j9j0 j9j0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$uiState = j9j0Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullScreenIntentNotificationHandlerImpl$launchRequestFullScreenModalRouter$1(this.$uiState, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullScreenIntentNotificationHandlerImpl$launchRequestFullScreenModalRouter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h9j0 h9j0Var = new h9j0(this.$uiState);
            d dVar = this.this$0;
            ((pep0) dVar.h).f((f9j0) dVar.j.getValue(), h9j0Var, hxx.a);
            f9j0 f9j0Var = (f9j0) this.this$0.j.getValue();
            this.L$0 = null;
            this.label = 1;
            if (com.yandex.go.navigation.base.a.d(f9j0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        d dVar2 = this.this$0;
        njv njvVar = dVar2.f;
        boolean c = dVar2.g.c();
        mjv mjvVar = njvVar.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        mjvVar.a.a("InAppCalls.FullscreenPermission.Closed", hashMap, 1, x4e.r(c, hashMap, "can_use_fullscreen"));
        return zy11.a;
    }
}
