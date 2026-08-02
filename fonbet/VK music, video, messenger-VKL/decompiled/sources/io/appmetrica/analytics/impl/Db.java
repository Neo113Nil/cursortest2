package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Db extends InterruptionSafeThread {
    public final /* synthetic */ Eb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Db(Eb eb, String str) {
        super(str);
        this.a = eb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.a.a) {
            Eb.a(this.a);
            this.a.e = true;
            this.a.a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.a.b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.a.b);
                this.a.b.clear();
            }
            if (hashMap.size() > 0) {
                Eb.a(this.a, hashMap);
                hashMap.clear();
            }
        }
    }
}
