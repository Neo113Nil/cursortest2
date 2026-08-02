package com.yandex.go.navigator.map_interactions.parkings.analytics;

import com.yandex.mapkit.GeoObject;
import defpackage.bb50;
import defpackage.bwa1;
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
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.parkings.analytics.CarParksAnalyticsInteractor$reportPinTapped$1", f = "CarParksAnalyticsInteractor.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarParksAnalyticsInteractor$reportPinTapped$1 extends SuspendLambda implements wls {
    final /* synthetic */ GeoObject $geoObject;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarParksAnalyticsInteractor$reportPinTapped$1(GeoObject geoObject, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$geoObject = geoObject;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarParksAnalyticsInteractor$reportPinTapped$1(this.$geoObject, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarParksAnalyticsInteractor$reportPinTapped$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String c;
        String str;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen;
        bb50 bb50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c = bwa1.c(this.$geoObject);
            String d = bwa1.d(this.$geoObject);
            a aVar = this.this$0;
            bb50 bb50Var2 = aVar.a;
            NavigatorCarParksAnalytics$Screen a = a.a(aVar);
            a aVar2 = this.this$0;
            this.L$0 = null;
            this.L$1 = d;
            this.L$2 = bb50Var2;
            this.L$3 = c;
            this.L$4 = a;
            this.label = 1;
            Object b = a.b(aVar2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = d;
            navigatorCarParksAnalytics$Screen = a;
            bb50Var = bb50Var2;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            navigatorCarParksAnalytics$Screen = (NavigatorCarParksAnalytics$Screen) this.L$4;
            c = (String) this.L$3;
            bb50Var = (bb50) this.L$2;
            str = (String) this.L$1;
            b.b(obj);
        }
        bb50Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", c);
        hashMap.put(MetaDataField.SCREEN_FIELD, navigatorCarParksAnalytics$Screen.getEventValue());
        hashMap.put(Constants.KEY_SERVICE, (String) obj);
        if (str != null) {
            hashMap.put("oid", str);
        }
        bb50Var.a.a("NavigatorCarParks.Pin.Tapped", hashMap, 2, new HashMap());
        return zy11.a;
    }
}
