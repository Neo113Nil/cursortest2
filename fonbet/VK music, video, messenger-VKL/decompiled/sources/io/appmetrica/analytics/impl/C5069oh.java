package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.oh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5069oh extends AbstractC4733bh {
    public C5069oh(C4927j5 c4927j5) {
        super(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        C4927j5 c4927j5 = this.a;
        synchronized (c4927j5) {
            ((C5262w5) c4927j5.p).d();
        }
        return false;
    }
}
