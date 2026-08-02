package androidx.room.coroutines;

import defpackage.ny61;
import defpackage.oll0;
import defpackage.pnq0;
import defpackage.qnq0;
import defpackage.rcc;
import defpackage.sls;
import defpackage.u5e;
import defpackage.vez0;
import defpackage.x43;
import defpackage.zo1;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class e {
    public final int a;
    public final sls b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final u5e[] f;
    public final pnq0 g;
    public final x43 h;

    public e(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
        this.f = new u5e[i];
        this.g = qnq0.a(i);
        this.h = new x43(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0083), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0083), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Pool$acquire$1 pool$acquire$1;
        int i;
        pnq0 pnq0Var;
        ReentrantLock reentrantLock;
        x43 x43Var = this.h;
        try {
            try {
                if (continuationImpl instanceof Pool$acquire$1) {
                    pool$acquire$1 = (Pool$acquire$1) continuationImpl;
                    int i2 = pool$acquire$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pool$acquire$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = pool$acquire$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = pool$acquire$1.label;
                        pnq0Var = this.g;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            pool$acquire$1.label = 1;
                            if (pnq0Var.b(pool$acquire$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                        }
                        reentrantLock = this.c;
                        reentrantLock.lock();
                        if (!this.e) {
                            vez0.Y(21, "Connection pool is closed");
                            throw null;
                        }
                        if (x43Var.isEmpty() && this.d < this.a) {
                            u5e u5eVar = new u5e((oll0) this.b.invoke());
                            u5e[] u5eVarArr = this.f;
                            int i3 = this.d;
                            this.d = i3 + 1;
                            u5eVarArr[i3] = u5eVar;
                            x43Var.addLast(u5eVar);
                        }
                        return (u5e) x43Var.removeLast();
                    }
                }
                if (!this.e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.c;
            reentrantLock.lock();
        } catch (Throwable th) {
            pnq0Var.f();
            throw th;
        }
        pool$acquire$1 = new Pool$acquire$1(this, continuationImpl);
        Object obj2 = pool$acquire$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pool$acquire$1.label;
        pnq0Var = this.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r11 = r11;
        r10 = r10;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:14:0x0067, B:16:0x006b, B:30:0x0073, B:33:0x007a), top: B:13:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v11, types: [sls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0056 -> B:12:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, zo1 zo1Var, ContinuationImpl continuationImpl) {
        Pool$acquireWithTimeout$1 pool$acquireWithTimeout$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Pool$acquireWithTimeout$1 pool$acquireWithTimeout$12;
        Throwable th;
        Pool$acquireWithTimeout$2 pool$acquireWithTimeout$2;
        zo1 zo1Var2;
        if (continuationImpl instanceof Pool$acquireWithTimeout$1) {
            pool$acquireWithTimeout$1 = (Pool$acquireWithTimeout$1) continuationImpl;
            int i2 = pool$acquireWithTimeout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pool$acquireWithTimeout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pool$acquireWithTimeout$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pool$acquireWithTimeout$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    pool$acquireWithTimeout$2 = new Pool$acquireWithTimeout$2(ref$ObjectRef2, this, null);
                    pool$acquireWithTimeout$1.L$0 = zo1Var;
                    pool$acquireWithTimeout$1.L$1 = ref$ObjectRef2;
                    pool$acquireWithTimeout$1.J$0 = j;
                    pool$acquireWithTimeout$1.label = 1;
                    if (kotlinx.coroutines.a.v(j, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = pool$acquireWithTimeout$1.J$0;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) pool$acquireWithTimeout$1.L$1;
                    ?? r2 = (sls) pool$acquireWithTimeout$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        zo1Var2 = r2;
                    } catch (Throwable th2) {
                        ref$ObjectRef = ref$ObjectRef3;
                        zo1Var = r2;
                        pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                        th = th2;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    zo1Var = zo1Var2;
                    pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                    th = null;
                    try {
                        if (th instanceof TimeoutCancellationException) {
                            zo1Var.invoke();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = ref$ObjectRef.element;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        pool$acquireWithTimeout$1 = pool$acquireWithTimeout$12;
                        Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
                        pool$acquireWithTimeout$2 = new Pool$acquireWithTimeout$2(ref$ObjectRef22, this, null);
                        pool$acquireWithTimeout$1.L$0 = zo1Var;
                        pool$acquireWithTimeout$1.L$1 = ref$ObjectRef22;
                        pool$acquireWithTimeout$1.J$0 = j;
                        pool$acquireWithTimeout$1.label = 1;
                        if (kotlinx.coroutines.a.v(j, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        zo1Var2 = zo1Var;
                        ref$ObjectRef3 = ref$ObjectRef22;
                        ref$ObjectRef = ref$ObjectRef3;
                        zo1Var = zo1Var2;
                        pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                        th = null;
                        if (th instanceof TimeoutCancellationException) {
                        }
                        pool$acquireWithTimeout$1 = pool$acquireWithTimeout$12;
                        Ref$ObjectRef ref$ObjectRef222 = new Ref$ObjectRef();
                        pool$acquireWithTimeout$2 = new Pool$acquireWithTimeout$2(ref$ObjectRef222, this, null);
                        pool$acquireWithTimeout$1.L$0 = zo1Var;
                        pool$acquireWithTimeout$1.L$1 = ref$ObjectRef222;
                        pool$acquireWithTimeout$1.J$0 = j;
                        pool$acquireWithTimeout$1.label = 1;
                        if (kotlinx.coroutines.a.v(j, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) == coroutineSingletons) {
                        }
                    } catch (Throwable th3) {
                        u5e u5eVar = (u5e) ref$ObjectRef.element;
                        if (u5eVar != null) {
                            e(u5eVar);
                        }
                        throw th3;
                    }
                }
            }
        }
        pool$acquireWithTimeout$1 = new Pool$acquireWithTimeout$1(this, continuationImpl);
        Object obj3 = pool$acquireWithTimeout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pool$acquireWithTimeout$1.label;
        if (i != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (u5e u5eVar : this.f) {
                if (u5eVar != null) {
                    u5eVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        x43 x43Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            ListBuilder a = rcc.a();
            int size = x43Var.size();
            for (int i = 0; i < size; i++) {
                a.add(x43Var.get(i));
            }
            ListBuilder j = a.j();
            sb.append('\t' + toString() + Extension.O_BRAKE_SPACE);
            sb.append("capacity=" + this.a + Extension.FIX_SPACE);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            pnq0 pnq0Var = this.g;
            pnq0Var.getClass();
            sb2.append(Math.max(kotlinx.coroutines.sync.b.z.get(pnq0Var), 0));
            sb2.append(Extension.FIX_SPACE);
            sb.append(sb2.toString());
            sb.append("queue=(size=" + j.size() + ")[" + kotlin.collections.a.X(j, null, null, null, null, 63) + ']');
            sb.append(Extension.C_BRAKE);
            sb.append('\n');
            u5e[] u5eVarArr = this.f;
            int length = u5eVarArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                u5e u5eVar = u5eVarArr[i3];
                i2++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i2);
                sb3.append("] - ");
                sb3.append(u5eVar != null ? u5eVar.a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (u5eVar != null) {
                    u5eVar.e(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(u5e u5eVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(u5eVar);
            reentrantLock.unlock();
            this.g.f();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
