package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes8.dex */
public final class O0 implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ C5208u1 b;

    public O0(C5208u1 c5208u1, Intent intent) {
        this.b = c5208u1;
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K7 k7 = this.b.d().b;
        Intent intent = this.a;
        k7.getClass();
        if (intent != null) {
            k7.a(intent.getDataString(), false);
        }
    }
}
