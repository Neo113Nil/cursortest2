package com.yandex.go.navigator.map_interactions;

import com.yandex.mapkit.GeoObject;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.NavigatorGeoObjectsTapListener$onObjectTap$1", f = "NavigatorGeoObjectsTapListener.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorGeoObjectsTapListener$onObjectTap$1 extends SuspendLambda implements wls {
    final /* synthetic */ GeoObject $geoObject;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorGeoObjectsTapListener$onObjectTap$1(c cVar, GeoObject geoObject, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$geoObject = geoObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorGeoObjectsTapListener$onObjectTap$1(this.this$0, this.$geoObject, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorGeoObjectsTapListener$onObjectTap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigator.map_interactions.experiment.a aVar = this.this$0.b;
            this.label = 1;
            obj = aVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.e.g(this.$geoObject);
        }
        return zy11.a;
    }
}
