package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import defpackage.asi0;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.csi0;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.dsi0;
import defpackage.f42;
import defpackage.l0p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qx3;
import defpackage.r8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xx3;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$loadData$1", f = "AutoTopupRegularViewModel.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupRegularViewModel$loadData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupRegularViewModel$loadData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupRegularViewModel$loadData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupRegularViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, new t8j0(), null, null, false, 239)));
            a aVar = this.this$0;
            com.ybsdk.feature.autotopup.internal.domain.b bVar = aVar.G;
            String agreementId = aVar.B.getAgreementId();
            this.label = 1;
            Object a = bVar.a(agreementId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            Object obj3 = (dqg) obj2;
            if (obj3 instanceof bqg) {
                a.b0(aVar2, new FailDataException((ct11) obj3));
            } else {
                if (!(obj3 instanceof cqg)) {
                    w511.b();
                    return null;
                }
                asi0 asi0Var = (asi0) ((cqg) obj3).a;
                f42 f42Var = aVar2.L;
                AutoTopupRegularParams autoTopupRegularParams = aVar2.B;
                f42Var.K(asi0Var.h, autoTopupRegularParams, (qx3) aVar2.X());
                f42 f42Var2 = aVar2.L;
                csi0 csi0Var = asi0Var.a;
                l0p l0pVar = f42Var2.b.c0;
                String agreementId2 = autoTopupRegularParams.getAgreementId();
                RegularAutotopupEvents$RegularAutotopupSettingsLoadedResult regularAutotopupEvents$RegularAutotopupSettingsLoadedResult = RegularAutotopupEvents$RegularAutotopupSettingsLoadedResult.OK;
                csi0 csi0Var2 = asi0Var.a;
                dsi0 dsi0Var = csi0Var2.a;
                l0pVar.i(agreementId2, regularAutotopupEvents$RegularAutotopupSettingsLoadedResult, dsi0Var != null ? dsi0Var.a : null, csi0Var2.b == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup.CHANGE);
                pz40 Y2 = aVar2.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, qx3.a((qx3) value2, null, null, a.P0(csi0Var.e), null, new r8j0(asi0Var, null, 14), asi0Var.h, null, false, 203)));
                int T = kotlin.collections.a.T(csi0Var.f.keySet(), csi0Var.e.a);
                if (T > 0) {
                    aVar2.Z(new xx3(T));
                }
            }
        }
        a aVar3 = this.this$0;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            a.b0(aVar3, a2);
        }
        return zy11.a;
    }
}
