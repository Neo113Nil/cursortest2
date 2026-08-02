package com.ybsdk.feature.autotopup.internal.presentation.result;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsResultScreenShownResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;
import com.ybsdk.feature.autotopup.internal.domain.c;
import defpackage.bqg;
import defpackage.c24;
import defpackage.cqg;
import defpackage.d24;
import defpackage.dqg;
import defpackage.e24;
import defpackage.eo1;
import defpackage.g8e;
import defpackage.l04;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wy3;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultViewModel$callRequestStatus$1", f = "AutoTopupResultViewModel.kt", l = {407}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupResultViewModel$callRequestStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isV2RequestStatusEnabled;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupResultViewModel$callRequestStatus$1(b bVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$requestId = str;
        this.$isV2RequestStatusEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupResultViewModel$callRequestStatus$1(this.this$0, this.$requestId, this.$isV2RequestStatusEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupResultViewModel$callRequestStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        r0 r0Var;
        Object value;
        wy3 wy3Var;
        d24 d24Var;
        Text.Constant i;
        String str;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.I;
            String str2 = this.$requestId;
            boolean z = this.$isV2RequestStatusEnabled;
            AutoTopupRequestStatusPollingOption autoTopupRequestStatusPollingOption = AutoTopupRequestStatusPollingOption.LONG;
            this.label = 1;
            Object a = cVar.a(str2, z, autoTopupRequestStatusPollingOption, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        b bVar = this.this$0;
        String str3 = this.$requestId;
        Throwable a2 = Result.a(obj2);
        if (a2 == null) {
            dqg dqgVar = (dqg) obj2;
            if (dqgVar instanceof bqg) {
                l04 l04Var = bVar.F;
                bqg bqgVar = (bqg) dqgVar;
                String str4 = bqgVar.a;
                l04Var.i(str4, null, str3);
                bVar.a0(new eo1(26, bqgVar));
                bVar.F.a.e.d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult.ERROR, str4, ((wy3) bVar.X()).k);
            } else {
                if (!(dqgVar instanceof cqg)) {
                    w511.b();
                    return null;
                }
                e24 e24Var = (e24) ((cqg) dqgVar).a;
                if (e24Var instanceof c24) {
                    x4c.g("3ds for auto topup setup is not supported", null, null, null, 14);
                    pz40 Y = bVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, wy3.a((wy3) value2, null, null, null, null, null, null, AutoTopupLogoResultStatus.FAILED, false, null, null, 1983)));
                    bVar.F.a.e.d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult.ERROR, "3ds for auto topup setup is not supported", ((wy3) bVar.X()).k);
                } else {
                    if (!(e24Var instanceof d24)) {
                        w511.b();
                        return null;
                    }
                    bVar.F.j(null, str3);
                    bVar.E.a.a.edit().putBoolean("need_show_auto_topup_tooltip", true).apply();
                    pz40 Y2 = bVar.Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                        wy3Var = (wy3) value;
                        d24Var = (d24) e24Var;
                        i = g8e.i(Text.Companion, d24Var.c);
                        str = d24Var.d;
                    } while (!r0Var.k(value, wy3.a(wy3Var, null, i, str != null ? new Text.Constant(str) : null, d24Var.e, d24Var.f, null, AutoTopupLogoResultStatus.SUCCESS, false, null, null, 1953)));
                    bVar.F.d(((wy3) bVar.X()).k);
                }
            }
        } else {
            bVar.F.i(a2.getMessage(), null, str3);
            x4c.g("[auto-topup] failed to get auto topup request status", null, a2, Collections.singletonList(lrp0.b), 2);
            b.b0(bVar);
        }
        return zy11.a;
    }
}
