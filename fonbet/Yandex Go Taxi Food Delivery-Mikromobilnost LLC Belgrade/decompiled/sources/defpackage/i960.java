package defpackage;

import com.ybsdk.feature.nfc.api.models.NfcResultErrorType;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i960 {
    public static NfcResultErrorType a(int i) {
        Object obj;
        Iterator<E> it = NfcResultErrorType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NfcResultErrorType) obj).getValue() == i) {
                break;
            }
        }
        NfcResultErrorType nfcResultErrorType = (NfcResultErrorType) obj;
        return nfcResultErrorType == null ? NfcResultErrorType.UNKNOWN : nfcResultErrorType;
    }
}
