package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class uke0 implements Callable<s3q0> {
    public final /* synthetic */ ple0 b;

    public uke0(ple0 ple0Var) {
        this.b = ple0Var;
    }

    @Override // java.util.concurrent.Callable
    public final s3q0 call() throws Exception {
        ple0 ple0Var = this.b;
        kle0 kle0Var = ple0Var.f;
        zin0 a = kle0Var.a();
        RoomDatabase roomDatabase = ple0Var.a;
        roomDatabase.c();
        try {
            a.executeUpdateDelete();
            roomDatabase.w();
            return s3q0.a;
        } finally {
            roomDatabase.q();
            kle0Var.d(a);
        }
    }
}
