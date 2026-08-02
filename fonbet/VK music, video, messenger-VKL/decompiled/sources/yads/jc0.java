package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class jc0 implements qz {
    public static final jc0 c = new jc0(Collections.EMPTY_MAP);
    public int a;
    public final Map b;

    public jc0(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final jc0 a(rz rzVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(rzVar.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        for (Map.Entry entry : rzVar.a().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bArr = ((String) value).getBytes(bu.c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value;
            }
            hashMap.put(str, bArr);
        }
        Map map = this.b;
        if (map.size() == hashMap.size()) {
            for (Map.Entry entry2 : map.entrySet()) {
                if (!Arrays.equals((byte[]) entry2.getValue(), (byte[]) hashMap.get(entry2.getKey()))) {
                }
            }
            return this;
        }
        return new jc0(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jc0.class != obj.getClass()) {
            return false;
        }
        Map map = this.b;
        Map map2 = ((jc0) obj).b;
        if (map.size() == map2.size()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
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

    public final String a() {
        byte[] bArr = (byte[]) this.b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, bu.c);
        }
        return null;
    }
}
