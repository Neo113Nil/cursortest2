package com.yandex.go.navigator.map_interactions.parkings.analytics;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bb50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tse0;
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
@mvg(c = "com.yandex.go.navigator.map_interactions.parkings.analytics.CarParksAnalyticsInteractor$reportLayerButtonTapped$1", f = "CarParksAnalyticsInteractor.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarParksAnalyticsInteractor$reportLayerButtonTapped$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $enabled;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarParksAnalyticsInteractor$reportLayerButtonTapped$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$enabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarParksAnalyticsInteractor$reportLayerButtonTapped$1(this.this$0, this.$enabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarParksAnalyticsInteractor$reportLayerButtonTapped$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bb50 bb50Var;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            bb50 bb50Var2 = aVar.a;
            boolean z2 = this.$enabled;
            NavigatorCarParksAnalytics$Screen a = a.a(aVar);
            a aVar2 = this.this$0;
            this.L$0 = bb50Var2;
            this.L$1 = a;
            this.Z$0 = z2;
            this.label = 1;
            Object b = a.b(aVar2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            bb50Var = bb50Var2;
            navigatorCarParksAnalytics$Screen = a;
            z = z2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            navigatorCarParksAnalytics$Screen = (NavigatorCarParksAnalytics$Screen) this.L$1;
            bb50Var = (bb50) this.L$0;
            b.b(obj);
        }
        bb50Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(z));
        hashMap.put(MetaDataField.SCREEN_FIELD, navigatorCarParksAnalytics$Screen.getEventValue());
        bb50Var.a.a("NavigatorCarParks.LayerButton.Tapped", hashMap, 2, tse0.r(Constants.KEY_SERVICE, hashMap, (String) obj));
        return zy11.a;
    }
}
