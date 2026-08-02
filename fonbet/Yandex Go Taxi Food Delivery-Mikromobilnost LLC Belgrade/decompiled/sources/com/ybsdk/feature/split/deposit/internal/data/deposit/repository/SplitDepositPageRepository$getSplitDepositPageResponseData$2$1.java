package com.ybsdk.feature.split.deposit.internal.data.deposit.repository;

import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import com.ybsdk.feature.split.deposit.internal.domain.model.SplitDepositPageData$AutoTopupData$AutoTopupStatus;
import defpackage.bob1;
import defpackage.egb1;
import defpackage.gka0;
import defpackage.i24;
import defpackage.j5a0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ntt0;
import defpackage.ny61;
import defpackage.ott0;
import defpackage.ptt0;
import defpackage.qgf;
import defpackage.qoh;
import defpackage.qtt0;
import defpackage.qxy0;
import defpackage.rr51;
import defpackage.rtt0;
import defpackage.stt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ttt0;
import defpackage.uda0;
import defpackage.utt0;
import defpackage.vtt0;
import defpackage.w511;
import defpackage.w530;
import defpackage.wls;
import defpackage.wtt0;
import defpackage.xtt0;
import defpackage.ytt0;
import defpackage.ztt0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lztt0;", "<anonymous>", "(Ltse;)Lztt0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.data.deposit.repository.SplitDepositPageRepository$getSplitDepositPageResponseData$2$1", f = "SplitDepositPageRepository.kt", l = {66, 67, 72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPageRepository$getSplitDepositPageResponseData$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ GetDepositPageResponse $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPageRepository$getSplitDepositPageResponseData$2$1(a aVar, GetDepositPageResponse getDepositPageResponse, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = getDepositPageResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplitDepositPageRepository$getSplitDepositPageResponseData$2$1 splitDepositPageRepository$getSplitDepositPageResponseData$2$1 = new SplitDepositPageRepository$getSplitDepositPageResponseData$2$1(this.this$0, this.$response, continuation);
        splitDepositPageRepository$getSplitDepositPageResponseData$2$1.L$0 = obj;
        return splitDepositPageRepository$getSplitDepositPageResponseData$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPageRepository$getSplitDepositPageResponseData$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bb, code lost:
    
        if (r2 == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0226  */
    /* JADX WARN: Type inference failed for: r8v15, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v17, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v20, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        ytt0 ytt0Var;
        Object s;
        qoh qohVar;
        GetDepositPageResponse getDepositPageResponse;
        gka0 gka0Var;
        Object k;
        ttt0 ttt0Var;
        rtt0 rtt0Var;
        ytt0 ytt0Var2;
        Object k2;
        GetDepositPageResponse getDepositPageResponse2;
        SplitDepositPageData$AutoTopupData$AutoTopupStatus splitDepositPageData$AutoTopupData$AutoTopupStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            qoh h2 = tje.h(tseVar, null, null, new SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$screenDeferred$1(this.this$0, this.$response, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$paymentStatusYbDivDataDeferred$1(this.this$0, this.$response, null), 3);
            h = tje.h(tseVar, null, null, new SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$autoTopupStatusYbDivDataDeferred$1(this.this$0, this.$response, null), 3);
            ytt0Var = this.this$0.b;
            GetDepositPageResponse getDepositPageResponse3 = this.$response;
            this.L$0 = h2;
            this.L$1 = h;
            this.L$2 = ytt0Var;
            this.L$3 = getDepositPageResponse3;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
                qohVar = h2;
                getDepositPageResponse = getDepositPageResponse3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getDepositPageResponse2 = (GetDepositPageResponse) this.L$2;
                ytt0Var2 = (ytt0) this.L$1;
                ttt0 ttt0Var2 = (ttt0) this.L$0;
                b.b(obj);
                ttt0Var = ttt0Var2;
                k2 = obj;
                rr51 rr51Var = (rr51) k2;
                ytt0Var2.getClass();
                utt0 utt0Var = new utt0(getDepositPageResponse2.getHeader().getTitle(), getDepositPageResponse2.getHeader().getAction());
                GetDepositPageResponse.PaymentMethod paymentMethod = getDepositPageResponse2.getPaymentMethod();
                String title = paymentMethod.getTitle();
                Themes<String> icon = paymentMethod.getIcon();
                String light = icon == null ? icon.getLight() : null;
                Themes<String> icon2 = paymentMethod.getIcon();
                return new ztt0(new wtt0(rr51Var, utt0Var, new vtt0(paymentMethod.getId(), title, new ThemedImageUrlEntity(light, icon2 != null ? icon2.getDark() : null))), ttt0Var);
            }
            gka0 gka0Var2 = (gka0) this.L$3;
            getDepositPageResponse = (GetDepositPageResponse) this.L$2;
            ytt0 ytt0Var3 = (ytt0) this.L$1;
            ?? r9 = (noh) this.L$0;
            b.b(obj);
            qohVar = r9;
            ytt0Var = ytt0Var3;
            gka0Var = gka0Var2;
            k = obj;
            i24 i24Var = (i24) k;
            ytt0Var.getClass();
            GetDepositPageResponse.TransactionStatusScreen transactionStatusScreen = getDepositPageResponse.getTransactionStatusScreen();
            stt0 stt0Var = new stt0(egb1.e(transactionStatusScreen.getPendingScreenData(), gka0Var.a), egb1.e(transactionStatusScreen.getTimeoutScreenData(), gka0Var.b));
            GetDepositPageResponse.AutoTopupData autoTopupData = getDepositPageResponse.getAutoTopupData();
            if (autoTopupData != null) {
                w530 w530Var = ytt0Var.a;
                ptt0 ptt0Var = new ptt0(egb1.e(autoTopupData.getStatusScreen().getPendingData(), i24Var != null ? i24Var.a : null), egb1.e(autoTopupData.getStatusScreen().getFailData(), i24Var != null ? i24Var.b : null), egb1.e(autoTopupData.getStatusScreen().getTimeoutData(), i24Var != null ? i24Var.c : null), egb1.e(autoTopupData.getStatusScreen().getSuccessData(), i24Var != null ? i24Var.d : null));
                String title2 = autoTopupData.getPaymentMethodsBottomSheet().getTitle();
                uda0 b = j5a0.b(autoTopupData.getPaymentMethodsBottomSheet().getPaymentMethods(), w530Var, false);
                CurrentPaymentMethodDto selectedPaymentMethod = autoTopupData.getPaymentMethodsBottomSheet().getSelectedPaymentMethod();
                ott0 ott0Var = new ott0(title2, b, selectedPaymentMethod != null ? qgf.a(selectedPaymentMethod, w530Var, false) : null);
                String targetAgreementId = autoTopupData.getTargetAgreementId();
                String externalMemberConfirmationDeeplink = autoTopupData.getExternalMemberConfirmationDeeplink();
                MoneyEntity g = bob1.g(autoTopupData.getAutoTopupSettings().getAutoFundLimit(), w530Var);
                MoneyEntity g2 = bob1.g(autoTopupData.getAutoTopupSettings().getAutoTopupThreshold(), w530Var);
                MoneyEntity g3 = bob1.g(autoTopupData.getAutoTopupSettings().getAutoTopupAmount(), w530Var);
                int i2 = xtt0.a[autoTopupData.getAutoTopupSettings().getAutoTopupStatus().ordinal()];
                if (i2 == 1) {
                    splitDepositPageData$AutoTopupData$AutoTopupStatus = SplitDepositPageData$AutoTopupData$AutoTopupStatus.ENABLED;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    splitDepositPageData$AutoTopupData$AutoTopupStatus = SplitDepositPageData$AutoTopupData$AutoTopupStatus.DISABLED;
                }
                rtt0Var = new rtt0(ptt0Var, ott0Var, targetAgreementId, externalMemberConfirmationDeeplink, new qtt0(autoTopupData.getWalletPaymentMethod().getTrustId(), autoTopupData.getWalletPaymentMethod().getTitle(), qxy0.c(autoTopupData.getWalletPaymentMethod().getIcon(), null)), new ntt0(g, g2, g3, splitDepositPageData$AutoTopupData$AutoTopupStatus));
            } else {
                rtt0Var = null;
            }
            ttt0Var = new ttt0(stt0Var, rtt0Var);
            ytt0Var2 = this.this$0.b;
            GetDepositPageResponse getDepositPageResponse4 = this.$response;
            this.L$0 = ttt0Var;
            this.L$1 = ytt0Var2;
            this.L$2 = getDepositPageResponse4;
            this.L$3 = null;
            this.label = 3;
            k2 = qohVar.k(this);
            if (k2 != coroutineSingletons) {
                getDepositPageResponse2 = getDepositPageResponse4;
                rr51 rr51Var2 = (rr51) k2;
                ytt0Var2.getClass();
                utt0 utt0Var2 = new utt0(getDepositPageResponse2.getHeader().getTitle(), getDepositPageResponse2.getHeader().getAction());
                GetDepositPageResponse.PaymentMethod paymentMethod2 = getDepositPageResponse2.getPaymentMethod();
                String title3 = paymentMethod2.getTitle();
                Themes<String> icon3 = paymentMethod2.getIcon();
                if (icon3 == null) {
                }
                Themes<String> icon22 = paymentMethod2.getIcon();
                return new ztt0(new wtt0(rr51Var2, utt0Var2, new vtt0(paymentMethod2.getId(), title3, new ThemedImageUrlEntity(light, icon22 != null ? icon22.getDark() : null))), ttt0Var);
            }
            return coroutineSingletons;
        }
        GetDepositPageResponse getDepositPageResponse5 = (GetDepositPageResponse) this.L$3;
        ytt0 ytt0Var4 = (ytt0) this.L$2;
        ?? r8 = (noh) this.L$1;
        ?? r92 = (noh) this.L$0;
        b.b(obj);
        qohVar = r92;
        ytt0Var = ytt0Var4;
        getDepositPageResponse = getDepositPageResponse5;
        h = r8;
        s = obj;
        gka0Var = (gka0) s;
        this.L$0 = qohVar;
        this.L$1 = ytt0Var;
        this.L$2 = getDepositPageResponse;
        this.L$3 = gka0Var;
        this.label = 2;
        k = h.k(this);
    }
}
