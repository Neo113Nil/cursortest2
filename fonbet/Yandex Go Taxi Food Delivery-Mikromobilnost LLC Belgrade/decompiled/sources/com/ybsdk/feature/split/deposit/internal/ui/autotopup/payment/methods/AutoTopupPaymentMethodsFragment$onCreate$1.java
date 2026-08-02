package com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import com.ybsdk.feature.split.deposit.api.model.SelectedAutoTopupPaymentMethod;
import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;
import defpackage.qw3;
import defpackage.tls;
import defpackage.uc5;
import defpackage.vw3;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupPaymentMethodsFragment$onCreate$1 extends FunctionReferenceImpl implements tls {
    public AutoTopupPaymentMethodsFragment$onCreate$1(uc5 uc5Var) {
        super(1, uc5Var, vw3.class, "onSelectedPaymentMethodInFullscreen", "onSelectedPaymentMethodInFullscreen(Lcom/ybsdk/feature/transfer/api/TransferSelectedTargetEntity;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        TransferSelectedTargetEntity transferSelectedTargetEntity = (TransferSelectedTargetEntity) obj;
        vw3 vw3Var = (vw3) this.receiver;
        vw3Var.Z(qw3.a);
        ThemedImageUrlEntity themedImage = transferSelectedTargetEntity.getPartnerEntity().getThemedImage();
        String lightUrl = themedImage != null ? themedImage.getLightUrl() : null;
        ThemedImageUrlEntity themedImage2 = transferSelectedTargetEntity.getPartnerEntity().getThemedImage();
        vw3Var.c0(new SelectedAutoTopupPaymentMethod(new ThemedImageUrlEntity(lightUrl, themedImage2 != null ? themedImage2.getDarkUrl() : null), transferSelectedTargetEntity.getPartnerEntity().getPartnerId(), PaymentMethodType.Me2Me));
        return zy11.a;
    }
}
