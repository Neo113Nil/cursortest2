package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5270wd extends SafeRunnable {
    public final /* synthetic */ C5320yd a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;

    public C5270wd(C5320yd c5320yd, String str, byte[] bArr) {
        this.a = c5320yd;
        this.b = str;
        this.c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5320yd.a(this.a).setSessionExtra(this.b, this.c);
    }
}
