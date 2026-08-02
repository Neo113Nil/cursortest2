package xsna;

import android.content.Context;
import com.ironsource.X3;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.profilelist.api.ProfileListData;
import com.vk.profilelist.impl.ProfileListRootFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.webapp.fragments.CommunityCreationFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultVkUsersBridge.kt */
/* loaded from: classes11.dex */
public class lrl implements o0r0 {
    @Override // xsna.o0r0
    public final io.reactivex.rxjava3.core.q a(UserId userId, boolean z, String str, boolean z2, FullSourceJoinApi fullSourceJoinApi) {
        return ((iyv0) this).b.a(userId, z, str, z2, fullSourceJoinApi);
    }

    @Override // xsna.o0r0
    public final void b(u90 u90Var, boolean z, boolean z2, boolean z3, boolean z4, int i, String str, String str2, String str3, String str4, Integer num, List list, List list2, List list3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Peer peer) {
        ImSelectContactsFragment.a aVar = new ImSelectContactsFragment.a();
        if (str == null) {
            str = u90Var.B().getString(R.string.vkim_choose_members);
        }
        aVar.L(str);
        if (str2 == null) {
            str2 = u90Var.B().getString(R.string.vkim_choose_members);
        }
        aVar.K(str2);
        List list4 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((UserId) it.next()).b));
        }
        aVar.z(arrayList);
        List list5 = list2;
        ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((UserId) it2.next()).b));
        }
        aVar.D(arrayList2);
        aVar.C(list3);
        aVar.y(z2);
        aVar.A(z);
        aVar.B(z3, z4);
        aVar.E(str3 == null ? u90Var.B().getString(R.string.vkim_select_members) : str3);
        aVar.F(num, str4);
        aVar.M(mobileOfficialAppsCoreNavStat$EventScreen);
        aVar.H();
        if (peer != null && peer.Ab(Peer.Type.USER)) {
            aVar.G(ContactsListFactory.PERSONAL_CHANNEL_USERS_INVITATION);
        }
        if (peer != null) {
            aVar.I(peer, true);
        }
        aVar.i(u90Var, i);
    }

    @Override // xsna.o0r0
    public final void c(Context context, String str) {
        xwk.d().e().a(context, str);
    }

    @Override // xsna.o0r0
    public final void d(Context context, ProfileListData profileListData) {
        new ProfileListRootFragment.a(profileListData).k(context);
    }

    @Override // xsna.o0r0
    public final io.reactivex.rxjava3.core.q f(UserId userId, boolean z, String str, boolean z2, String str2, AdminLeaveAction adminLeaveAction) {
        return fkq0.d(userId) ? !z ? ((iyv0) this).b.n(userId, z2, str, str2).U(new gq(new gz30(21), 10)) : ((iyv0) this).b.u(userId, str, str2).U(new hq(new gz30(21))) : zvm0.h(((iyv0) this).b, userId, z, str, str2, null, adminLeaveAction, null, null, 392);
    }

    @Override // xsna.o0r0
    public final void j(Context context, ArrayList arrayList, String str, b7 b7Var) {
        new vzv(context, arrayList, str, new fre(b7Var, 17)).a();
    }

    @Override // xsna.o0r0
    public final io.reactivex.rxjava3.core.q k(UserId userId, AdminLeaveAction adminLeaveAction, String str, String str2) {
        return zvm0.g(((iyv0) this).b, userId, str, str2, adminLeaveAction, 16);
    }

    @Override // xsna.o0r0
    public final void l() {
        throw new UnsupportedOperationException("Unsupported for vk client!");
    }

    @Override // xsna.o0r0
    public final io.reactivex.rxjava3.core.q n(UserId userId, AdminLeaveAction adminLeaveAction, String str, String str2) {
        return ((iyv0) this).b.l(userId, str, str2, adminLeaveAction, null);
    }

    @Override // xsna.o0r0
    public final void p(Context context) {
        CommunityCreationFragment.a a;
        int i = CommunityCreationFragment.a0;
        a = CommunityCreationFragment.d.a(X3.i.Z, null);
        a.k(context);
    }

    @Override // xsna.o0r0
    public final io.reactivex.rxjava3.core.q q(UserId userId, boolean z) {
        kwm0 kwm0Var = ((iyv0) this).b;
        if (z) {
            return kwm0Var.u(userId, null, null);
        }
        yjs yjsVar = new yjs(userId, (String) null);
        yjsVar.H0(null);
        yjsVar.F0(null);
        io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yjsVar);
        eeh0 eeh0Var = new eeh0(new jq5(kwm0Var, userId), 7);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return T.E(eeh0Var, lVar, kVar, kVar).U(new jgj0(new xsq(29)));
    }

    @Override // xsna.o0r0
    public final void r(Context context) {
        o19.j(context).c(context);
    }

    @Override // xsna.o0r0
    public final io.reactivex.rxjava3.core.q s(UserId userId, String str, FullSourceJoinApi fullSourceJoinApi) {
        return zvm0.h(((iyv0) this).b, userId, false, null, str, fullSourceJoinApi, null, null, null, 128);
    }
}
