package xsna;

import android.os.SystemClock;
import android.util.LruCache;
import java.net.InetAddress;
import java.util.List;

/* compiled from: AddressCache.kt */
/* loaded from: classes.dex */
public final class ct0 {
    public final LruCache<String, a> a = new LruCache<>(32);

    /* compiled from: AddressCache.kt */
    public static final class a {
        public final List<InetAddress> a;
        public final long b = SystemClock.elapsedRealtime() + 60000;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InetAddress> list) {
            this.a = list;
        }
    }
}
