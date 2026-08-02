package com.yandex.go.navigator.gas_stations.analytics;

import defpackage.fe50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.analytics.NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersAllShownV2$1", f = "NavigatorPetrolStationsAnalyticsInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersAllShownV2$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $chainsList;
    final /* synthetic */ List<String> $fuelList;
    final /* synthetic */ String $source;
    final /* synthetic */ String $type;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersAllShownV2$1(a aVar, String str, String str2, List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$source = str;
        this.$type = str2;
        this.$fuelList = list;
        this.$chainsList = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersAllShownV2$1(this.this$0, this.$source, this.$type, this.$fuelList, this.$chainsList, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsFiltersAllShownV2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fe50 fe50Var;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            fe50Var = aVar.d;
            NavigatorPetrolStationsAnalytics$Screen a = a.a(aVar);
            a aVar2 = this.this$0;
            this.L$0 = fe50Var;
            this.L$1 = a;
            this.label = 1;
            Object b = a.b(aVar2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            navigatorPetrolStationsAnalytics$Screen = a;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            navigatorPetrolStationsAnalytics$Screen = (NavigatorPetrolStationsAnalytics$Screen) this.L$1;
            fe50Var = (fe50) this.L$0;
            b.b(obj);
        }
        String str = this.$source;
        String str2 = this.$type;
        List<String> list = this.$fuelList;
        List<String> list2 = this.$chainsList;
        fe50Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put("type", str2);
        hashMap.put(MetaDataField.SCREEN_FIELD, navigatorPetrolStationsAnalytics$Screen.getEventValue());
        hashMap.put(Constants.KEY_SERVICE, (String) obj);
        if (list != null) {
            hashMap.put("fuel_list", list);
        }
        if (list2 != null) {
            hashMap.put("chains_list", list2);
        }
        fe50Var.a.a("NavigatorPetrolStations.FiltersAll.Shown", hashMap, 2, new HashMap());
        return zy11.a;
    }
}
