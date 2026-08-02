package xsna;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: VKMarker.kt */
/* loaded from: classes3.dex */
public final class qdr0 implements fo00 {
    public final eo00 a;

    public qdr0(eo00 eo00Var) {
        this.a = eo00Var;
    }

    @Override // xsna.fo00
    public final void a(edr0 edr0Var) {
        this.a.d(edi.B(edr0Var));
    }

    @Override // xsna.fo00
    public final void b(boolean z) {
        try {
            this.a.a.zzz(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.fo00
    public final void c(sb7 sb7Var) {
        this.a.c(((jar0) sb7Var).a);
    }
}
