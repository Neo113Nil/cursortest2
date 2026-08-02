package defpackage;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmMoney$Currency$FiatCurrency;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmMoney$Currency$LoyaltyCurrency;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmTextContent$Amount;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmTextContent$Plain;
import com.ybsdk.feature.pfm.internal.data.network.dto.a;
import com.ybsdk.feature.pfm.internal.domain.entities.PfmTextEntity$Amount$SignType;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public abstract class ncb0 {
    public static final ycb0 a(PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain) {
        Text.Constant e = d.e(pfmResponse$PfmTextContent$Plain.getText());
        Themes<String> textColor = pfmResponse$PfmTextContent$Plain.getTextColor();
        return new ycb0(e, textColor != null ? lvy0.c(textColor) : null);
    }

    public static final zcb0 b(PfmResponse.PfmText pfmText) {
        PfmTextEntity$Amount$SignType pfmTextEntity$Amount$SignType;
        String str;
        ThemedImageUrlEntity c;
        kcb0 content = pfmText.getContent();
        if (content instanceof PfmResponse$PfmTextContent$Plain) {
            return a((PfmResponse$PfmTextContent$Plain) content);
        }
        if (!(content instanceof PfmResponse$PfmTextContent$Amount)) {
            w511.b();
            return null;
        }
        PfmResponse$PfmTextContent$Amount pfmResponse$PfmTextContent$Amount = (PfmResponse$PfmTextContent$Amount) content;
        BigDecimal amount = pfmResponse$PfmTextContent$Amount.getMoney().getAmount();
        int i = mcb0.b[pfmResponse$PfmTextContent$Amount.getMoney().getSignType().ordinal()];
        if (i == 1) {
            pfmTextEntity$Amount$SignType = PfmTextEntity$Amount$SignType.CREDIT;
        } else if (i == 2) {
            pfmTextEntity$Amount$SignType = PfmTextEntity$Amount$SignType.DEBIT;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            pfmTextEntity$Amount$SignType = PfmTextEntity$Amount$SignType.NEUTRAL;
        }
        a currency = pfmResponse$PfmTextContent$Amount.getMoney().getCurrency();
        if (currency instanceof PfmResponse$PfmMoney$Currency$FiatCurrency) {
            str = ((PfmResponse$PfmMoney$Currency$FiatCurrency) currency).getCurrency();
        } else {
            if (!(currency instanceof PfmResponse$PfmMoney$Currency$LoyaltyCurrency)) {
                w511.b();
                return null;
            }
            int i2 = mcb0.a[((PfmResponse$PfmMoney$Currency$LoyaltyCurrency) currency).getType().ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                w511.b();
                return null;
            }
            str = null;
        }
        a currency2 = pfmResponse$PfmTextContent$Amount.getMoney().getCurrency();
        if (currency2 instanceof PfmResponse$PfmMoney$Currency$FiatCurrency) {
            c = null;
        } else {
            if (!(currency2 instanceof PfmResponse$PfmMoney$Currency$LoyaltyCurrency)) {
                w511.b();
                return null;
            }
            c = qxy0.c(((PfmResponse$PfmMoney$Currency$LoyaltyCurrency) currency2).getIcon(), null);
        }
        Themes<String> color = pfmResponse$PfmTextContent$Amount.getSpoiler().getColor();
        return new xcb0(amount, pfmTextEntity$Amount$SignType, str, c, color != null ? lvy0.c(color) : null);
    }
}
