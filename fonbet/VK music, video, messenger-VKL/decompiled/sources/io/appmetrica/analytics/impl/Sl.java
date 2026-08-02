package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Sl extends A5 {
    public Sl(C4970km c4970km, C5100pm c5100pm, C4944jm c4944jm) {
        super(c4970km, c5100pm, c4944jm);
    }

    @Override // io.appmetrica.analytics.impl.A5
    public final synchronized void a(@NonNull C4944jm c4944jm) {
        a(new X5(c(), C5342za.I.v(), C5342za.I.s(), ((C4944jm) b()).mergeFrom(c4944jm)));
        e();
    }
}
