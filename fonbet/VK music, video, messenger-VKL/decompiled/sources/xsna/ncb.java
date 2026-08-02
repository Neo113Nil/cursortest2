package xsna;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.serialize.Serializer;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.feed.design.view.posting.preview.spinner.PostingVkSpinnerWrapperView;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.profile.community.members.impl.ui.k;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.q;
import com.vkontakte.android.attachments.MarketAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ikv0;
import xsna.mt00;
import xsna.px60;
import xsna.wso;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ncb implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ncb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        MarketAttachment marketAttachment;
        Good good;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        us2 us2Var = null;
        int i2 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                int i3 = qcb.h1;
                ((qcb) obj3).startActivityForResult((Intent) obj, intValue);
                return s3q0.a;
            case 1:
                final DzenArticleFragment dzenArticleFragment = (DzenArticleFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-398995051, intValue2, -1, "com.vk.dzenarticle.impl.ui.DzenArticleFragment.ScreenContent.<anonymous> (DzenArticleFragment.kt:147)");
                    }
                    boolean J = aVar.J(dzenArticleFragment);
                    Object x = aVar.x();
                    if (J || x == c0012a) {
                        x = new qpj(dzenArticleFragment, 7);
                        aVar.R(x);
                    }
                    izs izsVar = (izs) x;
                    boolean J2 = aVar.J(dzenArticleFragment);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new jro(dzenArticleFragment, null);
                        aVar.R(x2);
                    }
                    r37.a(izsVar, (yzs) x2, kai.c(-1158413867, new zzs() { // from class: xsna.gro
                        @Override // xsna.zzs
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i4;
                            final z37 z37Var = (z37) obj4;
                            final wso wsoVar = (wso) obj5;
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj6;
                            int intValue3 = ((Integer) obj7).intValue();
                            qcy<Object>[] qcyVarArr2 = DzenArticleFragment.R;
                            if ((intValue3 & 6) == 0) {
                                i4 = (aVar2.J(z37Var) ? 4 : 2) | intValue3;
                            } else {
                                i4 = intValue3;
                            }
                            if ((intValue3 & 48) == 0) {
                                i4 |= (intValue3 & 64) == 0 ? aVar2.J(wsoVar) : aVar2.y(wsoVar) ? 32 : 16;
                            }
                            if (aVar2.t(i4 & 1, (i4 & 147) != 146)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1158413867, i4, -1, "com.vk.dzenarticle.impl.ui.DzenArticleFragment.ScreenContent.<anonymous>.<anonymous> (DzenArticleFragment.kt:157)");
                                }
                                boolean z = wsoVar instanceof wso.a;
                                wso.a aVar3 = z ? (wso.a) wsoVar : null;
                                String str = aVar3 != null ? aVar3.b : null;
                                wso.a aVar4 = z ? (wso.a) wsoVar : null;
                                String str2 = aVar4 != null ? aVar4.c : null;
                                boolean z2 = (i4 & 14) == 4;
                                Object x3 = aVar2.x();
                                if (z2 || x3 == a.C0011a.a) {
                                    ai6 ai6Var = new ai6(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0, 4);
                                    aVar2.R(ai6Var);
                                    x3 = ai6Var;
                                }
                                final DzenArticleFragment dzenArticleFragment2 = DzenArticleFragment.this;
                                zro.a(str, str2, (izs) ((fcy) x3), kai.c(-516930981, new yzs() { // from class: xsna.hro
                                    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
                                    @Override // xsna.yzs
                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                        androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj9;
                                        int intValue4 = ((Integer) obj10).intValue();
                                        qcy<Object>[] qcyVarArr3 = DzenArticleFragment.R;
                                        if (aVar5.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-516930981, intValue4, -1, "com.vk.dzenarticle.impl.ui.DzenArticleFragment.ScreenContent.<anonymous>.<anonymous>.<anonymous> (DzenArticleFragment.kt:165)");
                                            }
                                            wso wsoVar2 = wso.this;
                                            if (wsoVar2 instanceof wso.c) {
                                                aVar5.K(1445536947);
                                                vso.b(0, aVar5);
                                                aVar5.j();
                                            } else {
                                                boolean z3 = wsoVar2 instanceof wso.b;
                                                z37 z37Var2 = z37Var;
                                                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                                if (z3) {
                                                    aVar5.K(1445539718);
                                                    boolean J3 = aVar5.J(z37Var2);
                                                    Object x4 = aVar5.x();
                                                    if (J3 || x4 == c0012a2) {
                                                        x4 = new bi6(z37Var2, 6);
                                                        aVar5.R(x4);
                                                    }
                                                    uso.a((izs) ((fcy) x4), aVar5, 0);
                                                    aVar5.j();
                                                } else {
                                                    if (wsoVar2 instanceof wso.a) {
                                                        aVar5.K(1445543171);
                                                        wso.a aVar6 = (wso.a) wsoVar2;
                                                        xxs xxsVar = (xxs) dzenArticleFragment2.P.getValue();
                                                        boolean J4 = aVar5.J(z37Var2);
                                                        Object x5 = aVar5.x();
                                                        if (J4 || x5 == c0012a2) {
                                                            x5 = new ee8(z37Var2, 8);
                                                            aVar5.R(x5);
                                                        }
                                                        tso.m(aVar6, xxsVar, (izs) ((fcy) x5), aVar5, 0);
                                                    } else {
                                                        aVar5.K(1855113959);
                                                    }
                                                    aVar5.j();
                                                }
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar5.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, aVar2), aVar2, 3072);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                return new Pair(((ort) obj3).b(((bv6) obj).a), ((bv6) obj2).a);
            case 3:
                ikv0.a aVar2 = (ikv0.a) obj3;
                Integer num = (Integer) obj2;
                num.intValue();
                aVar2.o = num;
                aVar2.p((Window) obj);
                return s3q0.a;
            case 4:
                List<UserId> list = ((u2v) obj3).c;
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
                List list2 = (List) obj2;
                List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : d) {
                    if (list.contains(((UsersUserFullDto) obj4).s1())) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    UsersUserFullDto usersUserFullDto = (UsersUserFullDto) it.next();
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList2.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                List<UsersUserFullDto> d2 = friendsGetFieldsResponseDto.d();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : d2) {
                    if (!list.contains(((UsersUserFullDto) obj5).s1())) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) it2.next();
                    Serializer.c<ProfileFriendItem> cVar2 = ProfileFriendItem.CREATOR;
                    arrayList4.add(ProfileFriendItem.a.b(usersUserFullDto2));
                }
                List R = j5g.R(j5g.u0(list2, arrayList2));
                EmptyList emptyList = EmptyList.b;
                return new kqs(R, arrayList4, emptyList, emptyList);
            case 5:
                ((Integer) obj2).getClass();
                ((avw) obj3).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                giy giyVar = (giy) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(635686852, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.Content.<anonymous> (KidsAudioBookBigPlayerControls.kt:37)");
                    }
                    giyVar.c(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 7:
                wz00 wz00Var = (wz00) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gmq gmqVar = (gmq) obj2;
                if ((gmqVar instanceof MarketFavable) && (marketAttachment = (MarketAttachment) wz00Var.C) != null && (good = marketAttachment.f) != null) {
                    MarketFavable marketFavable = (MarketFavable) gmqVar;
                    if (marketFavable.b == good.b) {
                        good.J = booleanValue;
                        View view = wz00Var.M;
                        if (view != null) {
                            view.setActivated(booleanValue);
                        }
                        wz00Var.Y6();
                        mt00.h(new mt00.a((int) marketFavable.b, marketFavable.c, booleanValue, CommonMarketStat$TypeRefSource.POST, null, null, null, null, null, null, 8176));
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 8:
                a220 a220Var = (a220) obj3;
                k.c cVar3 = new k.c(false);
                if (a220Var.e && a220Var.b == CommunityMembersFilter.FRIENDS) {
                    return cVar3;
                }
                return null;
            case 9:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj3;
                int intValue4 = ((Integer) obj).intValue();
                View view2 = (View) obj2;
                CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = view2 instanceof CatalogRecyclerPaginatedView ? (CatalogRecyclerPaginatedView) view2 : null;
                if (intValue4 == 0) {
                    if (catalogRecyclerPaginatedView != null) {
                        RecyclerView recyclerView = catalogRecyclerPaginatedView.getRecyclerView();
                        if (!epx.f(musicCatalogRootVh.R, recyclerView)) {
                            musicCatalogRootVh.R = recyclerView;
                            if (recyclerView != null) {
                                recyclerView.addOnScrollListener(new kd40(musicCatalogRootVh));
                                musicCatalogRootVh.j0();
                            }
                        }
                    }
                } else if (!epx.f(musicCatalogRootVh.R, null)) {
                    musicCatalogRootVh.R = null;
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                u150.d((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                MviMembersListFragment mviMembersListFragment = (MviMembersListFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                MviMembersListFragment.a aVar5 = MviMembersListFragment.T;
                if (aVar4.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1081010431, intValue5, -1, "com.vk.profile.community.members.impl.ui.MviMembersListFragment.onCreateView.<anonymous>.<anonymous> (MviMembersListFragment.kt:93)");
                    }
                    j220 eo = mviMembersListFragment.eo();
                    boolean y = aVar4.y(mviMembersListFragment);
                    Object x3 = aVar4.x();
                    if (y || x3 == c0012a) {
                        x3 = new bk30(mviMembersListFragment, 3);
                        aVar4.R(x3);
                    }
                    izs izsVar2 = (izs) x3;
                    boolean y2 = aVar4.y(mviMembersListFragment);
                    Object x4 = aVar4.x();
                    if (y2 || x4 == c0012a) {
                        x4 = new qz40(mviMembersListFragment, i2);
                        aVar4.R(x4);
                    }
                    izs izsVar3 = (izs) x4;
                    boolean y3 = aVar4.y(mviMembersListFragment);
                    Object x5 = aVar4.x();
                    if (y3 || x5 == c0012a) {
                        x5 = new m1o(mviMembersListFragment, 28);
                        aVar4.R(x5);
                    }
                    gzs gzsVar = (gzs) x5;
                    boolean y4 = aVar4.y(mviMembersListFragment);
                    Object x6 = aVar4.x();
                    if (y4 || x6 == c0012a) {
                        x6 = new btm(mviMembersListFragment, 27);
                        aVar4.R(x6);
                    }
                    com.vk.profile.community.members.impl.ui.d.f(eo, izsVar2, izsVar3, gzsVar, (gzs) x6, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 12:
                qy60 qy60Var = (qy60) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                rvu rvuVar = qy60Var.j;
                final d64 a = isiVar.a(new ac0(sj50Var, rvuVar));
                final d64 a2 = isiVar.a(new xb0(sj50Var, rvuVar));
                final d64 a3 = isiVar.a(new yb0(sj50Var, rvuVar));
                final d64 a4 = isiVar.a(new zb0(rvuVar, qy60Var.g, sj50Var));
                final d64 a5 = isiVar.a(new dy60(sj50Var));
                isiVar.c = new wzs() { // from class: xsna.ay60
                    @Override // xsna.wzs
                    public final Object invoke(Object obj6, Object obj7) {
                        rj50 rj50Var = (rj50) obj6;
                        px60 px60Var = (px60) obj7;
                        if (px60Var instanceof px60.c) {
                            return rj50Var.a(d64.this, px60Var);
                        }
                        if (px60Var instanceof px60.b) {
                            return rj50Var.a(a3, px60Var);
                        }
                        if (px60Var instanceof px60.a) {
                            return rj50Var.a(a2, px60Var);
                        }
                        if (px60Var instanceof qx60) {
                            return rj50Var.a(a4, px60Var);
                        }
                        if (px60Var instanceof px60.d) {
                            return rj50Var.a(a5, px60Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 13:
                PollVotersFragment pollVotersFragment = (PollVotersFragment) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i4 = PollVotersFragment.a0;
                if (aVar6.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-268079712, intValue6, -1, "com.vk.poll.fragments.PollVotersFragment.onCreateView.<anonymous>.<anonymous> (PollVotersFragment.kt:106)");
                    }
                    pollVotersFragment.jo(0, aVar6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                int i5 = PostingVkSpinnerWrapperView.w;
                ((PostingVkSpinnerWrapperView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 15:
                ov70 ov70Var = (ov70) obj2;
                ((xlb0) obj).a();
                ((d0g0) obj3).w((int) Float.intBitsToFloat((int) (ov70Var.a >> 32)), (int) Float.intBitsToFloat((int) (ov70Var.a & 4294967295L)));
                return s3q0.a;
            case 16:
                VideoPlayerStatus videoPlayerStatus = (VideoPlayerStatus) obj;
                q.c cVar4 = (q.c) obj2;
                boolean booleanValue2 = ((Boolean) ((com.vk.video.ui.discovery.minimizable.p) obj3).d.getValue()).booleanValue();
                if ((!com.vk.video.ui.discovery.minimizable.player.b.a(videoPlayerStatus) || booleanValue2) && !videoPlayerStatus.equals(VideoPlayerStatus.Restricted.b) && !cVar4.b && cVar4.a && !cVar4.c) {
                    r6 = true;
                }
                return Boolean.valueOf(r6);
            case 17:
                DonutVideoUiModel.DescriptionChip descriptionChip = (DonutVideoUiModel.DescriptionChip) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                aVar7.K(-1031438274);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1031438274, intValue7, -1, "com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListViewStateMapper.map.<anonymous>.<anonymous> (VideosStackedListViewStateMapper.kt:76)");
                }
                DonutPriceTemplate donutPriceTemplate = descriptionChip.c;
                if (donutPriceTemplate == null) {
                    aVar7.K(-1381539238);
                } else {
                    aVar7.K(925265543);
                    us2Var = z1o.a(donutPriceTemplate, m4s.B(aVar7), aVar7, 0);
                }
                aVar7.j();
                if (us2Var == null) {
                    aVar7.K(925270265);
                    us2Var = ws2.b(descriptionChip.b, aVar7, 0);
                    aVar7.j();
                } else {
                    aVar7.K(925264964);
                    aVar7.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                return us2Var;
            default:
                ((Integer) obj2).getClass();
                x7u0.a((Alert$Button) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ ncb(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
