package com.yandex.go.preorder.zone;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/go/address/models/ZoneAddress;", "Ldvx;", "it", "", "<anonymous>", "(Lvpr;Ldvx;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.zone.PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2", f = "PreorderZoneChangesInteractor.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2 preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2 = new PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2(this.this$0, (Continuation) obj3);
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2.L$0 = (vpr) obj;
        return preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            ZoneAddress zoneAddress = this.this$0.f.c().a;
            if (zoneAddress != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(zoneAddress, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                z = false;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(z);
    }
}
