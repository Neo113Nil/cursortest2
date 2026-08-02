package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes8.dex */
public final class V {
    public final List a;

    public V(InterfaceC5364i interfaceC5364i) {
        this.a = interfaceC5364i.a();
    }

    public final void a(C5367l c5367l) {
        for (T t : this.a) {
            C5368m c5368m = null;
            if (c5367l != null) {
                C5367l c5367l2 = c5367l.a ? c5367l : null;
                if (c5367l2 != null) {
                    c5368m = c5367l2.b;
                }
            }
            t.a(c5368m);
        }
    }
}
