package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsInitiatedVersion;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.internal.domain.e;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.u04;
import defpackage.w511;
import defpackage.wls;
import defpackage.z94;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2ViewModel$loadData$1", f = "AutoTopupSetupV2ViewModel.kt", l = {243, 255}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupV2ViewModel$loadData$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isFullUpdateData;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupV2ViewModel$loadData$1(b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$isFullUpdateData = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupV2ViewModel$loadData$1(this.this$0, this.$isFullUpdateData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupV2ViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f4, code lost:
    
        if (com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b.c0(r1, (defpackage.cqg) r3, r2, r30) == r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f6, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r0 == r10) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, u04.a((u04) value, new t8j0(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32766)));
            z94 z94Var = this.this$0.J.a.e;
            AutotopupEvents$AutoTopupSettingsInitiatedVersion autotopupEvents$AutoTopupSettingsInitiatedVersion = AutotopupEvents$AutoTopupSettingsInitiatedVersion.V2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsInitiatedVersion.getOriginalValue());
            z94Var.a.a("auto_topup.settings.initiated", linkedHashMap);
            b bVar = this.this$0;
            e eVar = bVar.D;
            String source = bVar.B.getSource();
            AutoTopupShowOnly autoTopupShowOnly = this.this$0.B.getAutoTopupShowOnly();
            String autoTopupId = this.this$0.B.getAutoTopupId();
            String agreementId = this.this$0.B.getAgreementId();
            BigDecimal amount = this.this$0.B.getAmount();
            BigDecimal threshold = this.this$0.B.getThreshold();
            BigDecimal limit = this.this$0.B.getLimit();
            Map<String, String> additionalParams = this.this$0.B.getAdditionalParams();
            this.label = 1;
            b = eVar.b(source, autoTopupShowOnly, autoTopupId, agreementId, amount, threshold, limit, additionalParams, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b = this.L$0;
                kotlin.b.b(obj);
                b bVar2 = this.this$0;
                a = Result.a(b);
                if (a != null) {
                    b.b0(bVar2, a.getMessage(), a);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        b bVar3 = this.this$0;
        boolean z = this.$isFullUpdateData;
        if (!(b instanceof Result.Failure)) {
            dqg dqgVar = (dqg) b;
            if (dqgVar instanceof cqg) {
                this.L$0 = b;
                this.label = 2;
            } else {
                if (!(dqgVar instanceof bqg)) {
                    w511.b();
                    return null;
                }
                String str = ((bqg) dqgVar).a;
                b.b0(bVar3, str, new Exception(str));
            }
        }
        b bVar22 = this.this$0;
        a = Result.a(b);
        if (a != null) {
        }
        return zy11.a;
    }
}
