package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;

/* loaded from: classes2.dex */
public abstract class c27 {
    public static final boolean a(pzc0 pzc0Var) {
        PlusAcquisitionSmartOffer plusAcquisitionSmartOffer = pzc0Var.a;
        String discountPercent = plusAcquisitionSmartOffer.getTexts().getDiscountPercent();
        if (discountPercent != null && !evu0.J(discountPercent)) {
            return true;
        }
        String pointsText = plusAcquisitionSmartOffer.getTexts().getPointsText();
        return (pointsText == null || evu0.J(pointsText)) ? false : true;
    }
}
