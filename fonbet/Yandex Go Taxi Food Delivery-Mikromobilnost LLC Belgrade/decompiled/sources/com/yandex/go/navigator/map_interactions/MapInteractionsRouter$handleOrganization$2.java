package com.yandex.go.navigator.map_interactions;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.mapkit.GeoObject;
import defpackage.dpa1;
import defpackage.lg80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.sls;
import defpackage.tfx;
import defpackage.ti80;
import defpackage.tse;
import defpackage.uj00;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.MapInteractionsRouter$handleOrganization$2", f = "MapInteractionsRouter.kt", l = {224}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MapInteractionsRouter$handleOrganization$2 extends SuspendLambda implements wls {
    final /* synthetic */ GeoObject $geoObject;
    final /* synthetic */ zzs $geoPoint;
    final /* synthetic */ lg80 $mode;
    final /* synthetic */ tfx $onExitCalledInsideAction;
    final /* synthetic */ ti80 $organizationIdentification;
    int label;
    final /* synthetic */ uj00 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapInteractionsRouter$handleOrganization$2(GeoObject geoObject, uj00 uj00Var, zzs zzsVar, ti80 ti80Var, lg80 lg80Var, tfx tfxVar, Continuation continuation) {
        super(2, continuation);
        this.$geoObject = geoObject;
        this.this$0 = uj00Var;
        this.$geoPoint = zzsVar;
        this.$organizationIdentification = ti80Var;
        this.$mode = lg80Var;
        this.$onExitCalledInsideAction = tfxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapInteractionsRouter$handleOrganization$2(this.$geoObject, this.this$0, this.$geoPoint, this.$organizationIdentification, this.$mode, this.$onExitCalledInsideAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapInteractionsRouter$handleOrganization$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String name;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            name = this.$geoObject.getName();
            if (name == null) {
                e eVar = this.this$0.R;
                zzs zzsVar = this.$geoPoint;
                this.label = 1;
                obj = e.b(eVar, zzsVar, this, 30);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.this$0.P(dpa1.c(PlainAddress.Companion, this.$geoPoint, name), this.$organizationIdentification, this.$mode, (sls) this.$onExitCalledInsideAction);
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        name = ((pv0) obj).a.D1();
        this.this$0.P(dpa1.c(PlainAddress.Companion, this.$geoPoint, name), this.$organizationIdentification, this.$mode, (sls) this.$onExitCalledInsideAction);
        return zy11.a;
    }
}
