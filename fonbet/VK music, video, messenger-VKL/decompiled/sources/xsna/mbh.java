package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.profile.Address;
import com.vk.location.common.LocationCommon;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import java.util.ArrayList;

/* compiled from: CommunityOldAddressSupportPresenter.kt */
/* loaded from: classes5.dex */
public final class mbh extends vqg {
    @Override // xsna.vqg
    public final void b() {
        VKList vKList = new VKList();
        CommunityAddressesFragment communityAddressesFragment = this.c;
        vKList.add(communityAddressesFragment.o0);
        crg crgVar = communityAddressesFragment.T;
        if (crgVar != null) {
            ArrayList<Address> arrayList = crgVar.d;
            arrayList.clear();
            arrayList.addAll(vKList);
            crgVar.notifyDataSetChanged();
        }
        crg crgVar2 = communityAddressesFragment.T;
        if (crgVar2 != null) {
            RecyclerView recyclerView = communityAddressesFragment.V;
            if (recyclerView == null) {
                recyclerView = null;
            }
            crgVar2.x0(recyclerView, communityAddressesFragment.D0);
        }
        communityAddressesFragment.g0 = true;
        CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
        if (gVar == null) {
            gVar = null;
        }
        gVar.e();
        Context context = e43.a;
        io.reactivex.rxjava3.internal.operators.observable.b0 F = new io.reactivex.rxjava3.internal.operators.observable.s0(new c3d(context != null ? context : null, 1)).F(new ez(new azt(false), 26));
        LocationCommon.a.getClass();
        F.d0(LocationCommon.b).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tf(new ay0(this, 28), 16));
    }
}
