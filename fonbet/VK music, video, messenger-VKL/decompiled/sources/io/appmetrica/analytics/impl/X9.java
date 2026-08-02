package io.appmetrica.analytics.impl;

import android.util.Base64;

/* loaded from: classes8.dex */
public final class X9 implements S8 {
    @Override // io.appmetrica.analytics.impl.S8
    public final L8 a(C4722b6 c4722b6) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public final U8 a() {
        return U8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
