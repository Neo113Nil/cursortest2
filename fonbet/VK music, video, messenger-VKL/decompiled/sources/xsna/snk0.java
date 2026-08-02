package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.sse.SseFailureException;
import java.io.InterruptedIOException;
import xsna.nnk0;

/* compiled from: SseEventSourceImpl.kt */
/* loaded from: classes3.dex */
public final class snk0 implements onk0 {
    public final okhttp3.o b;
    public final okhttp3.p c;
    public f8f0 d;
    public okhttp3.u e;
    public unk0 f;
    public volatile boolean g = true;
    public volatile a h = a.READY_TO_CONNECT;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SseEventSourceImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLOSED;
        public static final a OPENED;
        public static final a READY_TO_CONNECT;

        static {
            a aVar = new a("READY_TO_CONNECT", 0);
            READY_TO_CONNECT = aVar;
            a aVar2 = new a("OPENED", 1);
            OPENED = aVar2;
            a aVar3 = new a("CLOSED", 2);
            CLOSED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
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
    }

    /* compiled from: SseEventSourceImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.READY_TO_CONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public snk0(okhttp3.o oVar, okhttp3.p pVar) {
        this.b = oVar;
        this.c = pVar;
    }

    public final nnk0.c a() {
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"sse-request-executor", "sse connect"});
        }
        okhttp3.d a2 = this.b.a(this.c);
        synchronized (this) {
            this.d = (f8f0) a2;
            s3q0 s3q0Var = s3q0.a;
        }
        okhttp3.u execute = ((f8f0) a2).execute();
        synchronized (this) {
            this.e = execute;
        }
        if (!execute.t()) {
            x2r0.c(execute);
            throw new SseFailureException("Can't init sse " + execute.e + ' ' + execute.d, 2);
        }
        l.getClass();
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"sse-request-executor", "sse connect is successful"});
        }
        okhttp3.v vVar = execute.h;
        okhttp3.m contentType = vVar.contentType();
        if (contentType == null || !contentType.b.equals("text") || !contentType.c.equals("event-stream")) {
            throw new SseFailureException("Invalid content-type: " + vVar.contentType(), 2);
        }
        ((f8f0) a2).j();
        this.f = new unk0(vVar.source());
        this.h = a.OPENED;
        l.getClass();
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"sse-request-executor", "sse connect is opened"});
        }
        return nnk0.c.a;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nnk0 next() {
        if (!this.g) {
            throw new IllegalStateException("Trying to get next event while hasNext is false");
        }
        boolean z = true;
        try {
            int i = b.$EnumSwitchMapping$0[this.h.ordinal()];
            if (i == 1) {
                return a();
            }
            if (i == 2) {
                return c();
            }
            throw new IllegalStateException("Trying to get next event from the closed event source");
        } catch (Throwable th) {
            synchronized (this) {
                try {
                    f8f0 f8f0Var = this.d;
                    if (f8f0Var == null || !f8f0Var.q) {
                        z = false;
                    }
                    s3q0 s3q0Var = s3q0.a;
                    L l = L.a;
                    l.getClass();
                    LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"sse-request-executor", "sse onClosed"});
                    }
                    this.g = false;
                    this.h = a.CLOSED;
                    cancel();
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.w(l, L.LogType.e, th, new Object[]{"sse-request-executor", "sse request failed"}, null, null, 24);
                    }
                    if (!z) {
                        throw th;
                    }
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    throw new InterruptedIOException(message);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final nnk0 c() {
        unk0 unk0Var = this.f;
        if (unk0Var == null) {
            unk0Var = null;
        }
        unk0Var.getClass();
        vl8 vl8Var = new vl8();
        try {
            nnk0 a2 = unk0Var.a(vl8Var);
            if (a2 != null) {
                if (a2 instanceof nnk0.b) {
                    nnk0.b bVar = (nnk0.b) a2;
                    if ("error".equalsIgnoreCase(bVar.b)) {
                        throw new SseFailureException(bVar.toString(), 2);
                    }
                }
                return a2;
            }
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"sse-request-executor", "sse onClosed"});
            }
            this.g = false;
            this.h = a.CLOSED;
            cancel();
            return nnk0.a.a;
        } finally {
            x2r0.c(vl8Var);
        }
    }

    @Override // xsna.onk0
    public final void cancel() {
        this.g = false;
        this.h = a.CLOSED;
        synchronized (this) {
            try {
                f8f0 f8f0Var = this.d;
                if (f8f0Var != null) {
                    f8f0Var.cancel();
                }
                okhttp3.u uVar = this.e;
                if (uVar != null) {
                    x2r0.c(uVar);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
