package xsna;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.bq5;

/* compiled from: MappingCache.kt */
/* loaded from: classes15.dex */
public final class hn00<K, V, C> {
    public final bq5.b a;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final LinkedHashMap c = new LinkedHashMap();

    public hn00(bq5.b bVar) {
        this.a = bVar;
    }
}
