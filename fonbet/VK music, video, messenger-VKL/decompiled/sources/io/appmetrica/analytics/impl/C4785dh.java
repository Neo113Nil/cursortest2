package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4785dh extends AbstractC4733bh {
    public final IReporter b;

    public C4785dh(@NonNull C4927j5 c4927j5, @NonNull IReporter iReporter) {
        super(c4927j5);
        this.b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        Sc sc = (Sc) Sc.c.get(c4722b6.d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", sc.a);
        hashMap.put("delivery_method", sc.b);
        this.b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
