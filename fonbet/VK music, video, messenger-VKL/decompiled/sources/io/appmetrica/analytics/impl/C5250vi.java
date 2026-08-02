package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import xsna.zr;

/* renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5250vi implements Co {
    public final Map a;

    public C5250vi(@NonNull Map<String, ?> map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable String str) {
        return this.a.containsKey(str) ? new Ao(this, false, zr.a("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new Ao(this, true, "");
    }
}
