package xsna;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: LazySchedulerFactory.kt */
/* loaded from: classes3.dex */
public final class kwy {
    public static final ConcurrentHashMap<Executor, io.reactivex.rxjava3.core.w> a;

    static {
        ConcurrentHashMap<Executor, io.reactivex.rxjava3.core.w> concurrentHashMap = new ConcurrentHashMap<>();
        a = concurrentHashMap;
        concurrentHashMap.put(je00.b, io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
