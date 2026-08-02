package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.mapkit.geometry.Point;
import defpackage.c91;
import defpackage.cwa1;
import defpackage.f21;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yve;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyve;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lyve;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1", f = "AddressMapPickerMapLayerRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1 addressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1 = new AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1(this.this$0, continuation);
        addressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1.L$0 = obj;
        return addressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1 addressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1 = (AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1) create((yve) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yve yveVar = (yve) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Point d = cwa1.d(yveVar.a);
        f21 a = this.this$0.K.a();
        Float f = jl40.l(a != null ? a.b : null, c91.a) ? new Float(17.0f) : yveVar.b;
        f fVar = this.this$0;
        if (f != null) {
            ((gh00) fVar.E).D(d, f.floatValue(), 300.0f, null);
        } else {
            ((gh00) fVar.E).E(d, 300.0f, null);
        }
        return zy11.a;
    }
}
