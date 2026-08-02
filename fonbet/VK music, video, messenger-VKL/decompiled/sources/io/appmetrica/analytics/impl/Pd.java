package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes8.dex */
public final class Pd implements ProtobufConverter {
    public static final Od a = new Od();
    public static final Map b = pn00.k(new Pair(NativeCrashSource.UNKNOWN, 0), new Pair(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4877h6 fromModel(Vd vd) {
        C4877h6 c4877h6 = new C4877h6();
        c4877h6.f = 1;
        C4851g6 c4851g6 = new C4851g6();
        c4851g6.a = vd.a;
        C4954k6 c4954k6 = new C4954k6();
        Integer num = (Integer) b.get(vd.b.a);
        if (num != null) {
            c4954k6.a = num.intValue();
        }
        String str = vd.b.b;
        if (str == null) {
            str = "";
        }
        c4954k6.b = str;
        c4851g6.b = c4954k6;
        c4877h6.g = c4851g6;
        return c4877h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Vd a(C4877h6 c4877h6) {
        throw new UnsupportedOperationException();
    }
}
