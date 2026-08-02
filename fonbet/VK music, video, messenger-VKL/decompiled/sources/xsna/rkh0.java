package xsna;

import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.sdk.common.internal.AttributesMap;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.lpw;

/* compiled from: SdkSpan.java */
/* loaded from: classes8.dex */
public final class rkh0 implements q7f0 {
    public static final Logger u = Logger.getLogger(rkh0.class.getName());
    public final zhk0 a;
    public final sm5 b;
    public final qhk0 c;
    public final fik0 d;
    public final n1q e;
    public final SpanKind f;
    public final bz1 g;
    public final gag0 h;
    public final q8x i;
    public final long j;
    public final Runnable k;
    public String m;
    public AttributesMap n;
    public ArrayList o;
    public long r;
    public Thread t;
    public final Object l = new Object();
    public int p = 0;
    public tm5 q = lpw.b;
    public a s = a.NOT_ENDED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SdkSpan.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ENDED;
        public static final a ENDING;
        public static final a NOT_ENDED;

        static {
            a aVar = new a("NOT_ENDED", 0);
            NOT_ENDED = aVar;
            a aVar2 = new a("ENDING", 1);
            ENDING = aVar2;
            a aVar3 = new a(SignalingProtocol.STATE_ENDED, 2);
            ENDED = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
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

    public rkh0(sm5 sm5Var, String str, q8x q8xVar, SpanKind spanKind, qhk0 qhk0Var, zhk0 zhk0Var, fik0 fik0Var, n1q n1qVar, bz1 bz1Var, gag0 gag0Var, AttributesMap attributesMap, long j, Runnable runnable) {
        this.b = sm5Var;
        this.i = q8xVar;
        this.c = qhk0Var;
        this.m = str;
        this.f = spanKind;
        this.d = fik0Var;
        this.e = n1qVar;
        this.h = gag0Var;
        this.g = bz1Var;
        this.j = j;
        this.n = attributesMap;
        this.a = zhk0Var;
        this.k = runnable;
    }

    @Override // xsna.ohk0
    public final void c(String str) {
        if (str == null) {
            return;
        }
        p(new gm5(str, jk3.e, this.g.a(), 0));
    }

    @Override // xsna.ohk0
    public final ohk0 e(StatusCode statusCode, String str) {
        tm5 tm5Var;
        if (statusCode == null) {
            return this;
        }
        synchronized (this.l) {
            try {
                if (!q()) {
                    u.log(Level.FINE, "Calling setStatus() on an ended Span.");
                    return this;
                }
                if (this.q.d == StatusCode.OK) {
                    u.log(Level.FINE, "Calling setStatus() on a Span that is already set to OK.");
                    return this;
                }
                if (statusCode == StatusCode.UNSET) {
                    u.log(Level.FINE, "Ignoring call to setStatus() with status UNSET.");
                    return this;
                }
                if (statusCode != StatusCode.ERROR) {
                    u.log(Level.FINE, "Ignoring setStatus() description since status is not ERROR.");
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                tm5 tm5Var2 = lpw.a;
                if (str.isEmpty()) {
                    int i = lpw.a.a[statusCode.ordinal()];
                    if (i == 1) {
                        tm5Var = lpw.b;
                    } else if (i == 2) {
                        tm5Var = lpw.a;
                    } else if (i == 3) {
                        tm5Var = lpw.c;
                    }
                    this.q = tm5Var;
                    return this;
                }
                tm5Var = new tm5(statusCode, str);
                this.q = tm5Var;
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ohk0
    public final void end() {
        long a2 = this.g.a();
        synchronized (this.l) {
            try {
                if (this.s != a.NOT_ENDED) {
                    u.log(Level.FINE, "Calling end() on an ended or ending Span.");
                    return;
                }
                this.r = a2;
                this.t = Thread.currentThread();
                this.s = a.ENDING;
                this.k.run();
                fik0 fik0Var = this.d;
                if (fik0Var instanceof qcq) {
                    qcq qcqVar = (qcq) fik0Var;
                    if (qcqVar.I2()) {
                        qcqVar.h3(this);
                    }
                }
                synchronized (this.l) {
                    this.s = a.ENDED;
                    this.t = null;
                }
                if (this.d.isEndRequired()) {
                    this.d.onEnd(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ohk0
    public final void f(Throwable th) {
        r(th, jk3.e);
    }

    @Override // xsna.ohk0
    public final ohk0 g(String str) {
        if (str == null) {
            return this;
        }
        synchronized (this.l) {
            try {
                if (q()) {
                    this.m = str;
                    return this;
                }
                u.log(Level.FINE, "Calling updateName() on an ended Span.");
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ohk0
    /* renamed from: h */
    public final ohk0 a(i94 i94Var, Object obj) {
        if (i94Var == null || i94Var.getKey().isEmpty() || obj == null) {
            return this;
        }
        synchronized (this.l) {
            try {
                if (!q()) {
                    u.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                    return this;
                }
                if (this.n == null) {
                    this.n = new AttributesMap(this.a.b(), this.a.a());
                }
                this.n.put(i94Var, obj);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ohk0
    public final qhk0 i() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (xsna.p94.a(r11.i().values(), new xsna.j94(r0)) != false) goto L15;
     */
    @Override // xsna.ohk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ohk0 j(String str, q94 q94Var) {
        if (str == null) {
            return this;
        }
        if (q94Var == null) {
            q94Var = jk3.e;
        }
        int size = q94Var.size();
        long a2 = this.g.a();
        zhk0 zhk0Var = this.a;
        int c = zhk0Var.c();
        final int a3 = zhk0Var.a();
        if (q94Var.isEmpty() || q94Var.size() <= c) {
            if (a3 != Integer.MAX_VALUE) {
            }
            p(new gm5(str, q94Var, a2, size));
            return this;
        }
        lk3 lk3Var = new lk3();
        int i = 0;
        for (Map.Entry<i94<?>, Object> entry : q94Var.i().entrySet()) {
            if (i >= c) {
                break;
            }
            lk3Var.f(entry.getKey(), p94.b(a3, entry.getValue()));
            i++;
        }
        q94Var = lk3Var.e();
        p(new gm5(str, q94Var, a2, size));
        return this;
    }

    @Override // xsna.ohk0
    public final /* bridge */ /* synthetic */ ohk0 n(Throwable th, q94 q94Var) {
        r(th, q94Var);
        return this;
    }

    public final void p(pyp pypVar) {
        synchronized (this.l) {
            try {
                if (!q()) {
                    u.log(Level.FINE, "Calling addEvent() on an ended Span.");
                    return;
                }
                if (this.o == null) {
                    this.o = new ArrayList();
                }
                if (this.o.size() < this.a.e()) {
                    this.o.add(pypVar);
                }
                this.p++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q() {
        a aVar = this.s;
        if (aVar != a.NOT_ENDED) {
            return aVar == a.ENDING && Thread.currentThread() == this.t;
        }
        return true;
    }

    public final void r(Throwable th, q94 q94Var) {
        String substring;
        if (th == null) {
            return;
        }
        if (q94Var == null) {
            q94Var = jk3.e;
        }
        zhk0 zhk0Var = this.a;
        int a2 = zhk0Var.a();
        final AttributesMap attributesMap = new AttributesMap(zhk0Var.b(), zhk0Var.a());
        oel oelVar = (oel) this.e;
        oelVar.getClass();
        String canonicalName = th.getClass().getCanonicalName();
        if (canonicalName != null) {
            attributesMap.put(n1q.a, canonicalName);
        }
        String message = th.getMessage();
        if (message != null) {
            attributesMap.put(n1q.b, message);
        }
        if (oelVar.d) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                printWriter.close();
                substring = stringWriter.toString();
            } finally {
            }
        } else {
            v6q0 v6q0Var = new v6q0(th, a2);
            StringBuilder sb = (StringBuilder) v6q0Var.d;
            if (sb.length() == 0) {
                sb.append(th);
                sb.append(System.lineSeparator());
                if (!v6q0Var.b()) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    int length = stackTrace.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            StackTraceElement stackTraceElement = stackTrace[i];
                            sb.append("\tat ");
                            sb.append(stackTraceElement);
                            sb.append(System.lineSeparator());
                            if (v6q0Var.b()) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                            newSetFromMap.add(th);
                            for (Throwable th2 : th.getSuppressed()) {
                                v6q0Var.a(stackTrace, th2, "\t", "Suppressed: ", newSetFromMap);
                            }
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                v6q0Var.a(stackTrace, cause, "", "Caused by: ", newSetFromMap);
                            }
                        }
                    }
                }
            }
            substring = sb.substring(0, Math.min(sb.length(), v6q0Var.c));
        }
        attributesMap.put(n1q.c, substring);
        q94Var.forEach(new BiConsumer() { // from class: xsna.qkh0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AttributesMap.this.put((i94) obj, obj2);
            }
        });
        p(new hm5(attributesMap, this.g.a(), attributesMap.l(), th));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0023, B:9:0x0027, B:12:0x002e, B:14:0x0034, B:16:0x004d, B:19:0x0059, B:22:0x0068, B:23:0x006f, B:27:0x0054, B:28:0x0038, B:29:0x004a, B:30:0x000b, B:32:0x0011, B:34:0x0017), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final un5 s() {
        List unmodifiableList;
        q94 q94Var;
        un5 un5Var;
        synchronized (this.l) {
            List list = Collections.EMPTY_LIST;
            ArrayList arrayList = this.o;
            if (arrayList == null) {
                unmodifiableList = list;
            } else {
                unmodifiableList = this.s == a.ENDED ? Collections.unmodifiableList(arrayList) : Collections.unmodifiableList(new ArrayList(this.o));
            }
            AttributesMap attributesMap = this.n;
            if (attributesMap != null && !attributesMap.isEmpty()) {
                if (this.s == a.ENDED) {
                    q94Var = this.n;
                } else {
                    AttributesMap attributesMap2 = this.n;
                    attributesMap2.getClass();
                    lk3 lk3Var = new lk3();
                    lk3Var.g(attributesMap2);
                    q94Var = lk3Var.e();
                }
                q94 q94Var2 = q94Var;
                AttributesMap attributesMap3 = this.n;
                un5Var = new un5(this, list, unmodifiableList, q94Var2, attributesMap3 != null ? 0 : attributesMap3.l(), this.p, this.q, this.m, this.r, this.s == a.ENDED);
            }
            q94Var = jk3.e;
            q94 q94Var22 = q94Var;
            AttributesMap attributesMap32 = this.n;
            un5Var = new un5(this, list, unmodifiableList, q94Var22, attributesMap32 != null ? 0 : attributesMap32.l(), this.p, this.q, this.m, this.r, this.s == a.ENDED);
        }
        return un5Var;
    }

    public final String toString() {
        String str;
        String valueOf;
        String valueOf2;
        long j;
        long j2;
        synchronized (this.l) {
            str = this.m;
            valueOf = String.valueOf(this.n);
            valueOf2 = String.valueOf(this.q);
            j = this.p;
            j2 = this.r;
        }
        StringBuilder sb = new StringBuilder("SdkSpan{traceId=");
        sb.append(this.b.b);
        sb.append(", spanId=");
        sb.append(this.b.c);
        sb.append(", parentSpanContext=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(str);
        sb.append(", kind=");
        sb.append(this.f);
        sb.append(", attributes=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(valueOf2);
        sb.append(", totalRecordedEvents=");
        sb.append(j);
        sb.append(", totalRecordedLinks=0, startEpochNanos=");
        sb.append(this.j);
        return e630.c(sb, ", endEpochNanos=", j2, "}");
    }
}
