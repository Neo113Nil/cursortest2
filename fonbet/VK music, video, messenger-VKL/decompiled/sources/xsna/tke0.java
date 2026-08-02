package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class tke0 implements Callable<s3q0> {
    public final /* synthetic */ String b;
    public final /* synthetic */ ple0 c;

    public tke0(ple0 ple0Var, String str) {
        this.c = ple0Var;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final s3q0 call() throws Exception {
        ple0 ple0Var = this.c;
        jle0 jle0Var = ple0Var.e;
        RoomDatabase roomDatabase = ple0Var.a;
        zin0 a = jle0Var.a();
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
            jle0Var.d(a);
        }
    }
}
