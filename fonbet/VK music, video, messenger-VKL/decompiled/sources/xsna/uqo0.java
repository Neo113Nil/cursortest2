package xsna;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ThreadLocalContextStorage.java */
/* loaded from: classes11.dex */
public final class uqo0 implements ipj {
    private static final /* synthetic */ uqo0[] $VALUES;
    public static final uqo0 INSTANCE;
    private static final ThreadLocal<wmj> THREAD_LOCAL_STORAGE;
    private static final Logger logger;

    /* compiled from: ThreadLocalContextStorage.java */
    public class b implements v9h0 {
        public final wmj b;
        public final wmj c;
        public boolean d;

        public b(wmj wmjVar, wmj wmjVar2) {
            this.b = wmjVar;
            this.c = wmjVar2;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.d || uqo0.this.current() != this.c) {
                uqo0.logger.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
            } else {
                this.d = true;
                uqo0.THREAD_LOCAL_STORAGE.set(this.b);
            }
        }
    }

    static {
        uqo0 uqo0Var = new uqo0("INSTANCE", 0);
        INSTANCE = uqo0Var;
        $VALUES = new uqo0[]{uqo0Var};
        logger = Logger.getLogger(uqo0.class.getName());
        THREAD_LOCAL_STORAGE = new ThreadLocal<>();
    }

    public uqo0() {
        throw null;
    }

    public static uqo0 valueOf(String str) {
        return (uqo0) Enum.valueOf(uqo0.class, str);
    }

    public static uqo0[] values() {
        return (uqo0[]) $VALUES.clone();
    }

    @Override // xsna.ipj
    public final v9h0 b(wmj wmjVar) {
        if (wmjVar == null) {
            return a.INSTANCE;
        }
        wmj current = current();
        if (wmjVar == current) {
            return a.INSTANCE;
        }
        THREAD_LOCAL_STORAGE.set(wmjVar);
        return new b(current, wmjVar);
    }

    @Override // xsna.ipj
    public final wmj current() {
        return THREAD_LOCAL_STORAGE.get();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThreadLocalContextStorage.java */
    /* loaded from: classes8.dex */
    public static final class a implements v9h0 {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
        }
    }
}
