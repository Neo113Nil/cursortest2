package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ComponentId.java */
/* loaded from: classes8.dex */
public abstract class d9i {

    /* compiled from: ComponentId.java */
    public static class a extends d9i {
        public static final ConcurrentHashMap c = new ConcurrentHashMap();
        public final String a;
        public volatile String b = null;

        public a(String str) {
            this.a = str;
        }

        @Override // xsna.d9i
        public final String a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a + DomExceptionUtils.SEPARATOR + ((AtomicInteger) c.computeIfAbsent(this.a, new c9i())).getAndIncrement();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    public abstract String a();
}
