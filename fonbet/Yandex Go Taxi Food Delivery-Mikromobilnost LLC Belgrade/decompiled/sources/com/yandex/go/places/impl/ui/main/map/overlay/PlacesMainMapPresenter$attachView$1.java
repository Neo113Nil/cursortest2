package com.yandex.go.places.impl.ui.main.map.overlay;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uac0;
import defpackage.uc4;
import defpackage.wac0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.overlay.PlacesMainMapPresenter$attachView$1", f = "PlacesMainMapPresenter.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMainMapPresenter$attachView$1 extends SuspendLambda implements wls {
    float F$0;
    Object L$0;
    int label;
    final /* synthetic */ uac0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMainMapPresenter$attachView$1(uac0 uac0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uac0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMainMapPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMainMapPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r12 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r12 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        PlacesMainMapPresenter$attachView$1 placesMainMapPresenter$attachView$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wac0 a = this.this$0.A.a(PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN);
            float f2 = a != null ? a.c : 17.0f;
            com.yandex.go.places.impl.domain.interactors.common.a aVar = this.this$0.x;
            this.F$0 = f2;
            this.label = 1;
            if (aVar.c(f2, this) != coroutineSingletons) {
                f = f2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                placesMainMapPresenter$attachView$1 = this;
                BoundingBox boundingBox = (BoundingBox) obj;
                if (boundingBox != null) {
                    ((gh00) placesMainMapPresenter$attachView$1.this$0.x.a).A(boundingBox, null);
                }
                return zy11.a;
            }
            f = this.F$0;
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                uc4 D = ru.yandex.taxi.map.utils.a.D(((gh00) this.this$0.C).e.f());
                uac0 uac0Var = this.this$0;
                com.yandex.go.places.impl.domain.interactors.map.e eVar = uac0Var.D;
                Float f3 = new Float(((gh00) uac0Var.C).j());
                this.L$0 = null;
                this.F$0 = f;
                this.label = 3;
                placesMainMapPresenter$attachView$1 = this;
                obj = eVar.b(D, f3, false, null, null, placesMainMapPresenter$attachView$1);
            }
            return zy11.a;
        }
        f = this.F$0;
        kotlin.b.b(obj);
        com.yandex.go.places.experiments.tabbar.b bVar = this.this$0.E;
        this.F$0 = f;
        this.label = 2;
        obj = bVar.d(this);
    }
}
