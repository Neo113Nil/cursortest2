package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5150rl implements Co {
    public final C5332z0 a;

    public C5150rl(@NonNull C5332z0 c5332z0) {
        this.a = c5332z0;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable Void r3) {
        this.a.getClass();
        return C5332z0.a() ? new Ao(this, true, "") : new Ao(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final Ao a() {
        return a((Void) null);
    }
}
