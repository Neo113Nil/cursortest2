package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5148rj implements InterfaceC5133r4 {
    public final Lg a;

    public C5148rj(@Nullable Lg lg) {
        this.a = lg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5133r4
    public final void a() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5133r4
    public final void a(@NonNull C4722b6 c4722b6, @NonNull B4 b4) {
        Lg lg = this.a;
        if (lg != null) {
            lg.a(c4722b6, b4);
        }
    }
}
