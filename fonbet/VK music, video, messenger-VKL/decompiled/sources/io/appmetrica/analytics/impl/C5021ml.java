package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5021ml implements InterfaceC5034n8 {
    public final C4915ij a;
    public final Qf b;

    public C5021ml() {
        this(new C4915ij(), new Qf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(@NonNull C4995ll c4995ll) {
        G8 g8 = new G8();
        g8.a = 2;
        g8.c = new D8();
        Ni fromModel = this.a.fromModel(c4995ll.b);
        g8.c.b = (C8) fromModel.a;
        Ni fromModel2 = this.b.fromModel(c4995ll.a);
        g8.c.a = (C5340z8) fromModel2.a;
        return Collections.singletonList(new Ni(g8, new C5003m3(C5003m3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5021ml(C4915ij c4915ij, Qf qf) {
        this.a = c4915ij;
        this.b = qf;
    }

    @NonNull
    public final C4995ll a(@NonNull List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
