package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import xsna.zcl;

/* renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5059o7 implements Converter {
    public final C5033n7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5059o7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C5085p7 c5085p7) {
        return MessageNano.toByteArray(this.a.fromModel(c5085p7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((C5085p7) obj));
    }

    public C5059o7(C5033n7 c5033n7) {
        this.a = c5033n7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5085p7 toModel(byte[] bArr) {
        C5314y7 c5314y7;
        if (bArr != null) {
            try {
                c5314y7 = (C5314y7) MessageNano.mergeFrom(new C5314y7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c5314y7 = new C5314y7();
            }
        }
        c5314y7 = new C5314y7();
        return this.a.toModel(c5314y7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C5059o7(C5033n7 c5033n7, int i, zcl zclVar) {
        this(c5033n7);
        if ((i & 1) != 0) {
            c5033n7 = new C5033n7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
