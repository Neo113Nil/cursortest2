package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5293xb implements Converter {
    public final Yc a;

    public C5293xb() {
        this(new Yc(new C4740bo()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull C4714ao c4714ao) {
        return MessageNano.toByteArray((MessageNano) this.a.a.fromModel(c4714ao));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5293xb(Yc yc) {
        this.a = yc;
    }

    @NonNull
    public final C4714ao a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
