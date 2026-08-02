package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5073ol implements InterfaceC5034n8 {
    public final Qf a;
    public final C5120qg b;

    public C5073ol() {
        this(new Qf(), new C5120qg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(@NonNull C5047nl c5047nl) {
        Ni ni;
        G8 g8 = new G8();
        g8.a = 3;
        g8.d = new E8();
        Ni fromModel = this.a.fromModel(c5047nl.a);
        g8.d.a = (C5340z8) fromModel.a;
        Hg hg = c5047nl.b;
        if (hg != null) {
            ni = this.b.fromModel(hg);
            g8.d.b = (B8) ni.a;
        } else {
            ni = null;
        }
        return Collections.singletonList(new Ni(g8, new C5003m3(C5003m3.b(fromModel, ni))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5073ol(Qf qf, C5120qg c5120qg) {
        this.a = qf;
        this.b = c5120qg;
    }

    @NonNull
    public final C5047nl a(@NonNull List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
