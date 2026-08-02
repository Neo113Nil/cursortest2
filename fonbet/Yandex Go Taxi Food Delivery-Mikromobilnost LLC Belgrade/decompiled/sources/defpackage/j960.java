package defpackage;

import android.net.Uri;
import com.ybsdk.feature.nfc.api.models.NfcCommandType;
import com.ybsdk.feature.nfc.api.models.NfcPaymentResult;
import com.ybsdk.feature.nfc.api.models.NfcPaymentScenario;
import com.ybsdk.feature.nfc.api.models.NfcResultErrorType;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class j960 {
    public static DeeplinkAction.ShowNfcPayment a(Uri uri) {
        boolean i;
        String o = bzk0.o(uri, SdkUri$QueryParam.TYPE);
        String o2 = bzk0.o(uri, SdkUri$QueryParam.NFC_TOKEN_REFERENCE_ID);
        if (o2 == null) {
            return null;
        }
        x860 x860Var = NfcPaymentScenario.Companion;
        Integer k = bzk0.k(uri, SdkUri$QueryParam.NFC_PAYMENT_SCENARIO);
        x860Var.getClass();
        NfcPaymentScenario a = x860.a(k);
        if (a == null) {
            return null;
        }
        if (jl40.l(o, "success")) {
            return new DeeplinkAction.ShowNfcPayment(a, new NfcPaymentResult.Success(o2, bzk0.o(uri, SdkUri$QueryParam.CURRENCY), bzk0.o(uri, SdkUri$QueryParam.AMOUNT)));
        }
        if (!jl40.l(o, "error")) {
            return null;
        }
        Integer k2 = bzk0.k(uri, SdkUri$QueryParam.NFC_ERROR_TYPE);
        Integer k3 = bzk0.k(uri, SdkUri$QueryParam.NFC_TERMINAL_COMMAND);
        if (k2 == null || k3 == null) {
            return null;
        }
        i = bzk0.i(uri, SdkUri$QueryParam.NFC_TUK_REQUIRED, false);
        i960 i960Var = NfcResultErrorType.Companion;
        int intValue = k2.intValue();
        i960Var.getClass();
        NfcResultErrorType a2 = i960.a(intValue);
        a860 a860Var = NfcCommandType.Companion;
        int intValue2 = k3.intValue();
        a860Var.getClass();
        return new DeeplinkAction.ShowNfcPayment(a, new NfcPaymentResult.Error(o2, a2, a860.a(intValue2), i));
    }
}
