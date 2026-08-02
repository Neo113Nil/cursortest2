package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class kuz0 extends xq01 {
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ rvz0 d;

    public kuz0(rvz0 rvz0Var, IBinder iBinder) {
        this.d = rvz0Var;
        this.c = iBinder;
    }

    @Override // xsna.xq01
    public final void c() {
        c401 z301Var;
        uvz0 uvz0Var = this.d.b;
        int i = b401.a;
        IBinder iBinder = this.c;
        if (iBinder == null) {
            z301Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            z301Var = queryLocalInterface instanceof c401 ? (c401) queryLocalInterface : new z301(iBinder);
        }
        uvz0Var.m = z301Var;
        lq01 lq01Var = uvz0Var.b;
        lq01Var.d("linkToDeath", new Object[0]);
        try {
            uvz0Var.m.asBinder().linkToDeath(uvz0Var.j, 0);
        } catch (RemoteException e) {
            lq01Var.c(e, "linkToDeath failed", new Object[0]);
        }
        uvz0Var.g = false;
        Iterator it = uvz0Var.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        uvz0Var.d.clear();
    }
}
