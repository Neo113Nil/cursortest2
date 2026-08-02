package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4894hn extends Y2 {
    public C4894hn(int i, @NonNull String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.a;
    }

    public C4894hn(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Vn
    @Nullable
    public final String a(@Nullable String str) {
        if (str != null) {
            int length = str.length();
            int i = this.a;
            if (length > i) {
                String substring = str.substring(0, i);
                this.c.warning("\"%s\" %s size exceeded limit of %d characters", this.b, str, Integer.valueOf(this.a));
                return substring;
            }
        }
        return str;
    }

    @NonNull
    public final String a() {
        return this.b;
    }
}
