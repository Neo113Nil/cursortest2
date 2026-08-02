package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;

/* compiled from: MoneyFormatter.kt */
/* loaded from: classes6.dex */
public final class j730 {
    public static String a(int i, VkTransactionInfo.Currency currency) {
        return sua.i(i, ',') + (char) 8201 + currency.h();
    }
}
