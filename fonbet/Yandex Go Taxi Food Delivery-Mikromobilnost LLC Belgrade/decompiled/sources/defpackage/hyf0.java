package defpackage;

import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class hyf0 {
    public static final LinkedHashMap a;

    static {
        Pair[] pairArr = {new Pair(ErrorCode.UNKNOWN_ERR, new w121()), new Pair(ErrorCode.ABORT_ERR, new r4()), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new sf60()), new Pair(ErrorCode.CONSTRAINT_ERR, new e7e()), new Pair(ErrorCode.DATA_ERR, new bog()), new Pair(ErrorCode.INVALID_STATE_ERR, new lvw()), new Pair(ErrorCode.ENCODING_ERR, new qzn()), new Pair(ErrorCode.NETWORK_ERR, new qs50()), new Pair(ErrorCode.NOT_ALLOWED_ERR, new jf60()), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new tf60()), new Pair(ErrorCode.SECURITY_ERR, new b7q0()), new Pair(ErrorCode.TIMEOUT_ERR, new aez0())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(12));
        b.q(linkedHashMap, pairArr);
        a = linkedHashMap;
    }
}
