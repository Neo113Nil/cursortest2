package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.otp.android.sdk.enums.WhatsAppClientType;
import com.whatsapp.otp.android.sdk.exceptions.InvalidWhatsAppOtpIntentException;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class ax41 {
    public static final WhatsAppClientType[] a = {WhatsAppClientType.CONSUMER, WhatsAppClientType.BUSINESS};

    public static String a(Intent intent) {
        boolean anyMatch;
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
        if (pendingIntent == null) {
            anyMatch = false;
        } else {
            anyMatch = Arrays.stream(a).map(new dyc(5)).anyMatch(new sa2(pendingIntent.getCreatorPackage(), 2));
        }
        if (anyMatch) {
            return intent.getStringExtra(AuthSdkActivity.RESPONSE_TYPE_CODE);
        }
        throw new InvalidWhatsAppOtpIntentException("Invalid Intent");
    }
}
