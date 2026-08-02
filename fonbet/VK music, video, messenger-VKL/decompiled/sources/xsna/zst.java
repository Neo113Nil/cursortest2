package xsna;

import android.location.Location;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.toggle.features.ComFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: GetNearestOrMainAddressRequest.kt */
/* loaded from: classes15.dex */
public final class zst extends awi<Address> {
    public final UserId s;
    public final Location t;
    public final int u;

    public zst(UserId userId, Location location, int i) {
        this.s = userId;
        this.t = location;
        this.u = i;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_ADDRESSES;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        int i = this.u;
        Location location = this.t;
        UserId userId = this.s;
        if (!a) {
            opu opuVar = new opu(userId);
            opuVar.F0(location);
            opuVar.v = 1;
            Address address = (Address) j5g.a0((List) opuVar.f(l7r0Var));
            if (address == null) {
                opu opuVar2 = new opu(userId);
                opuVar2.w = i7o0.a(Collections.singletonList(Integer.valueOf(i)));
                opuVar2.v = 1;
                address = (Address) j5g.a0((List) opuVar2.f(l7r0Var));
            }
            if (address != null) {
                return address;
            }
            opu opuVar3 = new opu(userId);
            opuVar3.v = 1;
            return (Address) j5g.a0((List) opuVar3.f(l7r0Var));
        }
        List<GroupsAddressDto> d = ((GroupsGetAddressesResponseDto) yfb.x(xqu.j(new zqu(), fkq0.a(userId), null, Float.valueOf((float) location.getLatitude()), Float.valueOf((float) location.getLongitude()), null, 1, null, 82)).f(l7r0Var)).d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(fz5.v((GroupsAddressDto) it.next()));
        }
        Address address2 = (Address) j5g.a0(arrayList);
        if (address2 == null) {
            List<GroupsAddressDto> d2 = ((GroupsGetAddressesResponseDto) yfb.x(xqu.j(new zqu(), this.s, Collections.singletonList(Integer.valueOf(i)), null, null, null, 1, null, 92)).f(l7r0Var)).d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
            Iterator<T> it2 = d2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(fz5.v((GroupsAddressDto) it2.next()));
            }
            address2 = (Address) j5g.a0(arrayList2);
        }
        if (address2 != null) {
            return address2;
        }
        List<GroupsAddressDto> d3 = ((GroupsGetAddressesResponseDto) yfb.x(xqu.j(new zqu(), this.s, null, null, null, null, 1, null, 94)).f(l7r0Var)).d();
        ArrayList arrayList3 = new ArrayList(c5g.u(d3, 10));
        Iterator<T> it3 = d3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(fz5.v((GroupsAddressDto) it3.next()));
        }
        return (Address) j5g.a0(arrayList3);
    }
}
