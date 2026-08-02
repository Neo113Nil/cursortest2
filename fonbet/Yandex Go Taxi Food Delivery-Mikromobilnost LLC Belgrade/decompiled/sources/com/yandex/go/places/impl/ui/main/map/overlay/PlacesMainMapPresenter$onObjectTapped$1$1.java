package com.yandex.go.places.impl.ui.main.map.overlay;

import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qac0;
import defpackage.tse;
import defpackage.uac0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.overlay.PlacesMainMapPresenter$onObjectTapped$1$1", f = "PlacesMainMapPresenter.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMainMapPresenter$onObjectTapped$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ GeoObjectSelectionMetadata $metadata;
    int label;
    final /* synthetic */ uac0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMainMapPresenter$onObjectTapped$1$1(uac0 uac0Var, GeoObjectSelectionMetadata geoObjectSelectionMetadata, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uac0Var;
        this.$metadata = geoObjectSelectionMetadata;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMainMapPresenter$onObjectTapped$1$1(this.this$0, this.$metadata, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMainMapPresenter$onObjectTapped$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qac0 qac0Var = this.this$0.F;
        GeoObjectSelectionMetadata geoObjectSelectionMetadata = this.$metadata;
        this.label = 1;
        qac0Var.b.a.emit(geoObjectSelectionMetadata, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
