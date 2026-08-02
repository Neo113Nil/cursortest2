package xsna;

import androidx.room.coroutines.ConnectionPool;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SupportSQLiteConnectionPool.android.kt */
/* loaded from: classes.dex */
public final class rin0 implements ConnectionPool {
    public final ph60 b;

    public rin0(ph60 ph60Var) {
        this.b = ph60Var;
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public final Object J2(boolean z, wzs wzsVar, ContinuationImpl continuationImpl) {
        tin0 tin0Var = (tin0) this.b.b;
        tin0Var.getDatabaseName();
        return wzsVar.invoke(new uin0(new qin0(tin0Var.getWritableDatabase())), continuationImpl);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((tin0) this.b.b).close();
    }
}
