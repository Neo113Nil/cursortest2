package xsna;

import io.reactivex.rxjava3.internal.functions.a;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ReactionsPreloader.kt */
/* loaded from: classes5.dex */
public final class d6f0 {
    public final io.reactivex.rxjava3.core.w a = io.reactivex.rxjava3.android.schedulers.a.b();
    public final Set<String> b = tj0.c();
    public final Set<String> c = tj0.c();
    public final ConcurrentHashMap<String, AtomicInteger> d = new ConcurrentHashMap<>();

    public final void a(String str) {
        AtomicInteger putIfAbsent;
        if (this.c.contains(str)) {
            return;
        }
        Set<String> set = this.b;
        if (set.contains(str)) {
            return;
        }
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.d;
        AtomicInteger atomicInteger = concurrentHashMap.get(str);
        if (atomicInteger == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = putIfAbsent;
        }
        if (atomicInteger.get() >= 3) {
            return;
        }
        set.add(str);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = c7r0.h(str).a0(this.a);
        oo20 oo20Var = new oo20(new defpackage.b0(27, this, str), 19);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(a0.E(oo20Var, lVar, kVar, kVar).F(new sl30(new nk0(23, this, str), 20)), new x000(1, this, str)));
    }
}
