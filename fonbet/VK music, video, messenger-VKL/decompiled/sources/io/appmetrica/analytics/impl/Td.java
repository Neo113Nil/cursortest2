package io.appmetrica.analytics.impl;

import android.content.Context;
import xsna.bjn0;
import xsna.izs;
import xsna.s7o0;

/* loaded from: classes8.dex */
public final class Td {
    public final izs a;

    public Td(Yd yd) {
        this.a = yd;
    }

    public final Ud a(Context context, C4759ch c4759ch) {
        return new Ud(context, c4759ch, this.a, new s7o0(0), EnumC5037nb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Ud b(Context context, C4759ch c4759ch) {
        return new Ud(context, c4759ch, this.a, new bjn0(1), EnumC5037nb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC4969kl a(G0 g0) {
        return new Rd(g0.f.d);
    }

    public static final InterfaceC4969kl b(G0 g0) {
        return new X();
    }
}
