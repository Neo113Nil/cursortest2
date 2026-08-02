package xsna;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ExclusiveLock.kt */
/* loaded from: classes12.dex */
public final class z2q {
    public static final a c = new a();
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final i9r b;

    /* compiled from: ExclusiveLock.kt */
    public static final class a {
    }

    public z2q(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        this.b = z ? new i9r(str) : null;
    }
}
