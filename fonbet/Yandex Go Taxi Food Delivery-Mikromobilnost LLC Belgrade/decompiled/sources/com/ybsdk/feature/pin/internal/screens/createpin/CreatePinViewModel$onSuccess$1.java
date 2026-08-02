package com.ybsdk.feature.pin.internal.screens.createpin;

import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.internal.entities.PinCode;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.c7f;
import defpackage.e7f;
import defpackage.frp0;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tfl0;
import defpackage.trp0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wlp;
import defpackage.wls;
import defpackage.ycp0;
import defpackage.zvb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.createpin.CreatePinViewModel$onSuccess$1", f = "CreatePinViewModel.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreatePinViewModel$onSuccess$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePinViewModel$onSuccess$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreatePinViewModel$onSuccess$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreatePinViewModel$onSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentScreen a;
        FragmentScreen a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (((com.ybsdk.feature.pin.internal.domain.biometric.a) this.this$0.E).c()) {
            a aVar = this.this$0;
            tfl0 tfl0Var = aVar.J;
            ycp0 ycp0Var = aVar.D;
            CreatePinScreenParams createPinScreenParams = aVar.B;
            int i2 = e7f.b[createPinScreenParams.getOnFinishStrategy().ordinal()];
            if (i2 == 1) {
                String m448constructorimpl = PinCode.m448constructorimpl(((c7f) aVar.X()).b);
                PinScenario scenario = createPinScreenParams.getScenario();
                ycp0Var.getClass();
                tfl0Var.l(ycp0.a(scenario, m448constructorimpl));
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                a2 = ((zvb0) aVar.F).a(((c7f) aVar.X()).h, true);
                String m448constructorimpl2 = PinCode.m448constructorimpl(((c7f) aVar.X()).b);
                PinScenario scenario2 = createPinScreenParams.getScenario();
                ycp0Var.getClass();
                tfl0Var.i(j73.A(new Screen[]{a2, ((CommonFeatureFlag) aVar.K.a.d(wlp.W).getData()).isEnabled() ? null : ycp0.a(scenario2, m448constructorimpl2)}));
            }
        } else {
            trp0 trp0Var = trp0.a;
            trp0.f(new frp0(false, false));
            a aVar2 = this.this$0;
            tfl0 tfl0Var2 = aVar2.J;
            int i3 = e7f.b[aVar2.B.getOnFinishStrategy().ordinal()];
            if (i3 == 1) {
                tfl0Var2.e();
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                a = ((zvb0) aVar2.F).a(((c7f) aVar2.X()).h, true);
                tfl0Var2.k(a);
            }
        }
        return zy11.a;
    }
}
