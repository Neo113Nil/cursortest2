package com.yandex.plus.pay.internal.benchmark.tarifficator;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import defpackage.k2d0;
import defpackage.ll5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tbd0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.benchmark.tarifficator.TarifficatorBenchmarkReporter$reportBenchmark$1", f = "TarifficatorBenchmarkReporter.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorBenchmarkReporter$reportBenchmark$1 extends SuspendLambda implements wls {
    final /* synthetic */ ll5 $benchmark;
    final /* synthetic */ PlusPayCompositeOffers.Offer $offer;
    double D$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorBenchmarkReporter$reportBenchmark$1(ll5 ll5Var, a aVar, PlusPayCompositeOffers.Offer offer, Continuation continuation) {
        super(2, continuation);
        this.$benchmark = ll5Var;
        this.this$0 = aVar;
        this.$offer = offer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TarifficatorBenchmarkReporter$reportBenchmark$1(this.$benchmark, this.this$0, this.$offer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TarifficatorBenchmarkReporter$reportBenchmark$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Map map;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer;
        Set set;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            str = "Perf." + ((com.yandex.plus.core.benchmark.b) this.$benchmark).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            double a = ((com.yandex.plus.core.benchmark.b) this.$benchmark).a() / ((Number) a.g.getValue()).longValue();
            linkedHashMap.put("duration", new Double(a));
            this.this$0.getClass();
            linkedHashMap.put("sdk_version", "110.0.2");
            linkedHashMap.put(Constants.KEY_SERVICE, this.this$0.a);
            linkedHashMap.put("brand", this.this$0.b.name());
            k2d0 k2d0Var = (k2d0) this.this$0.c.invoke();
            String str2 = k2d0Var != null ? k2d0Var.a : null;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("testIds", str2);
            String str3 = k2d0Var != null ? k2d0Var.b : null;
            linkedHashMap.put("triggeredTestIds", str3 != null ? str3 : "");
            List J0 = (k2d0Var == null || (set = k2d0Var.d) == null) ? null : kotlin.collections.a.J0(set);
            if (J0 == null) {
                J0 = EmptyList.a;
            }
            linkedHashMap.put("flags", J0);
            PlusPayCompositeOffers.Offer offer = this.$offer;
            if (offer != null && (tariffOffer = offer.getTariffOffer()) != null) {
                linkedHashMap.put(DRMInfoProvider.MediaDRMKeys.VENDOR, tariffOffer.getVendor().toString());
            }
            com.yandex.plus.home.common.utils.b bVar = this.this$0.e;
            this.L$0 = str;
            this.L$1 = linkedHashMap;
            this.L$2 = null;
            this.D$0 = a;
            this.label = 1;
            Object k = bVar.k(this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = linkedHashMap;
            obj = k;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$1;
            str = (String) this.L$0;
            b.b(obj);
        }
        String str4 = (String) obj;
        if (str4 != null) {
            map.put("store_region", str4);
        }
        this.this$0.d.b(new tbd0(PlusPayEvent$Type.LOG, str, map, (Throwable) null));
        return zy11.a;
    }
}
