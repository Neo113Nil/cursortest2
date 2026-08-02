package com.yandex.go.eboks.objects.data.mapper;

import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qhn;
import defpackage.tse;
import defpackage.whn;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lphn;", "<anonymous>", "(Ltse;)Lphn;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.data.mapper.EboksObjectsObjectsMapper$mapAllRowanObjectsWithSimpleThinning$2$1", f = "EboksObjectsObjectsMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsMapper$mapAllRowanObjectsWithSimpleThinning$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $currentZoom;
    final /* synthetic */ List<zzs> $objects;
    final /* synthetic */ qhn $style;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsMapper$mapAllRowanObjectsWithSimpleThinning$2$1(a aVar, List list, float f, String str, qhn qhnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$objects = list;
        this.$currentZoom = f;
        this.$type = str;
        this.$style = qhnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EboksObjectsObjectsMapper$mapAllRowanObjectsWithSimpleThinning$2$1(this.this$0, this.$objects, this.$currentZoom, this.$type, this.$style, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsObjectsMapper$mapAllRowanObjectsWithSimpleThinning$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        double size;
        int size2;
        double size3;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        List list = this.$objects;
        float f = this.$currentZoom;
        EboksObjectsParamsExperiment.Thinning thinning = aVar.g.a().e;
        if (thinning != null) {
            double d = thinning.d;
            double d2 = thinning.c;
            List x0 = kotlin.collections.a.x0(list, new whn());
            double d3 = thinning.a;
            double d4 = f;
            if (d3 > d4) {
                double d5 = thinning.b;
                if (d5 <= d4) {
                    d = (((d - d2) / 100.0d) * ((d3 - d4) / ((d3 - d5) / 100.0d))) + d2;
                    size = list.size();
                    size2 = list.size();
                    size3 = size - (size2 * d);
                    i = (int) size3;
                    if (i > 0 || x0.isEmpty()) {
                        list = EmptyList.a;
                    } else if (i >= x0.size()) {
                        list = x0;
                    } else {
                        double size4 = x0.size() / i;
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add(x0.get((int) (i2 * size4)));
                        }
                        list = arrayList;
                    }
                }
            }
            if (d4 > d3) {
                size3 = list.size() - (list.size() * d2);
                i = (int) size3;
                if (i > 0) {
                }
                list = EmptyList.a;
            } else {
                size = list.size();
                size2 = list.size();
                size3 = size - (size2 * d);
                i = (int) size3;
                if (i > 0) {
                }
                list = EmptyList.a;
            }
        }
        return a.c(this.this$0, this.$type, list, this.$style);
    }
}
