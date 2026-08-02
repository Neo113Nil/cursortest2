package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5055o3 implements Do {
    public final T8 a;

    public C5055o3() {
        this(new T8());
    }

    @Override // io.appmetrica.analytics.impl.Do
    @NonNull
    public final byte[] a(@NonNull Z8 z8, @NonNull C5224uh c5224uh) {
        byte[] bArr = new byte[0];
        String str = z8.b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        T8 t8 = this.a;
        return ((S8) t8.a.a(z8.o)).a(bArr);
    }

    public C5055o3(T8 t8) {
        this.a = t8;
    }
}
