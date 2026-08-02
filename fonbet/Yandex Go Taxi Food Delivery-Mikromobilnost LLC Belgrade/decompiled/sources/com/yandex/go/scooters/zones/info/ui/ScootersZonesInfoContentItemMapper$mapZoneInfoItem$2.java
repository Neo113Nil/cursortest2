package com.yandex.go.scooters.zones.info.ui;

import defpackage.i9p0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Ln9p0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.info.ui.ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2", f = "ScootersZonesInfoContentItemMapper.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<i9p0> $items;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2(List list, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$items = list;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2 scootersZonesInfoContentItemMapper$mapZoneInfoItem$2 = new ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2(this.$items, this.this$0, continuation);
        scootersZonesInfoContentItemMapper$mapZoneInfoItem$2.L$0 = obj;
        return scootersZonesInfoContentItemMapper$mapZoneInfoItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
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
        List<i9p0> list = this.$items;
        c cVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(tje.h(tseVar, null, null, new ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2$1$1(cVar, (i9p0) obj2, i2, null), 3));
            i2 = i3;
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
