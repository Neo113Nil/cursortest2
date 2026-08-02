package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5349zh extends AbstractC4733bh {
    public final Di b;

    public C5349zh(C4927j5 c4927j5) {
        super(c4927j5);
        this.b = new Di(new C5291x9(c4927j5), c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        return this.b.a(c4722b6, new Ci());
    }
}
