package xsna;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class a001 extends esl<xzz0> {
    public final jin0 e;
    public h6o0 f;
    public Activity g;
    public final ArrayList h = new ArrayList();

    @VisibleForTesting
    public a001(jin0 jin0Var) {
        this.e = jin0Var;
    }

    @Override // xsna.esl
    public final void a(h6o0 h6o0Var) {
        this.f = h6o0Var;
        e();
    }

    public final void e() {
        ArrayList arrayList = this.h;
        Activity activity = this.g;
        if (activity == null || this.f == null || this.a != null) {
            return;
        }
        try {
            try {
                boolean z = MapsInitializer.a;
                synchronized (MapsInitializer.class) {
                    MapsInitializer.a(activity);
                }
                mnv U = h601.a(this.g).U(new bq70(this.g));
                if (U == null) {
                    return;
                }
                this.f.b(new xzz0(this.e, U));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g780 g780Var = (g780) it.next();
                    xzz0 xzz0Var = (xzz0) this.a;
                    xzz0Var.getClass();
                    try {
                        xzz0Var.b.l(new pzz0(g780Var));
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
                arrayList.clear();
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
