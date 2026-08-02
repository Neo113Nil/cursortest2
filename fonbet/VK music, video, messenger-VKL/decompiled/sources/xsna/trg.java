package xsna;

import android.location.Location;
import com.vk.api.generated.address.dto.AddressFieldsDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.PlainAddress;
import com.vk.toggle.features.ComFeatures;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: CommunityAddressesRepository.kt */
/* loaded from: classes5.dex */
public class trg {
    public static final List<AddressFieldsDto> j = Collections.singletonList(AddressFieldsDto.ID);
    public final UserId a;
    public final vqg b;
    public final bpn0 c = new bpn0(new com.vk.movika.sdk.base.ui.g0(16));
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new iy2(13));
    public final ArrayList<PlainAddress> e = new ArrayList<>();
    public final HashMap<Integer, Address> f = new HashMap<>();
    public int g;
    public int h;
    public Location i;

    public trg(UserId userId, vqg vqgVar) {
        this.a = userId;
        this.b = vqgVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List<Integer> a() {
        if (((Boolean) this.d.getValue()).booleanValue()) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<PlainAddress> arrayList2 = this.e;
        int min = Math.min(arrayList2.size() - 1, this.g + 29);
        int i = this.g;
        if (i <= min) {
            while (true) {
                int i2 = arrayList2.get(i).b;
                if (!this.f.containsKey(Integer.valueOf(i2))) {
                    arrayList.add(Integer.valueOf(i2));
                }
                if (i == min) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public io.reactivex.rxjava3.core.q<Address> b(int i) {
        io.reactivex.rxjava3.core.q y0;
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, Address> hashMap = this.f;
        if (hashMap.containsKey(valueOf)) {
            return io.reactivex.rxjava3.core.q.T(hashMap.get(Integer.valueOf(i)));
        }
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_ADDRESSES;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        UserId userId = this.a;
        if (a) {
            y0 = rsg0.y0(yfb.x(xqu.j((xqu) this.c.getValue(), fkq0.a(userId), Collections.singletonList(Integer.valueOf(i)), null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)), null, null, 3).U(new e05(new f57(10), 14));
        } else {
            opu opuVar = new opu(userId);
            opuVar.w = i7o0.a(Collections.singletonList(Integer.valueOf(i)));
            y0 = rsg0.y0(opuVar, null, null, 3);
        }
        return y0.U(new rx0(new v5b(this, i, 1), 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public io.reactivex.rxjava3.core.q<List<GroupsAddressDto>> c(Location location) {
        boolean booleanValue = ((Boolean) this.d.getValue()).booleanValue();
        bpn0 bpn0Var = this.c;
        if (booleanValue) {
            this.e.clear();
            this.f.clear();
            this.g = 0;
            this.i = location;
            return rsg0.T(yfb.x(xqu.j((xqu) bpn0Var.getValue(), this.a, null, null, null, null, 1, j, 30))).U(new ai3(new kf1(this, 23), 14));
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(xqu.j((xqu) bpn0Var.getValue(), this.a, null, location != null ? Float.valueOf((float) location.getLatitude()) : null, location != null ? Float.valueOf((float) location.getLongitude()) : null, null, 10, j, 18))).U(new pr(new fj1(15), 10));
        xn xnVar = new xn(new lbe(this, 7), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = U.E(xnVar, lVar, kVar, kVar);
        this.i = location;
        return E;
    }

    public io.reactivex.rxjava3.internal.operators.observable.j1 d(int i, boolean z) {
        io.reactivex.rxjava3.core.q y0;
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_ADDRESSES;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        UserId userId = this.a;
        if (a) {
            xqu xquVar = (xqu) this.c.getValue();
            UserId a2 = fkq0.a(userId);
            List<Integer> a3 = a();
            Location location = this.i;
            Float valueOf = location != null ? Float.valueOf((float) location.getLatitude()) : null;
            Location location2 = this.i;
            y0 = rsg0.y0(yfb.x(xqu.j(xquVar, a2, a3, valueOf, location2 != null ? Float.valueOf((float) location2.getLongitude()) : null, Integer.valueOf(i), 30, null, 64)), null, null, 3).U(new lp0(new dj1(21), 15));
        } else {
            opu opuVar = new opu(userId);
            opuVar.F0(this.i);
            opuVar.w = i7o0.a(a());
            y0 = rsg0.y0(opuVar, null, null, 3);
        }
        return y0.F(new rrg(new y40(18), 0)).U(new ft0(new srg(this, 0), 19));
    }
}
