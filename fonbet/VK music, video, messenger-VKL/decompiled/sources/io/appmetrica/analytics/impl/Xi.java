package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;
import xsna.gq;

/* loaded from: classes8.dex */
public final class Xi implements Co {
    public final Bo a = new Bo();

    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable Revenue revenue) {
        Bo bo = this.a;
        C4758cg c4758cg = new C4758cg();
        Integer num = revenue.quantity;
        List<Ao> asList = Arrays.asList((num == null || num.intValue() > 0) ? new Ao(c4758cg, true, "") : new Ao(c4758cg, false, gq.d(num, "Invalid quantity value ")));
        bo.getClass();
        return bo.a(asList);
    }
}
