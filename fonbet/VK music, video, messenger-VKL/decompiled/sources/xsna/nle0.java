package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class nle0 implements Callable<s3q0> {
    public final /* synthetic */ pke0 b;
    public final /* synthetic */ ple0 c;

    public nle0(ple0 ple0Var, pke0 pke0Var) {
        this.c = ple0Var;
        this.b = pke0Var;
    }

    @Override // java.util.concurrent.Callable
    public final s3q0 call() throws Exception {
        ple0 ple0Var = this.c;
        RoomDatabase roomDatabase = ple0Var.a;
        roomDatabase.c();
        try {
            ple0Var.c.j(this.b);
            roomDatabase.w();
            return s3q0.a;
        } finally {
            roomDatabase.q();
        }
    }
}
