package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes8.dex */
public final class C4 extends D4 {
    public C4(@NonNull Bi bi) {
        super(bi);
    }

    public final void a(@NonNull EnumC5037nb enumC5037nb, @NonNull List<AbstractC4733bh> list) {
        if (!I9.h.contains(enumC5037nb)) {
            list.add(this.a.s);
        }
        if (I9.b.contains(enumC5037nb)) {
            return;
        }
        list.add(this.a.c);
    }
}
