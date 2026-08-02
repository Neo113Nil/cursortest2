package defpackage;

import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class h2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc9 b;

    public /* synthetic */ h2h(tc9 tc9Var, int i) {
        this.a = i;
        this.b = tc9Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        List singletonList;
        int i = this.a;
        x0h x0hVar = x0h.a;
        tc9 tc9Var = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PdfLoadById)) {
                    return x0hVar;
                }
                DeeplinkAction.PdfLoadById pdfLoadById = (DeeplinkAction.PdfLoadById) baseDeeplinkAction;
                return new v0h(Collections.singletonList(tc9Var.c(new PdfLoaderScreenParams.LoadById(pdfLoadById.getId(), pdfLoadById.getLifetimeInSeconds(), pdfLoadById.getTarget(), pdfLoadById.getAdditionalData()))), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PdfLoad)) {
                    return x0hVar;
                }
                DeeplinkAction.PdfLoad pdfLoad = (DeeplinkAction.PdfLoad) baseDeeplinkAction;
                if (pdfLoad instanceof DeeplinkAction.PdfLoad.Report) {
                    DeeplinkAction.PdfLoad.Report report = (DeeplinkAction.PdfLoad.Report) pdfLoad;
                    singletonList = Collections.singletonList(tc9Var.c(new PdfLoaderScreenParams.Base(report.getFileName(), report.isSharingEnabled(), report.getAgreementId(), report.getReportType(), report.getReportVersion(), report.getOperationId(), report.getOperationTimestamp())));
                } else if (pdfLoad instanceof DeeplinkAction.PdfLoad.DepositTariff) {
                    DeeplinkAction.PdfLoad.DepositTariff depositTariff = (DeeplinkAction.PdfLoad.DepositTariff) pdfLoad;
                    singletonList = Collections.singletonList(tc9Var.c(new PdfLoaderScreenParams.DepositTerms(depositTariff.getFileName(), depositTariff.isSharingEnabled(), depositTariff.getAgreementId())));
                } else if (pdfLoad instanceof DeeplinkAction.PdfLoad.CreditTerms) {
                    DeeplinkAction.PdfLoad.CreditTerms creditTerms = (DeeplinkAction.PdfLoad.CreditTerms) pdfLoad;
                    singletonList = Collections.singletonList(tc9Var.c(new PdfLoaderScreenParams.CreditTerms(creditTerms.getFileName(), creditTerms.isSharingEnabled(), creditTerms.getAgreementId())));
                } else {
                    if (!(pdfLoad instanceof DeeplinkAction.PdfLoad.SplitContractDraft)) {
                        w511.b();
                        return null;
                    }
                    DeeplinkAction.PdfLoad.SplitContractDraft splitContractDraft = (DeeplinkAction.PdfLoad.SplitContractDraft) pdfLoad;
                    List<DeeplinkAction.PdfLoad.SplitContractDraft.Cart.Item> items = splitContractDraft.getCart().getItems();
                    ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                    for (DeeplinkAction.PdfLoad.SplitContractDraft.Cart.Item item : items) {
                        arrayList.add(new PdfLoaderScreenParams.SplitContractDraft.Cart.Item(item.getTitle(), item.getCount()));
                    }
                    singletonList = Collections.singletonList(tc9Var.c(new PdfLoaderScreenParams.SplitContractDraft(new PdfLoaderScreenParams.SplitContractDraft.Cart(arrayList, splitContractDraft.getCart().getTotalAmount()), splitContractDraft.getPlanConstructor(), splitContractDraft.getMerchantID(), splitContractDraft.isPrepayment())));
                }
                return new v0h(singletonList, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PdfPreview)) {
                    return x0hVar;
                }
                DeeplinkAction.PdfPreview pdfPreview = (DeeplinkAction.PdfPreview) baseDeeplinkAction;
                return new v0h(Collections.singletonList(tc9Var.c(new PdfLoaderScreenParams.LoadFromUrl(pdfPreview.getUrl(), pdfPreview.getFileName(), pdfPreview.isSharingEnabled()))), null, 6);
        }
    }
}
