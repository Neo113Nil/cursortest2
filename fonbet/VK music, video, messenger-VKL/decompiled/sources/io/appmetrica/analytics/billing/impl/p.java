package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class p implements Converter {
    public final r a;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(RemoteBillingConfig remoteBillingConfig) {
        return MessageNano.toByteArray(this.a.fromModel(remoteBillingConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((RemoteBillingConfig) obj));
    }

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(byte[] bArr) {
        t tVar;
        try {
            tVar = (t) MessageNano.mergeFrom(new t(), bArr);
        } catch (Throwable unused) {
            tVar = new t();
        }
        return this.a.toModel(tVar);
    }

    public /* synthetic */ p(r rVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? new r(null, 1, null) : rVar);
    }
}
