package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class g581 implements j571 {
    public static final g581 c = new g581(Collections.EMPTY_MAP);
    public int a;
    public final Map b;

    public g581(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final g581 b(g871 g871Var) {
        byte[] bArr;
        Map map = this.b;
        HashMap hashMap = new HashMap(map);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(g871Var.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(g871Var.a);
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
                bArr = ((String) value2).getBytes(md81.c);
            } else {
                if (!(value2 instanceof byte[])) {
                    w511.q();
                    return null;
                }
                bArr = (byte[]) value2;
            }
            hashMap.put(str, bArr);
        }
        if (map.size() == hashMap.size()) {
            for (Map.Entry entry3 : map.entrySet()) {
                if (!Arrays.equals((byte[]) entry3.getValue(), (byte[]) hashMap.get(entry3.getKey()))) {
                }
            }
            return this;
        }
        return new g581(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g581.class != obj.getClass()) {
            return false;
        }
        Map map = ((g581) obj).b;
        Map map2 = this.b;
        if (map2.size() == map.size()) {
            for (Map.Entry entry : map2.entrySet()) {
                if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map.get(entry.getKey()))) {
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
}
