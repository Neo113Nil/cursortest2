package com.ybsdk.screens.registration.applicationstatus.presentation;

import android.net.Uri;
import com.ybsdk.api.YBSdkScenarioResultReceiver$RegistrationResult;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.b13;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.wlp;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq2e0;", "Lb13;", "pollingState", "Lzy11;", "<anonymous>", "(Lq2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3", f = "RegistrationApplicationStatusViewModel.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3 registrationApplicationStatusViewModel$pollProductOpeningStatus$3 = new RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3(this.this$0, this.$applicationId, continuation);
        registrationApplicationStatusViewModel$pollProductOpeningStatus$3.L$0 = obj;
        return registrationApplicationStatusViewModel$pollProductOpeningStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3) create((q2e0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri parsedUri;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            q2e0 q2e0Var = (q2e0) this.L$0;
            this.this$0.H.b(YBSdkScenarioResultReceiver$RegistrationResult.SUCCESS, this.$applicationId);
            boolean standaloneRegistration = this.this$0.B.getStandaloneRegistration();
            c cVar = this.this$0;
            if (standaloneRegistration) {
                cVar.E.f();
            } else {
                com.ybsdk.rconfig.b bVar = cVar.D;
                bVar.getClass();
                boolean isEnabled = ((CommonFeatureFlag) bVar.d(wlp.x).getData()).isEnabled();
                c cVar2 = this.this$0;
                if (isEnabled) {
                    Deeplink deeplink = ((b13) q2e0Var.a).e;
                    if (deeplink != null && (parsedUri = deeplink.getParsedUri()) != null) {
                        str = parsedUri.toString();
                    }
                    String str2 = this.$applicationId;
                    this.label = 1;
                    if (c.b0(cVar2, str, str2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    cVar2.E.j(com.ybsdk.screens.initial.a.c(cVar2.L));
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
