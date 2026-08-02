package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4977l3 extends Y2 {
    public C4977l3(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    public final int b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.Vn
    @Nullable
    public final byte[] a(@Nullable byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = this.a;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.c.warning("\"%s\" %s exceeded limit of %d bytes", this.b, bArr, Integer.valueOf(this.a));
                return bArr2;
            }
        }
        return bArr;
    }

    @NonNull
    public final String a() {
        return this.b;
    }
}
