package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class bn01 extends ah01 {
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ cp01 d;

    public bn01(cp01 cp01Var, IBinder iBinder) {
        this.d = cp01Var;
        this.c = iBinder;
    }

    @Override // xsna.ah01
    public final void a() {
        ka01 z601Var;
        up01 up01Var = this.d.b;
        int i = r801.a;
        IBinder iBinder = this.c;
        if (iBinder == null) {
            z601Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            z601Var = queryLocalInterface instanceof ka01 ? (ka01) queryLocalInterface : new z601(iBinder);
        }
        up01Var.m = z601Var;
        up01Var.b.a("linkToDeath", new Object[0]);
        try {
            up01Var.m.asBinder().linkToDeath(up01Var.j, 0);
        } catch (RemoteException e) {
            lf01 lf01Var = up01Var.b;
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", lf01.b(lf01Var.a, "linkToDeath failed", objArr), e);
            } else {
                lf01Var.getClass();
            }
        }
        up01Var.g = false;
        Iterator it = up01Var.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        up01Var.d.clear();
    }
}
