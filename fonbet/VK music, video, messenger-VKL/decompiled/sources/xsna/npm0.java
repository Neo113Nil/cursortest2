package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import xsna.gi;
import xsna.ldx0;

/* compiled from: StrictContextStorage.java */
/* loaded from: classes8.dex */
public final class npm0 implements ipj, AutoCloseable {
    public static final Logger d = Logger.getLogger(npm0.class.getName());
    public final ipj b;
    public final b c = new b(new ConcurrentHashMap());

    /* compiled from: StrictContextStorage.java */
    public static class a extends Throwable {
        volatile boolean closed;
        final wmj context;
        final long threadId;
        final String threadName;

        public a(wmj wmjVar) {
            super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + wmjVar + " here:");
            this.threadName = Thread.currentThread().getName();
            this.threadId = Thread.currentThread().getId();
            this.context = wmjVar;
        }
    }

    /* compiled from: StrictContextStorage.java */
    public static class b extends ldx0<v9h0, a> {
        public final ConcurrentHashMap<gi.c<v9h0>, a> c;

        public b(ConcurrentHashMap<gi.c<v9h0>, a> concurrentHashMap) {
            super(concurrentHashMap);
            this.c = concurrentHashMap;
            Thread thread = new Thread(this);
            thread.setName("weak-ref-cleaner-strictcontextstorage");
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.setContextClassLoader(null);
            thread.start();
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!Thread.interrupted()) {
                try {
                    Reference<? extends v9h0> remove = remove();
                    a remove2 = remove != null ? this.c.remove(remove) : null;
                    if (remove2 != null && !remove2.closed) {
                        npm0.d.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) npm0.c(remove2));
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* compiled from: StrictContextStorage.java */
    public final class c implements v9h0 {
        public final v9h0 b;
        public final a c;

        public c(v9h0 v9h0Var, a aVar) {
            this.b = v9h0Var;
            this.c = aVar;
            b bVar = npm0.this.c;
            bVar.getClass();
            bVar.b.put(new gi.c(this, bVar), aVar);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.c.closed = true;
            b bVar = npm0.this.c;
            bVar.getClass();
            ldx0.b bVar2 = new ldx0.b();
            bVar2.a = this;
            bVar2.b = System.identityHashCode(this);
            try {
                bVar.b.remove(bVar2);
                bVar2.a = null;
                bVar2.b = 0;
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                for (int i = 0; i < stackTrace.length; i++) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (stackTraceElement.getClassName().equals(c.class.getName()) && stackTraceElement.getMethodName().equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                        int i2 = i + 2;
                        int i3 = i + 1;
                        if (i3 < stackTrace.length) {
                            StackTraceElement stackTraceElement2 = stackTrace[i3];
                            if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i2 < stackTrace.length) {
                                i2 = i + 3;
                            }
                        }
                        if (stackTrace[i2].getMethodName().equals("invokeSuspend")) {
                            i2++;
                        }
                        if (i2 < stackTrace.length) {
                            StackTraceElement stackTraceElement3 = stackTrace[i2];
                            if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                                throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (Thread.currentThread().getId() != this.c.threadId) {
                    throw new IllegalStateException(ss9.a("Thread [", this.c.threadName, "] opened scope, but thread [", Thread.currentThread().getName(), "] closed it"), this.c);
                }
                this.b.close();
            } catch (Throwable th) {
                bVar2.a = null;
                bVar2.b = 0;
                throw th;
            }
        }

        public final String toString() {
            String message = this.c.getMessage();
            return message != null ? message : super.toString();
        }
    }

    public npm0(ipj ipjVar) {
        this.b = ipjVar;
    }

    public static AssertionError c(a aVar) {
        AssertionError assertionError = new AssertionError("Thread [" + aVar.threadName + "] opened a scope of " + aVar.context + " here:");
        assertionError.setStackTrace(aVar.getStackTrace());
        return assertionError;
    }

    public static npm0 h(ipj ipjVar) {
        return new npm0(ipjVar);
    }

    @Override // xsna.ipj
    public final v9h0 b(wmj wmjVar) {
        int i;
        v9h0 b2 = this.b.b(wmjVar);
        a aVar = new a(wmjVar);
        StackTraceElement[] stackTrace = aVar.getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement.getClassName().equals(wmj.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i = i2 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i3 = 1;
        while (i3 < stackTrace.length) {
            String className = stackTrace[i3].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i3++;
        }
        aVar.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3, stackTrace.length));
        return new c(b2, aVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b bVar;
        while (true) {
            bVar = this.c;
            Reference<? extends v9h0> poll = bVar.poll();
            if (poll == null) {
                break;
            } else {
                bVar.b.remove(poll);
            }
        }
        ConcurrentHashMap<gi.c<v9h0>, a> concurrentHashMap = bVar.c;
        List list = (List) concurrentHashMap.values().stream().filter(new opm0()).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            Level level = Level.SEVERE;
            Logger logger = d;
            logger.log(level, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                logger.log(Level.SEVERE, "Scope leaked", (Throwable) c((a) it.next()));
            }
        }
        throw c((a) list.get(0));
    }

    @Override // xsna.ipj
    public final wmj current() {
        return this.b.current();
    }
}
