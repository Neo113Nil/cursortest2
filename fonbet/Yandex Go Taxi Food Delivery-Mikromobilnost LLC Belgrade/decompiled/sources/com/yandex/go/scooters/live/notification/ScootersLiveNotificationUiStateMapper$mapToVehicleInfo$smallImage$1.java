package com.yandex.go.scooters.live.notification;

import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1", f = "ScootersLiveNotificationUiStateMapper.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $sessionState;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1(zuo0 zuo0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$sessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1(this.$sessionState, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        String o = this.$sessionState.o();
        this.label = 1;
        dVar.getClass();
        Object b = o.length() != 0 ? ru.yandex.taxi.utils.a.b(dVar.a.b().b(((m7x0) dVar.d).a(o)), this) : null;
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
