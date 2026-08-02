package androidx.window.java.core;

import defpackage.bvf0;
import defpackage.e9e;
import defpackage.ooc;
import defpackage.tje;
import defpackage.tpr;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes10.dex */
public final class a {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(Executor executor, e9e e9eVar, tpr tprVar) {
        LinkedHashMap linkedHashMap = this.b;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(e9eVar) == null) {
                linkedHashMap.put(e9eVar, tje.N(bvf0.a(ooc.o(executor)), null, null, new CallbackToFlowAdapter$connect$1$1(tprVar, e9eVar, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
