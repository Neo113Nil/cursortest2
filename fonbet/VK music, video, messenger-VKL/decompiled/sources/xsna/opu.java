package xsna;

import android.location.Location;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.core.util.NoLocation;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GroupsGetAddressesRequest.kt */
/* loaded from: classes15.dex */
public final class opu extends awi<List<? extends Address>> {
    public final UserId s;
    public Float t;
    public Float u;
    public int v = 100;
    public ArrayList w;

    public opu(UserId userId) {
        this.s = userId;
    }

    public final void F0(Location location) {
        if (location == null || location.equals(NoLocation.b)) {
            return;
        }
        this.t = Float.valueOf((float) location.getLatitude());
        this.u = Float.valueOf((float) location.getLongitude());
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        List<GroupsAddressDto> d = ((GroupsGetAddressesResponseDto) yfb.x(xqu.j(new zqu(), this.s, this.w, this.t, this.u, null, Integer.valueOf(this.v), null, 80)).f(l7r0Var)).d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(fz5.v((GroupsAddressDto) it.next()));
        }
        return arrayList;
    }
}
