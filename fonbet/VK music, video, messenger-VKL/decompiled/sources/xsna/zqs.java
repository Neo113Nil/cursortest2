package xsna;

import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.mts;
import xsna.s1r0;

/* compiled from: FriendsListWithListsDataSource.kt */
/* loaded from: classes4.dex */
public final class zqs extends czi {
    public final ArrayList c;
    public volatile int d;
    public volatile int e;

    public zqs(ArrayList arrayList) {
        super(7);
        this.c = arrayList;
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.internal.operators.observable.j1 l(int i, int i2) {
        if (this.d < this.c.size()) {
            return r();
        }
        List l = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.LISTS, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
        int i3 = this.e;
        FriendsGetOrderDto friendsGetOrderDto = FriendsGetOrderDto.HINTS;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i3);
        FriendsGetOrderDto friendsGetOrderDto2 = friendsGetOrderDto;
        if ((965 & 2) != 0) {
            friendsGetOrderDto2 = null;
        }
        if ((965 & 8) != 0) {
            valueOf = null;
        }
        return new io.reactivex.rxjava3.internal.operators.observable.z(rsg0.T(yfb.x(mts.a.a(null, friendsGetOrderDto2, null, valueOf, (965 & 16) != 0 ? null : valueOf2, l, null, null))), new f60(new k0j(this, 16), 29)).U(new aa6(new p4f(this, 26), 22));
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<kqs> o() {
        this.d = 0;
        this.e = 0;
        return io.reactivex.rxjava3.core.q.I0(rsg0.T(yfb.x(nts.f(new ots(), null, 7))).U(new ca6(new j5n(6), 18)), r(), new z7(new log(5), 26));
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<cts> p(String str) {
        return rsg0.T(yfb.x(nts.h(new ots(), t11.b(), str, e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.LISTS, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE), null, null, null, 242))).U(new s7(new sm0(20), 14));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 r() {
        List l = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.LISTS, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
        List H0 = j5g.H0(this.c.subList(this.d, this.c.size()), Math.min(this.c.size() - this.d, 20));
        ArrayList arrayList = new ArrayList();
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            Long n = arm0.n((String) it.next());
            if (n != null) {
                arrayList.add(n);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dq.h(((Number) it2.next()).longValue(), arrayList2);
        }
        if ((58 & 1) != 0) {
            arrayList2 = null;
        }
        if ((58 & 4) != 0) {
            l = null;
        }
        return new io.reactivex.rxjava3.internal.operators.observable.z(rsg0.T(yfb.x(s1r0.a.b(arrayList2, null, l, null, null))), new h60(new nhe(this, 25), 25)).U(new q7(new f2s(this, 3), 21));
    }
}
