package io.appmetrica.analytics.impl;

import android.os.Process;

/* loaded from: classes8.dex */
public final class Rd implements InterfaceC4969kl {
    public final int a;

    public Rd(int i) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969kl
    public final boolean a(String str) {
        return this.a != Process.myPid();
    }
}
