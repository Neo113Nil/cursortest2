package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4862gh extends AbstractC4733bh {
    public final Ho b;

    public C4862gh(@NonNull C4927j5 c4927j5) {
        this(c4927j5, c4927j5.u());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        C4927j5 c4927j5 = this.a;
        if (this.b.c()) {
            return false;
        }
        if (!this.b.d()) {
            C5266w9 c5266w9 = c4927j5.n;
            c5266w9.c.b(C4722b6.a(c4722b6, EnumC5037nb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        Ho ho = this.b;
        synchronized (ho) {
            Io io2 = ho.a;
            io2.a(io2.a().put("first_event_done", true));
        }
        return false;
    }

    public C4862gh(C4927j5 c4927j5, Ho ho) {
        super(c4927j5);
        this.b = ho;
    }
}
