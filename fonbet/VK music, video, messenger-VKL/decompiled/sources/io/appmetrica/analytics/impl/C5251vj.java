package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5251vj implements InterfaceC5159s4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5159s4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5148rj a(Context context, C5083p5 c5083p5, C4720b4 c4720b4, B4 b4) {
        Lg lg;
        C4747c5 c4747c5 = new C4747c5(c4720b4.b, c4720b4.a);
        synchronized (c5083p5) {
            lg = (Lg) c5083p5.a.get(c4747c5.toString());
        }
        return new C5148rj(lg);
    }
}
