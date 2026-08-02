package xsna;

import com.vk.api.generated.groups.dto.GroupsBanInfoDto;
import com.vk.api.generated.groups.dto.GroupsGetBannedResponseDto;
import com.vk.api.generated.groups.dto.GroupsOwnerXtrBanInfoDto;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.impl.helpers.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.r1r0;
import xsna.xqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ppu implements izs {
    public final /* synthetic */ com.vk.newsfeed.impl.helpers.a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ UserId d;
    public final /* synthetic */ UserId e;

    public /* synthetic */ ppu(com.vk.newsfeed.impl.helpers.a aVar, boolean z, UserId userId, UserId userId2) {
        this.b = aVar;
        this.c = z;
        this.d = userId;
        this.e = userId2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.t T;
        List<GroupsOwnerXtrBanInfoDto> d = ((GroupsGetBannedResponseDto) obj).d();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            GroupsBanInfoDto d2 = ((GroupsOwnerXtrBanInfoDto) it.next()).d();
            Integer d3 = d2 != null ? d2.d() : null;
            if (d3 != null) {
                arrayList.add(d3);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new UserId(((Number) it2.next()).intValue()));
        }
        boolean isEmpty = arrayList2.isEmpty();
        com.vk.newsfeed.impl.helpers.a aVar = this.b;
        boolean z = this.c;
        io.reactivex.rxjava3.core.q T2 = isEmpty ? io.reactivex.rxjava3.core.q.T(EmptyList.b) : com.vk.newsfeed.impl.helpers.a.b(yfb.x(r1r0.a.b(aVar.b, arrayList2, aVar.e, null, null, 58)), z);
        UserId userId = this.e;
        if (userId == null || userId.b <= 0) {
            T = io.reactivex.rxjava3.core.q.T(new a.C1382a(false, false));
        } else {
            aVar.a.getClass();
            T = new io.reactivex.rxjava3.internal.operators.observable.o1(com.vk.newsfeed.impl.helpers.a.b(yfb.x(xqu.a.b(this.d, userId)), z).U(new r41(new ve0(29), 29)), new s41(new per(4), 19));
        }
        return io.reactivex.rxjava3.core.q.I0(T2, T, new m40(new z85(3, aVar, d), 18));
    }
}
