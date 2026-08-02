package com.yandex.go.permission.location_with_agreement.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oaz;
import defpackage.tse;
import defpackage.waz;
import defpackage.wls;
import defpackage.zaz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.router.LocationPermissionV2Router$content$1$1$1", f = "LocationPermissionV2Router.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationPermissionV2Router$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zaz $action;
    int label;
    final /* synthetic */ waz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPermissionV2Router$content$1$1$1(waz wazVar, zaz zazVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wazVar;
        this.$action = zazVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationPermissionV2Router$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationPermissionV2Router$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            waz wazVar = this.this$0;
            com.yandex.go.permission.location_with_agreement.ui.a aVar = wazVar.I;
            zaz zazVar = this.$action;
            oaz oazVar = (oaz) wazVar.L.getValue();
            this.label = 1;
            if (aVar.b(zazVar, oazVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
