package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class r implements Runnable {
    public WeakReference a;

    public r(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = (s) this.a.get();
        if (sVar != null) {
            sVar.a();
        }
    }
}
