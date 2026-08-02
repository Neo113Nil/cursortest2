package xsna;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: ConnectionPoolImpl.kt */
/* loaded from: classes12.dex */
public final class cvb0 {
    public final int a;
    public final gzs<hyg0> b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final p4j[] f;
    public final dhi0 g;
    public final edc<p4j> h;

    /* JADX WARN: Multi-variable type inference failed */
    public cvb0(int i, gzs<? extends hyg0> gzsVar) {
        this.a = i;
        this.b = gzsVar;
        this.f = new p4j[i];
        int i2 = ehi0.a;
        this.g = new dhi0(i);
        this.h = new edc<>(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[Catch: all -> 0x0086, TryCatch #1 {all -> 0x0086, blocks: (B:13:0x004b, B:15:0x004f, B:19:0x0059, B:22:0x0060, B:23:0x007a, B:28:0x0088, B:29:0x0090), top: B:12:0x004b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #1 {all -> 0x0086, blocks: (B:13:0x004b, B:15:0x004f, B:19:0x0059, B:22:0x0060, B:23:0x007a, B:28:0x0088, B:29:0x0090), top: B:12:0x004b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        xub0 xub0Var;
        int i;
        cvb0 cvb0Var;
        ReentrantLock reentrantLock;
        try {
            try {
                if (continuationImpl instanceof xub0) {
                    xub0Var = (xub0) continuationImpl;
                    int i2 = xub0Var.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xub0Var.label = i2 - Integer.MIN_VALUE;
                        Object obj = xub0Var.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = xub0Var.label;
                        boolean z = true;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            xub0Var.L$0 = this;
                            xub0Var.label = 1;
                            if (this.g.a(xub0Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            cvb0Var = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cvb0Var = (cvb0) xub0Var.L$0;
                            kotlin.a.a(obj);
                        }
                        reentrantLock = cvb0Var.c;
                        edc<p4j> edcVar = cvb0Var.h;
                        reentrantLock.lock();
                        if (!cvb0Var.e) {
                            p7i.g(21, "Connection pool is closed");
                            throw null;
                        }
                        if (edcVar.b != edcVar.c) {
                            z = false;
                        }
                        if (z && cvb0Var.d < cvb0Var.a) {
                            p4j p4jVar = new p4j(cvb0Var.b.invoke());
                            p4j[] p4jVarArr = cvb0Var.f;
                            int i3 = cvb0Var.d;
                            cvb0Var.d = i3 + 1;
                            p4jVarArr[i3] = p4jVar;
                            edcVar.a(p4jVar);
                        }
                        return edcVar.c();
                    }
                }
                if (!cvb0Var.e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = cvb0Var.c;
            edc<p4j> edcVar2 = cvb0Var.h;
            reentrantLock.lock();
        } catch (Throwable th) {
            cvb0Var.g.release();
            throw th;
        }
        xub0Var = new xub0(this, continuationImpl);
        Object obj2 = xub0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xub0Var.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:9|10|11|12|13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r13 = r13;
        r12 = r12;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:14:0x0076, B:16:0x007a, B:30:0x0082, B:33:0x0089), top: B:13:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v11, types: [xsna.gzs] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0063 -> B:12:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, y1j y1jVar, ContinuationImpl continuationImpl) {
        yub0 yub0Var;
        int i;
        cvb0 cvb0Var;
        Ref$ObjectRef ref$ObjectRef;
        yub0 yub0Var2;
        Throwable th;
        zub0 zub0Var;
        y1j y1jVar2;
        if (continuationImpl instanceof yub0) {
            yub0Var = (yub0) continuationImpl;
            int i2 = yub0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yub0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = yub0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yub0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    cvb0Var = this;
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    zub0Var = new zub0(ref$ObjectRef2, cvb0Var, null);
                    yub0Var.L$0 = cvb0Var;
                    yub0Var.L$1 = y1jVar;
                    yub0Var.L$2 = ref$ObjectRef2;
                    yub0Var.J$0 = j;
                    yub0Var.label = 1;
                    if (oxo0.b(qsl.e(j), zub0Var, yub0Var) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = yub0Var.J$0;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) yub0Var.L$2;
                    ?? r2 = (gzs) yub0Var.L$1;
                    cvb0Var = (cvb0) yub0Var.L$0;
                    try {
                        kotlin.a.a(obj);
                        y1jVar2 = r2;
                    } catch (Throwable th2) {
                        ref$ObjectRef = ref$ObjectRef3;
                        y1jVar = r2;
                        yub0Var2 = yub0Var;
                        th = th2;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    y1jVar = y1jVar2;
                    yub0Var2 = yub0Var;
                    th = null;
                    try {
                        if (th instanceof TimeoutCancellationException) {
                            y1jVar.invoke();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = ref$ObjectRef.element;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        yub0Var = yub0Var2;
                        Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
                        zub0Var = new zub0(ref$ObjectRef22, cvb0Var, null);
                        yub0Var.L$0 = cvb0Var;
                        yub0Var.L$1 = y1jVar;
                        yub0Var.L$2 = ref$ObjectRef22;
                        yub0Var.J$0 = j;
                        yub0Var.label = 1;
                        if (oxo0.b(qsl.e(j), zub0Var, yub0Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        y1jVar2 = y1jVar;
                        ref$ObjectRef3 = ref$ObjectRef22;
                        ref$ObjectRef = ref$ObjectRef3;
                        y1jVar = y1jVar2;
                        yub0Var2 = yub0Var;
                        th = null;
                        if (th instanceof TimeoutCancellationException) {
                        }
                        yub0Var = yub0Var2;
                        Ref$ObjectRef ref$ObjectRef222 = new Ref$ObjectRef();
                        zub0Var = new zub0(ref$ObjectRef222, cvb0Var, null);
                        yub0Var.L$0 = cvb0Var;
                        yub0Var.L$1 = y1jVar;
                        yub0Var.L$2 = ref$ObjectRef222;
                        yub0Var.J$0 = j;
                        yub0Var.label = 1;
                        if (oxo0.b(qsl.e(j), zub0Var, yub0Var) == coroutineSingletons) {
                        }
                    } catch (Throwable th3) {
                        p4j p4jVar = (p4j) ref$ObjectRef.element;
                        if (p4jVar != null) {
                            cvb0Var.e(p4jVar);
                        }
                        throw th3;
                    }
                }
            }
        }
        yub0Var = new yub0(this, continuationImpl);
        Object obj3 = yub0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yub0Var.label;
        if (i != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (p4j p4jVar : this.f) {
                if (p4jVar != null) {
                    p4jVar.close();
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        edc<p4j> edcVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            ListBuilder e = e43.e();
            int d = edcVar.d();
            for (int i = 0; i < d; i++) {
                if (i < 0 || i >= edcVar.d()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                e.add(edcVar.a[(edcVar.b + i) & edcVar.d]);
            }
            ListBuilder g = e.g();
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            dhi0 dhi0Var = this.g;
            dhi0Var.getClass();
            sb2.append(Math.max(bhi0.h.get(dhi0Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + g.size() + ")[" + j5g.g0(g, null, null, null, 0, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            p4j[] p4jVarArr = this.f;
            int length = p4jVarArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                p4j p4jVar = p4jVarArr[i3];
                i2++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i2);
                sb3.append("] - ");
                sb3.append(p4jVar != null ? p4jVar.b.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (p4jVar != null) {
                    p4jVar.h(sb);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(p4j p4jVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(p4jVar);
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            this.g.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
