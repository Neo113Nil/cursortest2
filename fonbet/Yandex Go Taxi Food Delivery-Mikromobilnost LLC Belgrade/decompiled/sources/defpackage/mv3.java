package defpackage;

import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.autotopup.internal.presentation.result.a;
import com.ybsdk.feature.autotopup.internal.presentation.result.b;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupEditBottomSheet;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupEnableSetting;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSaveSettings;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSelectPaymentMethod;
import com.ybsdk.feature.deeplink.api.actions.DefaultPaymentMethodSet;
import com.ybsdk.feature.deeplink.api.actions.EnableSbpToAddAccountForTopup;
import com.ybsdk.feature.deeplink.api.actions.Intent;
import com.ybsdk.feature.deeplink.api.actions.MerchantOffersSearchSuggest;
import com.ybsdk.feature.deeplink.api.actions.PfmResetFilters;
import com.ybsdk.feature.deeplink.api.actions.SbpAccountUnbind;
import com.ybsdk.feature.qr.payments.api.model.QrPaymentAgreementParams;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.rconfig.configs.MerchantOffersSearchConfig;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes3.dex */
public final class mv3 implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mv3(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, Object obj, int i) {
        this.a = i;
        this.b = deeplinkHandleResult$DeeplinkType;
        this.c = obj;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        r0 r0Var;
        Object value;
        CommonSheetEntity appNotFoundSheetEntity;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        fem0 fem0Var;
        int i = this.a;
        TransactionsFeedFilterEntity transactionsFeedFilterEntity = null;
        x0h x0hVar = x0h.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = this.b;
        EmptyList emptyList = EmptyList.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!(deeplink.getAction() instanceof DeeplinkAction.AutotopupRetry)) {
                    return x0hVar;
                }
                ((a) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 1:
                if (!(deeplink.getAction() instanceof DeeplinkAction.AutotopupSave)) {
                    return x0hVar;
                }
                ((a) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 2:
                if (!(deeplink.getAction() instanceof AutoTopupSelectPaymentMethod)) {
                    return x0hVar;
                }
                ((v04) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 3:
                if (!(deeplink.getAction() instanceof DeeplinkAction.Close)) {
                    return x0hVar;
                }
                ((v04) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 4:
                if (!(deeplink.getAction() instanceof AutoTopupEditBottomSheet)) {
                    return x0hVar;
                }
                ((x04) obj).invoke((AutoTopupEditBottomSheet) deeplink.getAction());
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 5:
                if (!(deeplink.getAction() instanceof AutoTopupEnableSetting)) {
                    return x0hVar;
                }
                ((x04) obj).invoke((AutoTopupEnableSetting) deeplink.getAction());
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 6:
                if (!(deeplink.getAction() instanceof AutoTopupSaveSettings)) {
                    return x0hVar;
                }
                ((com.ybsdk.feature.autotopup.internal.presentation.setup.v2.a) obj).invoke((AutoTopupSaveSettings) deeplink.getAction());
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 7:
                if (!(deeplink.getAction() instanceof DeeplinkAction.Upgrade)) {
                    return x0hVar;
                }
                ((com.ybsdk.feature.autotopup.internal.presentation.setup.v1.a) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 8:
                if (!(deeplink.getAction() instanceof EnableSbpToAddAccountForTopup)) {
                    return x0hVar;
                }
                pz40 Y = ((vw3) obj).Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, sw3.a((sw3) value, sg6.a, 13)));
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 9:
                b bVar = (b) obj;
                if (!(deeplink.getAction() instanceof Intent)) {
                    return x0hVar;
                }
                if (!rje.k(bVar.G, new android.content.Intent("android.intent.action.VIEW", ((Intent) deeplink.getAction()).getUri()).addFlags(SelfTester_JCP.IMITA))) {
                    AutoTopupResultParams autoTopupResultParams = bVar.B;
                    AutoTopupResultParams.Polling polling = autoTopupResultParams instanceof AutoTopupResultParams.Polling ? (AutoTopupResultParams.Polling) autoTopupResultParams : null;
                    if (polling != null && (appNotFoundSheetEntity = polling.getAppNotFoundSheetEntity()) != null) {
                        com.ybsdk.core.analytics.a aVar = bVar.F.a.e.a;
                        byte[] bArr = y5e.u;
                        byte[] bArr2 = new byte[47];
                        for (int i2 = 0; i2 < 47; i2++) {
                            bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
                        }
                        aVar.a(new String(bArr2, uza.a), null);
                        pz40 Y2 = bVar.Y();
                        do {
                            r0Var2 = (r0) Y2;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, wy3.a((wy3) value2, null, null, null, null, null, appNotFoundSheetEntity, null, false, null, null, 2015)));
                    }
                }
                DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType2 = DeeplinkHandleResult$DeeplinkType.ACTION;
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 10:
                if (!(deeplink.getAction() instanceof DeeplinkAction.Close)) {
                    return x0hVar;
                }
                ((ju8) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 11:
                if (!(deeplink.getAction() instanceof DefaultPaymentMethodSet)) {
                    return x0hVar;
                }
                ((com.ybsdk.feature.change.payment.method.internal.ui.b) obj).invoke((DefaultPaymentMethodSet) deeplink.getAction());
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 12:
                if (!(deeplink.getAction() instanceof DeeplinkAction.ReloadPaymentMethodSheet)) {
                    return x0hVar;
                }
                DeeplinkAction.ReloadPaymentMethodSheet reloadPaymentMethodSheet = (DeeplinkAction.ReloadPaymentMethodSheet) deeplink.getAction();
                ((com.ybsdk.feature.change.payment.method.internal.ui.a) obj).invoke(reloadPaymentMethodSheet.getPaymentId(), reloadPaymentMethodSheet.getTrustId());
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 13:
                if (!(deeplink.getAction() instanceof DeeplinkAction.ReloadScreen)) {
                    return x0hVar;
                }
                ((ybf) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 14:
                if (!(deeplink.getAction() instanceof DeeplinkAction.SetDivVariables)) {
                    return x0hVar;
                }
                ((nsl) obj).invoke(((DeeplinkAction.SetDivVariables) deeplink.getAction()).getDivActionUris());
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 15:
                if (!(deeplink.getAction() instanceof DeeplinkAction.Close)) {
                    return x0hVar;
                }
                ((amh) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 16:
                if (!(deeplink.getAction() instanceof MerchantOffersSearchSuggest)) {
                    return x0hVar;
                }
                com.ybsdk.feature.merchant.offers.internal.screens.search.a aVar2 = (com.ybsdk.feature.merchant.offers.internal.screens.search.a) obj;
                String query = ((MerchantOffersSearchSuggest) deeplink.getAction()).getQuery();
                String str = ((gq10) aVar2.X()).d;
                if (str == null) {
                    str = "";
                }
                if (!jl40.l(query, str)) {
                    pz40 Y3 = aVar2.Y();
                    do {
                        r0Var3 = (r0) Y3;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, gq10.a((gq10) value3, null, null, null, query, 7)));
                    aVar2.c0(((MerchantOffersSearchConfig) aVar2.D.a.d(xp10.a).getData()).getDebounceDurationMs(), query);
                }
                aVar2.Z(new kq10(query));
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 17:
                if (!(deeplink.getAction() instanceof DeeplinkAction.SharePdf)) {
                    return x0hVar;
                }
                ((ak80) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 18:
                if (!(deeplink.getAction() instanceof PfmResetFilters)) {
                    return x0hVar;
                }
                ((pdb0) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 19:
                if (!(deeplink.getAction() instanceof DeeplinkAction.PickPhoto)) {
                    return x0hVar;
                }
                ((ncg0) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 20:
                if (!(deeplink.getAction() instanceof DeeplinkAction.BlockTaps)) {
                    return x0hVar;
                }
                ((j9g0) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 21:
                if (!(deeplink.getAction() instanceof DeeplinkAction.HideTooltip)) {
                    return x0hVar;
                }
                ((j9g0) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 22:
                if (!(deeplink.getAction() instanceof DeeplinkAction.QrPaymentsSelectAgreement)) {
                    return x0hVar;
                }
                DeeplinkAction.QrPaymentsSelectAgreement qrPaymentsSelectAgreement = (DeeplinkAction.QrPaymentsSelectAgreement) deeplink.getAction();
                ((i9g0) obj).invoke(new QrPaymentAgreementParams(qrPaymentsSelectAgreement.getAgreementId(), qrPaymentsSelectAgreement.getProductCode(), qrPaymentsSelectAgreement.getAutopaymentId(), qrPaymentsSelectAgreement.getMemberId()));
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 23:
                if (!(deeplink.getAction() instanceof DeeplinkAction.SetBoostStrategy)) {
                    return x0hVar;
                }
                DeeplinkAction.SetBoostStrategy setBoostStrategy = (DeeplinkAction.SetBoostStrategy) deeplink.getAction();
                ((i9g0) obj).invoke(new ka6(setBoostStrategy.getStrategy(), setBoostStrategy.getVariables()));
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 24:
                if (!(deeplink.getAction() instanceof DeeplinkAction.UnblockTaps)) {
                    return x0hVar;
                }
                ((j9g0) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 25:
                if (!(deeplink.getAction() instanceof DeeplinkAction.ConfirmFundOperation)) {
                    return x0hVar;
                }
                ((dnr) obj).invoke();
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 26:
                if (!(deeplink.getAction() instanceof SbpAccountUnbind)) {
                    return x0hVar;
                }
                pz40 Y4 = ((com.ybsdk.feature.main.internal.screens.sbpAccount.a) obj).Y();
                do {
                    r0Var4 = (r0) Y4;
                    value4 = r0Var4.getValue();
                    fem0Var = (fem0) value4;
                    if (fem0Var instanceof cem0) {
                        fem0Var = new eem0(((cem0) fem0Var).b);
                    } else {
                        x4c.g("Incorrect screen order", null, "in init block", Collections.singletonList(lrp0.C), 2);
                    }
                } while (!r0Var4.k(value4, fem0Var));
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 27:
                com.ybsdk.feature.main.internal.screens.sbpPartners.a aVar3 = (com.ybsdk.feature.main.internal.screens.sbpPartners.a) obj;
                if (!(deeplink.getAction() instanceof Intent)) {
                    return x0hVar;
                }
                if (rje.k(aVar3.I, new android.content.Intent("android.intent.action.VIEW", ((Intent) deeplink.getAction()).getUri()).addFlags(SelfTester_JCP.IMITA))) {
                    aVar3.L = Boolean.TRUE;
                    DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType3 = DeeplinkHandleResult$DeeplinkType.ACTION;
                } else {
                    aVar3.L = Boolean.FALSE;
                    DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType4 = DeeplinkHandleResult$DeeplinkType.ACTION;
                }
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            case 28:
                if (!(deeplink.getAction() instanceof DeeplinkAction.NextStory)) {
                    return x0hVar;
                }
                ((p9t0) obj).invoke(((DeeplinkAction.NextStory) deeplink.getAction()).getTarget());
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
            default:
                if (!(deeplink.getAction() instanceof DeeplinkAction.TransactionsFeedFilterSelected)) {
                    return x0hVar;
                }
                DeeplinkAction.TransactionsFeedFilterSelected transactionsFeedFilterSelected = (DeeplinkAction.TransactionsFeedFilterSelected) deeplink.getAction();
                if (!jl40.l(transactionsFeedFilterSelected, DeeplinkAction.TransactionsFeedFilterSelected.Empty.INSTANCE)) {
                    if (!(transactionsFeedFilterSelected instanceof DeeplinkAction.TransactionsFeedFilterSelected.ByProduct)) {
                        w511.b();
                        return null;
                    }
                    DeeplinkAction.TransactionsFeedFilterSelected.ByProduct byProduct = (DeeplinkAction.TransactionsFeedFilterSelected.ByProduct) transactionsFeedFilterSelected;
                    transactionsFeedFilterEntity = new TransactionsFeedFilterEntity(byProduct.getProduct(), byProduct.getAgreementId(), byProduct.getHeaderStyle(), byProduct.getFiltersStyle());
                }
                ((com.ybsdk.feature.transactions.impl.ui.screens.feed.b) obj).invoke(transactionsFeedFilterEntity);
                return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
        }
    }
}
