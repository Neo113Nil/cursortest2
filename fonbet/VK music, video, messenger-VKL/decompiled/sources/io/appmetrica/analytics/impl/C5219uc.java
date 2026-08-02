package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.C5219uc;

/* renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5219uc {
    public int a = 5;
    public final C4792e b;

    public C5219uc(InterfaceC4845g0 interfaceC4845g0) {
        this.b = new C4792e(new Pb(interfaceC4845g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C4792e c4792e = this.b;
        c4792e.a.add(new InterfaceC4741c() { // from class: xsna.zez0
            @Override // io.appmetrica.analytics.impl.InterfaceC4741c
            public final void onAppNotResponding() {
                C5219uc.b(AnrListener.this);
            }
        });
    }
}
