package xsna;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: BaseQueueOperation.java */
/* loaded from: classes12.dex */
public class wl6 implements ore0 {
    public final y3j a;

    public wl6(y3j y3jVar) {
        y3jVar.getClass();
        this.a = y3jVar;
    }

    @Override // xsna.ore0
    public final y3j a() {
        return this.a;
    }

    @Override // xsna.ore0
    public ore0 b(pel pelVar) {
        return this;
    }

    @Override // xsna.ore0
    public void c(IBinder iBinder) throws RemoteException {
    }

    @Override // xsna.ore0
    public void d(Exception exc) {
    }
}
