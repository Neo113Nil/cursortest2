package com.yandex.go.taxi.order.details.v2.state.elements.timeline.options;

import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.i8;
import com.yandex.go.taxi.order.models.api.response.j8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rok0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrok0;", "selectedOption", "", "<anonymous>", "(Lrok0;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.RideCardTimelineOptionsMapper$orderOptionsFlow$1", f = "RideCardTimelineOptionsMapper.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTimelineOptionsMapper$orderOptionsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $hasPendingChangesForTimelineOptions;
    final /* synthetic */ List<j8> $orderOptions;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTimelineOptionsMapper$orderOptionsFlow$1(List list, a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$orderOptions = list;
        this.this$0 = aVar;
        this.$hasPendingChangesForTimelineOptions = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTimelineOptionsMapper$orderOptionsFlow$1 rideCardTimelineOptionsMapper$orderOptionsFlow$1 = new RideCardTimelineOptionsMapper$orderOptionsFlow$1(this.$orderOptions, this.this$0, this.$hasPendingChangesForTimelineOptions, continuation);
        rideCardTimelineOptionsMapper$orderOptionsFlow$1.L$0 = obj;
        return rideCardTimelineOptionsMapper$orderOptionsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTimelineOptionsMapper$orderOptionsFlow$1) create((rok0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009e -> B:5:0x00a1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        a aVar;
        boolean z;
        Iterator it;
        rok0 rok0Var = (rok0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            List<j8> list = this.$orderOptions;
            a aVar2 = this.this$0;
            boolean z2 = this.$hasPendingChangesForTimelineOptions;
            arrayList = new ArrayList();
            aVar = aVar2;
            z = z2;
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            it = (Iterator) this.L$6;
            arrayList = (Collection) this.L$4;
            aVar = (a) this.L$2;
            b.b(obj);
            rok0 rok0Var2 = (rok0) obj;
            if (rok0Var2 != null) {
                arrayList.add(rok0Var2);
            }
            if (it.hasNext()) {
                j8 j8Var = (j8) it.next();
                this.L$0 = rok0Var;
                this.L$1 = null;
                this.L$2 = aVar;
                this.L$3 = null;
                this.L$4 = arrayList;
                this.L$5 = null;
                this.L$6 = it;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.Z$0 = z;
                this.label = 1;
                if (j8Var instanceof TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption) {
                    obj = aVar.b((TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption) j8Var, rok0Var, z, this);
                    if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj = (rok0) obj;
                    }
                } else if (j8Var instanceof TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption) {
                    obj = aVar.c((TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption) j8Var, rok0Var, z, this);
                    if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj = (rok0) obj;
                    }
                } else {
                    aVar.getClass();
                    if (!(j8Var instanceof i8)) {
                        w511.b();
                        return null;
                    }
                    obj = null;
                }
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rok0 rok0Var22 = (rok0) obj;
                if (rok0Var22 != null) {
                }
                if (it.hasNext()) {
                    return (List) arrayList;
                }
            }
        }
    }
}
