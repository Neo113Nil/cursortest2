package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveInitiatedVersion;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.domain.d;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupApiVersion;
import defpackage.gao;
import defpackage.h52;
import defpackage.h5a0;
import defpackage.hz3;
import defpackage.l5a0;
import defpackage.m04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r24;
import defpackage.rsa1;
import defpackage.s24;
import defpackage.sk11;
import defpackage.thq0;
import defpackage.tse;
import defpackage.u04;
import defpackage.ua91;
import defpackage.wls;
import defpackage.z94;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2ViewModel$saveSettings$1", f = "AutoTopupSetupV2ViewModel.kt", l = {350, 362}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupV2ViewModel$saveSettings$1 extends SuspendLambda implements wls {
    final /* synthetic */ AutoTopupApiVersion $apiVersion;
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupV2ViewModel$saveSettings$1(b bVar, String str, AutoTopupApiVersion autoTopupApiVersion, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$verificationToken = str;
        this.$apiVersion = autoTopupApiVersion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupV2ViewModel$saveSettings$1(this.this$0, this.$verificationToken, this.$apiVersion, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupV2ViewModel$saveSettings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0155, code lost:
    
        if (com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b.d0(r1, r3, r11, r30) == r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0157, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0139, code lost:
    
        if (r0 == r9) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0160  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        h5a0 h5a0Var;
        SettingStatus settingStatus;
        SettingStatus settingStatus2;
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            AutoTopupApiVersion autoTopupApiVersion = this.$apiVersion;
            pz40 Y = bVar.Y();
            while (true) {
                r0 r0Var = (r0) Y;
                Object value = r0Var.getValue();
                AutoTopupApiVersion autoTopupApiVersion2 = autoTopupApiVersion;
                if (r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, null, null, null, null, null, autoTopupApiVersion2, null, true, 12287))) {
                    break;
                }
                autoTopupApiVersion = autoTopupApiVersion2;
            }
            this.this$0.h0();
            b bVar2 = this.this$0;
            m04 m04Var = bVar2.J;
            u04 u04Var = (u04) bVar2.X();
            r24 r24Var = u04Var.e;
            z94 z94Var = m04Var.a.e;
            s24 s24Var = u04Var.d;
            String formattedAmount = (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : moneyEntity3.getFormattedAmount();
            String formattedAmount2 = (s24Var == null || (moneyEntity2 = s24Var.d) == null) ? null : moneyEntity2.getFormattedAmount();
            String formattedAmount3 = (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getFormattedAmount();
            thq0 thq0Var = u04Var.h;
            z94.e(z94Var, null, null, h52.b(thq0Var != null ? thq0Var.a : null), null, null, formattedAmount3, formattedAmount, formattedAmount2, (r24Var == null || (settingStatus2 = r24Var.a) == null) ? null : rsa1.d(settingStatus2), (s24Var == null || (settingStatus = s24Var.a) == null) ? null : rsa1.d(settingStatus), AutotopupEvents$AutoTopupSettingsSaveInitiatedVersion.V2, 27);
            thq0 thq0Var2 = ((u04) this.this$0.X()).h;
            l5a0 d = (thq0Var2 == null || (h5a0Var = thq0Var2.a) == null) ? null : ua91.d(h5a0Var);
            b bVar3 = this.this$0;
            d dVar = bVar3.E;
            String str = this.$verificationToken;
            String str2 = ((u04) bVar3.X()).k;
            String str3 = ((u04) this.this$0.X()).l;
            hz3 hz3Var = new hz3(((u04) this.this$0.X()).d, ((u04) this.this$0.X()).e);
            String str4 = ((u04) this.this$0.X()).j;
            this.label = 1;
            a = dVar.a(bVar3, str, str2, str3, hz3Var, str4, d, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a = this.L$0;
                kotlin.b.b(obj);
                b bVar4 = this.this$0;
                a2 = Result.a(a);
                if (a2 != null) {
                    bVar4.J.x(a2.getMessage(), (u04) bVar4.X());
                    bVar4.o0(gao.e(null, null, a2, 3));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        b bVar5 = this.this$0;
        AutoTopupApiVersion autoTopupApiVersion3 = this.$apiVersion;
        if (!(a instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) a;
            boolean z = autoTopupApiVersion3 == AutoTopupApiVersion.V2;
            this.L$0 = a;
            this.label = 2;
        }
        b bVar42 = this.this$0;
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }
}
