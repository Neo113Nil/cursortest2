package com.ybsdk.feature.split.deposit.internal.ui.autotopup.status;

import com.ybsdk.core.analytics.generated.delegates.SplitEvents$SplitDepositAutoTopupStatusShownStatus;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.domain.d;
import defpackage.em3;
import defpackage.hz3;
import defpackage.l5a0;
import defpackage.mvg;
import defpackage.ntt0;
import defpackage.ny61;
import defpackage.ozl0;
import defpackage.pk11;
import defpackage.prp0;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.r24;
import defpackage.rk11;
import defpackage.rtt0;
import defpackage.s24;
import defpackage.sk11;
import defpackage.sst0;
import defpackage.tse;
import defpackage.ust0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusViewModel$saveAutoTopup$1", f = "SplitDepositAutoTopupStatusViewModel.kt", l = {195, 210}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositAutoTopupStatusViewModel$saveAutoTopup$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositAutoTopupStatusViewModel$saveAutoTopup$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplitDepositAutoTopupStatusViewModel$saveAutoTopup$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositAutoTopupStatusViewModel$saveAutoTopup$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fe, code lost:
    
        if (r1 == r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0114, code lost:
    
        if (r1 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0116, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        if (r0 == r9) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x011f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        s24 s24Var;
        Object a;
        SettingStatus settingStatus;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = a.O;
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, sst0.a((sst0) value, PartnerSelectionSavingState.Pending, null, 30)));
            em3 em3Var = this.this$0.I.a.k0;
            SplitEvents$SplitDepositAutoTopupStatusShownStatus splitEvents$SplitDepositAutoTopupStatusShownStatus = SplitEvents$SplitDepositAutoTopupStatusShownStatus.PENDING;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put(ACSPConstants.STATUS, splitEvents$SplitDepositAutoTopupStatusShownStatus.getOriginalValue());
            em3Var.a.a("split_deposit.auto_topup_status.shown", linkedHashMap);
            rtt0 rtt0Var = this.this$0.N;
            r24 r24Var = rtt0Var != null ? new r24(SettingStatus.ENABLED, rtt0Var.f.a) : null;
            if (rtt0Var != null) {
                ntt0 ntt0Var = rtt0Var.f;
                MoneyEntity moneyEntity = ntt0Var.c;
                MoneyEntity moneyEntity2 = ntt0Var.b;
                int i2 = ust0.b[ntt0Var.d.ordinal()];
                if (i2 == 1) {
                    settingStatus = SettingStatus.ENABLED;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    settingStatus = SettingStatus.DISABLED;
                }
                s24Var = new s24(settingStatus, null, moneyEntity, moneyEntity2);
            } else {
                s24Var = null;
            }
            if (r24Var == null || s24Var == null) {
                x4c.g("AutoFund or AutoTopup settings are missing on auto topup save", null, null, Collections.singletonList(prp0.b), 6);
                this.this$0.g0();
                return zy11Var;
            }
            a aVar2 = this.this$0;
            d dVar = aVar2.E;
            rtt0 rtt0Var2 = aVar2.N;
            String str2 = rtt0Var2 != null ? rtt0Var2.c : null;
            hz3 hz3Var = new hz3(s24Var, r24Var);
            l5a0 l5a0Var = new l5a0(aVar2.B.getPaymentMethodId(), this.this$0.B.getPaymentMethodType());
            this.label = 1;
            a = dVar.a(aVar2, null, str2, null, hz3Var, null, l5a0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a = this.L$0;
                b.b(obj);
                a aVar3 = this.this$0;
                if (Result.a(a) != null) {
                    String str3 = a.O;
                    aVar3.g0();
                }
                return zy11Var;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) a;
            this.L$0 = a;
            this.label = 2;
            String str4 = a.O;
            aVar4.getClass();
            if (sk11Var instanceof rk11) {
                obj2 = aVar4.l0((ozl0) ((rk11) sk11Var).a, this);
            } else {
                if (!(sk11Var instanceof pk11) && !(sk11Var instanceof qk11)) {
                    w511.b();
                    return null;
                }
                aVar4.g0();
            }
            obj2 = zy11Var;
        }
        a aVar32 = this.this$0;
        if (Result.a(a) != null) {
        }
        return zy11Var;
    }
}
