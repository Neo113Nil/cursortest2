package com.yandex.plus.core.benchmark;

import defpackage.ll5;
import defpackage.ml5;
import defpackage.nl5;
import defpackage.w511;
import defpackage.yci0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class b implements ll5 {
    public final String a;
    public final List b;
    public final yci0 c;
    public final ml5 d;

    public b(String str, List list, yci0 yci0Var) {
        ml5 ml5Var = new ml5(Benchmark$State.NOT_STARTED);
        this.a = str;
        this.b = list;
        this.c = yci0Var;
        this.d = ml5Var;
    }

    public final long a() {
        Benchmark$State benchmark$State;
        long j;
        long j2;
        do {
            benchmark$State = (Benchmark$State) this.d.a.get();
            j = this.d.b;
            j2 = this.d.c;
        } while (benchmark$State != this.d.a.get());
        int i = nl5.a[benchmark$State.ordinal()];
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            this.c.getClass();
            j2 = System.nanoTime();
        } else if (i != 3) {
            w511.b();
            return 0L;
        }
        return j2 - j;
    }

    public final boolean b() {
        AtomicReference atomicReference = this.d.a;
        Benchmark$State benchmark$State = Benchmark$State.NOT_STARTED;
        Benchmark$State benchmark$State2 = Benchmark$State.STARTED;
        while (!atomicReference.compareAndSet(benchmark$State, benchmark$State2)) {
            if (atomicReference.get() != benchmark$State) {
                return false;
            }
        }
        ml5 ml5Var = this.d;
        this.c.getClass();
        ml5Var.b = System.nanoTime();
        return true;
    }

    public final boolean c() {
        AtomicReference atomicReference = this.d.a;
        Benchmark$State benchmark$State = Benchmark$State.STARTED;
        Benchmark$State benchmark$State2 = Benchmark$State.STOPPED;
        while (!atomicReference.compareAndSet(benchmark$State, benchmark$State2)) {
            if (atomicReference.get() != benchmark$State) {
                return false;
            }
        }
        ml5 ml5Var = this.d;
        this.c.getClass();
        ml5Var.c = System.nanoTime();
        return true;
    }
}
