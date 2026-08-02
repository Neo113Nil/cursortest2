package defpackage;

import com.ybsdk.feature.nfc.api.models.NfcCommandType;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class a860 {
    public static NfcCommandType a(int i) {
        Object obj;
        Iterator<E> it = NfcCommandType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NfcCommandType) obj).getValue() == i) {
                break;
            }
        }
        NfcCommandType nfcCommandType = (NfcCommandType) obj;
        return nfcCommandType == null ? NfcCommandType.UNSPECIFIED : nfcCommandType;
    }
}
