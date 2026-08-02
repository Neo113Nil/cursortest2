package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface mno {
    void closeSession(byte[] bArr);

    rcf createCryptoConfig(byte[] bArr);

    int getCryptoType();

    gno getKeyRequest(byte[] bArr, List list, int i, HashMap hashMap);

    lno getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(hno hnoVar);

    default void setPlayerIdForSession(byte[] bArr, vyc0 vyc0Var) {
    }
}
