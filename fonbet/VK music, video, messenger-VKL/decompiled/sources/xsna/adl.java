package xsna;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: DefaultContentMetadata.java */
/* loaded from: classes12.dex */
public final class adl implements cij {
    public static final adl c = new adl(Collections.EMPTY_MAP);
    public int a;
    public final Map<String, byte[]> b;

    public adl() {
        this(Collections.EMPTY_MAP);
    }

    public static boolean e(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final adl c(dij dijVar) {
        byte[] bArr;
        Map<String, byte[]> map = this.b;
        HashMap hashMap = new HashMap(map);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(dijVar.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(dijVar.a);
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
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value2;
            }
            hashMap.put(str, bArr);
        }
        return e(map, hashMap) ? this : new adl(hashMap);
    }

    public final Set<Map.Entry<String, byte[]>> d() {
        return this.b.entrySet();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || adl.class != obj.getClass()) {
            return false;
        }
        return e(this.b, ((adl) obj).b);
    }

    @Override // xsna.cij
    @Nullable
    public final String get() {
        byte[] bArr = this.b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }

    public final int hashCode() {
        if (this.a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.a = i;
        }
        return this.a;
    }

    public adl(Map<String, byte[]> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // xsna.cij
    public final long get(String str) {
        byte[] bArr = this.b.get(str);
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
