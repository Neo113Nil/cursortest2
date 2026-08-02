package defpackage;

import com.ybsdk.core.common.data.network.dto.AdditionalButtonDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.PaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class j5a0 {
    public static final h5a0 a(PaymentMethodDto paymentMethodDto, w530 w530Var, boolean z) {
        ThemedImageUrlEntity c = qxy0.c(paymentMethodDto.getThemedLogo(), paymentMethodDto.getLogo());
        if (z && c.getLightUrl() == null && c.getDarkUrl() == null) {
            x4c.g("Error getting the logo. Logo is required", null, paymentMethodDto.getTitle(), null, 10);
        }
        PaymentMethodTypeDto type = paymentMethodDto.getType();
        switch (type == null ? -1 : i5a0.a[type.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
                break;
            case 0:
            default:
                w511.b();
                break;
            case 1:
                if (paymentMethodDto.getCardInfo() != null) {
                    Text.Constant i = g8e.i(Text.Companion, paymentMethodDto.getTitle());
                    String description = paymentMethodDto.getDescription();
                    rbv f = job1.f(c, new bd90(15));
                    Themes<String> secondLogo = paymentMethodDto.getSecondLogo();
                    ThemedImageUrlEntity c2 = secondLogo != null ? qxy0.c(secondLogo, null) : null;
                    String id = paymentMethodDto.getCardInfo().getId();
                    String ybSuggestId = paymentMethodDto.getYbSuggestId();
                    String system = paymentMethodDto.getCardInfo().getSystem();
                    String number = paymentMethodDto.getCardInfo().getNumber();
                    String legalText = paymentMethodDto.getLegalText();
                    String action = paymentMethodDto.getAction();
                    String partnerId = paymentMethodDto.getCardInfo().getPartnerId();
                    String selectedMethodDescription = paymentMethodDto.getSelectedMethodDescription();
                    Money amount = paymentMethodDto.getAmount();
                    break;
                } else {
                    x4c.g("card_info is null with CARD type", null, null, null, 14);
                    break;
                }
            case 2:
                if (paymentMethodDto.getMe2meInfo() != null) {
                    Text.Constant i2 = g8e.i(Text.Companion, paymentMethodDto.getTitle());
                    String description2 = paymentMethodDto.getDescription();
                    d5a0 d5a0Var = new d5a0(c, false);
                    Themes<String> secondLogo2 = paymentMethodDto.getSecondLogo();
                    ThemedImageUrlEntity c3 = secondLogo2 != null ? qxy0.c(secondLogo2, null) : null;
                    d5a0 d5a0Var2 = new d5a0(c, true);
                    String partnerId2 = paymentMethodDto.getMe2meInfo().getPartnerId();
                    String ybSuggestId2 = paymentMethodDto.getYbSuggestId();
                    String legalText2 = paymentMethodDto.getLegalText();
                    String action2 = paymentMethodDto.getAction();
                    String selectedMethodDescription2 = paymentMethodDto.getSelectedMethodDescription();
                    Money amount2 = paymentMethodDto.getAmount();
                    break;
                } else {
                    x4c.g("me2me_info is null with ME2ME type", null, null, null, 14);
                    break;
                }
            case 3:
                if (paymentMethodDto.getSavingsAccountInfo() != null) {
                    Text.Constant i3 = g8e.i(Text.Companion, paymentMethodDto.getTitle());
                    String description3 = paymentMethodDto.getDescription();
                    Themes<String> secondLogo3 = paymentMethodDto.getSecondLogo();
                    ThemedImageUrlEntity c4 = secondLogo3 != null ? qxy0.c(secondLogo3, null) : null;
                    String agreementId = paymentMethodDto.getSavingsAccountInfo().getAgreementId();
                    String ybSuggestId3 = paymentMethodDto.getYbSuggestId();
                    String legalText3 = paymentMethodDto.getLegalText();
                    String action3 = paymentMethodDto.getAction();
                    String selectedMethodDescription3 = paymentMethodDto.getSelectedMethodDescription();
                    Money amount3 = paymentMethodDto.getAmount();
                    break;
                } else {
                    x4c.g("savings_account_info is null with SAVINGS_ACCOUNT type", null, null, null, 14);
                    break;
                }
            case 4:
                if (paymentMethodDto.getYandexAccountInfo() != null) {
                    Text.Constant i4 = g8e.i(Text.Companion, paymentMethodDto.getTitle());
                    String description4 = paymentMethodDto.getDescription();
                    Themes<String> secondLogo4 = paymentMethodDto.getSecondLogo();
                    ThemedImageUrlEntity c5 = secondLogo4 != null ? qxy0.c(secondLogo4, null) : null;
                    String agreementId2 = paymentMethodDto.getYandexAccountInfo().getAgreementId();
                    String ybSuggestId4 = paymentMethodDto.getYbSuggestId();
                    String legalText4 = paymentMethodDto.getLegalText();
                    String action4 = paymentMethodDto.getAction();
                    String selectedMethodDescription4 = paymentMethodDto.getSelectedMethodDescription();
                    Money amount4 = paymentMethodDto.getAmount();
                    break;
                } else {
                    x4c.g("yandex_account_info is null with YANDEX_ACCOUNT type", null, null, null, 14);
                    break;
                }
        }
        return null;
    }

    public static final uda0 b(PaymentMethodsListDto paymentMethodsListDto, w530 w530Var, boolean z) {
        List<PaymentMethodDto> paymentMethods = paymentMethodsListDto.getPaymentMethods();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paymentMethods.iterator();
        while (it.hasNext()) {
            h5a0 a = a((PaymentMethodDto) it.next(), w530Var, z);
            if (a != null) {
                arrayList.add(a);
            }
        }
        List<AdditionalButtonDto> additionalButtons = paymentMethodsListDto.getAdditionalButtons();
        ArrayList arrayList2 = new ArrayList(tcc.n(additionalButtons, 10));
        Iterator<T> it2 = additionalButtons.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((AdditionalButtonDto) it2.next()));
        }
        return new uda0(arrayList, arrayList2);
    }

    public static final el0 c(AdditionalButtonDto additionalButtonDto) {
        return new el0(additionalButtonDto.getTitle(), additionalButtonDto.getDescription(), job1.f(qxy0.c(additionalButtonDto.getThemedLogo(), additionalButtonDto.getLogo()), new bd90(16)), additionalButtonDto.getAction());
    }

    public static rbv d(ThemedImageUrlEntity themedImageUrlEntity, int i, int i2) {
        rev revVar = rev.i;
        if ((i2 & 1) != 0) {
            i = txg0.ybsdk_ic_yb_placeholder;
        }
        if ((i2 & 2) != 0) {
            revVar = rev.o;
        }
        rbv f = job1.f(themedImageUrlEntity, new is8(i, revVar, 8));
        return f == null ? new nbv(i, null) : f;
    }
}
