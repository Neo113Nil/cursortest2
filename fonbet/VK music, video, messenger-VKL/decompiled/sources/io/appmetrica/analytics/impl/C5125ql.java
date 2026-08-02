package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5125ql implements InterfaceC5034n8 {
    public final C4915ij a;

    public C5125ql() {
        this(new C4915ij());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(@NonNull C5099pl c5099pl) {
        G8 g8 = new G8();
        g8.a = 1;
        g8.b = new F8();
        Ni fromModel = this.a.fromModel(c5099pl.a);
        g8.b.a = (C8) fromModel.a;
        C5003m3 c5003m3 = new C5003m3(C5003m3.b(fromModel));
        fromModel.b.getBytesTruncated();
        return Collections.singletonList(new Ni(g8, c5003m3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5125ql(C4915ij c4915ij) {
        this.a = c4915ij;
    }

    @NonNull
    public final C5099pl a(@NonNull List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
