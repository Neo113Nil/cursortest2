package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4874h3 {
    public final C4848g3 a;
    public final GZIPCompressor b;

    public C4874h3() {
        this(new C4848g3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C4848g3 c4848g3 = this.a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c4848g3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C4874h3(C4848g3 c4848g3, GZIPCompressor gZIPCompressor) {
        this.a = c4848g3;
        this.b = gZIPCompressor;
    }
}
