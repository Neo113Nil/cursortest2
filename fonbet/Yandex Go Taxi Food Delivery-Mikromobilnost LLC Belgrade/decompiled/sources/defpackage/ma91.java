package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.tankerapp.models.results.PaymentKitDataResult;
import ru.yandex.tankerapp.models.results.PaymentKitStatusResult;

/* loaded from: classes5.dex */
public abstract class ma91 {
    public static final zgl a = new zgl(7);
    public static final zgl b = new zgl(8);

    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final PaymentKitDataResult b(Intent intent) {
        Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("DATA") : null;
        PaymentKitError paymentKitError = intent != null ? (PaymentKitError) intent.getParcelableExtra("ERROR") : null;
        return new PaymentKitDataResult(parcelableExtra, parcelableExtra != null ? PaymentKitStatusResult.Success : paymentKitError != null ? PaymentKitStatusResult.Failure : PaymentKitStatusResult.Cancel, paymentKitError);
    }

    public static hki c(int i) {
        return i == 0 ? gki.a : new fki(i - 1);
    }
}
