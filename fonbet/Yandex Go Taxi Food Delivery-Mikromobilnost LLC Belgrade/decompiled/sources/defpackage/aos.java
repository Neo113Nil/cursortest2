package defpackage;

import android.app.Activity;
import android.webkit.WebView;
import com.yandex.go.lootbox.impl.data.api.LootBoxApi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.activity.MessengerActivityBase;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackArguments;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveFragment;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.b;
import com.ybsdk.feature.pdf.internal.ui.PdfLoaderFragment;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.masstransit.main.router.a;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes3.dex */
public final class aos implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;

    public /* synthetic */ aos(n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new FundDocsNoticeFragment((dos) n3wVar.a);
            case 1:
                return new arg((Activity) n3wVar.a);
            case 2:
                ImageViewerInfo imageViewerInfo = ((chv) n3wVar.a).b;
                if (imageViewerInfo != null) {
                    return imageViewerInfo;
                }
                ny61.g("Invalid arguments passed to imageViewer");
                return null;
            case 3:
                return new InternetPaymentFormInputFragment((htw) n3wVar.a);
            case 4:
                return new InternetPaymentSelectProviderFragment((vtw) n3wVar.a);
            case 5:
                on2 on2Var = ((ypz) n3wVar.a).r;
                on2Var.getClass();
                LootBoxApi lootBoxApi = (LootBoxApi) on2Var.a(GoApiName.TaxiV4, LootBoxApi.class);
                q5z.i(lootBoxApi);
                return lootBoxApi;
            case 6:
                ((qa60) ((h9g) ((tw51) n3wVar.a)).c0.get()).getClass();
                return null;
            case 7:
                w030 modalViewCoordinator = ((MapFragment) n3wVar.a).modalViewCoordinator();
                q5z.i(modalViewCoordinator);
                return modalViewCoordinator;
            case 8:
                return new e410((a) n3wVar.a);
            case 9:
                return (MessengerActivityBase) n3wVar.a;
            case 10:
                ChatRequest chatRequest = ((MessengerCallFeedbackArguments) n3wVar.a).getChatRequest();
                q5z.i(chatRequest);
                return chatRequest;
            case 11:
                return new h3b(((ml21) n3wVar.a).a);
            case 12:
                return new th20((WebView) n3wVar.a);
            case 13:
                return new wh20((lh20) n3wVar.a);
            case 14:
                return new st20((qh01) n3wVar.a);
            case 15:
                return new MobileProvidersListFragment((hu20) n3wVar.a);
            case 16:
                return new g130((h130) n3wVar.a);
            case 17:
                return new w730((u730) n3wVar.a);
            case 18:
                k6x k6xVar = ((l6x) n3wVar.a).a;
                return k6xVar == null ? new k6x() : k6xVar;
            case 19:
                return new fl10((ji50) n3wVar.a);
            case 20:
                ChatRequest chatRequest2 = ((xl50) n3wVar.a).b;
                q5z.i(chatRequest2);
                return chatRequest2;
            case 21:
                return new cm70((dm70) n3wVar.a);
            case 22:
                return new xl10((o2y0) n3wVar.a);
            case 23:
                return new uv70((zz41) n3wVar.a);
            case 24:
                return new PartnerSaveFragment((th90) n3wVar.a);
            case 25:
                return new PartnersFragment((b) n3wVar.a);
            case 26:
                return new PdfLoaderFragment((yqa0) n3wVar.a);
            case 27:
                return new PfmFragment((rdb0) n3wVar.a);
            case 28:
                return new PhoneConfirmationFragment((leb0) n3wVar.a);
            default:
                ((c0g) ((i6r) n3wVar.a)).getClass();
                return new k15();
        }
    }
}
