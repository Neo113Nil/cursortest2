package com.yandex.go.inapp_calls.ui.loader;

import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$ButtonName;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$Reason;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$State;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import defpackage.fkv;
import defpackage.jjv;
import defpackage.kjv;
import defpackage.mf1;
import defpackage.mjv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingPresenter$defaultCall$1", f = "InAppCallsLoadingPresenter.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class InAppCallsLoadingPresenter$defaultCall$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsLoadingPresenter$defaultCall$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsLoadingPresenter$defaultCall$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsLoadingPresenter$defaultCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kjv kjvVar;
        int i;
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            kjv kjvVar2 = aVar.E.d;
            fkv fkvVar = aVar.z;
            String str3 = fkvVar != null ? fkvVar.a : null;
            mf1 mf1Var = aVar.A;
            String str4 = mf1Var != null ? mf1Var.b : null;
            g c = aVar.B.c();
            this.L$0 = kjvVar2;
            this.L$1 = str3;
            this.L$2 = str4;
            this.I$0 = 0;
            this.label = 1;
            obj = e.y(c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            kjvVar = kjvVar2;
            i = 0;
            str = str4;
            str2 = str3;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            str = (String) this.L$2;
            str2 = (String) this.L$1;
            kjvVar = (kjv) this.L$0;
            b.b(obj);
        }
        boolean z = i != 0;
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) obj;
        mjv mjvVar = kjvVar.d.b;
        if (str2 == null) {
            str2 = "";
        }
        InAppCallsAnalytics$Reason inAppCallsAnalytics$Reason = z ? InAppCallsAnalytics$Reason.Notification : InAppCallsAnalytics$Reason.OutgoingCall;
        InAppCallsAnalytics$ButtonName inAppCallsAnalytics$ButtonName = InAppCallsAnalytics$ButtonName.Ok;
        InAppCallsAnalytics$State inAppCallsAnalytics$State = jjv.a[inAppCallsFeatureWrapper$State.ordinal()] == 1 ? InAppCallsAnalytics$State.Loading : InAppCallsAnalytics$State.Failed;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("forwarding_id", str2);
        if (str != null) {
            hashMap.put("linkage_id", str);
        }
        if (inAppCallsAnalytics$Reason != null) {
            hashMap.put(CRLReasonCodeExtension.REASON, inAppCallsAnalytics$Reason.getEventValue());
        }
        hashMap.put("button_name", inAppCallsAnalytics$ButtonName.getEventValue());
        hashMap.put(ClidProvider.STATE, inAppCallsAnalytics$State.getEventValue());
        mjvVar.a.a("InAppCalls.DynamicFeatureScreen.Tapped", hashMap, 2, new HashMap());
        kjvVar.d("PhoneCall", true);
        return zy11.a;
    }
}
