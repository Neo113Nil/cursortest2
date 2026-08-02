package defpackage;

import com.google.gson.ReflectionAccessFilter$FilterResult;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes11.dex */
public abstract class hia1 {
    public static int a = 2;

    public static ReflectionAccessFilter$FilterResult a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        return ReflectionAccessFilter$FilterResult.ALLOW;
    }

    public static final String b(String str) {
        return j73.K(MessageDigest.getInstance(JCP.DIGEST_SHA_256).digest(str.getBytes(uza.a)), "", new l0o(22), 30);
    }

    public static final boolean c(PaymentMethod$Type paymentMethod$Type) {
        return paymentMethod$Type == PaymentMethod$Type.SBP_BIND_TOKEN || paymentMethod$Type == PaymentMethod$Type.KASPI || paymentMethod$Type == PaymentMethod$Type.CLICK_WALLET || paymentMethod$Type == PaymentMethod$Type.EASYPAISA_WALLET || paymentMethod$Type == PaymentMethod$Type.JAZZCASH_WALLET;
    }
}
