package xsna;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ThreadLocalBufferManager.java */
/* loaded from: classes12.dex */
public final class tqo0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ReferenceQueue<im8> b = new ReferenceQueue<>();

    /* compiled from: ThreadLocalBufferManager.java */
    public static final class a {
        public static final tqo0 a = new tqo0();
    }
}
