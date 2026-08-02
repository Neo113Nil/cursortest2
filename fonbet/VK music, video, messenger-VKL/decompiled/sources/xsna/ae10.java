package xsna;

import android.location.Location;
import com.vk.api.generated.address.dto.AddressFieldsDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: MarketServicesAddressesRepository.kt */
/* loaded from: classes5.dex */
public final class ae10 extends trg {
    public static final List<AddressFieldsDto> m = e43.l(AddressFieldsDto.WORK_INFO_STATUS, AddressFieldsDto.TIMETABLE);
    public final UserId k;
    public final long l;

    public ae10(UserId userId, long j, j1i j1iVar) {
        super(fkq0.e(userId), j1iVar);
        this.k = userId;
        this.l = j;
    }

    @Override // xsna.trg
    public final io.reactivex.rxjava3.core.q<Address> b(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, Address> hashMap = this.f;
        if (hashMap.containsKey(valueOf)) {
            return io.reactivex.rxjava3.core.q.T(hashMap.get(Integer.valueOf(i)));
        }
        return null;
    }

    @Override // xsna.trg
    public final io.reactivex.rxjava3.core.q<List<GroupsAddressDto>> c(Location location) {
        this.i = location;
        return io.reactivex.rxjava3.core.q.T(new ArrayList());
    }

    @Override // xsna.trg
    public final io.reactivex.rxjava3.internal.operators.observable.j1 d(int i, boolean z) {
        return rsg0.y0(new ez00(new fz00(this.k, this.l, i, this.i, m)), null, null, 3).U(new ai3(new zd10(z, this), 26));
    }
}
