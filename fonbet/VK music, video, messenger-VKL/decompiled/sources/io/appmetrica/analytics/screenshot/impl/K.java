package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class K implements Converter {
    public final M a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(J j) {
        return MessageNano.toByteArray(this.a.fromModel(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((J) obj));
    }

    public K(M m) {
        this.a = m;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(byte[] bArr) {
        S s;
        try {
            s = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s = new S();
        }
        return this.a.toModel(s);
    }

    public /* synthetic */ K(M m, int i, zcl zclVar) {
        this((i & 1) != 0 ? new M(null, 1, null) : m);
    }
}
