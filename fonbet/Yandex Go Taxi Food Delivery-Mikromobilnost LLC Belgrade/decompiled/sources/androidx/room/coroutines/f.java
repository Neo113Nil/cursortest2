package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Transactor$SQLiteTransactionType;
import defpackage.a9i0;
import defpackage.e6e0;
import defpackage.f6e0;
import defpackage.g050;
import defpackage.g6e0;
import defpackage.gwk0;
import defpackage.h6e0;
import defpackage.ljo;
import defpackage.mg01;
import defpackage.ny61;
import defpackage.oll0;
import defpackage.tls;
import defpackage.u4e;
import defpackage.u5e;
import defpackage.v4e;
import defpackage.vez0;
import defpackage.wls;
import defpackage.x43;
import defpackage.ycc;
import defpackage.zy11;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class f implements mg01, a9i0 {
    public final v4e a;
    public final u5e b;
    public final boolean c;
    public final x43 d = new x43();
    public volatile boolean e;

    public f(v4e v4eVar, u5e u5eVar, boolean z) {
        this.a = v4eVar;
        this.b = u5eVar;
        this.c = z;
    }

    @Override // defpackage.a9i0
    public final oll0 a() {
        return this.b;
    }

    @Override // defpackage.mg01
    public final Object b(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, wls wlsVar, SuspendLambda suspendLambda) {
        if (this.e) {
            vez0.Y(21, "Connection is recycled");
            throw null;
        }
        u4e u4eVar = (u4e) suspendLambda.get_context().get(this.a);
        if (u4eVar != null && u4eVar.b == this) {
            return g(transactor$SQLiteTransactionType, wlsVar, suspendLambda);
        }
        vez0.Y(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.mg01
    public final Boolean c(Continuation continuation) {
        if (this.e) {
            vez0.Y(21, "Connection is recycled");
            throw null;
        }
        u4e u4eVar = (u4e) continuation.get_context().get(this.a);
        if (u4eVar != null && u4eVar.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.A());
        }
        vez0.Y(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v5, types: [g050] */
    @Override // defpackage.d6e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, tls tlsVar, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$usePrepared$1 pooledConnectionImpl$usePrepared$1;
        int i;
        u5e u5eVar;
        try {
            try {
                if (continuationImpl instanceof PooledConnectionImpl$usePrepared$1) {
                    pooledConnectionImpl$usePrepared$1 = (PooledConnectionImpl$usePrepared$1) continuationImpl;
                    int i2 = pooledConnectionImpl$usePrepared$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pooledConnectionImpl$usePrepared$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = pooledConnectionImpl$usePrepared$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = pooledConnectionImpl$usePrepared$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            if (this.e) {
                                vez0.Y(21, "Connection is recycled");
                                throw null;
                            }
                            u4e u4eVar = (u4e) pooledConnectionImpl$usePrepared$1.get_context().get(this.a);
                            if (u4eVar == null || u4eVar.b != this) {
                                vez0.Y(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            u5eVar = this.b;
                            pooledConnectionImpl$usePrepared$1.L$0 = str;
                            pooledConnectionImpl$usePrepared$1.L$1 = tlsVar;
                            pooledConnectionImpl$usePrepared$1.L$2 = u5eVar;
                            pooledConnectionImpl$usePrepared$1.label = 1;
                            if (u5eVar.b.a(pooledConnectionImpl$usePrepared$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ?? r7 = (g050) pooledConnectionImpl$usePrepared$1.L$2;
                            tlsVar = (tls) pooledConnectionImpl$usePrepared$1.L$1;
                            String str2 = (String) pooledConnectionImpl$usePrepared$1.L$0;
                            kotlin.b.b(obj);
                            u5eVar = r7;
                            str = str2;
                        }
                        e6e0 e6e0Var = new e6e0(this, this.b.T0(str));
                        Object invoke = tlsVar.invoke(e6e0Var);
                        gwk0.m(e6e0Var, null);
                        return invoke;
                    }
                }
                Object invoke2 = tlsVar.invoke(e6e0Var);
                gwk0.m(e6e0Var, null);
                return invoke2;
            } finally {
            }
            e6e0 e6e0Var2 = new e6e0(this, this.b.T0(str));
        } finally {
            u5eVar.d(null);
        }
        pooledConnectionImpl$usePrepared$1 = new PooledConnectionImpl$usePrepared$1(this, continuationImpl);
        Object obj2 = pooledConnectionImpl$usePrepared$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$usePrepared$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:11:0x0051, B:13:0x005b, B:19:0x006b, B:20:0x0099, B:24:0x0073, B:25:0x0078, B:26:0x0079, B:27:0x007f, B:28:0x0085), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:11:0x0051, B:13:0x005b, B:19:0x006b, B:20:0x0099, B:24:0x0073, B:25:0x0078, B:26:0x0079, B:27:0x007f, B:28:0x0085), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r8v10, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$beginTransaction$1 pooledConnectionImpl$beginTransaction$1;
        int i;
        u5e u5eVar;
        x43 x43Var = this.d;
        try {
            if (continuationImpl instanceof PooledConnectionImpl$beginTransaction$1) {
                pooledConnectionImpl$beginTransaction$1 = (PooledConnectionImpl$beginTransaction$1) continuationImpl;
                int i2 = pooledConnectionImpl$beginTransaction$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pooledConnectionImpl$beginTransaction$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pooledConnectionImpl$beginTransaction$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pooledConnectionImpl$beginTransaction$1.label;
                    u5e u5eVar2 = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pooledConnectionImpl$beginTransaction$1.L$0 = transactor$SQLiteTransactionType;
                        pooledConnectionImpl$beginTransaction$1.L$1 = u5eVar2;
                        pooledConnectionImpl$beginTransaction$1.label = 1;
                        if (u5eVar2.b.a(pooledConnectionImpl$beginTransaction$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        u5eVar = u5eVar2;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r8 = (g050) pooledConnectionImpl$beginTransaction$1.L$1;
                        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType2 = (Transactor$SQLiteTransactionType) pooledConnectionImpl$beginTransaction$1.L$0;
                        kotlin.b.b(obj);
                        u5eVar = r8;
                        transactor$SQLiteTransactionType = transactor$SQLiteTransactionType2;
                    }
                    int size = x43Var.size();
                    if (x43Var.isEmpty()) {
                        vez0.s(u5eVar2, "SAVEPOINT '" + size + '\'');
                    } else {
                        int i3 = h6e0.a[transactor$SQLiteTransactionType.ordinal()];
                        if (i3 == 1) {
                            vez0.s(u5eVar2, "BEGIN DEFERRED TRANSACTION");
                        } else if (i3 == 2) {
                            vez0.s(u5eVar2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            vez0.s(u5eVar2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    x43Var.addLast(new g6e0(size));
                    zy11 zy11Var = zy11.a;
                    u5eVar.d(null);
                    return zy11Var;
                }
            }
            int size2 = x43Var.size();
            if (x43Var.isEmpty()) {
            }
            x43Var.addLast(new g6e0(size2));
            zy11 zy11Var2 = zy11.a;
            u5eVar.d(null);
            return zy11Var2;
        } catch (Throwable th) {
            u5eVar.d(null);
            throw th;
        }
        pooledConnectionImpl$beginTransaction$1 = new PooledConnectionImpl$beginTransaction$1(this, continuationImpl);
        Object obj2 = pooledConnectionImpl$beginTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$beginTransaction$1.label;
        u5e u5eVar22 = this.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:11:0x004f, B:13:0x0055, B:15:0x005f, B:17:0x0068, B:18:0x00a5, B:22:0x0070, B:23:0x0085, B:25:0x008b, B:26:0x0091, B:27:0x00ab, B:28:0x00b2), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #0 {all -> 0x006e, blocks: (B:11:0x004f, B:13:0x0055, B:15:0x005f, B:17:0x0068, B:18:0x00a5, B:22:0x0070, B:23:0x0085, B:25:0x008b, B:26:0x0091, B:27:0x00ab, B:28:0x00b2), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$endTransaction$1 pooledConnectionImpl$endTransaction$1;
        int i;
        g050 g050Var;
        x43 x43Var = this.d;
        try {
            if (continuationImpl instanceof PooledConnectionImpl$endTransaction$1) {
                pooledConnectionImpl$endTransaction$1 = (PooledConnectionImpl$endTransaction$1) continuationImpl;
                int i2 = pooledConnectionImpl$endTransaction$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pooledConnectionImpl$endTransaction$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pooledConnectionImpl$endTransaction$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pooledConnectionImpl$endTransaction$1.label;
                    u5e u5eVar = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pooledConnectionImpl$endTransaction$1.L$0 = u5eVar;
                        pooledConnectionImpl$endTransaction$1.Z$0 = z;
                        pooledConnectionImpl$endTransaction$1.label = 1;
                        if (u5eVar.b.a(pooledConnectionImpl$endTransaction$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = u5eVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = pooledConnectionImpl$endTransaction$1.Z$0;
                        g050Var = (g050) pooledConnectionImpl$endTransaction$1.L$0;
                        kotlin.b.b(obj);
                    }
                    if (!x43Var.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    g6e0 g6e0Var = (g6e0) ycc.z(x43Var);
                    if (z) {
                        g6e0Var.getClass();
                        if (x43Var.isEmpty()) {
                            vez0.s(u5eVar, "END TRANSACTION");
                        } else {
                            vez0.s(u5eVar, "RELEASE SAVEPOINT '" + g6e0Var.a + '\'');
                        }
                    } else if (x43Var.isEmpty()) {
                        vez0.s(u5eVar, "ROLLBACK TRANSACTION");
                    } else {
                        vez0.s(u5eVar, "ROLLBACK TRANSACTION TO SAVEPOINT '" + g6e0Var.a + '\'');
                    }
                    zy11 zy11Var = zy11.a;
                    g050Var.d(null);
                    return zy11Var;
                }
            }
            if (!x43Var.isEmpty()) {
            }
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        pooledConnectionImpl$endTransaction$1 = new PooledConnectionImpl$endTransaction$1(this, continuationImpl);
        Object obj2 = pooledConnectionImpl$endTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$endTransaction$1.label;
        u5e u5eVar2 = this.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006d, code lost:
    
        if (e(r11, r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, wls wlsVar, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$transaction$1 pooledConnectionImpl$transaction$1;
        Object obj;
        Object obj2;
        int i;
        SQLException e;
        Throwable th;
        int i2;
        try {
            if (continuationImpl instanceof PooledConnectionImpl$transaction$1) {
                pooledConnectionImpl$transaction$1 = (PooledConnectionImpl$transaction$1) continuationImpl;
                int i3 = pooledConnectionImpl$transaction$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    pooledConnectionImpl$transaction$1.label = i3 - Integer.MIN_VALUE;
                    obj = pooledConnectionImpl$transaction$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pooledConnectionImpl$transaction$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (transactor$SQLiteTransactionType == null) {
                            transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.DEFERRED;
                        }
                        pooledConnectionImpl$transaction$1.L$0 = wlsVar;
                        pooledConnectionImpl$transaction$1.label = 1;
                    } else if (i == 1) {
                        wlsVar = (wls) pooledConnectionImpl$transaction$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i == 2) {
                            i2 = pooledConnectionImpl$transaction$1.I$0;
                            kotlin.b.b(obj);
                            boolean z = i2 != 0;
                            pooledConnectionImpl$transaction$1.L$0 = obj;
                            pooledConnectionImpl$transaction$1.label = 3;
                            return f(z, pooledConnectionImpl$transaction$1) != obj2 ? obj2 : obj;
                        }
                        if (i == 3 || i == 4) {
                            Object obj3 = pooledConnectionImpl$transaction$1.L$0;
                            kotlin.b.b(obj);
                            return obj3;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) pooledConnectionImpl$transaction$1.L$1;
                        th = (Throwable) pooledConnectionImpl$transaction$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            throw th;
                        } catch (SQLException e2) {
                            e = e2;
                            if (th != null) {
                            }
                        }
                    }
                    f6e0 f6e0Var = new f6e0(this);
                    pooledConnectionImpl$transaction$1.L$0 = null;
                    pooledConnectionImpl$transaction$1.I$0 = 1;
                    pooledConnectionImpl$transaction$1.label = 2;
                    obj = wlsVar.invoke(f6e0Var, pooledConnectionImpl$transaction$1);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        pooledConnectionImpl$transaction$1.L$0 = obj;
                        pooledConnectionImpl$transaction$1.label = 3;
                        if (f(z, pooledConnectionImpl$transaction$1) != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            f6e0 f6e0Var2 = new f6e0(this);
            pooledConnectionImpl$transaction$1.L$0 = null;
            pooledConnectionImpl$transaction$1.I$0 = 1;
            pooledConnectionImpl$transaction$1.label = 2;
            obj = wlsVar.invoke(f6e0Var2, pooledConnectionImpl$transaction$1);
            if (obj != obj2) {
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    pooledConnectionImpl$transaction$1.L$0 = th;
                    pooledConnectionImpl$transaction$1.L$1 = th3;
                    pooledConnectionImpl$transaction$1.label = 5;
                    if (f(false, pooledConnectionImpl$transaction$1) != obj2) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    ljo.a(th, e);
                    throw th;
                }
            }
        }
        pooledConnectionImpl$transaction$1 = new PooledConnectionImpl$transaction$1(this, continuationImpl);
        obj = pooledConnectionImpl$transaction$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$transaction$1.label;
    }
}
