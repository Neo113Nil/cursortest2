package xsna;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;

/* compiled from: VKSupportMapFragment.kt */
/* loaded from: classes3.dex */
public final class vgr0 extends jin0 implements ol00 {
    @Override // xsna.ol00
    public final void Nk(final CommunityAddressesFragment.h hVar) {
        g780 g780Var = new g780() { // from class: xsna.ugr0
            @Override // xsna.g780
            public final void a(s9u s9uVar) {
                CommunityAddressesFragment.h.this.a(new ndr0(s9uVar));
            }
        };
        exc0.e("getMapAsync must be called on the main thread.");
        a001 a001Var = this.h;
        l4z l4zVar = a001Var.a;
        if (l4zVar == null) {
            a001Var.h.add(g780Var);
            return;
        }
        try {
            ((xzz0) l4zVar).b.l(new pzz0(g780Var));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
