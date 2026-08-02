package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import java.nio.charset.Charset;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public abstract class oi01 {
    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, MoneyEntity moneyEntity) {
        Locale locale = tm60.a;
        String a = tm60.a(moneyEntity.getAmount());
        String currency = moneyEntity.getCurrency();
        if (str3 == null) {
            str3 = "";
        }
        String lowerCase = unr0.r(oyr.w(str2, a, currency, str4, str5), str6, str7, str3).toLowerCase(Locale.ROOT);
        i5z0.a.a("hmac:\n".concat(lowerCase), new Object[0]);
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = uza.a;
        mac.init(new SecretKeySpec(str.getBytes(charset), "HmacSHA256"));
        return j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30);
    }
}
