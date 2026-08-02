package androidx.room.coroutines;

import defpackage.ayy0;
import defpackage.cvw;
import defpackage.e3n;
import defpackage.e5e;
import defpackage.fse;
import defpackage.h0w;
import defpackage.kp50;
import defpackage.lyc;
import defpackage.ny61;
import defpackage.o430;
import defpackage.sls;
import defpackage.tje;
import defpackage.u4e;
import defpackage.u5e;
import defpackage.v4e;
import defpackage.vez0;
import defpackage.wls;
import defpackage.zo1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;

/* loaded from: classes10.dex */
public final class a implements e5e {
    public final e a;
    public final e b;
    public final v4e c = new v4e();
    public final ThreadLocal w = new ThreadLocal();
    public volatile boolean x;
    public final long y;
    public final int z;

    public a(final h0w h0wVar, final String str, int i) {
        o430 o430Var = e3n.b;
        this.y = kp50.U(30, DurationUnit.SECONDS);
        this.z = 2;
        if (i <= 0) {
            ny61.g("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.a = new e(i, new sls() { // from class: f5e
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                h0w h0wVar2 = h0wVar;
                switch (i3) {
                    case 0:
                        oll0 c = h0wVar2.c(str2);
                        vez0.s(c, "PRAGMA query_only = 1");
                        return c;
                    default:
                        return h0wVar2.c(str2);
                }
            }
        });
        final int i3 = 1;
        this.b = new e(1, new sls() { // from class: f5e
            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                String str2 = str;
                h0w h0wVar2 = h0wVar;
                switch (i32) {
                    case 0:
                        oll0 c = h0wVar2.c(str2);
                        vez0.s(c, "PRAGMA query_only = 1");
                        return c;
                    default:
                        return h0wVar2.c(str2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #4 {all -> 0x019a, blocks: (B:55:0x0122, B:59:0x0138, B:61:0x0143, B:65:0x019e, B:66:0x01a5), top: B:54:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e A[Catch: all -> 0x019a, TRY_ENTER, TryCatch #4 {all -> 0x019a, blocks: (B:55:0x0122, B:59:0x0138, B:61:0x0143, B:65:0x019e, B:66:0x01a5), top: B:54:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, androidx.room.coroutines.f] */
    @Override // defpackage.e5e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(boolean z, wls wlsVar, ContinuationImpl continuationImpl) {
        ConnectionPoolImpl$useConnection$1 connectionPoolImpl$useConnection$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        e eVar;
        wls wlsVar2;
        fse fseVar;
        v4e v4eVar;
        e eVar2;
        Ref$ObjectRef ref$ObjectRef2;
        T t;
        Ref$ObjectRef ref$ObjectRef3;
        f fVar;
        boolean z2 = z;
        try {
            if (continuationImpl instanceof ConnectionPoolImpl$useConnection$1) {
                connectionPoolImpl$useConnection$1 = (ConnectionPoolImpl$useConnection$1) continuationImpl;
                int i2 = connectionPoolImpl$useConnection$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    connectionPoolImpl$useConnection$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = connectionPoolImpl$useConnection$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = connectionPoolImpl$useConnection$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (this.x) {
                            vez0.Y(21, "Connection pool is closed");
                            throw null;
                        }
                        f fVar2 = (f) this.w.get();
                        if (fVar2 == null) {
                            u4e u4eVar = (u4e) connectionPoolImpl$useConnection$1.get_context().get(this.c);
                            fVar2 = u4eVar != null ? u4eVar.b : null;
                        }
                        if (fVar2 == null) {
                            e eVar3 = z2 ? this.a : this.b;
                            ref$ObjectRef = new Ref$ObjectRef();
                            try {
                                fse fseVar2 = connectionPoolImpl$useConnection$1.get_context();
                                v4e v4eVar2 = this.c;
                                long j = this.y;
                                zo1 zo1Var = new zo1(this, z2, 5);
                                connectionPoolImpl$useConnection$1.L$0 = wlsVar;
                                connectionPoolImpl$useConnection$1.L$1 = eVar3;
                                connectionPoolImpl$useConnection$1.L$2 = ref$ObjectRef;
                                connectionPoolImpl$useConnection$1.L$3 = fseVar2;
                                connectionPoolImpl$useConnection$1.L$4 = ref$ObjectRef;
                                connectionPoolImpl$useConnection$1.L$5 = v4eVar2;
                                connectionPoolImpl$useConnection$1.Z$0 = z2;
                                connectionPoolImpl$useConnection$1.label = 3;
                                Object b = eVar3.b(j, zo1Var, connectionPoolImpl$useConnection$1);
                                if (b != coroutineSingletons) {
                                    wlsVar2 = wlsVar;
                                    fseVar = fseVar2;
                                    v4eVar = v4eVar2;
                                    eVar2 = eVar3;
                                    obj = b;
                                    ref$ObjectRef2 = ref$ObjectRef;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                eVar = eVar3;
                                throw th;
                            }
                        } else {
                            if (!z2 && fVar2.c) {
                                vez0.Y(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (connectionPoolImpl$useConnection$1.get_context().get(this.c) == null) {
                                fse U = cvw.U(new u4e(this.c, fVar2), new ayy0(fVar2, this.w));
                                ConnectionPoolImpl$useConnection$2 connectionPoolImpl$useConnection$2 = new ConnectionPoolImpl$useConnection$2(wlsVar, fVar2, null);
                                connectionPoolImpl$useConnection$1.label = 1;
                                Object k0 = tje.k0(U, connectionPoolImpl$useConnection$2, connectionPoolImpl$useConnection$1);
                                if (k0 != coroutineSingletons) {
                                    return k0;
                                }
                            } else {
                                connectionPoolImpl$useConnection$1.label = 2;
                                Object invoke = wlsVar.invoke(fVar2, connectionPoolImpl$useConnection$1);
                                if (invoke != coroutineSingletons) {
                                    return invoke;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i == 3) {
                        z2 = connectionPoolImpl$useConnection$1.Z$0;
                        v4eVar = (v4e) connectionPoolImpl$useConnection$1.L$5;
                        Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) connectionPoolImpl$useConnection$1.L$4;
                        fseVar = (fse) connectionPoolImpl$useConnection$1.L$3;
                        Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) connectionPoolImpl$useConnection$1.L$2;
                        eVar2 = (e) connectionPoolImpl$useConnection$1.L$1;
                        wlsVar2 = (wls) connectionPoolImpl$useConnection$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            ref$ObjectRef2 = ref$ObjectRef4;
                            ref$ObjectRef = ref$ObjectRef5;
                        } catch (Throwable th3) {
                            th = th3;
                            ref$ObjectRef = ref$ObjectRef5;
                            eVar = eVar2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef3 = (Ref$ObjectRef) connectionPoolImpl$useConnection$1.L$1;
                        eVar = (e) connectionPoolImpl$useConnection$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            fVar = (f) ref$ObjectRef3.element;
                            if (fVar != null) {
                                if (!fVar.e) {
                                    fVar.e = true;
                                    if (fVar.b.a.A()) {
                                        vez0.s(fVar.b, "ROLLBACK TRANSACTION");
                                    }
                                }
                                u5e u5eVar = fVar.b;
                                u5eVar.c = null;
                                u5eVar.w = null;
                                eVar.e(u5eVar);
                            }
                            return obj;
                        } catch (Throwable th4) {
                            ref$ObjectRef = ref$ObjectRef3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    u5e u5eVar2 = (u5e) obj;
                    u5eVar2.c = fseVar;
                    u5eVar2.w = new Throwable();
                    ref$ObjectRef2.element = new f(v4eVar, u5eVar2, this.a == this.b && z2);
                    t = ref$ObjectRef.element;
                    if (t != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    f fVar3 = (f) t;
                    fse U2 = cvw.U(new u4e(this.c, fVar3), new ayy0(fVar3, this.w));
                    ConnectionPoolImpl$useConnection$4 connectionPoolImpl$useConnection$4 = new ConnectionPoolImpl$useConnection$4(wlsVar2, ref$ObjectRef, null);
                    connectionPoolImpl$useConnection$1.L$0 = eVar2;
                    connectionPoolImpl$useConnection$1.L$1 = ref$ObjectRef;
                    connectionPoolImpl$useConnection$1.L$2 = null;
                    connectionPoolImpl$useConnection$1.L$3 = null;
                    connectionPoolImpl$useConnection$1.L$4 = null;
                    connectionPoolImpl$useConnection$1.L$5 = null;
                    connectionPoolImpl$useConnection$1.label = 4;
                    obj = tje.k0(U2, connectionPoolImpl$useConnection$4, connectionPoolImpl$useConnection$1);
                    if (obj != coroutineSingletons) {
                        ref$ObjectRef3 = ref$ObjectRef;
                        eVar = eVar2;
                        fVar = (f) ref$ObjectRef3.element;
                        if (fVar != null) {
                        }
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            u5e u5eVar22 = (u5e) obj;
            u5eVar22.c = fseVar;
            u5eVar22.w = new Throwable();
            ref$ObjectRef2.element = new f(v4eVar, u5eVar22, this.a == this.b && z2);
            t = ref$ObjectRef.element;
            if (t != 0) {
            }
        } catch (Throwable th5) {
            th = th5;
            eVar = eVar2;
            throw th;
        }
        connectionPoolImpl$useConnection$1 = new ConnectionPoolImpl$useConnection$1(this, continuationImpl);
        Object obj2 = connectionPoolImpl$useConnection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = connectionPoolImpl$useConnection$1.label;
        if (i != 0) {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.a.c();
        this.b.c();
    }

    public a(h0w h0wVar) {
        o430 o430Var = e3n.b;
        this.y = kp50.U(30, DurationUnit.SECONDS);
        this.z = 2;
        e eVar = new e(1, new lyc(12, h0wVar));
        this.a = eVar;
        this.b = eVar;
    }
}
