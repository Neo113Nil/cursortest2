package xsna;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class twz0 extends esl<iwz0> {
    public final km00 e;
    public final Context f;
    public h6o0 g;

    @Nullable
    public final GoogleMapOptions h;
    public final ArrayList i = new ArrayList();

    @VisibleForTesting
    public twz0(km00 km00Var, Context context, @Nullable GoogleMapOptions googleMapOptions) {
        this.e = km00Var;
        this.f = context;
        this.h = googleMapOptions;
    }

    @Override // xsna.esl
    public final void a(h6o0 h6o0Var) {
        this.g = h6o0Var;
        ArrayList arrayList = this.i;
        Context context = this.f;
        if (h6o0Var == null || this.a != null) {
            return;
        }
        try {
            try {
                boolean z = MapsInitializer.a;
                synchronized (MapsInitializer.class) {
                    MapsInitializer.a(context);
                }
                nnv v0 = h601.a(context).v0(new bq70(context), this.h);
                if (v0 == null) {
                    return;
                }
                this.g.b(new iwz0(this.e, v0));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g780 g780Var = (g780) it.next();
                    iwz0 iwz0Var = (iwz0) this.a;
                    iwz0Var.getClass();
                    try {
                        iwz0Var.b.l(new awz0(g780Var));
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
