package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class vke0 implements Callable<s3q0> {
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ple0 d;

    public vke0(ple0 ple0Var, long j, String str) {
        this.d = ple0Var;
        this.b = j;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final s3q0 call() throws Exception {
        ple0 ple0Var = this.d;
        lle0 lle0Var = ple0Var.g;
        RoomDatabase roomDatabase = ple0Var.a;
        zin0 a = lle0Var.a();
        a.bindLong(1, this.b);
        String str = this.c;
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        roomDatabase.c();
        try {
            a.executeUpdateDelete();
            roomDatabase.w();
            return s3q0.a;
        } finally {
            roomDatabase.q();
            lle0Var.d(a);
        }
    }
}
