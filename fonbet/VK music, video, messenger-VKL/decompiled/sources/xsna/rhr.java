package xsna;

import android.annotation.SuppressLint;
import android.os.Trace;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Firebase.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class rhr {
    public static final bpn0 a = new bpn0(new y0f(1));
    public static bpn0 b;
    public static final ReentrantLock c;
    public static final Condition d;
    public static boolean e;
    public static final ArrayList f;
    public static final qhr g;
    public static final bpn0 h;
    public static final bpn0 i;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        c = reentrantLock;
        d = reentrantLock.newCondition();
        e = true;
        f = new ArrayList();
        g = new qhr();
        h = new bpn0(new ab3(3));
        i = new bpn0(new eu2(3));
    }

    public static void a(izs izsVar) {
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            f.add(izsVar);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static boolean b(Long l) {
        Trace.beginSection(ndp0.f("Firebase.awaitInitialization"));
        try {
            try {
                if (c()) {
                    return c();
                }
                ReentrantLock reentrantLock = c;
                reentrantLock.lock();
                try {
                    if (!c()) {
                        Condition condition = d;
                        if (l != null) {
                            condition.await(l.longValue(), TimeUnit.MILLISECONDS);
                        } else {
                            condition.await();
                        }
                    }
                    boolean c2 = c();
                    reentrantLock.unlock();
                    return c2;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Exception e2) {
                L.i(e2);
                Trace.endSection();
                return false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public static boolean c() {
        CompletableFuture<Void> completableFuture = com.vk.core.firebase.providers.a.e;
        if (completableFuture != null) {
            return completableFuture.isDone();
        }
        return false;
    }
}
