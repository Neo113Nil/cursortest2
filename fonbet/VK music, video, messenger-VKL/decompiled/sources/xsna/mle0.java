package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class mle0 implements Callable<Long> {
    public final /* synthetic */ pke0 b;
    public final /* synthetic */ ple0 c;

    public mle0(ple0 ple0Var, pke0 pke0Var) {
        this.c = ple0Var;
        this.b = pke0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        ple0 ple0Var = this.c;
        RoomDatabase roomDatabase = ple0Var.a;
        roomDatabase.c();
        try {
            cle0 cle0Var = ple0Var.b;
            pke0 pke0Var = this.b;
            zin0 a = cle0Var.a();
            try {
                cle0Var.i(a, pke0Var);
                long executeInsert = a.executeInsert();
                cle0Var.d(a);
                roomDatabase.w();
                return Long.valueOf(executeInsert);
            } catch (Throwable th) {
                cle0Var.d(a);
                throw th;
            }
        } finally {
            roomDatabase.q();
        }
    }
}
