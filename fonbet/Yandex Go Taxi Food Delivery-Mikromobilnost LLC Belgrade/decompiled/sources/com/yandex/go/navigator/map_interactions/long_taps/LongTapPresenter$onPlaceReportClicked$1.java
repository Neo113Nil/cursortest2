package com.yandex.go.navigator.map_interactions.long_taps;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tse;
import defpackage.vmz;
import defpackage.vnz;
import defpackage.wls;
import defpackage.ynz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.long_taps.LongTapPresenter$onPlaceReportClicked$1", f = "LongTapPresenter.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LongTapPresenter$onPlaceReportClicked$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ynz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTapPresenter$onPlaceReportClicked$1(ynz ynzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ynzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongTapPresenter$onPlaceReportClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongTapPresenter$onPlaceReportClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vnz vnzVar;
        Point point;
        vnz vnzVar2;
        Point point2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Address address = null;
        if (i == 0) {
            kotlin.b.b(obj);
            ynz ynzVar = this.this$0;
            vnzVar = ynzVar.z;
            point = ynzVar.x;
            qoh qohVar = ynzVar.F;
            if (qohVar != null) {
                this.L$0 = vnzVar;
                this.L$1 = point;
                this.label = 1;
                obj = qohVar.s(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vnzVar2 = vnzVar;
                point2 = point;
            }
            vnzVar.b.r(new vmz(1, point, address));
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        point2 = (Point) this.L$1;
        vnzVar2 = (vnz) this.L$0;
        kotlin.b.b(obj);
        address = (Address) obj;
        vnzVar = vnzVar2;
        point = point2;
        vnzVar.b.r(new vmz(1, point, address));
        return zy11.a;
    }
}
