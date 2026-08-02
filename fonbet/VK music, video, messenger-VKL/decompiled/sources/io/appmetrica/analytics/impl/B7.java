package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class B7 implements ProtobufConverter {
    public final C5271we a;

    /* JADX WARN: Multi-variable type inference failed */
    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 fromModel(D7 d7) {
        A7 a7 = new A7();
        Long l = d7.a;
        if (l != null) {
            a7.a = l.longValue();
        }
        Long l2 = d7.b;
        if (l2 != null) {
            a7.b = l2.longValue();
        }
        Boolean bool = d7.c;
        if (bool != null) {
            a7.c = this.a.fromModel(bool).intValue();
        }
        return a7;
    }

    public B7(C5271we c5271we) {
        this.a = c5271we;
    }

    public /* synthetic */ B7(C5271we c5271we, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C5271we() : c5271we);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D7 toModel(A7 a7) {
        A7 a72 = new A7();
        long j = a7.a;
        Long valueOf = Long.valueOf(j);
        if (j == a72.a) {
            valueOf = null;
        }
        long j2 = a7.b;
        return new D7(valueOf, j2 != a72.b ? Long.valueOf(j2) : null, this.a.a(a7.c));
    }
}
