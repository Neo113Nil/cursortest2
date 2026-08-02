package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class b0 implements l {
    public final /* synthetic */ AtomicReference a;

    public b0(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // com.google.ar.core.l
    public final void a(ArCoreApk.Availability availability) {
        this.a.set(availability);
    }
}
