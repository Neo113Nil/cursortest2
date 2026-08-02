package com.ybsdk.screens.initial;

import android.net.Uri;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.b13;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.s2e0;
import defpackage.wlp;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls2e0;", "Lb13;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.initial.InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1", f = "InitialViewModel.kt", l = {644}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1 initialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1 = new InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1(this.this$0, continuation);
        initialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1.L$0 = obj;
        return initialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1) create((s2e0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r6 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Uri parsedUri;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s2e0 s2e0Var = (s2e0) this.L$0;
        if (s2e0Var instanceof q2e0) {
            d dVar = this.this$0;
            q2e0 q2e0Var = (q2e0) s2e0Var;
            this.label = 1;
            com.ybsdk.rconfig.b bVar = dVar.H;
            bVar.getClass();
            if (((CommonFeatureFlag) bVar.d(wlp.x).getData()).isEnabled()) {
                String a = dVar.C.a();
                String b = dVar.C.b();
                Deeplink deeplink = ((b13) q2e0Var.a).e;
                if (deeplink != null && (parsedUri = deeplink.getParsedUri()) != null) {
                    str = parsedUri.toString();
                }
                obj2 = dVar.g0(a, b, str, this);
            } else {
                Deeplink deeplink2 = ((b13) q2e0Var.a).e;
                if (deeplink2 != null) {
                    dVar.Z.a = deeplink2;
                }
            }
            obj2 = zy11Var;
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
