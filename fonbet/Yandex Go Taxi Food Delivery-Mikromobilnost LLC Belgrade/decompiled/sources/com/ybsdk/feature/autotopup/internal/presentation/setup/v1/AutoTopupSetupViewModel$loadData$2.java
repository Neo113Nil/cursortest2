package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsInitiatedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedVersion;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import defpackage.b64;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.eo1;
import defpackage.h52;
import defpackage.hfp0;
import defpackage.j04;
import defpackage.k2b1;
import defpackage.l04;
import defpackage.lrp0;
import defpackage.lz3;
import defpackage.mvg;
import defpackage.n14;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qis;
import defpackage.qz3;
import defpackage.rsa1;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z94;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupViewModel$loadData$2", f = "AutoTopupSetupViewModel.kt", l = {410, NetworkRequestException.TOO_MANY_REQUESTS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupViewModel$loadData$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupViewModel$loadData$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupViewModel$loadData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        if (r3 == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0173, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008d, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0202  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        b bVar;
        r0 r0Var;
        Object value;
        qz3 qz3Var;
        Object a2;
        r0 r0Var2;
        Object value2;
        Throwable a3;
        r0 r0Var3;
        Object value3;
        lrp0 lrp0Var = lrp0.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            z94 z94Var = this.this$0.I.a.e;
            AutotopupEvents$AutoTopupSettingsInitiatedVersion autotopupEvents$AutoTopupSettingsInitiatedVersion = AutotopupEvents$AutoTopupSettingsInitiatedVersion.V1;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsInitiatedVersion.getOriginalValue());
            z94Var.a.a("auto_topup.settings.initiated", linkedHashMap);
            b bVar2 = this.this$0;
            e eVar = bVar2.M;
            String autoTopupId = bVar2.B.getAutoTopupId();
            String agreementId = this.this$0.B.getAgreementId();
            AutoTopupType autoTopupType = this.this$0.B.getAutoTopupType();
            BigDecimal amount = this.this$0.B.getAmount();
            BigDecimal threshold = this.this$0.B.getThreshold();
            this.label = 1;
            a = eVar.a(autoTopupId, agreementId, autoTopupType, amount, threshold, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qz3Var = (qz3) this.L$2;
                bVar = (b) this.L$1;
                obj2 = this.L$0;
                kotlin.b.b(obj);
                a2 = obj;
                qis qisVar = (qis) a2;
                if (qisVar != null) {
                    bVar.Z(new n14(qisVar));
                }
                bVar.a0(new eo1(29, qz3Var));
                b bVar3 = this.this$0;
                a3 = Result.a(obj2);
                if (a3 != null) {
                    x4c.g("[auto_topup] failed to load autoTopup settings V2", a3, null, Collections.singletonList(lrp0Var), 4);
                    bVar3.I.e(a3.getMessage(), bVar3.B.getSource());
                    pz40 Y = bVar3.Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, j04.a((j04) value3, new s8j0(a3), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142)));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        obj2 = a;
        bVar = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            Object obj3 = (dqg) obj2;
            if (obj3 instanceof cqg) {
                qz3Var = (qz3) ((cqg) obj3).a;
                if (qz3Var.j.d.isEmpty()) {
                    x4c.g("[auto_topup] empty auto topup settings", null, null, Collections.singletonList(lrp0Var), 6);
                    bVar.I.e("empty auto topup settings", bVar.B.getSource());
                    pz40 Y2 = bVar.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, j04.a((j04) value2, new s8j0(new Exception("Empty autoTopup settings")), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142)));
                } else {
                    l04 l04Var = bVar.I;
                    String source = bVar.B.getSource();
                    z94 z94Var2 = l04Var.a.e;
                    AutotopupEvents$AutoTopupSettingsLoadedResult autotopupEvents$AutoTopupSettingsLoadedResult = AutotopupEvents$AutoTopupSettingsLoadedResult.OK;
                    String plainString = k2b1.c(qz3Var, AutoTopupInputType.AMOUNT).d.toPlainString();
                    String plainString2 = k2b1.c(qz3Var, AutoTopupInputType.THRESHOLD).d.toPlainString();
                    Map a4 = h52.a(qz3Var.m);
                    Integer c = rsa1.c(k2b1.d(qz3Var, null));
                    lz3 lz3Var = qz3Var.k;
                    z94.b(z94Var2, autotopupEvents$AutoTopupSettingsLoadedResult, null, plainString, plainString2, a4, c, lz3Var != null ? rsa1.e(lz3Var.a) : null, source, null, null, null, null, null, null, AutotopupEvents$AutoTopupSettingsLoadedVersion.V1, 16128);
                    List list = qz3Var.n;
                    this.L$0 = obj2;
                    this.L$1 = bVar;
                    this.L$2 = qz3Var;
                    this.label = 2;
                    a2 = bVar.L.a(list, hfp0.b);
                }
            } else {
                if (!(obj3 instanceof bqg)) {
                    w511.b();
                    return null;
                }
                l04 l04Var2 = bVar.I;
                bqg bqgVar = (bqg) obj3;
                String str = bqgVar.a;
                l04Var2.e(str, bVar.B.getSource());
                pz40 Y3 = bVar.Y();
                do {
                    r0Var = (r0) Y3;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, j04.a((j04) value, new s8j0(new FailDataException((ct11) obj3)), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142)));
                x4c.g("failed to load autoTopup settings", null, b64.l("error: ", str, ", description: ", bqgVar.b), Collections.singletonList(lrp0Var), 2);
            }
        }
        b bVar32 = this.this$0;
        a3 = Result.a(obj2);
        if (a3 != null) {
        }
        return zy11.a;
    }
}
