package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class Mh implements InterfaceC5159s4 {
    public final InterfaceC4953k5 a;

    public Mh(InterfaceC4953k5 interfaceC4953k5) {
        this.a = interfaceC4953k5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5159s4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Kg a(Context context, C5083p5 c5083p5, C4720b4 c4720b4, B4 b4) {
        Lg lg;
        C4747c5 c4747c5 = new C4747c5(c4720b4.b, c4720b4.a);
        Mg mg = new Mg(this.a);
        synchronized (c5083p5) {
            lg = (Lg) c5083p5.a(c4747c5, b4, mg, c5083p5.a);
        }
        return new Kg(context, lg);
    }
}
