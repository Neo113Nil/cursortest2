package com.ybsdk.feature.pin.internal.screens.createpin;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import defpackage.b7f;
import defpackage.c7f;
import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.pz40;
import defpackage.rwb0;
import defpackage.s6f;
import defpackage.swb0;
import defpackage.tje;
import defpackage.tse;
import defpackage.twb0;
import defpackage.uwb0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x6f;
import defpackage.z6f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.createpin.CreatePinViewModel$issuePinToken$1", f = "CreatePinViewModel.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreatePinViewModel$issuePinToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ ReissueActionType $newActionType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePinViewModel$issuePinToken$1(a aVar, ReissueActionType reissueActionType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$newActionType = reissueActionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreatePinViewModel$issuePinToken$1(this.this$0, this.$newActionType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreatePinViewModel$issuePinToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, c7f.a((c7f) value, null, null, z6f.b, new x6f(CreatePinState$PinStatusType.None, x6f.c), null, null, 235)));
            a aVar = this.this$0;
            com.ybsdk.feature.pin.internal.domain.b bVar = aVar.C;
            String verificationToken = aVar.B.getVerificationToken();
            this.label = 1;
            obj = bVar.d.a(aVar, verificationToken, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        uwb0 uwb0Var = (uwb0) obj;
        if (uwb0Var instanceof rwb0) {
            p1b p1bVar = this.this$0.M;
            AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) p1bVar.b;
            int i2 = s6f.a[((PinScenario) p1bVar.a).ordinal()];
            if (i2 == 1) {
                appAnalyticsReporter.S.a.a("setup_pin.issue_pin_token_error", null);
            } else if (i2 == 2) {
                appAnalyticsReporter.S.a.a("forgot_pin.issue_pin_token_error", null);
            } else if (i2 == 3) {
                appAnalyticsReporter.S.a.a("reissue_pin.issue_pin_token_error", null);
            }
            pz40 Y2 = this.this$0.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, c7f.a((c7f) value3, null, null, b7f.a, new x6f(CreatePinState$PinStatusType.IssuePinError, ((rwb0) uwb0Var).a), null, null, 235)));
        } else if (uwb0Var instanceof swb0) {
            pz40 Y3 = this.this$0.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, c7f.a((c7f) value2, null, null, null, new x6f(CreatePinState$PinStatusType.PinSetup, x6f.c), ((swb0) uwb0Var).a, null, 207)));
            this.this$0.M.n();
        } else {
            if (!(uwb0Var instanceof twb0)) {
                w511.b();
                return null;
            }
            this.this$0.M.m();
            a aVar2 = this.this$0;
            String str = ((twb0) uwb0Var).a;
            ReissueActionType reissueActionType = this.$newActionType;
            aVar2.getClass();
            tje.N(ds31.a(aVar2), null, null, new CreatePinViewModel$moveToSecondFactor$1(reissueActionType, aVar2, str, null), 3);
        }
        return zy11.a;
    }
}
