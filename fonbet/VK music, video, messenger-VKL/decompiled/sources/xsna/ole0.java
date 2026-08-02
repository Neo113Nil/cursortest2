package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class ole0 implements Callable<Integer> {
    public final /* synthetic */ pke0 b;
    public final /* synthetic */ ple0 c;

    public ole0(ple0 ple0Var, pke0 pke0Var) {
        this.c = ple0Var;
        this.b = pke0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        ple0 ple0Var = this.c;
        RoomDatabase roomDatabase = ple0Var.a;
        roomDatabase.c();
        try {
            int j = ple0Var.d.j(this.b);
            roomDatabase.w();
            return Integer.valueOf(j);
        } finally {
            roomDatabase.q();
        }
    }
}
