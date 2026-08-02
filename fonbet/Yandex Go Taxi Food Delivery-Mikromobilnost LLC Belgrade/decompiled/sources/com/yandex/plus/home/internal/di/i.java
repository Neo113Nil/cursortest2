package com.yandex.plus.home.internal.di;

import defpackage.bvf0;
import defpackage.g6u;
import defpackage.ild0;
import defpackage.jl40;
import defpackage.jse;
import defpackage.sls;
import defpackage.syq0;
import defpackage.tje;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public abstract class i {
    public static volatile h d;
    public static volatile boolean e;
    public static volatile int f;
    public static final ReentrantLock a = new ReentrantLock();
    public static final ReentrantLock b = new ReentrantLock();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ild0 g = new ild0();

    public static void a(boolean z) {
        int i;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (z) {
                i = f + 1;
            } else {
                i = f - 1;
                if (i < 0) {
                    i = 0;
                }
            }
            b(i, e);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void b(int i, boolean z) {
        if (e == z && f == i) {
            return;
        }
        h hVar = d;
        if (hVar != null) {
            Boolean bool = (!e || f <= 0) ? (!z || i <= 0) ? null : Boolean.TRUE : Boolean.FALSE;
            if (bool != null) {
                hVar.invoke(bool);
            }
        }
        e = z;
        f = i;
    }

    public static void c(sls slsVar, g6u g6uVar, jse jseVar) {
        syq0 syq0Var;
        if (!c.getAndSet(true)) {
            tje.N(bvf0.a(g6uVar), null, null, new PlusSdkSingleInstanceComponent$observeProcessLifecycle$1(2, null), 3);
        }
        if (d == null) {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                if (d == null && (syq0Var = (syq0) slsVar.invoke()) != null) {
                    d = new h(bvf0.a(jseVar.plus(jl40.a())), syq0Var);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
