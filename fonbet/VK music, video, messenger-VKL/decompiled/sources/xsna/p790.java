package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class p790 implements Callable<Long> {
    public final /* synthetic */ e790 b;
    public final /* synthetic */ t790 c;

    public p790(t790 t790Var, e790 e790Var) {
        this.c = t790Var;
        this.b = e790Var;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        t790 t790Var = this.c;
        RoomDatabase roomDatabase = t790Var.a;
        roomDatabase.c();
        try {
            k790 k790Var = t790Var.b;
            e790 e790Var = this.b;
            zin0 a = k790Var.a();
            try {
                k790Var.i(a, e790Var);
                long executeInsert = a.executeInsert();
                k790Var.d(a);
                roomDatabase.w();
                return Long.valueOf(executeInsert);
            } catch (Throwable th) {
                k790Var.d(a);
                throw th;
            }
        } finally {
            roomDatabase.q();
        }
    }
}
