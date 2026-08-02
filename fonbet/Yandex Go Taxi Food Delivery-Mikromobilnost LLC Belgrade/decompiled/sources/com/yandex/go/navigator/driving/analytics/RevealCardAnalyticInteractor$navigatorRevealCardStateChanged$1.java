package com.yandex.go.navigator.driving.analytics;

import com.yandex.go.navigator.analitycs.NavigatorRevealCardAnalytics$DrivingModalState;
import com.yandex.go.navigator.analitycs.NavigatorRevealCardAnalytics$Screen;
import defpackage.me50;
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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.analytics.RevealCardAnalyticInteractor$navigatorRevealCardStateChanged$1", f = "RevealCardAnalyticInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RevealCardAnalyticInteractor$navigatorRevealCardStateChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ NavigatorRevealCardAnalytics$DrivingModalState $state;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevealCardAnalyticInteractor$navigatorRevealCardStateChanged$1(a aVar, NavigatorRevealCardAnalytics$DrivingModalState navigatorRevealCardAnalytics$DrivingModalState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$state = navigatorRevealCardAnalytics$DrivingModalState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RevealCardAnalyticInteractor$navigatorRevealCardStateChanged$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RevealCardAnalyticInteractor$navigatorRevealCardStateChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen;
        me50 me50Var;
        NavigatorRevealCardAnalytics$DrivingModalState navigatorRevealCardAnalytics$DrivingModalState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            me50 me50Var2 = aVar.a;
            NavigatorRevealCardAnalytics$DrivingModalState navigatorRevealCardAnalytics$DrivingModalState2 = this.$state;
            NavigatorRevealCardAnalytics$Screen a = a.a(aVar);
            a aVar2 = this.this$0;
            this.L$0 = me50Var2;
            this.L$1 = navigatorRevealCardAnalytics$DrivingModalState2;
            this.L$2 = a;
            this.label = 1;
            Object b = a.b(aVar2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            navigatorRevealCardAnalytics$Screen = a;
            obj = b;
            me50Var = me50Var2;
            navigatorRevealCardAnalytics$DrivingModalState = navigatorRevealCardAnalytics$DrivingModalState2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            navigatorRevealCardAnalytics$Screen = (NavigatorRevealCardAnalytics$Screen) this.L$2;
            navigatorRevealCardAnalytics$DrivingModalState = (NavigatorRevealCardAnalytics$DrivingModalState) this.L$1;
            me50Var = (me50) this.L$0;
            b.b(obj);
        }
        me50Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(ClidProvider.STATE, navigatorRevealCardAnalytics$DrivingModalState.getEventValue());
        hashMap.put(MetaDataField.SCREEN_FIELD, navigatorRevealCardAnalytics$Screen.getEventValue());
        me50Var.a.a("NavigatorRevealCard.StateChanged", hashMap, 1, tse0.r(Constants.KEY_SERVICE, hashMap, (String) obj));
        return zy11.a;
    }
}
