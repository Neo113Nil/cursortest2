package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class od01 extends com.google.android.gms.internal.maps.zzb {
    public final /* synthetic */ uf20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od01(uf20 uf20Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        this.a = uf20Var;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mv9 mv9Var = (mv9) this.a.c;
        ndr0 ndr0Var = (ndr0) mv9Var.c;
        CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) mv9Var.b;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new lrg(ndr0Var, communityAddressesFragment));
        asu0 asu0Var = asu0.a;
        ver0.c(communityAddressesFragment.requireContext(), vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new bw(new h1(6, communityAddressesFragment, ndr0Var), 18)));
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzc(parcel2, true);
        return true;
    }
}
