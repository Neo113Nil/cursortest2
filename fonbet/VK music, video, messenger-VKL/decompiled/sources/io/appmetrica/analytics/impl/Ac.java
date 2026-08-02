package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class Ac implements InterfaceC5223ug {
    public final /* synthetic */ Bc a;

    public Ac(Bc bc) {
        this.a = bc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5223ug
    public final void a(@Nullable C5298xg c5298xg) {
        if (c5298xg == null) {
            return;
        }
        C4722b6 c4722b6 = new C4722b6("", "", 0);
        c4722b6.setValueBytes(c5298xg.a());
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        c4722b6.d = 4097;
        this.a.a(c4722b6);
    }
}
