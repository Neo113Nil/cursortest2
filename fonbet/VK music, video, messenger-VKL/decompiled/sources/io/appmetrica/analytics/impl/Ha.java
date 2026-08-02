package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class Ha extends O2 {
    public final Ea b;
    public final Ea c;
    public final Ga d;

    public Ha(int i, int i2, int i3) {
        this(i, new Ea(i2), new Ea(i3));
    }

    public Ha(int i, @NonNull Ea ea, @NonNull Ea ea2) {
        super(i);
        this.d = new Ga();
        this.b = ea;
        this.c = ea2;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Wn a(@Nullable Map<String, String> map) {
        HashMap hashMap;
        int i;
        int i2 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.d);
            int length = entryArr.length;
            i = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                Wn a = this.b.a((String) entry.getKey());
                Wn a2 = this.c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a2.a) + StringUtils.getUtf8BytesLength((String) a.a);
                if (z || utf8BytesLength2 + i4 > this.a) {
                    i3++;
                    i += utf8BytesLength;
                    z = true;
                } else {
                    i = a2.b.getBytesTruncated() + a.b.getBytesTruncated() + i;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a2.a) + StringUtils.getUtf8BytesLength((String) a.a) + i4;
                    hashMap.put((String) a.a, (String) a2.a);
                    i4 = utf8BytesLength3;
                }
                i2++;
            }
            i2 = i3;
        } else {
            hashMap = null;
            i = 0;
        }
        return new Wn(hashMap, new C5336z4(i2, i));
    }
}
