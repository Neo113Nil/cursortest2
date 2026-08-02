package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsLoadedStateRounding;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatus;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.dzk0;
import defpackage.ezk0;
import defpackage.g5a0;
import defpackage.kzk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.us3;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingViewModel$loadData$1", f = "RoundingViewModel.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RoundingViewModel$loadData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundingViewModel$loadData$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoundingViewModel$loadData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoundingViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object obj2;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, null, new t8j0(), null, null, 111)));
            b bVar = this.this$0;
            com.ybsdk.feature.autotopup.internal.data.b bVar2 = bVar.B;
            String agreementId = bVar.C.getAgreementId();
            this.label = 1;
            Object h = bVar2.h(agreementId, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = h;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        b bVar3 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            Object obj3 = (dqg) obj2;
            if (obj3 instanceof bqg) {
                b.b0(bVar3, new FailDataException((ct11) obj3));
            } else {
                if (!(obj3 instanceof cqg)) {
                    w511.b();
                    return null;
                }
                ezk0 ezk0Var = (ezk0) ((cqg) obj3).a;
                us3 us3Var = bVar3.J;
                RoundingParams roundingParams = bVar3.C;
                dzk0 dzk0Var = ezk0Var.a;
                us3Var.a.e0.v(roundingParams.getAgreementId(), RoundingEvents$RoundingSettingsLoadedResult.OK, ezk0Var.a.a == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsLoadedStateRounding.CHANGE : RoundingEvents$RoundingSettingsLoadedStateRounding.NEW);
                g5a0 g5a0Var = ezk0Var.i;
                if (g5a0Var != null) {
                    bVar3.J.w(roundingParams, g5a0Var, ezk0Var);
                }
                pz40 Y2 = bVar3.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, RoundingState.a((RoundingState) value2, null, dzk0Var.e, dzk0Var.d, null, new r8j0(ezk0Var, null, 14), ezk0Var.i, null, 73)));
                int indexOf = dzk0Var.e.indexOf(dzk0Var.d);
                if (indexOf > 0) {
                    bVar3.Z(new kzk0(indexOf));
                }
            }
        }
        b bVar4 = this.this$0;
        Throwable a = Result.a(obj2);
        if (a != null) {
            b.b0(bVar4, a);
        }
        return zy11.a;
    }
}
