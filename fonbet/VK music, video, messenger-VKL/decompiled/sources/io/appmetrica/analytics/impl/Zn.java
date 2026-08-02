package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes8.dex */
public final class Zn implements Do {
    public final T8 a;

    public Zn() {
        this(new T8());
    }

    @Override // io.appmetrica.analytics.impl.Do
    @NonNull
    public final byte[] a(@NonNull Z8 z8, @NonNull C5224uh c5224uh) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(z8.b);
        } catch (Throwable unused) {
        }
        byte[] a = ((S8) this.a.a.a(z8.o)).a(bArr);
        return a == null ? new byte[0] : a;
    }

    public Zn(T8 t8) {
        this.a = t8;
    }

    @NonNull
    public final T8 a() {
        return this.a;
    }
}
