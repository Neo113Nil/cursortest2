package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class s790 implements Callable<s3q0> {
    public final /* synthetic */ t790 b;

    public s790(t790 t790Var) {
        this.b = t790Var;
    }

    @Override // java.util.concurrent.Callable
    public final s3q0 call() throws Exception {
        t790 t790Var = this.b;
        n790 n790Var = t790Var.e;
        zin0 a = n790Var.a();
        RoomDatabase roomDatabase = t790Var.a;
        roomDatabase.c();
        try {
            a.executeUpdateDelete();
            roomDatabase.w();
            return s3q0.a;
        } finally {
            roomDatabase.q();
            n790Var.d(a);
        }
    }
}
