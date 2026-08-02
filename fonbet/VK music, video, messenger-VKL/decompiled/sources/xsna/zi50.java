package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.toggle.features.VkcFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.cs;
import xsna.r1r0;

/* compiled from: MutualFriendsRepository.kt */
/* loaded from: classes13.dex */
public final class zi50 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new pd4(23));
    public final j2r0 b = new j2r0();
    public final List<UsersFieldsDto> c = Collections.singletonList(UsersFieldsDto.PHOTO_BASE);
    public final LinkedHashMap d = new LinkedHashMap();

    public static ArrayList b(ArrayList arrayList, List list) {
        HashMap r = p4g.r(arrayList, xi50.b);
        List<zxq0> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (zxq0 zxq0Var : list2) {
            RequestUserProfile requestUserProfile = zxq0Var.a;
            int i = zxq0Var.b;
            List<UserId> list3 = zxq0Var.c;
            requestUserProfile.k0 = i;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                UserProfile userProfile = (UserProfile) r.get((UserId) it.next());
                if (userProfile != null) {
                    arrayList3.add(userProfile);
                }
            }
            requestUserProfile.j0 = (UserProfile[]) arrayList3.toArray(new UserProfile[0]);
            arrayList2.add(requestUserProfile);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.core.x<List<RequestUserProfile>> a(List<zxq0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((zxq0) it.next()).c, arrayList);
        }
        List R = j5g.R(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = R.iterator();
        while (it2.hasNext()) {
            UserProfile userProfile = (UserProfile) this.d.get((UserId) it2.next());
            if (userProfile != null) {
                arrayList2.add(userProfile);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((UserProfile) it3.next()).c);
        }
        List t0 = j5g.t0(R, j5g.S0(arrayList3));
        if (t0.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(b(arrayList2, list));
        }
        VkcFeatures vkcFeatures = VkcFeatures.MIGRATION_USERS_GET_TO_ACC_GET_3;
        vkcFeatures.getClass();
        if (!com.vk.toggle.b.A.a(vkcFeatures)) {
            return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(yfb.x(r1r0.a.b((s1r0) this.a.getValue(), t0, this.c, null, null, 58)), 7).l(new s41(new jjx(this, 18), 24)), new c2y(new w910(this, 7), 11)).l(new u5(new v53(this, list, arrayList2), 23));
        }
        List<UsersFieldsDto> list2 = this.c;
        ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((UsersFieldsDto) it4.next()).i());
        }
        if ((12 & 1) != 0) {
            t0 = null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(yfb.x(cs.a.a((12 & 4) == 0 ? "nom" : null, t0, arrayList4)), 7).l(new d22(new zl20(this, 9), 29)), new wmz(new kb40(this, 6), 8)).l(new p5w(new eaa(this, list, arrayList2), 6));
    }
}
