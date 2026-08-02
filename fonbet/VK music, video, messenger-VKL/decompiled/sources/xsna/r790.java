package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class r790 implements Callable<s3q0> {
    public final /* synthetic */ String b;
    public final /* synthetic */ t790 c;

    public r790(t790 t790Var, String str) {
        this.c = t790Var;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final s3q0 call() throws Exception {
        t790 t790Var = this.c;
        m790 m790Var = t790Var.d;
        RoomDatabase roomDatabase = t790Var.a;
        zin0 a = m790Var.a();
        String str = this.b;
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        roomDatabase.c();
        try {
            a.executeUpdateDelete();
            roomDatabase.w();
            return s3q0.a;
        } finally {
            roomDatabase.q();
            m790Var.d(a);
        }
    }
}
