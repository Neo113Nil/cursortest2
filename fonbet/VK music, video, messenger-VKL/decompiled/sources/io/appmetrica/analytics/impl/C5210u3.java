package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5210u3 implements InterfaceC5034n8 {
    public final C5235v3 a;

    public C5210u3() {
        this(new C5235v3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(@NonNull C5184t3 c5184t3) {
        G8 g8 = new G8();
        g8.e = new C5086p8();
        Ni fromModel = this.a.fromModel(c5184t3.b);
        g8.e.a = (C5112q8) fromModel.a;
        g8.a = c5184t3.a;
        return Collections.singletonList(new Ni(g8, new C5003m3(C5003m3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5210u3(C5235v3 c5235v3) {
        this.a = c5235v3;
    }

    @NonNull
    public final C5184t3 a(@NonNull List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
