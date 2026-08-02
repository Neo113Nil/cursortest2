package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5318yb implements InterfaceC4969kl {
    @Override // io.appmetrica.analytics.impl.InterfaceC4969kl
    public final boolean a(C5243vb c5243vb) {
        Integer num = c5243vb.f;
        return num == null || num.intValue() != Process.myPid();
    }
}
