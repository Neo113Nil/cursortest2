package com.yandex.go.navigator.gas_stations.analytics;

import defpackage.fe50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.analytics.NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsSearchResultErrorV2$1", f = "NavigatorPetrolStationsAnalyticsInteractor.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsSearchResultErrorV2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $reason;
    final /* synthetic */ String $source;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsSearchResultErrorV2$1(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$reason = str;
        this.$source = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsSearchResultErrorV2$1(this.this$0, this.$reason, this.$source, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorPetrolStationsAnalyticsInteractor$navigatorPetrolStationsSearchResultErrorV2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen;
        String str;
        fe50 fe50Var;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            fe50 fe50Var2 = aVar.d;
            String str3 = this.$reason;
            String str4 = this.$source;
            NavigatorPetrolStationsAnalytics$Screen a = a.a(aVar);
            a aVar2 = this.this$0;
            this.L$0 = fe50Var2;
            this.L$1 = str3;
            this.L$2 = str4;
            this.L$3 = a;
            this.label = 1;
            Object b = a.b(aVar2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            navigatorPetrolStationsAnalytics$Screen = a;
            str = str3;
            obj = b;
            fe50Var = fe50Var2;
            str2 = str4;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            navigatorPetrolStationsAnalytics$Screen = (NavigatorPetrolStationsAnalytics$Screen) this.L$3;
            str2 = (String) this.L$2;
            str = (String) this.L$1;
            fe50Var = (fe50) this.L$0;
            b.b(obj);
        }
        fe50Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, str);
        hashMap.put("source", str2);
        hashMap.put(MetaDataField.SCREEN_FIELD, navigatorPetrolStationsAnalytics$Screen.getEventValue());
        hashMap.put(Constants.KEY_SERVICE, (String) obj);
        fe50Var.a.a("NavigatorPetrolStations.SearchResult.Error", hashMap, 2, new HashMap());
        return zy11.a;
    }
}
