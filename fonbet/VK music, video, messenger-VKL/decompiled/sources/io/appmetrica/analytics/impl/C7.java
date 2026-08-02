package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class C7 implements Converter {
    public final B7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(D7 d7) {
        return MessageNano.toByteArray(this.a.fromModel(d7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((D7) obj));
    }

    public C7(B7 b7) {
        this.a = b7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D7 toModel(byte[] bArr) {
        A7 a7;
        if (bArr != null) {
            try {
                a7 = (A7) MessageNano.mergeFrom(new A7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                a7 = new A7();
            }
        }
        a7 = new A7();
        return this.a.toModel(a7);
    }

    public /* synthetic */ C7(B7 b7, int i, zcl zclVar) {
        this((i & 1) != 0 ? new B7(null, 1, null) : b7);
    }
}
