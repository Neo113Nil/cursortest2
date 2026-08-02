package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes8.dex */
public final class Q1 implements InterfaceC5046nk {
    public static final P1 b = new P1();
    public static final int c = 1;
    public final InterfaceC5155s0 a;

    public Q1(InterfaceC5155s0 interfaceC5155s0) {
        this.a = interfaceC5155s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5046nk
    public final void reportData(int i, Bundle bundle) {
        ((N1) this.a).a(bundle);
    }
}
