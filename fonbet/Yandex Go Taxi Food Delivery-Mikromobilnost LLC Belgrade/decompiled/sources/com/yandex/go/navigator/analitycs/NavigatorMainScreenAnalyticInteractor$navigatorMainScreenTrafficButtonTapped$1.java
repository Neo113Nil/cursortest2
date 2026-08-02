package com.yandex.go.navigator.analitycs;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.fio;
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
@mvg(c = "com.yandex.go.navigator.analitycs.NavigatorMainScreenAnalyticInteractor$navigatorMainScreenTrafficButtonTapped$1", f = "NavigatorMainScreenAnalyticInteractor.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorMainScreenAnalyticInteractor$navigatorMainScreenTrafficButtonTapped$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ EvgenNavigatorAnalytics$Screen $screen;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorMainScreenAnalyticInteractor$navigatorMainScreenTrafficButtonTapped$1(a aVar, boolean z, EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$enabled = z;
        this.$screen = evgenNavigatorAnalytics$Screen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorMainScreenAnalyticInteractor$navigatorMainScreenTrafficButtonTapped$1(this.this$0, this.$enabled, this.$screen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorMainScreenAnalyticInteractor$navigatorMainScreenTrafficButtonTapped$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fio fioVar;
        boolean z;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            fio fioVar2 = aVar.a;
            boolean z2 = this.$enabled;
            EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen2 = this.$screen;
            this.L$0 = fioVar2;
            this.L$1 = evgenNavigatorAnalytics$Screen2;
            this.Z$0 = z2;
            this.label = 1;
            obj = a.a(aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            fioVar = fioVar2;
            z = z2;
            evgenNavigatorAnalytics$Screen = evgenNavigatorAnalytics$Screen2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            evgenNavigatorAnalytics$Screen = (EvgenNavigatorAnalytics$Screen) this.L$1;
            fioVar = (fio) this.L$0;
            b.b(obj);
        }
        fioVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(z));
        hashMap.put(MetaDataField.SCREEN_FIELD, evgenNavigatorAnalytics$Screen.getEventValue());
        fioVar.a.a("Navigator.MainScreen.TrafficButton.Tapped", hashMap, 1, tse0.r(Constants.KEY_SERVICE, hashMap, (String) obj));
        return zy11.a;
    }
}
