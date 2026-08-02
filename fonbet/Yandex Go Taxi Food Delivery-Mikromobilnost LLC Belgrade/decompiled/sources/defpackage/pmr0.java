package defpackage;

import android.net.Uri;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes13.dex */
public final class pmr0 {
    public static SharedAccountScreen a(Uri uri) {
        String queryParameter = uri.getQueryParameter(MetaDataField.SCREEN_FIELD);
        return jl40.l(queryParameter, "payment_method") ? SharedAccountScreen.PAYMENT_METHOD : jl40.l(queryParameter, "report") ? SharedAccountScreen.REPORT : SharedAccountScreen.DETAILS;
    }
}
