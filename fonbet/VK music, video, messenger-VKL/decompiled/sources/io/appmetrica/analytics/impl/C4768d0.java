package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4768d0 implements ProtobufConverter {
    public final W a;
    public final C5187t6 b;

    public C4768d0() {
        this(new W(new Hn()), new C5187t6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4799e6 fromModel(@NonNull C4742c0 c4742c0) {
        C4799e6 c4799e6 = new C4799e6();
        c4799e6.a = this.a.fromModel(c4742c0.a);
        String str = c4742c0.b;
        if (str != null) {
            c4799e6.b = str;
        }
        c4799e6.c = this.b.a(c4742c0.c);
        return c4799e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4768d0(W w, C5187t6 c5187t6) {
        this.a = w;
        this.b = c5187t6;
    }

    @NonNull
    public final C4742c0 a(@NonNull C4799e6 c4799e6) {
        throw new UnsupportedOperationException();
    }
}
