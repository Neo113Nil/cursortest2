package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5012mc implements InterfaceC5159s4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5159s4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final G4 a(Context context, C5083p5 c5083p5, C4720b4 c4720b4, B4 b4) {
        J4 j4;
        H4 h4 = new H4(c4720b4.b);
        K4 k4 = new K4();
        synchronized (c5083p5) {
            j4 = (J4) c5083p5.a(h4, b4, k4, c5083p5.b);
        }
        return new G4(context, j4, b4);
    }
}
