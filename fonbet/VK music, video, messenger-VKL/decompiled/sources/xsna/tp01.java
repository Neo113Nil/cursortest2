package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class tp01 extends sl01 {
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ ur01 d;

    public tp01(ur01 ur01Var, IBinder iBinder) {
        this.d = ur01Var;
        this.c = iBinder;
    }

    @Override // xsna.sl01
    public final void a() {
        ia01 y601Var;
        as01 as01Var = this.d.b;
        int i = q801.a;
        IBinder iBinder = this.c;
        if (iBinder == null) {
            y601Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            y601Var = queryLocalInterface instanceof ia01 ? (ia01) queryLocalInterface : new y601(iBinder);
        }
        as01Var.m = y601Var;
        tk01 tk01Var = as01Var.b;
        tk01Var.c("linkToDeath", new Object[0]);
        try {
            as01Var.m.asBinder().linkToDeath(as01Var.j, 0);
        } catch (RemoteException e) {
            tk01Var.b(e, "linkToDeath failed", new Object[0]);
        }
        as01Var.g = false;
        Iterator it = as01Var.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        as01Var.d.clear();
    }
}
