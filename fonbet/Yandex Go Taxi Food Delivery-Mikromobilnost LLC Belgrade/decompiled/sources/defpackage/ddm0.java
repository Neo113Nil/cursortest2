package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.savings.internal.network.dto.SavingsInterestHintResponse;

/* loaded from: classes3.dex */
public final class ddm0 {
    public final w530 a;

    public ddm0(w530 w530Var) {
        this.a = w530Var;
    }

    public final gam0 a(SavingsInterestHintResponse savingsInterestHintResponse) {
        MoneyEntity g = bob1.g(savingsInterestHintResponse.getAmount(), this.a);
        String text = savingsInterestHintResponse.getText();
        ColorModel e = lvy0.e(savingsInterestHintResponse.getAmountTextColor().getLight(), savingsInterestHintResponse.getAmountTextColor().getDark());
        if (e == null) {
            e = new ColorModel.Attr(ung0.ybColor_fill_color7_500);
        }
        ColorModel colorModel = e;
        ColorModel e2 = lvy0.e(savingsInterestHintResponse.getAmountBackground().getLight(), savingsInterestHintResponse.getAmountBackground().getDark());
        if (e2 == null) {
            e2 = new ColorModel.Attr(ung0.ybColor_internal_transparent);
        }
        ColorModel colorModel2 = e2;
        ColorModel e3 = lvy0.e(savingsInterestHintResponse.getTextColor().getLight(), savingsInterestHintResponse.getTextColor().getDark());
        if (e3 == null) {
            e3 = new ColorModel.Attr(ung0.ybColor_fill_color4_100);
        }
        return new gam0(g, colorModel, colorModel2, e3, text);
    }
}
