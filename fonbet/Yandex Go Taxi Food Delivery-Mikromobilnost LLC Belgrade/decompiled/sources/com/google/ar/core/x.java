package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* loaded from: classes11.dex */
public final /* synthetic */ class x implements Consumer {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;

    public /* synthetic */ x(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        ArCoreApkJniAdapter.nativeInvokeAvailabilityCallback(this.a, this.b, ((ArCoreApk.Availability) obj).nativeCode);
    }
}
