package com.yandex.go.places.impl.ui.nearby.flex;

import com.yandex.go.places.impl.data.entities.network.map.MapObjectsItemDtoWrapper;
import com.yandex.go.places.map.data.repositories.h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tj50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.nearby.flex.NearbyFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1", f = "NearbyFlexPresenter.kt", l = {81, 83}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class NearbyFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $data;
    Object L$0;
    int label;
    final /* synthetic */ tj50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1(Object obj, tj50 tj50Var, Continuation continuation) {
        super(2, continuation);
        this.$data = obj;
        this.this$0 = tj50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r1.v(r6, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = this.$data;
            MapObjectsItemDtoWrapper mapObjectsItemDtoWrapper = obj2 instanceof MapObjectsItemDtoWrapper ? (MapObjectsItemDtoWrapper) obj2 : null;
            if (mapObjectsItemDtoWrapper != null && (list = mapObjectsItemDtoWrapper.a) != null) {
                com.yandex.go.places.map.data.mappers.a aVar = this.this$0.L;
                this.L$0 = null;
                this.label = 1;
                obj = aVar.o(list, this);
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        List list2 = (List) obj;
        if (list2 != null) {
            h hVar = this.this$0.K;
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
