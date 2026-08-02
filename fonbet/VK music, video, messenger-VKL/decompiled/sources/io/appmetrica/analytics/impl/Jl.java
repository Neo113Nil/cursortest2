package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jl extends Aa {
    public final AbstractC4733bh b;

    public Jl(Bi bi, AbstractC4733bh abstractC4733bh) {
        super(bi);
        this.b = abstractC4733bh;
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final void a(@NonNull List<AbstractC4733bh> list) {
        list.add(this.b);
    }
}
