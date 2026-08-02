package xsna;

import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.LatLng;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsProfileTileVh;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.core.serialize.Serializer;
import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.fave.fragments.FavesTabSearchFragment;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a3i;
import xsna.a7f0;
import xsna.c5i;
import xsna.edt;
import xsna.mem;
import xsna.o0r0;
import xsna.o2j;
import xsna.sct;
import xsna.t8s;
import xsna.wih;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pcg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pcg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v58, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        qwz qwzVar = null;
        CommunityProfileContentItem communityProfileContentItem = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                afg Co = ((CommentThreadFragment) obj2).Co();
                if (Co != null) {
                    ((mdg) Co).H7();
                }
                return s3q0.a;
            case 1:
                ((lfg) obj2).L8((vqt) obj, true);
                return s3q0.a;
            case 2:
                ndr0 ndr0Var = (ndr0) obj2;
                int i2 = CommunityAddressesFragment.E0;
                Location location = (Location) ((it80) obj).a;
                if (location != null) {
                    vj00 vj00Var = ofx.a;
                    (vj00Var != null ? vj00Var : null).getClass();
                    ndr0Var.b(new tar0(xa4.F(new LatLng(location.getLatitude(), location.getLongitude()), 13.0f)));
                }
                return s3q0.a;
            case 3:
                CommunityEventsFragment communityEventsFragment = (CommunityEventsFragment) obj2;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = CommunityEventsFragment.P;
                g47Var.b(new h1m(rsr.i(new cxm0(f9t.z(communityEventsFragment.eo()), null)), new xe4(3, new defpackage.f(communityEventsFragment, 26))));
                l370.m(g47Var, f9t.w(communityEventsFragment.eo()));
                g47Var.d(new CommunityEventsFragment.b(communityEventsFragment.eo()));
                return s3q0.a;
            case 4:
                x2i x2iVar = ((j7h) obj2).g;
                if (x2iVar != null) {
                    x2iVar.mn(new a3i.b(false));
                }
                return s3q0.a;
            case 5:
                wih.a aVar = (wih.a) obj2;
                ProfileFabState profileFabState = (ProfileFabState) obj;
                if (profileFabState.e == null) {
                    Iterator it = aVar.n.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (((CommunityProfileContentItem) next).h == profileFabState.a) {
                                communityProfileContentItem = next;
                            }
                        }
                    }
                    CommunityProfileContentItem communityProfileContentItem2 = communityProfileContentItem;
                    if (communityProfileContentItem2 != null) {
                        aVar.p.d(communityProfileContentItem2);
                    }
                }
                return s3q0.a;
            case 6:
                hrh hrhVar = (hrh) obj2;
                awh awhVar = hrhVar.d0;
                UserId userId = hrhVar.e0;
                c5i c5iVar = (c5i) obj;
                if (c5iVar instanceof c5i.b) {
                    c5i.b bVar = (c5i.b) c5iVar;
                    if (epx.f(userId, bVar.a)) {
                        awhVar.bg(bVar.b);
                    }
                } else if (c5iVar instanceof c5i.a) {
                    hrhVar.h0();
                } else {
                    if (!(c5iVar instanceof c5i.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c5i.c cVar = (c5i.c) c5iVar;
                    if (hrhVar.f0 != null && epx.f(cVar.a, userId)) {
                        ExtendedUserProfile L0 = hrhVar.g0.L0(cVar.a);
                        ExtendedCommunityProfile extendedCommunityProfile = L0 instanceof ExtendedCommunityProfile ? (ExtendedCommunityProfile) L0 : null;
                        if (extendedCommunityProfile != null) {
                            hrhVar.f0 = extendedCommunityProfile;
                            awhVar.T7(extendedCommunityProfile);
                        }
                    }
                }
                return s3q0.a;
            case 7:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = (w48) obj2;
                ojtVar.b = 200;
                return s3q0.a;
            case 8:
                L.g("Assign participants was failed", (Throwable) obj);
                ((a2j) obj2).T(o2j.f.b);
                return s3q0.a;
            case 9:
                Integer num = (Integer) obj;
                num.intValue();
                ((zak0) ((ContextMenuScreenContent) obj2).k).setValue(num);
                return s3q0.a;
            case 10:
                int i3 = CreateChatTransferFragment.F0;
                Object obj3 = ((CreateChatTransferFragment) obj2).m0;
                ((d7k) (obj3 != null ? obj3 : null)).w();
                return s3q0.a;
            case 11:
                scl sclVar = (scl) obj2;
                vqt vqtVar = (vqt) obj;
                sclVar.l.f(vqtVar.d);
                sclVar.i.s(vqtVar.e);
                return s3q0.a;
            case 12:
                ((com.vk.clips.sdk.shared.item.common.description.b) obj2).c.g(new c.C0669c((String) obj));
                return s3q0.a;
            case 13:
                Integer num2 = (Integer) obj;
                mem.a aVar2 = ((sem) obj2).l;
                if (aVar2 != null) {
                    aVar2.b(num2);
                }
                return s3q0.a;
            case 14:
                rjm rjmVar = (rjm) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                hpm e = xgl0Var.b().e();
                long j = rjmVar.d;
                com.vk.im.engine.models.dialogs.b c = e.c(j);
                if (c == null) {
                    return null;
                }
                int i4 = c.W;
                int i5 = rjmVar.e;
                int i6 = rjmVar.f ? i4 | i5 : i4 & (~i5);
                e.c.a(Long.valueOf(j), new u8a(i6, 1 == true ? 1 : 0), new wif(e, i6, 1 == true ? 1 : 0));
                pdm c2 = xgl0Var.b().c();
                long j2 = c.b;
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                c2.b.b().h(new ndm(c2, i6, Peer.a.b(j2)));
                return s3q0.a;
            case 15:
                com.vk.im.engine.models.dialogs.b bVar2 = (com.vk.im.engine.models.dialogs.b) obj;
                vjm vjmVar = bVar2.d;
                String valueOf = String.valueOf(vjmVar.a());
                long j3 = bVar2.b;
                String[] strArr = {valueOf, String.valueOf(j3)};
                tgl0 tgl0Var = ((hpm) obj2).b;
                tgl0Var.b().execSQL("UPDATE dialogs SET sort_id_server = ? WHERE id = ?", strArr);
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_server = ? WHERE x_dialog_id = ? AND x_folder_id != ?", new Object[]{Integer.valueOf(vjmVar.c), Long.valueOf(j3), -1});
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_server = ? WHERE x_dialog_id = ? AND x_folder_id = ?", new Object[]{Long.valueOf(vjmVar.a()), Long.valueOf(j3), -1});
                return s3q0.a;
            case 16:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof bim) && epx.f(((bim) instantJob).c, ((uum) obj2).b));
            case 17:
                DiscoverNewsEntriesRepository.b.remove((DiscoverId) obj2);
                return s3q0.a;
            case 18:
                ((xuo) obj2).d.onNext((List) obj);
                return s3q0.a;
            case 19:
                ((FavesTabSearchFragment) obj2).W = (ad90) obj;
                return s3q0.a;
            case 20:
                return new du90((ViewGroup) obj, ((mzr) obj2).j);
            case 21:
                com.vk.folders.impl.model.a aVar3 = (com.vk.folders.impl.model.a) obj2;
                aVar3.i.set(false);
                aVar3.c.d(l580.b);
                return s3q0.a;
            case 22:
                v1z v1zVar = (v1z) obj2;
                k8s k8sVar = (k8s) obj;
                k8sVar.a(new t8s.d(v1zVar));
                k8sVar.a(new t8s.e(v1zVar));
                return s3q0.a;
            case 23:
                gls glsVar = (gls) obj2;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                if (glsVar.g.a(usersUserFullDto)) {
                    a7f0.a.f(glsVar, glsVar.f.a(0, true), new r9k(glsVar, 11), new uoh(glsVar, 18), 1);
                } else {
                    glsVar.T(new jls(usersUserFullDto));
                }
                return s3q0.a;
            case 24:
                FriendsProfileTileVh friendsProfileTileVh = (FriendsProfileTileVh) obj2;
                View view = (View) obj;
                UIBlockProfile uIBlockProfile = friendsProfileTileVh.f;
                if (uIBlockProfile != null) {
                    CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
                    friendsProfileTileVh.b.a(new cfp0(uIBlockProfile, new FriendsAnalyticsInfo(FriendsAnalyticsInfo.ClickTarget.Open)));
                    SearchStatsLoggingInfo b = friendsProfileTileVh.c.b(SchemeStat$EventItem.Type.USER, catalogUserMeta.d, false);
                    cks cksVar = friendsProfileTileVh.d;
                    if (cksVar != null) {
                        cksVar.b(catalogUserMeta, "friends_main_recommended_block");
                    }
                    xwk.e().m(view.getContext(), uIBlockProfile.A.c, new o0r0.a(false, "friends", catalogUserMeta.d, null, b, null, null, false, false, false, false, null, null, null, 65512));
                }
                return s3q0.a;
            case 25:
                xbt xbtVar = (xbt) obj2;
                sct sctVar = (sct) obj;
                if (sctVar instanceof sct.c) {
                    sct.c cVar3 = (sct.c) sctVar;
                    xbtVar.getClass();
                    xbtVar.T(new edt.g(cVar3.a, cVar3.b));
                } else if (sctVar instanceof sct.a) {
                    xbtVar.T(new edt.b(((sct.a) sctVar).a));
                } else if (sctVar instanceof sct.b) {
                    sct.b bVar3 = (sct.b) sctVar;
                    if (bVar3.b) {
                        xbtVar.T(new edt.a(bVar3.a));
                    }
                } else {
                    if (!(sctVar instanceof sct.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xbtVar.C(r9t.b);
                }
                return s3q0.a;
            case 26:
                xnt xntVar = (xnt) obj2;
                bwh0 bwh0Var = (bwh0) obj;
                if (xntVar.j == null) {
                    Iterator it2 = bwh0Var.a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ?? next2 = it2.next();
                            if (((qwz) next2).c) {
                                qwzVar = next2;
                            }
                        }
                    }
                    xntVar.j = qwzVar;
                }
                xntVar.e.onNext(bwh0Var.a);
                return s3q0.a;
            case 27:
                k6u k6uVar = (k6u) obj2;
                mzp0 mzp0Var = k6uVar.i;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                k6uVar.T(y6u.d.b.b);
                return s3q0.a;
            case 28:
                fgu fguVar = (fgu) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ?? r2 = fguVar.itemView;
                ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (!booleanValue || ((zzz) fguVar.l.a).isHorizontal()) ? cn70.b(0) : fgu.v;
                r2.setLayoutParams(marginLayoutParams);
                return s3q0.a;
            default:
                return (io.reactivex.rxjava3.internal.operators.observable.m1) obj2;
        }
    }
}
