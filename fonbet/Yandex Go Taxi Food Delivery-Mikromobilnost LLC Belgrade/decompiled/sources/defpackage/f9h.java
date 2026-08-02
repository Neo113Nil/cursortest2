package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class f9h implements bhe {
    public static final f9h c = new f9h(Collections.EMPTY_MAP);
    public int a;
    public final Map b;

    public f9h(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public static boolean e(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final f9h b(che cheVar) {
        byte[] bArr;
        Map map = this.b;
        HashMap hashMap = new HashMap(map);
        cheVar.getClass();
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(cheVar.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(cheVar.a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(StandardCharsets.UTF_8);
            } else {
                if (!(value2 instanceof byte[])) {
                    w511.q();
                    return null;
                }
                bArr = (byte[]) value2;
            }
            hashMap.put(str, bArr);
        }
        return e(map, hashMap) ? this : new f9h(hashMap);
    }

    public final Set c() {
        return this.b.entrySet();
    }

    public final long d(long j, String str) {
        byte[] bArr = (byte[]) this.b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f9h.class != obj.getClass()) {
            return false;
        }
        return e(this.b, ((f9h) obj).b);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int i = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.a = i;
        }
        return this.a;
    }

    public f9h() {
        this(Collections.EMPTY_MAP);
    }
}
