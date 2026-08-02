package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.ecomm.reviews.impl.communities.yclients.ConnectYClientsReviewsResult;
import com.vk.ecomm.reviews.impl.communities.yclients.d;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import xsna.b26;
import xsna.d1j;
import xsna.f6u;
import xsna.hfr;
import xsna.lta;
import xsna.mwm;
import xsna.rtb0;
import xsna.tj50;
import xsna.ukl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p4f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p4f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x03f9, code lost:
    
        if (((xsna.by00) r10).a.h == 1) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0406, code lost:
    
        if (((xsna.cy00) r10).a.h == 1) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [xsna.kpk] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Poll currentPoll;
        int i = 0;
        switch (this.b) {
            case 0:
                ((hjc) this.c).onClick();
                return s3q0.a;
            case 1:
                ((a4g) this.c).p(((Float) obj).floatValue());
                return s3q0.a;
            case 2:
                v0h v0hVar = (v0h) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                r3h r3hVar = v0hVar.k;
                if (r3hVar != null) {
                    r3hVar.invoke(bool);
                }
                return s3q0.a;
            case 3:
                d2h d2hVar = (d2h) this.c;
                int i2 = d2h.p1;
                Bundle bundle = new Bundle();
                bundle.putBoolean("IS_SHORTNAME_CHANGED", true);
                d2hVar.getParentFragmentManager().k0(bundle, "EDIT_SHORTNAME_RESULT_KEY");
                d2hVar.Yn();
                d2hVar.dismiss();
                return s3q0.a;
            case 4:
                xkh xkhVar = (xkh) this.c;
                ay00 ay00Var = (ay00) obj;
                UserId q = ay00Var.q();
                if (epx.f(q != null ? fkq0.a(q) : null, fkq0.a(xkhVar.a))) {
                    if (ay00Var instanceof by00) {
                        break;
                    } else if (ay00Var instanceof cy00) {
                        break;
                    } else if (!(ay00Var instanceof dy00)) {
                        if (ay00Var instanceof MarketEventGoodCreated) {
                            r2 = ((MarketEventGoodCreated) ay00Var).a.V;
                        } else if (!(ay00Var instanceof iy00)) {
                            if (ay00Var instanceof jy00) {
                                r2 = ((jy00) ay00Var).a.V;
                            }
                        }
                    }
                    return Boolean.valueOf(r2);
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 5:
                ((osh) this.c).f.invoke(new d.n.a(false));
                return s3q0.a;
            case 6:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                List<? extends hfz> list = (List) obj;
                CommunityReviewsView communityReviewsView = communityReviewsFragment.a0;
                if (communityReviewsView != null) {
                    fyh fyhVar = communityReviewsView.d;
                    (fyhVar != null ? fyhVar : null).setItems(list);
                }
                CommunityReviewsView communityReviewsView2 = communityReviewsFragment.a0;
                if (communityReviewsView2 != null) {
                    communityReviewsView2.c();
                }
                return s3q0.a;
            case 7:
                ((z37) this.c).b((gs7) obj);
                return s3q0.a;
            case 8:
                s0j s0jVar = (s0j) this.c;
                L.g("Error while observing session rooms and participants", (Throwable) obj);
                s0jVar.T(d1j.i.b);
                return s3q0.a;
            case 9:
                com.vk.ecomm.reviews.impl.communities.yclients.c cVar = (com.vk.ecomm.reviews.impl.communities.yclients.c) this.c;
                com.vk.ecomm.reviews.impl.communities.yclients.d dVar = (com.vk.ecomm.reviews.impl.communities.yclients.d) obj;
                int i3 = com.vk.ecomm.reviews.impl.communities.yclients.c.j1;
                if (dVar instanceof d.a) {
                    if (epx.f(((d.a) dVar).a, ConnectYClientsReviewsResult.Success.b)) {
                        cVar.getParentFragmentManager().k0(new Bundle(), "connect_yclients_reviews");
                    }
                    cVar.dismiss();
                }
                return s3q0.a;
            case 10:
                ((ddj) this.c).p.g(((tho0) obj).a.c);
                return s3q0.a;
            case 11:
                nqj nqjVar = (nqj) this.c;
                String str = nqjVar.b;
                Handler handler = nqjVar.a;
                if (((Boolean) obj).booleanValue()) {
                    nqjVar.a(true);
                    handler.removeCallbacksAndMessages(str);
                    handler.postDelayed(new w29(nqjVar, 3), str, 5000L);
                } else {
                    handler.removeCallbacksAndMessages(str);
                    nqjVar.a(false);
                }
                return s3q0.a;
            case 12:
                return CoverChooseState.a((CoverChooseState) obj, (Bitmap) this.c, null, null, false, 29);
            case 13:
                ?? r0 = (kpk) this.c;
                VKList vKList = (VKList) obj;
                ReentrantLock reentrantLock = r0.d;
                reentrantLock.lock();
                try {
                    r0.e = vKList;
                    r0.f.onNext(r0.a(vKList));
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 14:
                uil uilVar = (uil) this.c;
                jr20 jr20Var = uilVar.q;
                Object obj2 = uilVar.l;
                jr20Var.A4(((bjf0) (obj2 != null ? obj2 : null)).a.d(), uilVar.getAdapterPosition());
                return s3q0.a;
            case 15:
                rtb0.a aVar = (rtb0.a) obj;
                ukl.a aVar2 = ((ukl) this.c).a;
                return Boolean.valueOf((aVar2 == null || (currentPoll = aVar2.getCurrentPoll()) == null || currentPoll.b != aVar.a.b) ? false : true);
            case 16:
                Boolean invoke = ((nvl) this.c).f.invoke(Integer.valueOf(((onb0) obj).a.b));
                invoke.booleanValue();
                return invoke;
            case 17:
                fl00 fl00Var = ((wxl) this.c).g;
                Throwable th2 = ((hyl) obj).d.f;
                fl00Var.getClass();
                return fl00.a(th2);
            case 18:
                u1m u1mVar = (u1m) this.c;
                b25 b25Var = u1mVar.b;
                if (!((Boolean) obj).booleanValue()) {
                    return lta.a.C3293a.a;
                }
                pta ptaVar = u1mVar.a;
                b25Var.A().c(ptaVar.c.d).commit();
                Intent putExtra = new Intent("com.vkontakte.android.USER_STATUS_CHANGED").putExtra("uid", b25Var.c()).putExtra("status", ptaVar.c.d);
                Context context = e43.a;
                n2i0.a(context != null ? context : null, hf8.a, putExtra);
                return lta.a.c.C3295c.a;
            case 19:
                hkp hkpVar = ((tim) this.c).p;
                if (hkpVar != null) {
                    pim pimVar = (pim) hkpVar.b;
                    PinnedMsg a = pimVar.l.a();
                    if (a != null) {
                        pimVar.p.b(new CnvMsgId(a.b, a.c));
                        b26.f fVar = pimVar.o;
                        if (fVar != null) {
                            ProfilesInfo profilesInfo = pimVar.l.a.b;
                            ChatFragment.b bVar = b26.this.m;
                            if (bVar != null) {
                                ChatFragment chatFragment = ChatFragment.this;
                                ChatFragment.d dVar2 = ChatFragment.w1;
                                if (a.m) {
                                    o0w b = chatFragment.r0.b();
                                    FragmentActivity kn = chatFragment.kn();
                                    DialogExt dialogExt = chatFragment.V;
                                    b.z(kn, a, dialogExt != null ? dialogExt : null, chatFragment.no());
                                    ChatFragment.Ho(false);
                                } else {
                                    int i4 = a.c;
                                    com.vk.im.ui.components.msg_list.a aVar3 = chatFragment.H0;
                                    if (aVar3 == null) {
                                        aVar3 = null;
                                    }
                                    MsgIdType msgIdType = MsgIdType.CNV_ID;
                                    aVar3.w1(msgIdType, i4);
                                    com.vk.im.ui.components.msg_list.a aVar4 = chatFragment.H0;
                                    (aVar4 != null ? aVar4 : null).a2(msgIdType, i4, "openOrShowPinnedMsg");
                                    ChatFragment.Ho(true);
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((ka80) obj).c.e.c.get(Long.valueOf(((a1w) ((q1t) this.c).b).q().d)) != null);
            case 21:
                Group group = (Group) ((wpp) obj).c.get(Long.valueOf(((mwm) this.c).b.q().d));
                return group == null ? mwm.a.c.a : new mwm.a.b(group.c);
            case 22:
                bwr0 bwr0Var = (bwr0) obj;
                hfr j = rli0.j(rli0.o(rli0.j(new i5g(((k5n) this.c).d), l86.e), new j5n(i)), m86.e);
                int i5 = 19;
                if (bwr0Var instanceof hxr0) {
                    hfr.a aVar5 = new hfr.a(rli0.j(j, new oce(bwr0Var, i5)));
                    while (aVar5.hasNext()) {
                        ((VideoDiscoverGridItem) aVar5.next()).j.k.f0(true);
                    }
                } else if (bwr0Var instanceof dyr0) {
                    hfr.a aVar6 = new hfr.a(rli0.j(j, new fre(bwr0Var, i5)));
                    while (aVar6.hasNext()) {
                        ((VideoDiscoverGridItem) aVar6.next()).j.k.f0(false);
                    }
                }
                return s3q0.a;
            case 23:
                return new s3o(((tj50.a) obj).a(new v7((r3o) this.c, 26), ao8.d));
            case 24:
                kiq kiqVar = (kiq) this.c;
                return Boolean.valueOf(((Long) obj).longValue() * kiqVar.f < kiqVar.a);
            case 25:
                fxt0 fxt0Var = (fxt0) this.c;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((zak0) fxt0Var.k).setValue(bool2);
                return s3q0.a;
            case 26:
                zqs zqsVar = (zqs) this.c;
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
                int size = ((zqsVar.c.size() + friendsGetFieldsResponseDto.d().size()) * 2) + friendsGetFieldsResponseDto.getCount();
                List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    Serializer.c<ProfileFriendItem> cVar2 = ProfileFriendItem.CREATOR;
                    arrayList.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return new VkPaginationList(arrayList, size, friendsGetFieldsResponseDto.d().size() + zqsVar.e < size, zqsVar.e);
            case 27:
                vvs vvsVar = (vvs) this.c;
                int i6 = vvs.C;
                vvsVar.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("DIALOG_RESULT_APP_VIEW", (String) obj);
                s3q0 s3q0Var2 = s3q0.a;
                vvsVar.getParentFragmentManager().k0(bundle2, "GAMES_CONFIRM_EXIT_DIALOG_KEY");
                return s3q0.a;
            case 28:
                Throwable th3 = (Throwable) obj;
                cvk.w(j03.g((Context) this.c, th3, R.string.error), false);
                L.i(th3);
                return s3q0.a;
            default:
                ((k6u) this.c).k.b(new f6u.b((Throwable) obj));
                return s3q0.a;
        }
    }
}
