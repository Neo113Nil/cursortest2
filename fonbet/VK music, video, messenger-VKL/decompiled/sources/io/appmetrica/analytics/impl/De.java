package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes8.dex */
public final class De implements Converter {
    public final Ha a;

    public De() {
        this(new Ha(CacheDataSink.DEFAULT_BUFFER_SIZE, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull Map<String, String> map) {
        Wn a = this.a.a(map);
        C5290x8 c5290x8 = new C5290x8();
        c5290x8.b = ((C5336z4) a.b).b;
        Map map2 = (Map) a.a;
        if (map2 != null) {
            c5290x8.a = new C5265w8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c5290x8.a[i] = new C5265w8();
                c5290x8.a[i].a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c5290x8.a[i].b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC5029n3 interfaceC5029n3 = a.b;
        int i2 = ((C5336z4) interfaceC5029n3).a;
        return new Ni(c5290x8, interfaceC5029n3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public De(@NonNull Ha ha) {
        this.a = ha;
    }

    @NonNull
    public final Map<String, String> a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
