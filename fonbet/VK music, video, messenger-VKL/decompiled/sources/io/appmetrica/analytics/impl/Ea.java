package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class Ea extends O2 {
    public Ea(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Wn a(@Nullable String str) {
        int i = 0;
        if (str != null) {
            int length = str.length();
            int i2 = this.a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                i = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new Wn(str, new C5003m3(i));
    }
}
