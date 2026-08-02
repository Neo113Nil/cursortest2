package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5285x3 implements Converter {
    public final Da a;

    public C5285x3() {
        this(new Da(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(@NonNull List<String> list) {
        Wn a = this.a.a((List<Object>) list);
        C5137r8 c5137r8 = new C5137r8();
        c5137r8.a = StringUtils.getUTF8Bytes((List<String>) a.a);
        InterfaceC5029n3 interfaceC5029n3 = a.b;
        int i = ((C5336z4) interfaceC5029n3).a;
        return new Ni(c5137r8, interfaceC5029n3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5285x3(@NonNull Da da) {
        this.a = da;
    }

    @NonNull
    public final List<String> a(@NonNull Ni ni) {
        throw new UnsupportedOperationException();
    }
}
