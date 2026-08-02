package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class q790 implements Callable<s3q0> {
    public final /* synthetic */ e790 b;
    public final /* synthetic */ t790 c;

    public q790(t790 t790Var, e790 e790Var) {
        this.c = t790Var;
        this.b = e790Var;
    }

    @Override // java.util.concurrent.Callable
    public final s3q0 call() throws Exception {
        t790 t790Var = this.c;
        RoomDatabase roomDatabase = t790Var.a;
        roomDatabase.c();
        try {
            t790Var.c.j(this.b);
            roomDatabase.w();
            return s3q0.a;
        } finally {
            roomDatabase.q();
        }
    }
}
