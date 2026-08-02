package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ValidationException;

/* loaded from: classes8.dex */
public class On implements Co {
    public final Co a;

    public On(@NonNull Co co) {
        this.a = co;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable Object obj) {
        Ao a = this.a.a(obj);
        if (a.a) {
            return a;
        }
        throw new ValidationException(a.b);
    }

    @NonNull
    public final Co a() {
        return this.a;
    }
}
