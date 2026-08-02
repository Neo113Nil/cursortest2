package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.xc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5294xc implements InterfaceC5159s4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5159s4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5319yc a(Context context, C5083p5 c5083p5, C4720b4 c4720b4, B4 b4) {
        Lg lg;
        C5344zc c5344zc = new C5344zc(c4720b4.b, c4720b4.a);
        Mg mg = new Mg(new Cc());
        synchronized (c5083p5) {
            lg = (Lg) c5083p5.a(c5344zc, b4, mg, c5083p5.a);
        }
        return new C5319yc(context, lg);
    }
}
