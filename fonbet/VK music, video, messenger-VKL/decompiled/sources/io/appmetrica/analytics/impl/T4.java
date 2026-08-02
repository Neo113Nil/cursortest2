package io.appmetrica.analytics.impl;

import com.ironsource.X3;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class T4 implements InterfaceC4929j7 {
    public final String a;
    public final String b;

    public T4(C4747c5 c4747c5) {
        this.a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c4747c5.d() ? X3.i.Z : c4747c5.b()}, 1));
        this.b = "db_metrica_" + c4747c5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4929j7
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4929j7
    public final String b() {
        return this.a;
    }
}
