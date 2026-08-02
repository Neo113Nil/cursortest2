package com.yandex.go.scooters.domain;

import com.yandex.go.eboks.objects.api.MapObjectAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/go/eboks/objects/api/MapObjectAction;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersEboksObjectsActionHandler$listenToMapSelection$2", f = "ScootersEboksObjectsActionHandler.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersEboksObjectsActionHandler$listenToMapSelection$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersEboksObjectsActionHandler$listenToMapSelection$2 scootersEboksObjectsActionHandler$listenToMapSelection$2 = new ScootersEboksObjectsActionHandler$listenToMapSelection$2(3, (Continuation) obj3);
        scootersEboksObjectsActionHandler$listenToMapSelection$2.L$0 = (vpr) obj;
        return scootersEboksObjectsActionHandler$listenToMapSelection$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            MapObjectAction mapObjectAction = MapObjectAction.DESELECT;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(mapObjectAction, this) == coroutineSingletons) {
                return coroutineSingletons;
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
