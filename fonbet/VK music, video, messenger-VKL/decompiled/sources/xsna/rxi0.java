package xsna;

import java.util.HashMap;
import java.util.UUID;

/* compiled from: SessionUuidStateRepository.kt */
/* loaded from: classes6.dex */
public final class rxi0 {
    public static final rxi0 a = new rxi0();
    public static HashMap<Long, String> b;

    public static void a(long j) {
        if (b == null) {
            b = new HashMap<>();
        }
        HashMap<Long, String> hashMap = b;
        if (hashMap != null) {
            hashMap.put(Long.valueOf(j), UUID.randomUUID().toString());
        }
    }

    public static String b(long j) {
        String str;
        HashMap<Long, String> hashMap = b;
        if (hashMap != null && (str = hashMap.get(Long.valueOf(j))) != null) {
            return str;
        }
        a(j);
        HashMap<Long, String> hashMap2 = b;
        String str2 = hashMap2 != null ? hashMap2.get(Long.valueOf(j)) : null;
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException(qlb0.a(j, "SessionUuid by appId ", " = null").toString());
    }
}
