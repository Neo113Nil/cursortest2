package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.AgreementEntity;
import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ebg0 implements ev31 {
    public final Context a;
    public rbv b;
    public ThemedImageUrlEntity c;

    public ebg0(Context context) {
        this.a = context;
    }

    public static sl a(AgreementEntity agreementEntity) {
        rbv nbvVar;
        String agreementId = agreementEntity.getAgreementId();
        String title = agreementEntity.getTitle();
        String description = agreementEntity.getDescription();
        AgreementImageEntity image = agreementEntity.getImage();
        ThemedImageUrlEntity bottomSheetImage = image != null ? image.getBottomSheetImage() : null;
        if (bottomSheetImage == null || (nbvVar = job1.f(bottomSheetImage, new cbg0(0))) == null) {
            nbvVar = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
        }
        return new sl(agreementId, title, description, nbvVar, null, null, null);
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        YbButtonView.a aVar;
        pdq0 pdq0Var;
        cma0 cma0Var = (cma0) obj;
        ThemedImageUrlEntity themedImageUrlEntity = this.c;
        SubscriptionInfoEntity subscriptionInfoEntity = cma0Var.b;
        rbv f = jl40.l(themedImageUrlEntity, subscriptionInfoEntity.getLogo()) ? this.b : job1.f(subscriptionInfoEntity.getLogo(), new ugd0(20, this, cma0Var));
        if (f == null) {
            f = new nbv(vxg0.ybsdk_ic_circle_gray, null);
        }
        rbv rbvVar = f;
        this.b = rbvVar;
        this.c = subscriptionInfoEntity.getLogo();
        int i = dbg0.a[cma0Var.a.ordinal()];
        if (i == 1) {
            aVar = new YbButtonView.a(new Text.Resource(dzh0.ybsdk_transfer_qr_payments_subscription_success_button_title), null, null, null, null, null, null, false, false, null, 4094);
        } else if (i == 2 || i == 3) {
            aVar = new YbButtonView.a(new Text.Resource(dzh0.ybsdk_transfer_payment_without_extra_actions_button), null, null, null, null, null, null, false, false, null, 4094);
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            aVar = new YbButtonView.a(new Text.Resource(dzh0.ybsdk_transfer_payment_without_extra_actions_button), null, null, null, null, null, null, false, true, null, 3070);
        }
        Text.Constant i2 = g8e.i(Text.Companion, subscriptionInfoEntity.getTitle());
        Text.Constant constant = new Text.Constant(subscriptionInfoEntity.getDescription());
        String str = cma0Var.c;
        if (str != null) {
            List<AgreementEntity> agreements = subscriptionInfoEntity.getAgreements();
            ArrayList arrayList = new ArrayList(tcc.n(agreements, 10));
            for (AgreementEntity agreementEntity : agreements) {
                sl a = a(agreementEntity);
                boolean l = jl40.l(agreementEntity.getAgreementId(), str);
                arrayList.add(new ddq0(a.a, a.d, g8e.i(Text.Companion, agreementEntity.getTitle()), new Text.Constant(agreementEntity.getDescription()), vng.t(l ? txg0.ybsdk_ic_selected_payment_method : txg0.ybsdk_ic_unselected_payment_method, this.a), new edq0(a(agreementEntity), true), true, l));
            }
            pdq0Var = new pdq0(arrayList, null, null, null, null, 48);
        } else {
            pdq0Var = null;
        }
        return new dma0(aVar, new tbg0(i2, constant, rbvVar, subscriptionInfoEntity.getAgreementsSheetTitle(), pdq0Var));
    }
}
