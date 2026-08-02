package com.yandex.go.navigator.driving;

import com.yandex.go.navigator.notifications.cartech.CartechDeeplinkPayloadDto;
import defpackage.c0m;
import defpackage.ikm;
import defpackage.lkm;
import defpackage.mvg;
import defpackage.nkm;
import defpackage.ny61;
import defpackage.zch;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzy11;", "<unused var>", "", "isActive", "<anonymous>", "(VZ)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalPresenter$observeGuidance$2", f = "DrivingModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalPresenter$observeGuidance$2 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ikm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingModalPresenter$observeGuidance$2(ikm ikmVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = ikmVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DrivingModalPresenter$observeGuidance$2 drivingModalPresenter$observeGuidance$2 = new DrivingModalPresenter$observeGuidance$2(this.this$0, (Continuation) obj3);
        drivingModalPresenter$observeGuidance$2.Z$0 = booleanValue;
        zy11 zy11Var = zy11.a;
        drivingModalPresenter$observeGuidance$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DrivingModeNotification drivingModeNotification = (DrivingModeNotification) this.this$0.L.g.getValue();
        Object payload = drivingModeNotification != null ? drivingModeNotification.getPayload() : null;
        CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto = payload instanceof CartechDeeplinkPayloadDto ? (CartechDeeplinkPayloadDto) payload : null;
        ikm ikmVar = this.this$0;
        if (cartechDeeplinkPayloadDto != null) {
            ikmVar.M.a(cartechDeeplinkPayloadDto);
            ((nkm) ((zch) this.this$0.y.b).a).r(new c0m(8));
        } else if (z) {
            ikmVar.A.f(true);
            ((nkm) ((zch) this.this$0.y.b).a).r(new lkm(GuidanceCompletionReason.GUIDANCE_ROUTE_IS_NULL, 0));
        } else {
            ((nkm) ((zch) ikmVar.y.b).a).r(new lkm(GuidanceCompletionReason.END_OF_ROUTE_ACHIEVED, 0));
        }
        return zy11.a;
    }
}
